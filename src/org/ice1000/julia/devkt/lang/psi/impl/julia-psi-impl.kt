@file:JvmName("JuliaPsiImplUtils")

package org.ice1000.julia.devkt.lang.psi.impl

import org.ice1000.julia.devkt.lang.psi.*
import org.jetbrains.kotlin.com.intellij.psi.*
import org.jetbrains.kotlin.com.intellij.psi.scope.PsiScopeProcessor
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType

fun PsiElement.processDeclTrivial(
	processor: PsiScopeProcessor,
	substitutor: ResolveState,
	lastParent: PsiElement?,
	place: PsiElement): Boolean {
	var run: PsiElement? = lastParent?.prevSibling ?: lastChild
	while (run != null) {
		if (!run.processDeclarations(processor, substitutor, null, place)) return false
		run = run.prevSibling
	}
	return true
}

/**
 * @param self The declaration itself
 */
fun collectFrom(startPoint: PsiElement, name: String, self: PsiElement? = null) = SyntaxTraverser
	.psiTraverser(startPoint)
	.filter { it is JuliaSymbol && !it.isDeclaration && it.text == name && it != self }
	.mapNotNull(PsiElement::getReference)
	.let { if (self != null) it.filter { it.isReferenceTo(self) } else it }
	.toTypedArray()

val DocStringOwner.docString: JuliaString? get() = prevSiblingIgnoring(JuliaTypes.EOL, TokenType.WHITE_SPACE)
val IJuliaString.docStringOwner: DocStringOwner? get() = nextSiblingIgnoring(JuliaTypes.EOL, TokenType.WHITE_SPACE)

inline fun <reified Psi : PsiElement> PsiElement.nextSiblingIgnoring(vararg types: IElementType): Psi? {
	var next: PsiElement? = nextSibling
	while (true) {
		val localNext = next ?: return null
		next = localNext.nextSibling
		return if (types.any { localNext.node.elementType == it }) continue
		else localNext as? Psi
	}
}

inline fun <reified Psi : PsiElement> PsiElement.prevSiblingIgnoring(vararg types: IElementType): Psi? {
	var next: PsiElement? = prevSibling
	while (true) {
		val localNext = next ?: return null
		next = localNext.prevSibling
		return if (types.any { localNext.node.elementType == it }) continue
		else localNext as? Psi
	}
}

fun PsiElement.childrenBefore(type: IElementType): List<PsiElement> {
	val ret = ArrayList<PsiElement>()
	var next: PsiElement? = firstChild
	while (true) {
		next = next?.nextSibling ?: return ret
		if (next.node.elementType == type) return ret
		ret += next
	}
}
