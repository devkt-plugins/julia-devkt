package org.ice1000.julia.devkt.lang

import org.ice1000.devkt.openapi.*
import org.ice1000.julia.devkt.lang.psi.JuliaSymbol
import org.jetbrains.kotlin.com.intellij.psi.PsiElement
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType

class Julia<TextAttributes> : ExtendedDevKtLanguage<TextAttributes>(
		JuliaLanguage.INSTANCE,
		JuliaParserDefinition
) {
	override val lineCommentStart: String get() = "#"
	override fun satisfies(fileName: String) = fileName.endsWith(".jl")
	override fun attributesOf(type: IElementType, colorScheme: ColorScheme<TextAttributes>) =
			JuliaHighlighter.getTokenHighlights(type, colorScheme)

	override fun annotate(element: PsiElement, document: AnnotationHolder<TextAttributes>, colorScheme: ColorScheme<TextAttributes>) {
		when (element) {
			is JuliaSymbol -> when {
				element.isFunctionName -> document.highlight(element, colorScheme.function)
				element.isVariableName -> document.highlight(element, colorScheme.variable)
			}
		}
	}
}
