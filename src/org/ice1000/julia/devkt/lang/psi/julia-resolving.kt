package org.ice1000.julia.devkt.lang.psi

import org.ice1000.julia.devkt.lang.JuliaTokenType
import org.ice1000.julia.devkt.lang.orFalse
import org.ice1000.julia.devkt.lang.psi.impl.IJuliaFunctionDeclaration
import org.ice1000.julia.devkt.lang.psi.impl.JuliaAbstractSymbol
import org.jetbrains.kotlin.com.intellij.openapi.util.Key
import org.jetbrains.kotlin.com.intellij.openapi.util.TextRange
import org.jetbrains.kotlin.com.intellij.psi.*
import org.jetbrains.kotlin.com.intellij.psi.impl.source.resolve.ResolveCache
import org.jetbrains.kotlin.com.intellij.psi.scope.PsiScopeProcessor
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil

/**
 * @author ice1000
 * element should be only [JuliaSymbol] or [JuliaMacroSymbol]
 */
class JuliaSymbolRef(
		private val symbol: JuliaAbstractSymbol,
		private var refTo: PsiElement? = null) : PsiPolyVariantReference {
	private val range = TextRange(0, element.textLength)
	private val isDeclaration = (element as? JuliaSymbol)?.isDeclaration.orFalse()
	private val resolver by lazy {
		if (element is JuliaMacroSymbol) macroResolver
		else /* is JuliaSymbol */ symbolResolver
	}

	override fun equals(other: Any?) = (other as? JuliaSymbolRef)?.element == element
	override fun getElement() = symbol
	override fun hashCode() = element.hashCode()
	override fun getRangeInElement() = range
	override fun isSoft() = true
	override fun resolve() = if (isDeclaration) null else multiResolve(false).firstOrNull()?.element
	override fun isReferenceTo(o: PsiElement?) = o === refTo || o === resolve()
	override fun getVariants(): Array<Any> = emptyArray()

	override fun getCanonicalText(): String = element.text
	override fun handleElementRename(newName: String) = JuliaTokenType.fromText(newName, element.project).let(element::replace)
	override fun bindToElement(element: PsiElement) = element.also { refTo = element }
	override fun multiResolve(incompleteCode: Boolean): Array<out ResolveResult> {
		val file = element.containingFile ?: return emptyArray()
		if (isDeclaration or !element.isValid or element.project.isDisposed) return emptyArray()
		return ResolveCache.getInstance(element.project)
				.resolveWithCaching(this, resolver, true, incompleteCode, file)
	}

	private companion object ResolverHolder {
		private val symbolResolver = ResolveCache.PolyVariantResolver<JuliaSymbolRef> { ref, incompleteCode ->
			resolveWith(SymbolResolveProcessor(ref, incompleteCode), ref)
		}

		private val macroResolver = ResolveCache.PolyVariantResolver<JuliaSymbolRef> { ref, incompleteCode ->
			resolveWith(MacroSymbolResolveProcessor(ref, incompleteCode), ref)
		}

		private inline fun <reified T> resolveWith(processor: ResolveProcessor<T>, ref: JuliaSymbolRef): Array<T> {
			val file = ref.element.containingFile ?: return emptyArray()
			treeWalkUp(processor, ref.element, file)
			return processor.candidateSet.toTypedArray()
		}
	}
}

abstract class ResolveProcessor<ResolveResult>(private val place: PsiElement) : PsiScopeProcessor {
	abstract val candidateSet: ArrayList<ResolveResult>
	override fun handleEvent(event: PsiScopeProcessor.Event, o: Any?) = Unit
	override fun <T : Any?> getHint(hintKey: Key<T>): T? = null
	protected val PsiElement.hasNoError get() = (this as? StubBasedPsiElement<*>)?.stub != null || !PsiTreeUtil.hasErrorElements(this)
	fun isInScope(element: PsiElement) = when {
		element !is JuliaSymbol -> false
		element.isFunctionParameter -> PsiTreeUtil.isAncestor(
				PsiTreeUtil.getParentOfType(element, IJuliaFunctionDeclaration::class.java), place, true)
		element.isCatchSymbol -> PsiTreeUtil.isAncestor(
				PsiTreeUtil.getParentOfType(element, JuliaCatchClause::class.java), place, true)
		element.isLoopParameter -> PsiTreeUtil.isAncestor(
				PsiTreeUtil.getParentOfType(element, JuliaForExpr::class.java), place, true)
		element.isLambdaParameter -> PsiTreeUtil.isAncestor(
				PsiTreeUtil.getParentOfType(element, JuliaLambda::class.java), place, false)
		element.isDeclaration -> PsiTreeUtil.isAncestor(
				PsiTreeUtil.getParentOfType(element, JuliaStatements::class.java), place, false)
		else -> false
	}
}

open class SymbolResolveProcessor(
		@JvmField protected val name: String,
		place: PsiElement,
		private val incompleteCode: Boolean) :
		ResolveProcessor<PsiElementResolveResult>(place) {
	constructor(ref: JuliaSymbolRef, incompleteCode: Boolean) : this(ref.canonicalText, ref.element, incompleteCode)

	override val candidateSet = ArrayList<PsiElementResolveResult>(3)
	protected open fun accessible(element: PsiElement) = name == element.text && isInScope(element)
	override fun execute(element: PsiElement, resolveState: ResolveState) = when {
		candidateSet.isNotEmpty() -> false
		element is JuliaSymbol -> {
			val accessible = accessible(element) and element.isDeclaration
			if (accessible) candidateSet += PsiElementResolveResult(element, element.hasNoError)
			!accessible
		}
		else -> true
	}
}

class MacroSymbolResolveProcessor(name: String, place: PsiElement, incompleteCode: Boolean) :
		SymbolResolveProcessor(name, place, incompleteCode) {
	constructor(ref: JuliaSymbolRef, incompleteCode: Boolean) : this(ref.canonicalText, ref.element, incompleteCode)

	override fun accessible(element: PsiElement) = "@${element.text}" == name && isInScope(element)
}

