package org.ice1000.julia.devkt.lang

import org.ice1000.julia.devkt.lang.psi.JuliaTypes
import org.jetbrains.kotlin.com.intellij.lang.*
import org.jetbrains.kotlin.com.intellij.lexer.FlexAdapter
import org.jetbrains.kotlin.com.intellij.openapi.project.Project
import org.jetbrains.kotlin.com.intellij.psi.*
import org.jetbrains.kotlin.com.intellij.psi.tree.*

class JuliaLexerAdapter : FlexAdapter(JuliaLexer())

object JuliaParserDefinition : ParserDefinition {
	private val FILE = IFileElementType(JuliaLanguage.INSTANCE)
	override fun createParser(project: Project?): PsiParser = JuliaParser()
	override fun createFile(viewProvider: FileViewProvider) = JuliaFile(viewProvider)
	override fun spaceExistanceTypeBetweenTokens(left: ASTNode?, right: ASTNode?) = ParserDefinition.SpaceRequirements.MAY
	override fun getStringLiteralElements() = JuliaTokenType.STRINGS
	override fun getFileNodeType() = FILE
	override fun createLexer(project: Project?) = JuliaLexerAdapter()
	override fun createElement(node: ASTNode?): PsiElement = JuliaTypes.Factory.createElement(node)
	override fun getCommentTokens() = JuliaTokenType.COMMENTS
	override fun getWhitespaceTokens() = TokenSet.WHITE_SPACE
}

class JuliaTokenType(debugName: String) : IElementType(debugName, JuliaLanguage.INSTANCE) {
	companion object TokenHolder {
		@JvmField
		val COMMENTS = TokenSet.create(
				JuliaTypes.BLOCK_COMMENT_BODY,
				JuliaTypes.BLOCK_COMMENT_START,
				JuliaTypes.BLOCK_COMMENT_END,
				JuliaTypes.LINE_COMMENT
		)

		@JvmField
		val STRINGS = TokenSet.create(
				JuliaTypes.REGULAR_STRING_PART_LITERAL,
				JuliaTypes.STRING_CONTENT
		)

		@JvmField
		val BINARY_OPERATORS = TokenSet.create(
				JuliaTypes.SPECIAL_ARROW_SYM,
				JuliaTypes.DOT_SYM,
				JuliaTypes.DOUBLE_COLON,
				JuliaTypes.COLON_SYM,
				JuliaTypes.TRANSPOSE_SYM,
				JuliaTypes.FACTORISE_SYM,
				JuliaTypes.EXPONENT_SYM,
				JuliaTypes.EQUALS_SYM,
				JuliaTypes.NOT_SYM,
				JuliaTypes.BITWISE_NOT_SYM,
				JuliaTypes.BITWISE_AND_SYM,
				JuliaTypes.BITWISE_OR_SYM,
				JuliaTypes.BITWISE_XOR_SYM,
				JuliaTypes.REMAINDER_SYM,
				JuliaTypes.SUBTYPE_SYM,
				JuliaTypes.INTERPOLATE_SYM,
				JuliaTypes.INVERSE_DIV_SYM,
				JuliaTypes.IS_SYM,
				JuliaTypes.ISNT_SYM,
				JuliaTypes.LAMBDA_ABSTRACTION,
				JuliaTypes.SLICE_SYM,
				JuliaTypes.LESS_THAN_SYM,
				JuliaTypes.LESS_THAN_OR_EQUAL_SYM,
				JuliaTypes.USHR_SYM,
				JuliaTypes.AND_SYM,
				JuliaTypes.OR_SYM,
				JuliaTypes.INVERSE_PIPE_SYM,
				JuliaTypes.PIPE_SYM,
				JuliaTypes.SHL_SYM,
				JuliaTypes.SHR_SYM,
				JuliaTypes.PLUS_SYM,
				JuliaTypes.MINUS_SYM,
				JuliaTypes.MULTIPLY_SYM,
				JuliaTypes.UNEQUAL_SYM,
				JuliaTypes.IN_SYM,
				JuliaTypes.FRACTION_SYM,
				JuliaTypes.GREATER_THAN_SYM,
				JuliaTypes.GREATER_THAN_OR_EQUAL_SYM,
				JuliaTypes.DIVIDE_SYM
		)

		@JvmField
		val ASSIGN_OPERATORS = TokenSet.create(
				JuliaTypes.EQ_SYM,
				JuliaTypes.INVERSE_DIV_ASSIGN_SYM,
				JuliaTypes.USHR_ASSIGN_SYM,
				JuliaTypes.SHL_ASSIGN_SYM,
				JuliaTypes.SHR_ASSIGN_SYM,
				JuliaTypes.PLUS_ASSIGN_SYM,
				JuliaTypes.MINUS_ASSIGN_SYM,
				JuliaTypes.MULTIPLY_ASSIGN_SYM,
				JuliaTypes.DIVIDE_ASSIGN_SYM,
				JuliaTypes.FRACTION_ASSIGN_SYM,
				JuliaTypes.FACTORISE_ASSIGN_SYM,
				JuliaTypes.EXPONENT_ASSIGN_SYM,
				JuliaTypes.BITWISE_AND_ASSIGN_SYM,
				JuliaTypes.BITWISE_OR_ASSIGN_SYM,
				JuliaTypes.BITWISE_XOR_ASSIGN_SYM,
				JuliaTypes.REMAINDER_ASSIGN_SYM
		)

		@JvmField
		val CONCATENATABLE_TOKENS = TokenSet.orSet(COMMENTS, STRINGS)

		fun fromText(code: String, project: Project): PsiElement = PsiFileFactory
				.getInstance(project)
				.createFileFromText(JuliaLanguage.INSTANCE, code)
				.firstChild
	}
}

class JuliaElementType(debugName: String) : IElementType(debugName, JuliaLanguage.INSTANCE)
