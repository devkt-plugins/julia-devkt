package org.ice1000.julia.devkt.lang.docfmt

import org.ice1000.julia.devkt.lang.docfmt.psi.DocfmtTypes
import org.jetbrains.kotlin.com.intellij.lang.ASTNode
import org.jetbrains.kotlin.com.intellij.lang.ParserDefinition
import org.jetbrains.kotlin.com.intellij.lexer.FlexAdapter
import org.jetbrains.kotlin.com.intellij.openapi.project.Project
import org.jetbrains.kotlin.com.intellij.psi.FileViewProvider
import org.jetbrains.kotlin.com.intellij.psi.PsiElement
import org.jetbrains.kotlin.com.intellij.psi.tree.*

class DocfmtLexerAdapter : FlexAdapter(DocfmtLexer())

object DocfmtParserDefinition : ParserDefinition {
	private val FILE = IFileElementType(DocfmtLanguage.INSTANCE)
	override fun spaceExistanceTypeBetweenTokens(left: ASTNode?, right: ASTNode?) = ParserDefinition.SpaceRequirements.MAY
	override fun createParser(project: Project?) = DocfmtParser()
	override fun createFile(viewProvider: FileViewProvider) = DocfmtFile(viewProvider)
	override fun createElement(node: ASTNode?): PsiElement = DocfmtTypes.Factory.createElement(node)
	override fun getCommentTokens() = DocfmtTokenType.COMMENTS
	override fun createLexer(project: Project?) = DocfmtLexerAdapter()
	override fun getWhitespaceTokens() = TokenSet.WHITE_SPACE
	override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY
	override fun getFileNodeType() = FILE
}

class DocfmtTokenType(debugName: String) : IElementType(debugName, DocfmtLanguage.INSTANCE) {
	companion object TokenHolder {
		@JvmField
		val COMMENTS = TokenSet.create(DocfmtTypes.LINE_COMMENT)
	}
}

class DocfmtElementType(debugName: String) : IElementType(debugName, DocfmtLanguage.INSTANCE)
