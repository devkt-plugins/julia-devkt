package org.ice1000.julia.devkt.lang.docfmt

import org.ice1000.devkt.openapi.*
import org.ice1000.julia.devkt.lang.docfmt.psi.DocfmtValue
import org.jetbrains.kotlin.com.intellij.psi.PsiElement

class Docfmt<T> : ExtendedDevKtLanguage<T>(
		DocfmtLanguage.INSTANCE,
		DocfmtParserDefinition
) {
	override val lineCommentStart get() = "//"
	override fun annotate(element: PsiElement, document: AnnotationHolder<T>, colorScheme: ColorScheme<T>) {
		super.annotate(element, document, colorScheme)
		if (element is DocfmtValue) {
		}
	}
}