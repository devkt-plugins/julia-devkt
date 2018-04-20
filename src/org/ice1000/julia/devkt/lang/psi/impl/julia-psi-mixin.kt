package org.ice1000.julia.devkt.lang.psi.impl

import org.ice1000.julia.devkt.lang.psi.*
import org.jetbrains.kotlin.com.intellij.extapi.psi.ASTWrapperPsiElement
import org.jetbrains.kotlin.com.intellij.lang.ASTNode

interface IJuliaSymbol : JuliaExpr {
	// check if they are declarations
	val isField: Boolean
	val isFunctionName: Boolean
	val isMacroName: Boolean
	val isModuleName: Boolean
	val isTypeName: Boolean
	val isAbstractTypeName: Boolean
	val isPrimitiveTypeName: Boolean
	val isFunctionParameter: Boolean
	val isLambdaParameter: Boolean
	val isIndexParameter: Boolean
	val isVariableName: Boolean
	val isGlobalName: Boolean
	val isCatchSymbol: Boolean
	val isDeclaration: Boolean
}

abstract class JuliaSymbolMixin(node: ASTNode) : ASTWrapperPsiElement(node), JuliaSymbol {
	final override val isField: Boolean by lazy {
		this !== parent.children.firstOrNull { it is JuliaSymbol } &&
				parent is JuliaTypeDeclaration
	}
	final override val isFunctionName by lazy {
		(parent is JuliaCompactFunction && this === parent.firstChild) ||
				parent is JuliaFunction
	}
	final override val isMacroName get() = parent is JuliaMacro
	final override val isModuleName get() = parent is JuliaModuleDeclaration
	final override val isTypeName by lazy {
		(parent is JuliaTypeDeclaration && this === parent.children.firstOrNull { it is JuliaSymbol }) ||
				parent is JuliaTypeAlias
	}
	final override val isAbstractTypeName get() = parent is JuliaAbstractTypeDeclaration
	final override val isPrimitiveTypeName get() = parent is JuliaPrimitiveTypeDeclaration
	final override val isFunctionParameter by lazy {
		parent is JuliaTypedNamedVariable && this === parent.firstChild
	}
	final override val isGlobalName: Boolean by lazy { parent is JuliaGlobalStatement }
	final override val isCatchSymbol: Boolean by lazy { parent is JuliaCatchClause }
	final override val isLambdaParameter: Boolean by lazy {
		parent is JuliaLambda || (parent is JuliaTuple && parent.parent is JuliaLambda)
	}
	final override val isIndexParameter: Boolean by lazy {
		parent is JuliaSingleIndexer ||
				parent.parent is JuliaMultiIndexer
	}
	final override val isVariableName by lazy {
		parent is JuliaAssignOp && this === parent.firstChild ||
				parent is JuliaSymbolLhs
	}
	final override val isDeclaration by lazy {
		isFunctionName ||
				isVariableName ||
				isFunctionParameter ||
				isMacroName ||
				isModuleName ||
				isTypeName ||
				isAbstractTypeName ||
				isGlobalName ||
				isPrimitiveTypeName ||
				isCatchSymbol ||
				isIndexParameter ||
				isLambdaParameter
	}
}
