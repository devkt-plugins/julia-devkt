package org.ice1000.julia.devkt.lang.docfmt

import org.ice1000.devkt.openapi.*
import org.ice1000.devkt.openapi.ui.IconLoader
import org.ice1000.julia.devkt.lang.DOCFMT_EXTENSION
import org.ice1000.julia.devkt.lang.docfmt.psi.DocfmtValue
import org.jetbrains.kotlin.com.intellij.psi.PsiElement
import javax.swing.Icon

class Docfmt<T> : ExtendedDevKtLanguage<T>(
		DocfmtLanguage.INSTANCE,
		DocfmtParserDefinition
) {
	override val icon: Icon = IconLoader.getIcon("/icon/docfmt/docfmt_blue.png")
	override val lineCommentStart get() = "//"
	override fun satisfies(fileName: String) = fileName == ".$DOCFMT_EXTENSION"
	override fun annotate(element: PsiElement, document: AnnotationHolder<T>, colorScheme: ColorScheme<T>) {
		super.annotate(element, document, colorScheme)
		if (element is DocfmtValue) {
			val text = element.text
			if (text == "true" || text == "false") document.highlight(element, colorScheme.keywords)
			else if (text.all { it.isDigit() }) document.highlight(element, colorScheme.numbers)
		}
	}
}
