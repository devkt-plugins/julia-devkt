package org.ice1000.julia.devkt.lang

import org.ice1000.devkt.openapi.ColorScheme
import org.ice1000.julia.devkt.lang.psi.JuliaTypes
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType

object JuliaHighlighter {
	private val UNICODE_OPERATOR_LIST = listOf(
		JuliaTypes.MISC_ARROW_SYM,
		JuliaTypes.MISC_COMPARISON_SYM,
		JuliaTypes.MISC_PLUS_SYM,
		JuliaTypes.MISC_MULTIPLY_SYM,
		JuliaTypes.MISC_EXPONENT_SYM
	)

	private val ASSIGNMENT_OPERATOR_LIST = JuliaTokenType.ASSIGN_OPERATORS.types.asList()
	private val OPERATOR_LIST = JuliaTokenType.BINARY_OPERATORS.types.asList()

	private val KEYWORDS_LIST = listOf(
		JuliaTypes.END_KEYWORD,
		JuliaTypes.MODULE_KEYWORD,
		JuliaTypes.BAREMODULE_KEYWORD,
		JuliaTypes.BREAK_KEYWORD,
		JuliaTypes.CONTINUE_KEYWORD,
		JuliaTypes.EXPORT_KEYWORD,
		JuliaTypes.IMPORT_KEYWORD,
		JuliaTypes.IMPORTALL_KEYWORD,
		JuliaTypes.USING_KEYWORD,
		JuliaTypes.IF_KEYWORD,
		JuliaTypes.ELSEIF_KEYWORD,
		JuliaTypes.ELSE_KEYWORD,
		JuliaTypes.FOR_KEYWORD,
		JuliaTypes.WHILE_KEYWORD,
		JuliaTypes.IN_KEYWORD,
		JuliaTypes.RETURN_KEYWORD,
		JuliaTypes.TRY_KEYWORD,
		JuliaTypes.CATCH_KEYWORD,
		JuliaTypes.FINALLY_KEYWORD,
		JuliaTypes.FUNCTION_KEYWORD,
		JuliaTypes.TYPE_KEYWORD,
		JuliaTypes.ABSTRACT_KEYWORD,
		JuliaTypes.PRIMITIVE_KEYWORD,
		JuliaTypes.STRUCT_KEYWORD,
		JuliaTypes.TYPEALIAS_KEYWORD,
		JuliaTypes.IMMUTABLE_KEYWORD,
		JuliaTypes.MUTABLE_KEYWORD,
		JuliaTypes.TRUE_KEYWORD,
		JuliaTypes.FALSE_KEYWORD,
		JuliaTypes.QUOTE_KEYWORD,
		JuliaTypes.MACRO_KEYWORD,
		JuliaTypes.LOCAL_KEYWORD,
		JuliaTypes.GLOBAL_KEYWORD,
		JuliaTypes.CONST_KEYWORD,
		JuliaTypes.LET_KEYWORD,
		JuliaTypes.DO_KEYWORD,
		JuliaTypes.BEGIN_KEYWORD,
		JuliaTypes.UNION_KEYWORD,
		JuliaTypes.WHERE_KEYWORD
	)

	/** parentheses */
	private val BRACKETS = listOf(JuliaTypes.LEFT_BRACKET, JuliaTypes.RIGHT_BRACKET)
	/** braces */
	private val B_BRACKETS = listOf(JuliaTypes.LEFT_B_BRACKET, JuliaTypes.RIGHT_B_BRACKET)
	/** brackets */
	private val M_BRACKETS = listOf(JuliaTypes.LEFT_M_BRACKET, JuliaTypes.RIGHT_M_BRACKET)

	fun <T> getTokenHighlights(type: IElementType?, colorScheme: ColorScheme<T>) = when (type) {
		JuliaTypes.QUOTE_START,
		JuliaTypes.QUOTE_END,
		JuliaTypes.CMD_QUOTE_START,
		JuliaTypes.CMD_QUOTE_END,
		JuliaTypes.TRIPLE_QUOTE_START,
		JuliaTypes.TRIPLE_QUOTE_END,
		JuliaTypes.REGEX_START,
		JuliaTypes.REGEX_END,
		JuliaTypes.REGULAR_STRING_PART_LITERAL -> colorScheme.string
		JuliaTypes.STRING_INTERPOLATE_START,
		JuliaTypes.STRING_INTERPOLATE_END -> colorScheme.interpolation
		JuliaTypes.STRING_ESCAPE,
		JuliaTypes.STRING_UNICODE -> colorScheme.stringEscape
		JuliaTypes.CHAR_LITERAL -> colorScheme.charLiteral
		JuliaTypes.LINE_COMMENT -> colorScheme.lineComments
		JuliaTypes.BLOCK_COMMENT_BODY,
		JuliaTypes.BLOCK_COMMENT_END,
		JuliaTypes.BLOCK_COMMENT_START -> colorScheme.blockComments
		JuliaTypes.INT_LITERAL,
		JuliaTypes.FLOAT_LITERAL -> colorScheme.numbers
		JuliaTypes.SEMICOLON_SYM -> colorScheme.semicolon
		JuliaTypes.FLOAT_CONSTANT -> colorScheme.predefined
		JuliaTypes.MACRO_SYM -> colorScheme.macro
		in BRACKETS -> colorScheme.parentheses
		in M_BRACKETS -> colorScheme.brackets
		in B_BRACKETS -> colorScheme.braces
		in KEYWORDS_LIST -> colorScheme.keywords
		in OPERATOR_LIST -> colorScheme.operators
		in ASSIGNMENT_OPERATOR_LIST -> colorScheme.operators
		in UNICODE_OPERATOR_LIST -> colorScheme.operators
		else -> null
	}
}
