package org.ice1000.julia.devkt.lang

import org.ice1000.julia.devkt.lang.psi.JuliaTypes

object JuliaHighlighter {
	@JvmField
	val UNICODE_OPERATOR_LIST = listOf(
			JuliaTypes.MISC_ARROW_SYM,
			JuliaTypes.MISC_COMPARISON_SYM,
			JuliaTypes.MISC_PLUS_SYM,
			JuliaTypes.MISC_MULTIPLY_SYM,
			JuliaTypes.MISC_EXPONENT_SYM
	)

	@JvmField
	val ASSIGNMENT_OPERATOR_LIST = JuliaTokenType.ASSIGN_OPERATORS.types.asList()
	@JvmField
	val OPERATOR_LIST = JuliaTokenType.BINARY_OPERATORS.types.asList()

	@JvmField
	val KEYWORDS_LIST = listOf(
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
	@JvmField
	val BRACKETS = listOf(JuliaTypes.LEFT_BRACKET, JuliaTypes.RIGHT_BRACKET)
	/** braces */
	@JvmField
	val B_BRACKETS = listOf(JuliaTypes.LEFT_B_BRACKET, JuliaTypes.RIGHT_B_BRACKET)
	/** brackets */
	@JvmField
	val M_BRACKETS = listOf(JuliaTypes.LEFT_M_BRACKET, JuliaTypes.RIGHT_M_BRACKET)
}
