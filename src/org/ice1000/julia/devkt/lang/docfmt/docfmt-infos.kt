package org.ice1000.julia.devkt.lang.docfmt

import org.ice1000.julia.devkt.lang.DOCFMT_EXTENSION
import org.jetbrains.kotlin.com.intellij.extapi.psi.PsiFileBase
import org.jetbrains.kotlin.com.intellij.openapi.fileTypes.LanguageFileType
import org.jetbrains.kotlin.com.intellij.psi.FileViewProvider

object DocfmtFileType : LanguageFileType(DocfmtLanguage.INSTANCE) {
	override fun getDefaultExtension() = DOCFMT_EXTENSION
	override fun getName() = "Docfmt"
	override fun getIcon() = null
	override fun getDescription() = ""
}

class DocfmtFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, DocfmtLanguage.INSTANCE) {
	override fun getFileType() = DocfmtFileType
}

//object DocfmtHighlighter : SyntaxHighlighter {
//	override fun getHighlightingLexer() = DocfmtLexerAdapter()
//	override fun getTokenHighlights(tokenType: IElementType?) = when (tokenType) {
//		DocfmtTypes.EQ_SYM -> JuliaHighlighter.ASSIGNMENT_OPERATOR_KEY
//		DocfmtTypes.LINE_COMMENT -> JuliaHighlighter.COMMENT_KEY
//		DocfmtTypes.INT -> JuliaHighlighter.NUMBER_KEY
//		else -> emptyArray()
//	}
//}

//class DocfmtHighlighterFactory : SyntaxHighlighterFactory() {
//	override fun getSyntaxHighlighter(project: Project?, virtualFile: VirtualFile?) = DocfmtHighlighter
//}

//class DocfmtCommenter : Commenter {
//	override fun getCommentedBlockCommentPrefix() = blockCommentPrefix
//	override fun getCommentedBlockCommentSuffix() = blockCommentSuffix
//	override fun getBlockCommentPrefix(): String? = null
//	override fun getBlockCommentSuffix(): String? = null
//	override fun getLineCommentPrefix() = "# "
//}
