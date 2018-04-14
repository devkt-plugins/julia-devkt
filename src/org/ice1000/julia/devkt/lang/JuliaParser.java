// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang;

import org.jetbrains.kotlin.com.intellij.lang.PsiBuilder;
import org.jetbrains.kotlin.com.intellij.lang.PsiBuilder.Marker;

import static org.jetbrains.kotlin.com.intellij.lang.parser.GeneratedParserUtilBase.*;
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.tree.TokenSet;
import org.jetbrains.kotlin.com.intellij.lang.PsiParser;
import org.jetbrains.kotlin.com.intellij.lang.LightPsiParser;
import org.ice1000.julia.devkt.lang.psi.JuliaTypes;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class JuliaParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, EXTENDS_SETS_);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == JuliaTypes.ARGUMENTS) {
      result_ = arguments(builder_, 0);
    }
    else if (root_ == JuliaTypes.ASSIGN_LEVEL_OPERATOR) {
      result_ = assignLevelOperator(builder_, 0);
    }
    else if (root_ == JuliaTypes.BITWISE_LEVEL_OPERATOR) {
      result_ = bitwiseLevelOperator(builder_, 0);
    }
    else if (root_ == JuliaTypes.CATCH_CLAUSE) {
      result_ = catchClause(builder_, 0);
    }
    else if (root_ == JuliaTypes.COLON_SYM_BEGINS) {
      result_ = colonSymBegins(builder_, 0);
    }
    else if (root_ == JuliaTypes.COMPARISON_LEVEL_OPERATOR) {
      result_ = comparisonLevelOperator(builder_, 0);
    }
    else if (root_ == JuliaTypes.COMPREHENSION_ELEMENT) {
      result_ = comprehensionElement(builder_, 0);
    }
    else if (root_ == JuliaTypes.DO_BLOCK) {
      result_ = doBlock(builder_, 0);
    }
    else if (root_ == JuliaTypes.ELSE_CLAUSE) {
      result_ = elseClause(builder_, 0);
    }
    else if (root_ == JuliaTypes.ELSE_IF_CLAUSE) {
      result_ = elseIfClause(builder_, 0);
    }
    else if (root_ == JuliaTypes.EXPR) {
      result_ = expr(builder_, 0, -1);
    }
    else if (root_ == JuliaTypes.EXPR_OR_END) {
      result_ = exprOrEnd(builder_, 0, -1);
    }
    else if (root_ == JuliaTypes.FINALLY_CLAUSE) {
      result_ = finallyClause(builder_, 0);
    }
    else if (root_ == JuliaTypes.FUNCTION_SIGNATURE) {
      result_ = functionSignature(builder_, 0);
    }
    else if (root_ == JuliaTypes.GLOBAL_STATEMENT) {
      result_ = globalStatement(builder_, 0);
    }
    else if (root_ == JuliaTypes.MEMBER_ACCESS) {
      result_ = memberAccess(builder_, 0);
    }
    else if (root_ == JuliaTypes.MODULE_DECLARATION) {
      result_ = moduleDeclaration(builder_, 0);
    }
    else if (root_ == JuliaTypes.MULTI_INDEXER) {
      result_ = multiIndexer(builder_, 0);
    }
    else if (root_ == JuliaTypes.MULTIPLY_LEVEL_OPERATOR) {
      result_ = multiplyLevelOperator(builder_, 0);
    }
    else if (root_ == JuliaTypes.NAMED_PARAMETER) {
      result_ = namedParameter(builder_, 0);
    }
    else if (root_ == JuliaTypes.OP_AS_SYMBOL) {
      result_ = opAsSymbol(builder_, 0);
    }
    else if (root_ == JuliaTypes.PIPE_LEVEL_OPERATOR) {
      result_ = pipeLevelOperator(builder_, 0);
    }
    else if (root_ == JuliaTypes.PLUS_LEVEL_OPERATOR) {
      result_ = plusLevelOperator(builder_, 0);
    }
    else if (root_ == JuliaTypes.SINGLE_COMPREHENSION) {
      result_ = singleComprehension(builder_, 0);
    }
    else if (root_ == JuliaTypes.SINGLE_INDEXER) {
      result_ = singleIndexer(builder_, 0);
    }
    else if (root_ == JuliaTypes.STATEMENTS) {
      result_ = statements(builder_, 0);
    }
    else if (root_ == JuliaTypes.STRING_CONTENT) {
      result_ = stringContent(builder_, 0);
    }
    else if (root_ == JuliaTypes.TEMPLATE) {
      result_ = template(builder_, 0);
    }
    else if (root_ == JuliaTypes.TYPE_ANNOTATION) {
      result_ = typeAnnotation(builder_, 0);
    }
    else if (root_ == JuliaTypes.TYPE_PARAMETERS) {
      result_ = typeParameters(builder_, 0);
    }
    else if (root_ == JuliaTypes.TYPED_NAMED_VARIABLE) {
      result_ = typedNamedVariable(builder_, 0);
    }
    else if (root_ == JuliaTypes.UNARY_OP_AS_SYMBOL) {
      result_ = unaryOpAsSymbol(builder_, 0);
    }
    else if (root_ == JuliaTypes.UNTYPED_VARIABLES) {
      result_ = untypedVariables(builder_, 0);
    }
    else if (root_ == JuliaTypes.USER_TYPE) {
      result_ = userType(builder_, 0);
    }
    else if (root_ == JuliaTypes.WHERE_CLAUSE) {
      result_ = whereClause(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return juliaFile(builder_, level_ + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(JuliaTypes.END, JuliaTypes.EXPR_OR_END, JuliaTypes.EXPR_WRAPPER, JuliaTypes.MULTIPLY_INDEXING,
      JuliaTypes.PLUS_INDEXING, JuliaTypes.RANGE_INDEXING),
    create_token_set_(JuliaTypes.ABSTRACT_TYPE_DECLARATION, JuliaTypes.AND_OP, JuliaTypes.APPLY_FUNCTION_OP, JuliaTypes.APPLY_INDEX_OP,
      JuliaTypes.APPLY_MACRO_OP, JuliaTypes.APPLY_WHERE_OP, JuliaTypes.ARRAY, JuliaTypes.ARROW_OP,
      JuliaTypes.ASSIGN_LEVEL_OP, JuliaTypes.ASSIGN_OP, JuliaTypes.BITWISE_LEVEL_OP, JuliaTypes.BIT_WISE_NOT_OP,
      JuliaTypes.BLOCK, JuliaTypes.BOOLEAN_LIT, JuliaTypes.BRACKETED_EXPR, JuliaTypes.BREAK_EXPR,
      JuliaTypes.CHAR_LIT, JuliaTypes.COLON_BLOCK, JuliaTypes.COLON_OP, JuliaTypes.COMMAND,
      JuliaTypes.COMPACT_FUNCTION, JuliaTypes.COMPARISON_LEVEL_OP, JuliaTypes.COMPOUND_QUOTE_OP, JuliaTypes.CONTINUE_EXPR,
      JuliaTypes.DO_BLOCK, JuliaTypes.EXPONENT_OP, JuliaTypes.EXPORT, JuliaTypes.EXPR,
      JuliaTypes.FLOAT_LIT, JuliaTypes.FOR_COMPREHENSION, JuliaTypes.FOR_EXPR, JuliaTypes.FRACTION_OP,
      JuliaTypes.FUNCTION, JuliaTypes.IF_EXPR, JuliaTypes.IMPLICIT_MULTIPLY_OP, JuliaTypes.IMPORT_ALL_EXPR,
      JuliaTypes.IMPORT_EXPR, JuliaTypes.INTEGER, JuliaTypes.IN_AS_OP, JuliaTypes.IN_OP,
      JuliaTypes.LAMBDA, JuliaTypes.LET, JuliaTypes.MACRO, JuliaTypes.MACRO_SYMBOL,
      JuliaTypes.MEMBER_ACCESS_OP, JuliaTypes.MISC_ARROWS_OP, JuliaTypes.MISC_EXPONENT_OP, JuliaTypes.MULTIPLY_LEVEL_OP,
      JuliaTypes.NOT_OP, JuliaTypes.OP_AS_SYMBOL, JuliaTypes.OR_OP, JuliaTypes.PIPE_LEVEL_OP,
      JuliaTypes.PLUS_LEVEL_OP, JuliaTypes.PRIMITIVE_TYPE_DECLARATION, JuliaTypes.QUOTE_OP, JuliaTypes.RANGE_OP,
      JuliaTypes.REGEX, JuliaTypes.RETURN_EXPR, JuliaTypes.SPLICE_OP, JuliaTypes.STRING,
      JuliaTypes.SYMBOL, JuliaTypes.SYMBOL_LHS, JuliaTypes.TERNARY_OP, JuliaTypes.TRANSPOSE_OP,
      JuliaTypes.TRY_CATCH, JuliaTypes.TUPLE, JuliaTypes.TYPE, JuliaTypes.TYPE_ALIAS,
      JuliaTypes.TYPE_DECLARATION, JuliaTypes.TYPE_OP, JuliaTypes.UNARY_INTERPOLATE_OP, JuliaTypes.UNARY_MINUS_OP,
      JuliaTypes.UNARY_OP_AS_SYMBOL, JuliaTypes.UNARY_PLUS_OP, JuliaTypes.UNARY_SUBTYPE_OP, JuliaTypes.UNARY_TYPE_OP,
      JuliaTypes.UNION, JuliaTypes.USING, JuliaTypes.WHILE_EXPR),
  };

  /* ********************************************************** */
  // (DOT_SYM | DOUBLE_DOT_SYM | SLICE_SYM)? memberAccess
  static boolean access(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "access")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = access_0(builder_, level_ + 1);
    result_ = result_ && memberAccess(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (DOT_SYM | DOUBLE_DOT_SYM | SLICE_SYM)?
  private static boolean access_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "access_0")) return false;
    access_0_0(builder_, level_ + 1);
    return true;
  }

  // DOT_SYM | DOUBLE_DOT_SYM | SLICE_SYM
  private static boolean access_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "access_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.DOT_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.DOUBLE_DOT_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.SLICE_SYM);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (symbol | LEFT_B_BRACKET symbol RIGHT_B_BRACKET)
  //     ((SUBTYPE_SYM | EQ_SYM) endOfLine expr)?
  //  | LEFT_B_BRACKET
  //     (afterWhere (commaSep afterWhere)*)?
  //      COMMA_SYM? endOfLine
  //    RIGHT_B_BRACKET
  static boolean afterWhere(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "afterWhere")) return false;
    if (!nextTokenIs(builder_, "", JuliaTypes.LEFT_B_BRACKET, JuliaTypes.SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = afterWhere_0(builder_, level_ + 1);
    if (!result_) result_ = afterWhere_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (symbol | LEFT_B_BRACKET symbol RIGHT_B_BRACKET)
  //     ((SUBTYPE_SYM | EQ_SYM) endOfLine expr)?
  private static boolean afterWhere_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "afterWhere_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = afterWhere_0_0(builder_, level_ + 1);
    result_ = result_ && afterWhere_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // symbol | LEFT_B_BRACKET symbol RIGHT_B_BRACKET
  private static boolean afterWhere_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "afterWhere_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = symbol(builder_, level_ + 1);
    if (!result_) result_ = afterWhere_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_B_BRACKET symbol RIGHT_B_BRACKET
  private static boolean afterWhere_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "afterWhere_0_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.LEFT_B_BRACKET);
    result_ = result_ && symbol(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.RIGHT_B_BRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ((SUBTYPE_SYM | EQ_SYM) endOfLine expr)?
  private static boolean afterWhere_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "afterWhere_0_1")) return false;
    afterWhere_0_1_0(builder_, level_ + 1);
    return true;
  }

  // (SUBTYPE_SYM | EQ_SYM) endOfLine expr
  private static boolean afterWhere_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "afterWhere_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = afterWhere_0_1_0_0(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // SUBTYPE_SYM | EQ_SYM
  private static boolean afterWhere_0_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "afterWhere_0_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.SUBTYPE_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.EQ_SYM);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_B_BRACKET
  //     (afterWhere (commaSep afterWhere)*)?
  //      COMMA_SYM? endOfLine
  //    RIGHT_B_BRACKET
  private static boolean afterWhere_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "afterWhere_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.LEFT_B_BRACKET);
    result_ = result_ && afterWhere_1_1(builder_, level_ + 1);
    result_ = result_ && afterWhere_1_2(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.RIGHT_B_BRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (afterWhere (commaSep afterWhere)*)?
  private static boolean afterWhere_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "afterWhere_1_1")) return false;
    afterWhere_1_1_0(builder_, level_ + 1);
    return true;
  }

  // afterWhere (commaSep afterWhere)*
  private static boolean afterWhere_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "afterWhere_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = afterWhere(builder_, level_ + 1);
    result_ = result_ && afterWhere_1_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (commaSep afterWhere)*
  private static boolean afterWhere_1_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "afterWhere_1_1_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!afterWhere_1_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "afterWhere_1_1_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // commaSep afterWhere
  private static boolean afterWhere_1_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "afterWhere_1_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = commaSep(builder_, level_ + 1);
    result_ = result_ && afterWhere(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // COMMA_SYM?
  private static boolean afterWhere_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "afterWhere_1_2")) return false;
    consumeToken(builder_, JuliaTypes.COMMA_SYM);
    return true;
  }

  /* ********************************************************** */
  // SEMICOLON_SYM endOfLine
  //  (
  //    namedParameter
  //   (commaSep namedParameter)*
  //  )?
  //  endOfLine
  public static boolean arguments(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arguments")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.SEMICOLON_SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.SEMICOLON_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && arguments_2(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, JuliaTypes.ARGUMENTS, result_);
    return result_;
  }

  // (
  //    namedParameter
  //   (commaSep namedParameter)*
  //  )?
  private static boolean arguments_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arguments_2")) return false;
    arguments_2_0(builder_, level_ + 1);
    return true;
  }

  // namedParameter
  //   (commaSep namedParameter)*
  private static boolean arguments_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arguments_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = namedParameter(builder_, level_ + 1);
    result_ = result_ && arguments_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (commaSep namedParameter)*
  private static boolean arguments_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arguments_2_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!arguments_2_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "arguments_2_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // commaSep namedParameter
  private static boolean arguments_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arguments_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = commaSep(builder_, level_ + 1);
    result_ = result_ && namedParameter(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // COLON_ASSIGN_SYM
  //  | BITWISE_AND_ASSIGN_SYM
  //  | BITWISE_OR_ASSIGN_SYM
  //  | BITWISE_XOR_ASSIGN_SYM
  //  | INVERSE_DIV_ASSIGN_SYM
  //  | SHL_ASSIGN_SYM
  //  | SHR_ASSIGN_SYM
  //  | REMAINDER_ASSIGN_SYM
  //  | USHR_ASSIGN_SYM
  //  | PLUS_ASSIGN_SYM
  //  | MINUS_ASSIGN_SYM
  //  | MULTIPLY_ASSIGN_SYM
  //  | FRACTION_ASSIGN_SYM
  //  | DIVIDE_ASSIGN_SYM
  //  | FACTORISE_ASSIGN_SYM
  //  | EXPONENT_ASSIGN_SYM
  public static boolean assignLevelOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignLevelOperator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.ASSIGN_LEVEL_OPERATOR, "<assign level operator>");
    result_ = consumeToken(builder_, JuliaTypes.COLON_ASSIGN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.BITWISE_AND_ASSIGN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.BITWISE_OR_ASSIGN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.BITWISE_XOR_ASSIGN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.INVERSE_DIV_ASSIGN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.SHL_ASSIGN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.SHR_ASSIGN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.REMAINDER_ASSIGN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.USHR_ASSIGN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.PLUS_ASSIGN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.MINUS_ASSIGN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.MULTIPLY_ASSIGN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.FRACTION_ASSIGN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.DIVIDE_ASSIGN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.FACTORISE_ASSIGN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.EXPONENT_ASSIGN_SYM);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // SHR_SYM
  //  | USHR_SYM
  //  | SHL_SYM
  public static boolean bitwiseLevelOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwiseLevelOperator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.BITWISE_LEVEL_OPERATOR, "<bitwise level operator>");
    result_ = consumeToken(builder_, JuliaTypes.SHR_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.USHR_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.SHL_SYM);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // BLOCK_COMMENT_START (BLOCK_COMMENT_BODY | blockComment)* BLOCK_COMMENT_END
  static boolean blockComment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "blockComment")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.BLOCK_COMMENT_START)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.BLOCK_COMMENT_START);
    result_ = result_ && blockComment_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.BLOCK_COMMENT_END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (BLOCK_COMMENT_BODY | blockComment)*
  private static boolean blockComment_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "blockComment_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!blockComment_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "blockComment_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // BLOCK_COMMENT_BODY | blockComment
  private static boolean blockComment_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "blockComment_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.BLOCK_COMMENT_BODY);
    if (!result_) result_ = blockComment(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CATCH_KEYWORD symbol? endOfLine
  //  statements
  public static boolean catchClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "catchClause")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.CATCH_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.CATCH_KEYWORD);
    result_ = result_ && catchClause_1(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && statements(builder_, level_ + 1);
    exit_section_(builder_, marker_, JuliaTypes.CATCH_CLAUSE, result_);
    return result_;
  }

  // symbol?
  private static boolean catchClause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "catchClause_1")) return false;
    symbol(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // COLON_SYM endOfLine LEFT_BRACKET
  public static boolean colonSymBegins(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "colonSymBegins")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.COLON_SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.COLON_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.LEFT_BRACKET);
    exit_section_(builder_, marker_, JuliaTypes.COLON_SYM_BEGINS, result_);
    return result_;
  }

  /* ********************************************************** */
  // endOfLine COMMA_SYM endOfLine
  static boolean commaSep(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "commaSep")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = endOfLine(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.COMMA_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // blockComment | LINE_COMMENT
  static boolean comment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comment")) return false;
    if (!nextTokenIs(builder_, "", JuliaTypes.BLOCK_COMMENT_START, JuliaTypes.LINE_COMMENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = blockComment(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.LINE_COMMENT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LESS_THAN_SYM
  //  | LESS_THAN_OR_EQUAL_SYM
  //  | GREATER_THAN_SYM
  //  | GREATER_THAN_OR_EQUAL_SYM
  //  | EQUALS_SYM
  //  | UNEQUAL_SYM
  //  | IS_SYM
  //  | ISNT_SYM
  //  | SUBTYPE_SYM
  //  | MISC_COMPARISON_SYM
  public static boolean comparisonLevelOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comparisonLevelOperator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.COMPARISON_LEVEL_OPERATOR, "<comparison level operator>");
    result_ = consumeToken(builder_, JuliaTypes.LESS_THAN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.LESS_THAN_OR_EQUAL_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.GREATER_THAN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.GREATER_THAN_OR_EQUAL_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.EQUALS_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.UNEQUAL_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.IS_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.ISNT_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.SUBTYPE_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.MISC_COMPARISON_SYM);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // endOfLine expr endOfLine
  //  (
  //   FOR_KEYWORD
  //   singleComprehension
  //    (commaSep singleComprehension)?)+
  public static boolean comprehensionElement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comprehensionElement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.COMPREHENSION_ELEMENT, "<comprehension element>");
    result_ = endOfLine(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && comprehensionElement_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (
  //   FOR_KEYWORD
  //   singleComprehension
  //    (commaSep singleComprehension)?)+
  private static boolean comprehensionElement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comprehensionElement_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comprehensionElement_3_0(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!comprehensionElement_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "comprehensionElement_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // FOR_KEYWORD
  //   singleComprehension
  //    (commaSep singleComprehension)?
  private static boolean comprehensionElement_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comprehensionElement_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.FOR_KEYWORD);
    result_ = result_ && singleComprehension(builder_, level_ + 1);
    result_ = result_ && comprehensionElement_3_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (commaSep singleComprehension)?
  private static boolean comprehensionElement_3_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comprehensionElement_3_0_2")) return false;
    comprehensionElement_3_0_2_0(builder_, level_ + 1);
    return true;
  }

  // commaSep singleComprehension
  private static boolean comprehensionElement_3_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comprehensionElement_3_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = commaSep(builder_, level_ + 1);
    result_ = result_ && singleComprehension(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DO_KEYWORD statements END_KEYWORD
  public static boolean doBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "doBlock")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.DO_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.DO_KEYWORD);
    result_ = result_ && statements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.END_KEYWORD);
    exit_section_(builder_, marker_, JuliaTypes.DO_BLOCK, result_);
    return result_;
  }

  /* ********************************************************** */
  // ELSE_KEYWORD statements
  public static boolean elseClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elseClause")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.ELSE_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.ELSE_KEYWORD);
    result_ = result_ && statements(builder_, level_ + 1);
    exit_section_(builder_, marker_, JuliaTypes.ELSE_CLAUSE, result_);
    return result_;
  }

  /* ********************************************************** */
  // ELSEIF_KEYWORD expr endOfLine
  //  statements
  public static boolean elseIfClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elseIfClause")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.ELSEIF_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.ELSEIF_KEYWORD);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && statements(builder_, level_ + 1);
    exit_section_(builder_, marker_, JuliaTypes.ELSE_IF_CLAUSE, result_);
    return result_;
  }

  /* ********************************************************** */
  // endOfLineImpl*
  static boolean endOfLine(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "endOfLine")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!endOfLineImpl(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "endOfLine", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // EOL | comment
  static boolean endOfLineImpl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "endOfLineImpl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.EOL);
    if (!result_) result_ = comment(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // expr (commaSep expr)* COMMA_SYM?
  static boolean expressionList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expressionList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1, -1);
    result_ = result_ && expressionList_1(builder_, level_ + 1);
    result_ = result_ && expressionList_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (commaSep expr)*
  private static boolean expressionList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expressionList_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!expressionList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "expressionList_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // commaSep expr
  private static boolean expressionList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expressionList_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = commaSep(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // COMMA_SYM?
  private static boolean expressionList_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expressionList_2")) return false;
    consumeToken(builder_, JuliaTypes.COMMA_SYM);
    return true;
  }

  /* ********************************************************** */
  // FINALLY_KEYWORD statements
  public static boolean finallyClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "finallyClause")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.FINALLY_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.FINALLY_KEYWORD);
    result_ = result_ && statements(builder_, level_ + 1);
    exit_section_(builder_, marker_, JuliaTypes.FINALLY_CLAUSE, result_);
    return result_;
  }

  /* ********************************************************** */
  // LEFT_BRACKET endOfLine
  //   (typedNamedVariable (commaSep typedNamedVariable)*)?
  //   (SEMICOLON_SYM endOfLine
  //    (typedNamedVariable (commaSep typedNamedVariable)*)?)?
  //   commaSep?
  //   (SLICE_SYM endOfLine)?
  //  RIGHT_BRACKET
  public static boolean functionSignature(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionSignature")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.LEFT_BRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.LEFT_BRACKET);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && functionSignature_2(builder_, level_ + 1);
    result_ = result_ && functionSignature_3(builder_, level_ + 1);
    result_ = result_ && functionSignature_4(builder_, level_ + 1);
    result_ = result_ && functionSignature_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.RIGHT_BRACKET);
    exit_section_(builder_, marker_, JuliaTypes.FUNCTION_SIGNATURE, result_);
    return result_;
  }

  // (typedNamedVariable (commaSep typedNamedVariable)*)?
  private static boolean functionSignature_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionSignature_2")) return false;
    functionSignature_2_0(builder_, level_ + 1);
    return true;
  }

  // typedNamedVariable (commaSep typedNamedVariable)*
  private static boolean functionSignature_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionSignature_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = typedNamedVariable(builder_, level_ + 1);
    result_ = result_ && functionSignature_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (commaSep typedNamedVariable)*
  private static boolean functionSignature_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionSignature_2_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!functionSignature_2_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "functionSignature_2_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // commaSep typedNamedVariable
  private static boolean functionSignature_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionSignature_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = commaSep(builder_, level_ + 1);
    result_ = result_ && typedNamedVariable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (SEMICOLON_SYM endOfLine
  //    (typedNamedVariable (commaSep typedNamedVariable)*)?)?
  private static boolean functionSignature_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionSignature_3")) return false;
    functionSignature_3_0(builder_, level_ + 1);
    return true;
  }

  // SEMICOLON_SYM endOfLine
  //    (typedNamedVariable (commaSep typedNamedVariable)*)?
  private static boolean functionSignature_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionSignature_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.SEMICOLON_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && functionSignature_3_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (typedNamedVariable (commaSep typedNamedVariable)*)?
  private static boolean functionSignature_3_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionSignature_3_0_2")) return false;
    functionSignature_3_0_2_0(builder_, level_ + 1);
    return true;
  }

  // typedNamedVariable (commaSep typedNamedVariable)*
  private static boolean functionSignature_3_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionSignature_3_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = typedNamedVariable(builder_, level_ + 1);
    result_ = result_ && functionSignature_3_0_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (commaSep typedNamedVariable)*
  private static boolean functionSignature_3_0_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionSignature_3_0_2_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!functionSignature_3_0_2_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "functionSignature_3_0_2_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // commaSep typedNamedVariable
  private static boolean functionSignature_3_0_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionSignature_3_0_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = commaSep(builder_, level_ + 1);
    result_ = result_ && typedNamedVariable(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // commaSep?
  private static boolean functionSignature_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionSignature_4")) return false;
    commaSep(builder_, level_ + 1);
    return true;
  }

  // (SLICE_SYM endOfLine)?
  private static boolean functionSignature_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionSignature_5")) return false;
    functionSignature_5_0(builder_, level_ + 1);
    return true;
  }

  // SLICE_SYM endOfLine
  private static boolean functionSignature_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionSignature_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.SLICE_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // GLOBAL_KEYWORD endOfLine
  //  symbol (COMMA_SYM endOfLine symbol)*
  public static boolean globalStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "globalStatement")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.GLOBAL_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.GLOBAL_KEYWORD);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && symbol(builder_, level_ + 1);
    result_ = result_ && globalStatement_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, JuliaTypes.GLOBAL_STATEMENT, result_);
    return result_;
  }

  // (COMMA_SYM endOfLine symbol)*
  private static boolean globalStatement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "globalStatement_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!globalStatement_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "globalStatement_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA_SYM endOfLine symbol
  private static boolean globalStatement_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "globalStatement_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.COMMA_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && symbol(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // access (COLON_SYM symbolAndMacroSymbol)? (commaSep access)*
  static boolean imported(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "imported")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = access(builder_, level_ + 1);
    result_ = result_ && imported_1(builder_, level_ + 1);
    result_ = result_ && imported_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COLON_SYM symbolAndMacroSymbol)?
  private static boolean imported_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "imported_1")) return false;
    imported_1_0(builder_, level_ + 1);
    return true;
  }

  // COLON_SYM symbolAndMacroSymbol
  private static boolean imported_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "imported_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.COLON_SYM);
    result_ = result_ && symbolAndMacroSymbol(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (commaSep access)*
  private static boolean imported_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "imported_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!imported_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "imported_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // commaSep access
  private static boolean imported_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "imported_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = commaSep(builder_, level_ + 1);
    result_ = result_ && access(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // multiIndexer | singleIndexer
  static boolean indexer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "indexer")) return false;
    if (!nextTokenIs(builder_, "", JuliaTypes.LEFT_BRACKET, JuliaTypes.SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = multiIndexer(builder_, level_ + 1);
    if (!result_) result_ = singleIndexer(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IN_KEYWORD | IN_SYM | EQ_SYM
  static boolean infixIndexer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "infixIndexer")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.IN_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.IN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.EQ_SYM);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // endOfLine statements
  static boolean juliaFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "juliaFile")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = endOfLine(builder_, level_ + 1);
    result_ = result_ && statements(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IN_KEYWORD
  //  | UNION_KEYWORD
  //  | opAsSymbol
  //  | symbolAndMacroSymbol (DOT_SYM symbolAndMacroSymbol)*
  public static boolean memberAccess(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "memberAccess")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.MEMBER_ACCESS, "<member access>");
    result_ = consumeToken(builder_, JuliaTypes.IN_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.UNION_KEYWORD);
    if (!result_) result_ = opAsSymbol(builder_, level_ + 1);
    if (!result_) result_ = memberAccess_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // symbolAndMacroSymbol (DOT_SYM symbolAndMacroSymbol)*
  private static boolean memberAccess_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "memberAccess_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = symbolAndMacroSymbol(builder_, level_ + 1);
    result_ = result_ && memberAccess_3_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (DOT_SYM symbolAndMacroSymbol)*
  private static boolean memberAccess_3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "memberAccess_3_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!memberAccess_3_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "memberAccess_3_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // DOT_SYM symbolAndMacroSymbol
  private static boolean memberAccess_3_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "memberAccess_3_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.DOT_SYM);
    result_ = result_ && symbolAndMacroSymbol(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (BAREMODULE_KEYWORD | MODULE_KEYWORD) symbol endOfLine
  //   statements
  //  END_KEYWORD
  public static boolean moduleDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "moduleDeclaration")) return false;
    if (!nextTokenIs(builder_, "<module declaration>", JuliaTypes.BAREMODULE_KEYWORD, JuliaTypes.MODULE_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.MODULE_DECLARATION, "<module declaration>");
    result_ = moduleDeclaration_0(builder_, level_ + 1);
    result_ = result_ && symbol(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && statements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.END_KEYWORD);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // BAREMODULE_KEYWORD | MODULE_KEYWORD
  private static boolean moduleDeclaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "moduleDeclaration_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.BAREMODULE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.MODULE_KEYWORD);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // tuple infixIndexer endOfLine expr
  public static boolean multiIndexer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiIndexer")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.LEFT_BRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = tuple(builder_, level_ + 1);
    result_ = result_ && infixIndexer(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, JuliaTypes.MULTI_INDEXER, result_);
    return result_;
  }

  /* ********************************************************** */
  // MULTIPLY_SYM
  //  | DIVIDE_SYM
  //  | REMAINDER_SYM
  //  | INVERSE_DIV_SYM
  //  | FACTORISE_SYM
  //  | BITWISE_AND_SYM
  //  | MISC_MULTIPLY_SYM
  public static boolean multiplyLevelOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplyLevelOperator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.MULTIPLY_LEVEL_OPERATOR, "<multiply level operator>");
    result_ = consumeToken(builder_, JuliaTypes.MULTIPLY_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.DIVIDE_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.REMAINDER_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.INVERSE_DIV_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.FACTORISE_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.BITWISE_AND_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.MISC_MULTIPLY_SYM);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // symbol endOfLine EQ_SYM endOfLine expr
  public static boolean namedParameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namedParameter")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = symbol(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.EQ_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, JuliaTypes.NAMED_PARAMETER, result_);
    return result_;
  }

  /* ********************************************************** */
  // SEMICOLON_SYM
  //  | QUESTION_SYM
  //  | SUBTYPE_SYM
  //  | INVERSE_DIV_SYM
  //  | IS_SYM
  //  | ISNT_SYM
  //  | EQ_SYM
  //  | LAMBDA_ABSTRACTION
  //  | ARROW_SYM
  //  | SLICE_SYM
  //  | LESS_THAN_SYM
  //  | LESS_THAN_OR_EQUAL_SYM
  //  | AND_SYM
  //  | OR_SYM
  //  | PIPE_SYM
  //  | INVRESE_PIPE_SYM
  //  | SHL_SYM
  //  | SHR_SYM
  //  | USHR_SYM
  //  | FRACTION_SYM
  //  | DIVIDE_SYM
  //  | REMAINDER_SYM
  //  | EXPONENT_SYM
  //  | MULTIPLY_SYM
  //  | EQUALS_SYM
  //  | UNEQUAL_SYM
  //  | GREATER_THAN_SYM
  //  | GREATER_THAN_OR_EQUAL_SYM
  //  | TRANSPOSE_SYM
  //  | IN_SYM
  //  | MISC_COMPARISON_SYM
  //  | MISC_PLUS_SYM
  //  | MISC_MULTIPLY_SYM
  //  | MISC_EXPONENT_SYM
  //  | FACTORISE_SYM
  //  | BITWISE_AND_SYM
  //  | BITWISE_OR_SYM
  //  | BITWISE_XOR_SYM
  //  | SPECIAL_ARROW_SYM
  //  | MISC_ARROW_SYM
  //  | BITWISE_NOT_SYM
  //  | ASSIGN_SYM
  public static boolean opAsSymbol(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "opAsSymbol")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.OP_AS_SYMBOL, "<op as symbol>");
    result_ = consumeToken(builder_, JuliaTypes.SEMICOLON_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.QUESTION_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.SUBTYPE_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.INVERSE_DIV_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.IS_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.ISNT_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.EQ_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.LAMBDA_ABSTRACTION);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.ARROW_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.SLICE_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.LESS_THAN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.LESS_THAN_OR_EQUAL_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.AND_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.OR_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.PIPE_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.INVRESE_PIPE_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.SHL_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.SHR_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.USHR_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.FRACTION_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.DIVIDE_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.REMAINDER_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.EXPONENT_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.MULTIPLY_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.EQUALS_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.UNEQUAL_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.GREATER_THAN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.GREATER_THAN_OR_EQUAL_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.TRANSPOSE_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.IN_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.MISC_COMPARISON_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.MISC_PLUS_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.MISC_MULTIPLY_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.MISC_EXPONENT_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.FACTORISE_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.BITWISE_AND_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.BITWISE_OR_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.BITWISE_XOR_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.SPECIAL_ARROW_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.MISC_ARROW_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.BITWISE_NOT_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.ASSIGN_SYM);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // PIPE_SYM | INVERSE_PIPE_SYM
  public static boolean pipeLevelOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pipeLevelOperator")) return false;
    if (!nextTokenIs(builder_, "<pipe level operator>", JuliaTypes.INVERSE_PIPE_SYM, JuliaTypes.PIPE_SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.PIPE_LEVEL_OPERATOR, "<pipe level operator>");
    result_ = consumeToken(builder_, JuliaTypes.PIPE_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.INVERSE_PIPE_SYM);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // INTERPOLATE_SYM
  //  | BITWISE_XOR_SYM
  //  | BITWISE_OR_SYM
  //  | PLUS_SYM
  //  | MINUS_SYM
  //  | MISC_PLUS_SYM
  public static boolean plusLevelOperator(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "plusLevelOperator")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.PLUS_LEVEL_OPERATOR, "<plus level operator>");
    result_ = consumeToken(builder_, JuliaTypes.INTERPOLATE_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.BITWISE_XOR_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.BITWISE_OR_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.PLUS_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.MINUS_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.MISC_PLUS_SYM);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // unaryOpAsSymbol
  //  | opAsSymbol
  //  | QUOTE_KEYWORD
  //  | expr
  static boolean quotable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "quotable")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = unaryOpAsSymbol(builder_, level_ + 1);
    if (!result_) result_ = opAsSymbol(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.QUOTE_KEYWORD);
    if (!result_) result_ = expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TRIPLE_QUOTE_START stringTemplateElement* TRIPLE_QUOTE_END
  static boolean rawStr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rawStr")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.TRIPLE_QUOTE_START)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.TRIPLE_QUOTE_START);
    result_ = result_ && rawStr_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.TRIPLE_QUOTE_END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // stringTemplateElement*
  private static boolean rawStr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rawStr_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!stringTemplateElement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "rawStr_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // endOfLineImpl | SEMICOLON_SYM
  static boolean semi(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "semi")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = endOfLineImpl(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.SEMICOLON_SYM);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // indexer (IF_KEYWORD expr)?
  public static boolean singleComprehension(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "singleComprehension")) return false;
    if (!nextTokenIs(builder_, "<single comprehension>", JuliaTypes.LEFT_BRACKET, JuliaTypes.SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.SINGLE_COMPREHENSION, "<single comprehension>");
    result_ = indexer(builder_, level_ + 1);
    result_ = result_ && singleComprehension_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (IF_KEYWORD expr)?
  private static boolean singleComprehension_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "singleComprehension_1")) return false;
    singleComprehension_1_0(builder_, level_ + 1);
    return true;
  }

  // IF_KEYWORD expr
  private static boolean singleComprehension_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "singleComprehension_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.IF_KEYWORD);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // symbol infixIndexer endOfLine expr
  public static boolean singleIndexer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "singleIndexer")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = symbol(builder_, level_ + 1);
    result_ = result_ && infixIndexer(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, JuliaTypes.SINGLE_INDEXER, result_);
    return result_;
  }

  /* ********************************************************** */
  // integer | floatLit | symbol | string
  static boolean specialLhs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "specialLhs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = integer(builder_, level_ + 1);
    if (!result_) result_ = floatLit(builder_, level_ + 1);
    if (!result_) result_ = symbol(builder_, level_ + 1);
    if (!result_) result_ = string(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // symbol | string | charLit | integer | floatLit
  static boolean specialRhs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "specialRhs")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = symbol(builder_, level_ + 1);
    if (!result_) result_ = string(builder_, level_ + 1);
    if (!result_) result_ = charLit(builder_, level_ + 1);
    if (!result_) result_ = integer(builder_, level_ + 1);
    if (!result_) result_ = floatLit(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // moduleDeclaration
  //  | globalStatement
  //  | expr (COMMA_SYM expr)*
  static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = moduleDeclaration(builder_, level_ + 1);
    if (!result_) result_ = globalStatement(builder_, level_ + 1);
    if (!result_) result_ = statement_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr (COMMA_SYM expr)*
  private static boolean statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1, -1);
    result_ = result_ && statement_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA_SYM expr)*
  private static boolean statement_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_2_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!statement_2_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "statement_2_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA_SYM expr
  private static boolean statement_2_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_2_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.COMMA_SYM);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // semi* (statement (semi+ statement)*)? semi*
  public static boolean statements(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statements")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.STATEMENTS, "<statements>");
    result_ = statements_0(builder_, level_ + 1);
    result_ = result_ && statements_1(builder_, level_ + 1);
    result_ = result_ && statements_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // semi*
  private static boolean statements_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statements_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!semi(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "statements_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (statement (semi+ statement)*)?
  private static boolean statements_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statements_1")) return false;
    statements_1_0(builder_, level_ + 1);
    return true;
  }

  // statement (semi+ statement)*
  private static boolean statements_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statements_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = statement(builder_, level_ + 1);
    result_ = result_ && statements_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (semi+ statement)*
  private static boolean statements_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statements_1_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!statements_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "statements_1_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // semi+ statement
  private static boolean statements_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statements_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = statements_1_0_1_0_0(builder_, level_ + 1);
    result_ = result_ && statement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // semi+
  private static boolean statements_1_0_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statements_1_0_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = semi(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!semi(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "statements_1_0_1_0_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // semi*
  private static boolean statements_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statements_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!semi(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "statements_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // QUOTE_START stringTemplateElement* QUOTE_END
  static boolean str(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "str")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.QUOTE_START)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.QUOTE_START);
    result_ = result_ && str_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.QUOTE_END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // stringTemplateElement*
  private static boolean str_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "str_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!stringTemplateElement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "str_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // REGULAR_STRING_PART_LITERAL
  public static boolean stringContent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stringContent")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.REGULAR_STRING_PART_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.REGULAR_STRING_PART_LITERAL);
    exit_section_(builder_, marker_, JuliaTypes.STRING_CONTENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // STRING_UNICODE
  //  | STRING_ESCAPE
  //  | template
  //  | stringContent
  static boolean stringTemplateElement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stringTemplateElement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.STRING_UNICODE);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.STRING_ESCAPE);
    if (!result_) result_ = template(builder_, level_ + 1);
    if (!result_) result_ = stringContent(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // symbol | macroSymbol
  static boolean symbolAndMacroSymbol(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbolAndMacroSymbol")) return false;
    if (!nextTokenIs(builder_, "", JuliaTypes.MACRO_SYM, JuliaTypes.SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = symbol(builder_, level_ + 1);
    if (!result_) result_ = macroSymbol(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // symbol | LEFT_BRACKET symbol RIGHT_BRACKET
  static boolean symbolLhsInternal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbolLhsInternal")) return false;
    if (!nextTokenIs(builder_, "", JuliaTypes.LEFT_BRACKET, JuliaTypes.SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = symbol(builder_, level_ + 1);
    if (!result_) result_ = symbolLhsInternal_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_BRACKET symbol RIGHT_BRACKET
  private static boolean symbolLhsInternal_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbolLhsInternal_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.LEFT_BRACKET);
    result_ = result_ && symbol(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.RIGHT_BRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // SHORT_INTERPOLATE_SYM symbol | STRING_INTERPOLATE_START expr STRING_INTERPOLATE_END
  public static boolean template(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template")) return false;
    if (!nextTokenIs(builder_, "<template>", JuliaTypes.SHORT_INTERPOLATE_SYM, JuliaTypes.STRING_INTERPOLATE_START)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.TEMPLATE, "<template>");
    result_ = template_0(builder_, level_ + 1);
    if (!result_) result_ = template_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // SHORT_INTERPOLATE_SYM symbol
  private static boolean template_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.SHORT_INTERPOLATE_SYM);
    result_ = result_ && symbol(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // STRING_INTERPOLATE_START expr STRING_INTERPOLATE_END
  private static boolean template_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "template_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.STRING_INTERPOLATE_START);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.STRING_INTERPOLATE_END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOUBLE_COLON endOfLine
  //  primaryExpr endOfLine
  //  typeParameters?
  public static boolean typeAnnotation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeAnnotation")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.DOUBLE_COLON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.DOUBLE_COLON);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, 19);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && typeAnnotation_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, JuliaTypes.TYPE_ANNOTATION, result_);
    return result_;
  }

  // typeParameters?
  private static boolean typeAnnotation_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeAnnotation_4")) return false;
    typeParameters(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // IMMUTABLE_KEYWORD | MUTABLE_KEYWORD
  static boolean typeModifiers(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeModifiers")) return false;
    if (!nextTokenIs(builder_, "", JuliaTypes.IMMUTABLE_KEYWORD, JuliaTypes.MUTABLE_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.IMMUTABLE_KEYWORD);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.MUTABLE_KEYWORD);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // LEFT_B_BRACKET endOfLine
  //   expr? (commaSep expr?)* endOfLine
  //  RIGHT_B_BRACKET
  public static boolean typeParameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeParameters")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.LEFT_B_BRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.LEFT_B_BRACKET);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && typeParameters_2(builder_, level_ + 1);
    result_ = result_ && typeParameters_3(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.RIGHT_B_BRACKET);
    exit_section_(builder_, marker_, JuliaTypes.TYPE_PARAMETERS, result_);
    return result_;
  }

  // expr?
  private static boolean typeParameters_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeParameters_2")) return false;
    expr(builder_, level_ + 1, -1);
    return true;
  }

  // (commaSep expr?)*
  private static boolean typeParameters_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeParameters_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!typeParameters_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "typeParameters_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // commaSep expr?
  private static boolean typeParameters_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeParameters_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = commaSep(builder_, level_ + 1);
    result_ = result_ && typeParameters_3_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr?
  private static boolean typeParameters_3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeParameters_3_0_1")) return false;
    expr(builder_, level_ + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // (
  //    symbol typeAnnotation?
  //  | symbol? typeAnnotation
  //  ) (EQ_SYM expr)?
  public static boolean typedNamedVariable(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typedNamedVariable")) return false;
    if (!nextTokenIs(builder_, "<typed named variable>", JuliaTypes.DOUBLE_COLON, JuliaTypes.SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.TYPED_NAMED_VARIABLE, "<typed named variable>");
    result_ = typedNamedVariable_0(builder_, level_ + 1);
    result_ = result_ && typedNamedVariable_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // symbol typeAnnotation?
  //  | symbol? typeAnnotation
  private static boolean typedNamedVariable_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typedNamedVariable_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = typedNamedVariable_0_0(builder_, level_ + 1);
    if (!result_) result_ = typedNamedVariable_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // symbol typeAnnotation?
  private static boolean typedNamedVariable_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typedNamedVariable_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = symbol(builder_, level_ + 1);
    result_ = result_ && typedNamedVariable_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // typeAnnotation?
  private static boolean typedNamedVariable_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typedNamedVariable_0_0_1")) return false;
    typeAnnotation(builder_, level_ + 1);
    return true;
  }

  // symbol? typeAnnotation
  private static boolean typedNamedVariable_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typedNamedVariable_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = typedNamedVariable_0_1_0(builder_, level_ + 1);
    result_ = result_ && typeAnnotation(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // symbol?
  private static boolean typedNamedVariable_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typedNamedVariable_0_1_0")) return false;
    symbol(builder_, level_ + 1);
    return true;
  }

  // (EQ_SYM expr)?
  private static boolean typedNamedVariable_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typedNamedVariable_1")) return false;
    typedNamedVariable_1_0(builder_, level_ + 1);
    return true;
  }

  // EQ_SYM expr
  private static boolean typedNamedVariable_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typedNamedVariable_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.EQ_SYM);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // MINUS_SYM
  //  | DOT_SYM
  //  | PLUS_SYM
  //  | NOT_SYM
  //  | INTERPOLATE_SYM
  public static boolean unaryOpAsSymbol(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unaryOpAsSymbol")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.UNARY_OP_AS_SYMBOL, "<unary op as symbol>");
    result_ = consumeToken(builder_, JuliaTypes.MINUS_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.DOT_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.PLUS_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.NOT_SYM);
    if (!result_) result_ = consumeToken(builder_, JuliaTypes.INTERPOLATE_SYM);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // LEFT_BRACKET endOfLine
  //   (symbol (commaSep symbol)*)? endOfLine
  //  RIGHT_BRACKET
  public static boolean untypedVariables(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "untypedVariables")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.LEFT_BRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.LEFT_BRACKET);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && untypedVariables_2(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.RIGHT_BRACKET);
    exit_section_(builder_, marker_, JuliaTypes.UNTYPED_VARIABLES, result_);
    return result_;
  }

  // (symbol (commaSep symbol)*)?
  private static boolean untypedVariables_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "untypedVariables_2")) return false;
    untypedVariables_2_0(builder_, level_ + 1);
    return true;
  }

  // symbol (commaSep symbol)*
  private static boolean untypedVariables_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "untypedVariables_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = symbol(builder_, level_ + 1);
    result_ = result_ && untypedVariables_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (commaSep symbol)*
  private static boolean untypedVariables_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "untypedVariables_2_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!untypedVariables_2_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "untypedVariables_2_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // commaSep symbol
  private static boolean untypedVariables_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "untypedVariables_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = commaSep(builder_, level_ + 1);
    result_ = result_ && symbol(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // primaryExpr typeParameters?
  public static boolean userType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "userType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.USER_TYPE, "<user type>");
    result_ = expr(builder_, level_ + 1, 19);
    result_ = result_ && userType_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // typeParameters?
  private static boolean userType_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "userType_1")) return false;
    typeParameters(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // WHERE_KEYWORD afterWhere
  public static boolean whereClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "whereClause")) return false;
    if (!nextTokenIs(builder_, JuliaTypes.WHERE_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, JuliaTypes.WHERE_KEYWORD);
    result_ = result_ && afterWhere(builder_, level_ + 1);
    exit_section_(builder_, marker_, JuliaTypes.WHERE_CLAUSE, result_);
    return result_;
  }

  /* ********************************************************** */
  // Expression root: expr
  // Operator priority table:
  // 0: BINARY(compactFunction)
  // 1: ATOM(applyMacroOp)
  // 2: BINARY(assignOp) BINARY(assignLevelOp)
  // 3: BINARY(arrowOp)
  // 4: BINARY(ternaryOp)
  // 5: ATOM(lambda)
  // 6: BINARY(miscArrowsOp)
  // 7: BINARY(orOp)
  // 8: BINARY(andOp)
  // 9: BINARY(comparisonLevelOp)
  // 10: BINARY(pipeLevelOp)
  // 11: POSTFIX(spliceOp) BINARY(colonOp) ATOM(quoteOp) ATOM(compoundQuoteOp)
  // 12: BINARY(plusLevelOp)
  // 13: BINARY(bitwiseLevelOp) BINARY(rangeOp) POSTFIX(transposeOp)
  // 14: BINARY(multiplyLevelOp) ATOM(implicitMultiplyOp)
  // 15: BINARY(fractionOp) BINARY(inOp)
  // 16: BINARY(miscExponentOp) BINARY(exponentOp)
  // 17: BINARY(typeOp)
  // 18: PREFIX(unaryPlusOp) PREFIX(unaryMinusOp) PREFIX(unaryTypeOp) PREFIX(unarySubtypeOp)
  //    PREFIX(unaryInterpolateOp) PREFIX(notOp) PREFIX(bitWiseNotOp)
  // 19: POSTFIX(applyFunctionOp) POSTFIX(applyIndexOp) BINARY(memberAccessOp) POSTFIX(applyWhereOp)
  //    POSTFIX(type)
  // 20: ATOM(string) ATOM(command) ATOM(regex) ATOM(charLit)
  //    ATOM(integer) ATOM(floatLit) ATOM(booleanLit) PREFIX(ifExpr)
  //    ATOM(forExpr) ATOM(forComprehension) PREFIX(whileExpr) PREFIX(function)
  //    ATOM(returnExpr) ATOM(breakExpr) ATOM(tryCatch) ATOM(continueExpr)
  //    ATOM(array) PREFIX(union) ATOM(tuple) PREFIX(macro)
  //    ATOM(let) ATOM(block) ATOM(colonBlock) ATOM(export)
  //    ATOM(importExpr) ATOM(importAllExpr) ATOM(using) ATOM(abstractTypeDeclaration)
  //    ATOM(primitiveTypeDeclaration) ATOM(typeDeclaration) PREFIX(typeAlias) ATOM(symbolLhs)
  //    ATOM(symbol) ATOM(inAsOp) ATOM(macroSymbol) ATOM(bracketedExpr)
  public static boolean expr(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "expr")) return false;
    addVariant(builder_, "<expr>");
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expr>");
    result_ = applyMacroOp(builder_, level_ + 1);
    if (!result_) result_ = lambda(builder_, level_ + 1);
    if (!result_) result_ = quoteOp(builder_, level_ + 1);
    if (!result_) result_ = compoundQuoteOp(builder_, level_ + 1);
    if (!result_) result_ = implicitMultiplyOp(builder_, level_ + 1);
    if (!result_) result_ = unaryPlusOp(builder_, level_ + 1);
    if (!result_) result_ = unaryMinusOp(builder_, level_ + 1);
    if (!result_) result_ = unaryTypeOp(builder_, level_ + 1);
    if (!result_) result_ = unarySubtypeOp(builder_, level_ + 1);
    if (!result_) result_ = unaryInterpolateOp(builder_, level_ + 1);
    if (!result_) result_ = notOp(builder_, level_ + 1);
    if (!result_) result_ = bitWiseNotOp(builder_, level_ + 1);
    if (!result_) result_ = string(builder_, level_ + 1);
    if (!result_) result_ = command(builder_, level_ + 1);
    if (!result_) result_ = regex(builder_, level_ + 1);
    if (!result_) result_ = charLit(builder_, level_ + 1);
    if (!result_) result_ = integer(builder_, level_ + 1);
    if (!result_) result_ = floatLit(builder_, level_ + 1);
    if (!result_) result_ = booleanLit(builder_, level_ + 1);
    if (!result_) result_ = ifExpr(builder_, level_ + 1);
    if (!result_) result_ = forExpr(builder_, level_ + 1);
    if (!result_) result_ = forComprehension(builder_, level_ + 1);
    if (!result_) result_ = whileExpr(builder_, level_ + 1);
    if (!result_) result_ = function(builder_, level_ + 1);
    if (!result_) result_ = returnExpr(builder_, level_ + 1);
    if (!result_) result_ = breakExpr(builder_, level_ + 1);
    if (!result_) result_ = tryCatch(builder_, level_ + 1);
    if (!result_) result_ = continueExpr(builder_, level_ + 1);
    if (!result_) result_ = array(builder_, level_ + 1);
    if (!result_) result_ = union(builder_, level_ + 1);
    if (!result_) result_ = tuple(builder_, level_ + 1);
    if (!result_) result_ = macro(builder_, level_ + 1);
    if (!result_) result_ = let(builder_, level_ + 1);
    if (!result_) result_ = block(builder_, level_ + 1);
    if (!result_) result_ = colonBlock(builder_, level_ + 1);
    if (!result_) result_ = export(builder_, level_ + 1);
    if (!result_) result_ = importExpr(builder_, level_ + 1);
    if (!result_) result_ = importAllExpr(builder_, level_ + 1);
    if (!result_) result_ = using(builder_, level_ + 1);
    if (!result_) result_ = abstractTypeDeclaration(builder_, level_ + 1);
    if (!result_) result_ = primitiveTypeDeclaration(builder_, level_ + 1);
    if (!result_) result_ = typeDeclaration(builder_, level_ + 1);
    if (!result_) result_ = typeAlias(builder_, level_ + 1);
    if (!result_) result_ = symbolLhs(builder_, level_ + 1);
    if (!result_) result_ = symbol(builder_, level_ + 1);
    if (!result_) result_ = inAsOp(builder_, level_ + 1);
    if (!result_) result_ = macroSymbol(builder_, level_ + 1);
    if (!result_) result_ = bracketedExpr(builder_, level_ + 1);
    pinned_ = result_;
    result_ = result_ && expr_0(builder_, level_ + 1, priority_);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean expr_0(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "expr_0")) return false;
    boolean result_ = true;
    while (true) {
      Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
      if (priority_ < 0 && leftMarkerIs(builder_, JuliaTypes.SYMBOL) && compactFunction_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 0);
        exit_section_(builder_, level_, marker_, JuliaTypes.COMPACT_FUNCTION, result_, true, null);
      }
      else if (priority_ < 2 && assignOp_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 1);
        exit_section_(builder_, level_, marker_, JuliaTypes.ASSIGN_OP, result_, true, null);
      }
      else if (priority_ < 2 && assignLevelOp_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 1);
        exit_section_(builder_, level_, marker_, JuliaTypes.ASSIGN_LEVEL_OP, result_, true, null);
      }
      else if (priority_ < 3 && arrowOp_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 2);
        exit_section_(builder_, level_, marker_, JuliaTypes.ARROW_OP, result_, true, null);
      }
      else if (priority_ < 4 && ternaryOp_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 12);
        exit_section_(builder_, level_, marker_, JuliaTypes.TERNARY_OP, result_, true, null);
      }
      else if (priority_ < 6 && miscArrowsOp_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 6);
        exit_section_(builder_, level_, marker_, JuliaTypes.MISC_ARROWS_OP, result_, true, null);
      }
      else if (priority_ < 7 && orOp_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 7);
        exit_section_(builder_, level_, marker_, JuliaTypes.OR_OP, result_, true, null);
      }
      else if (priority_ < 8 && andOp_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 8);
        exit_section_(builder_, level_, marker_, JuliaTypes.AND_OP, result_, true, null);
      }
      else if (priority_ < 9 && comparisonLevelOp_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 9);
        exit_section_(builder_, level_, marker_, JuliaTypes.COMPARISON_LEVEL_OP, result_, true, null);
      }
      else if (priority_ < 10 && pipeLevelOp_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 10);
        exit_section_(builder_, level_, marker_, JuliaTypes.PIPE_LEVEL_OP, result_, true, null);
      }
      else if (priority_ < 11 && consumeTokenSmart(builder_, JuliaTypes.SLICE_SYM)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, JuliaTypes.SPLICE_OP, result_, true, null);
      }
      else if (priority_ < 11 && colonSymBegins(builder_, level_ + 1)) {
        result_ = report_error_(builder_, expr(builder_, level_, 11));
        result_ = consumeToken(builder_, JuliaTypes.RIGHT_BRACKET) && result_;
        exit_section_(builder_, level_, marker_, JuliaTypes.COLON_OP, result_, true, null);
      }
      else if (priority_ < 12 && plusLevelOp_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 12);
        exit_section_(builder_, level_, marker_, JuliaTypes.PLUS_LEVEL_OP, result_, true, null);
      }
      else if (priority_ < 13 && bitwiseLevelOp_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 13);
        exit_section_(builder_, level_, marker_, JuliaTypes.BITWISE_LEVEL_OP, result_, true, null);
      }
      else if (priority_ < 13 && rangeOp_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 13);
        exit_section_(builder_, level_, marker_, JuliaTypes.RANGE_OP, result_, true, null);
      }
      else if (priority_ < 13 && consumeTokenSmart(builder_, JuliaTypes.TRANSPOSE_SYM)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, JuliaTypes.TRANSPOSE_OP, result_, true, null);
      }
      else if (priority_ < 14 && multiplyLevelOp_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 14);
        exit_section_(builder_, level_, marker_, JuliaTypes.MULTIPLY_LEVEL_OP, result_, true, null);
      }
      else if (priority_ < 15 && fractionOp_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 15);
        exit_section_(builder_, level_, marker_, JuliaTypes.FRACTION_OP, result_, true, null);
      }
      else if (priority_ < 15 && inOp_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 15);
        exit_section_(builder_, level_, marker_, JuliaTypes.IN_OP, result_, true, null);
      }
      else if (priority_ < 16 && miscExponentOp_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 16);
        exit_section_(builder_, level_, marker_, JuliaTypes.MISC_EXPONENT_OP, result_, true, null);
      }
      else if (priority_ < 16 && exponentOp_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 16);
        exit_section_(builder_, level_, marker_, JuliaTypes.EXPONENT_OP, result_, true, null);
      }
      else if (priority_ < 17 && typeOp_0(builder_, level_ + 1)) {
        result_ = expr(builder_, level_, 17);
        exit_section_(builder_, level_, marker_, JuliaTypes.TYPE_OP, result_, true, null);
      }
      else if (priority_ < 19 && applyFunctionOp_0(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, JuliaTypes.APPLY_FUNCTION_OP, result_, true, null);
      }
      else if (priority_ < 19 && applyIndexOp_0(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, JuliaTypes.APPLY_INDEX_OP, result_, true, null);
      }
      else if (priority_ < 19 && consumeTokenSmart(builder_, JuliaTypes.DOT_SYM)) {
        result_ = expr(builder_, level_, 19);
        exit_section_(builder_, level_, marker_, JuliaTypes.MEMBER_ACCESS_OP, result_, true, null);
      }
      else if (priority_ < 19 && whereClause(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, JuliaTypes.APPLY_WHERE_OP, result_, true, null);
      }
      else if (priority_ < 19 && typeParameters(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, JuliaTypes.TYPE, result_, true, null);
      }
      else {
        exit_section_(builder_, level_, marker_, null, false, false, null);
        break;
      }
    }
    return result_;
  }

  // (typeParameters endOfLine)? functionSignature endOfLine (whereClause endOfLine)? EQ_SYM endOfLine
  private static boolean compactFunction_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compactFunction_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = compactFunction_0_0(builder_, level_ + 1);
    result_ = result_ && functionSignature(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && compactFunction_0_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.EQ_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (typeParameters endOfLine)?
  private static boolean compactFunction_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compactFunction_0_0")) return false;
    compactFunction_0_0_0(builder_, level_ + 1);
    return true;
  }

  // typeParameters endOfLine
  private static boolean compactFunction_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compactFunction_0_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = typeParameters(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (whereClause endOfLine)?
  private static boolean compactFunction_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compactFunction_0_3")) return false;
    compactFunction_0_3_0(builder_, level_ + 1);
    return true;
  }

  // whereClause endOfLine
  private static boolean compactFunction_0_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compactFunction_0_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = whereClause(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // macroSymbol expr expr*
  public static boolean applyMacroOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyMacroOp")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.MACRO_SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, JuliaTypes.APPLY_MACRO_OP, null);
    result_ = macroSymbol(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && applyMacroOp_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // expr*
  private static boolean applyMacroOp_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyMacroOp_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!expr(builder_, level_ + 1, -1)) break;
      if (!empty_element_parsed_guard_(builder_, "applyMacroOp_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // (EQ_SYM | ASSIGN_SYM) endOfLine
  private static boolean assignOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = assignOp_0_0(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // EQ_SYM | ASSIGN_SYM
  private static boolean assignOp_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignOp_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.EQ_SYM);
    if (!result_) result_ = consumeTokenSmart(builder_, JuliaTypes.ASSIGN_SYM);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // assignLevelOperator endOfLine
  private static boolean assignLevelOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignLevelOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = assignLevelOperator(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ARROW_SYM endOfLine
  private static boolean arrowOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrowOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.ARROW_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // QUESTION_SYM endOfLine
  private static boolean ternaryOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ternaryOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.QUESTION_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (symbol | tuple | LEFT_BRACKET RIGHT_BRACKET)
  //   LAMBDA_ABSTRACTION expr
  public static boolean lambda(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.LEFT_BRACKET, JuliaTypes.SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.LAMBDA, "<lambda>");
    result_ = lambda_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.LAMBDA_ABSTRACTION);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // symbol | tuple | LEFT_BRACKET RIGHT_BRACKET
  private static boolean lambda_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lambda_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = symbol(builder_, level_ + 1);
    if (!result_) result_ = tuple(builder_, level_ + 1);
    if (!result_) result_ = parseTokensSmart(builder_, 0, JuliaTypes.LEFT_BRACKET, JuliaTypes.RIGHT_BRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (SPECIAL_ARROW_SYM | MISC_ARROW_SYM) endOfLine
  private static boolean miscArrowsOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "miscArrowsOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = miscArrowsOp_0_0(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // SPECIAL_ARROW_SYM | MISC_ARROW_SYM
  private static boolean miscArrowsOp_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "miscArrowsOp_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.SPECIAL_ARROW_SYM);
    if (!result_) result_ = consumeTokenSmart(builder_, JuliaTypes.MISC_ARROW_SYM);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OR_SYM endOfLine
  private static boolean orOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "orOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.OR_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // AND_SYM endOfLine
  private static boolean andOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "andOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.AND_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // comparisonLevelOperator endOfLine
  private static boolean comparisonLevelOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comparisonLevelOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comparisonLevelOperator(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // pipeLevelOperator endOfLine
  private static boolean pipeLevelOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pipeLevelOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = pipeLevelOperator(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // COLON_SYM endOfLine quotable
  public static boolean quoteOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "quoteOp")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.COLON_SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.COLON_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && quotable(builder_, level_ + 1);
    exit_section_(builder_, marker_, JuliaTypes.QUOTE_OP, result_);
    return result_;
  }

  // QUOTE_KEYWORD endOfLine (expr endOfLine)* END_KEYWORD
  public static boolean compoundQuoteOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compoundQuoteOp")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.QUOTE_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.QUOTE_KEYWORD);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && compoundQuoteOp_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.END_KEYWORD);
    exit_section_(builder_, marker_, JuliaTypes.COMPOUND_QUOTE_OP, result_);
    return result_;
  }

  // (expr endOfLine)*
  private static boolean compoundQuoteOp_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compoundQuoteOp_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!compoundQuoteOp_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "compoundQuoteOp_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // expr endOfLine
  private static boolean compoundQuoteOp_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compoundQuoteOp_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1, -1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // plusLevelOperator endOfLine
  private static boolean plusLevelOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "plusLevelOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = plusLevelOperator(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // bitwiseLevelOperator endOfLine
  private static boolean bitwiseLevelOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitwiseLevelOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = bitwiseLevelOperator(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // COLON_SYM endOfLine
  private static boolean rangeOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rangeOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.COLON_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // multiplyLevelOperator endOfLine
  private static boolean multiplyLevelOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplyLevelOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = multiplyLevelOperator(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // specialLhs blockComment? IMPLICIT_MULTIPLY_SYM specialRhs
  public static boolean implicitMultiplyOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "implicitMultiplyOp")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, JuliaTypes.IMPLICIT_MULTIPLY_OP, "<implicit multiply op>");
    result_ = specialLhs(builder_, level_ + 1);
    result_ = result_ && implicitMultiplyOp_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.IMPLICIT_MULTIPLY_SYM);
    result_ = result_ && specialRhs(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // blockComment?
  private static boolean implicitMultiplyOp_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "implicitMultiplyOp_1")) return false;
    blockComment(builder_, level_ + 1);
    return true;
  }

  // FRACTION_SYM endOfLine
  private static boolean fractionOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "fractionOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.FRACTION_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (IN_KEYWORD | IN_SYM) endOfLine
  private static boolean inOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = inOp_0_0(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IN_KEYWORD | IN_SYM
  private static boolean inOp_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inOp_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.IN_KEYWORD);
    if (!result_) result_ = consumeTokenSmart(builder_, JuliaTypes.IN_SYM);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // MISC_EXPONENT_SYM endOfLine
  private static boolean miscExponentOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "miscExponentOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.MISC_EXPONENT_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // EXPONENT_SYM endOfLine
  private static boolean exponentOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exponentOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.EXPONENT_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // DOUBLE_COLON endOfLine
  private static boolean typeOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.DOUBLE_COLON);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  public static boolean unaryPlusOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unaryPlusOp")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.PLUS_SYM)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = unaryPlusOp_0(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 18);
    exit_section_(builder_, level_, marker_, JuliaTypes.UNARY_PLUS_OP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // PLUS_SYM endOfLine
  private static boolean unaryPlusOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unaryPlusOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.PLUS_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  public static boolean unaryMinusOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unaryMinusOp")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.MINUS_SYM)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = unaryMinusOp_0(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 18);
    exit_section_(builder_, level_, marker_, JuliaTypes.UNARY_MINUS_OP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // MINUS_SYM endOfLine
  private static boolean unaryMinusOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unaryMinusOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.MINUS_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  public static boolean unaryTypeOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unaryTypeOp")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.DOUBLE_COLON)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = unaryTypeOp_0(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 18);
    exit_section_(builder_, level_, marker_, JuliaTypes.UNARY_TYPE_OP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // DOUBLE_COLON endOfLine
  private static boolean unaryTypeOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unaryTypeOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.DOUBLE_COLON);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  public static boolean unarySubtypeOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unarySubtypeOp")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.SUBTYPE_SYM)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = unarySubtypeOp_0(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 18);
    exit_section_(builder_, level_, marker_, JuliaTypes.UNARY_SUBTYPE_OP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // SUBTYPE_SYM endOfLine
  private static boolean unarySubtypeOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unarySubtypeOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.SUBTYPE_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  public static boolean unaryInterpolateOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unaryInterpolateOp")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.INTERPOLATE_SYM)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = unaryInterpolateOp_0(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 18);
    exit_section_(builder_, level_, marker_, JuliaTypes.UNARY_INTERPOLATE_OP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // INTERPOLATE_SYM endOfLine
  private static boolean unaryInterpolateOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unaryInterpolateOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.INTERPOLATE_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  public static boolean notOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notOp")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.NOT_SYM)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = notOp_0(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 18);
    exit_section_(builder_, level_, marker_, JuliaTypes.NOT_OP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // NOT_SYM endOfLine
  private static boolean notOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "notOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.NOT_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  public static boolean bitWiseNotOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitWiseNotOp")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.BITWISE_NOT_SYM)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = bitWiseNotOp_0(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 18);
    exit_section_(builder_, level_, marker_, JuliaTypes.BIT_WISE_NOT_OP, result_, pinned_, null);
    return result_ || pinned_;
  }

  // BITWISE_NOT_SYM endOfLine
  private static boolean bitWiseNotOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bitWiseNotOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.BITWISE_NOT_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // DOT_SYM? LEFT_BRACKET endOfLine (
  //      comprehensionElement+
  //    | (expressionList endOfLine)
  //   )? arguments? endOfLine RIGHT_BRACKET doBlock?
  private static boolean applyFunctionOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyFunctionOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = applyFunctionOp_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.LEFT_BRACKET);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && applyFunctionOp_0_3(builder_, level_ + 1);
    result_ = result_ && applyFunctionOp_0_4(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.RIGHT_BRACKET);
    result_ = result_ && applyFunctionOp_0_7(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // DOT_SYM?
  private static boolean applyFunctionOp_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyFunctionOp_0_0")) return false;
    consumeTokenSmart(builder_, JuliaTypes.DOT_SYM);
    return true;
  }

  // (
  //      comprehensionElement+
  //    | (expressionList endOfLine)
  //   )?
  private static boolean applyFunctionOp_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyFunctionOp_0_3")) return false;
    applyFunctionOp_0_3_0(builder_, level_ + 1);
    return true;
  }

  // comprehensionElement+
  //    | (expressionList endOfLine)
  private static boolean applyFunctionOp_0_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyFunctionOp_0_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = applyFunctionOp_0_3_0_0(builder_, level_ + 1);
    if (!result_) result_ = applyFunctionOp_0_3_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // comprehensionElement+
  private static boolean applyFunctionOp_0_3_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyFunctionOp_0_3_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comprehensionElement(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!comprehensionElement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "applyFunctionOp_0_3_0_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expressionList endOfLine
  private static boolean applyFunctionOp_0_3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyFunctionOp_0_3_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expressionList(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // arguments?
  private static boolean applyFunctionOp_0_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyFunctionOp_0_4")) return false;
    arguments(builder_, level_ + 1);
    return true;
  }

  // doBlock?
  private static boolean applyFunctionOp_0_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyFunctionOp_0_7")) return false;
    doBlock(builder_, level_ + 1);
    return true;
  }

  // LEFT_M_BRACKET (
  //    comprehensionElement
  //  | exprOrEnd (COMMA_SYM exprOrEnd)*
  //  )? endOfLine RIGHT_M_BRACKET
  private static boolean applyIndexOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyIndexOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.LEFT_M_BRACKET);
    result_ = result_ && applyIndexOp_0_1(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.RIGHT_M_BRACKET);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (
  //    comprehensionElement
  //  | exprOrEnd (COMMA_SYM exprOrEnd)*
  //  )?
  private static boolean applyIndexOp_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyIndexOp_0_1")) return false;
    applyIndexOp_0_1_0(builder_, level_ + 1);
    return true;
  }

  // comprehensionElement
  //  | exprOrEnd (COMMA_SYM exprOrEnd)*
  private static boolean applyIndexOp_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyIndexOp_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comprehensionElement(builder_, level_ + 1);
    if (!result_) result_ = applyIndexOp_0_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // exprOrEnd (COMMA_SYM exprOrEnd)*
  private static boolean applyIndexOp_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyIndexOp_0_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = exprOrEnd(builder_, level_ + 1, -1);
    result_ = result_ && applyIndexOp_0_1_0_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA_SYM exprOrEnd)*
  private static boolean applyIndexOp_0_1_0_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyIndexOp_0_1_0_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!applyIndexOp_0_1_0_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "applyIndexOp_0_1_0_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA_SYM exprOrEnd
  private static boolean applyIndexOp_0_1_0_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "applyIndexOp_0_1_0_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.COMMA_SYM);
    result_ = result_ && exprOrEnd(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // str | rawStr
  public static boolean string(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "string")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.QUOTE_START, JuliaTypes.TRIPLE_QUOTE_START)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.STRING, "<string>");
    result_ = str(builder_, level_ + 1);
    if (!result_) result_ = rawStr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // CMD_QUOTE_START stringTemplateElement* CMD_QUOTE_END
  public static boolean command(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.CMD_QUOTE_START)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.CMD_QUOTE_START);
    result_ = result_ && command_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.CMD_QUOTE_END);
    exit_section_(builder_, marker_, JuliaTypes.COMMAND, result_);
    return result_;
  }

  // stringTemplateElement*
  private static boolean command_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "command_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!stringTemplateElement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "command_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // REGEX_START (stringContent | STRING_ESCAPE)* REGEX_END
  public static boolean regex(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "regex")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.REGEX_START)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.REGEX_START);
    result_ = result_ && regex_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.REGEX_END);
    exit_section_(builder_, marker_, JuliaTypes.REGEX, result_);
    return result_;
  }

  // (stringContent | STRING_ESCAPE)*
  private static boolean regex_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "regex_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!regex_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "regex_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // stringContent | STRING_ESCAPE
  private static boolean regex_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "regex_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = stringContent(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenSmart(builder_, JuliaTypes.STRING_ESCAPE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // CHAR_LITERAL
  public static boolean charLit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "charLit")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.CHAR_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.CHAR_LITERAL);
    exit_section_(builder_, marker_, JuliaTypes.CHAR_LIT, result_);
    return result_;
  }

  // INT_LITERAL
  public static boolean integer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "integer")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.INT_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.INT_LITERAL);
    exit_section_(builder_, marker_, JuliaTypes.INTEGER, result_);
    return result_;
  }

  // FLOAT_LITERAL | FLOAT_CONSTANT
  public static boolean floatLit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "floatLit")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.FLOAT_CONSTANT, JuliaTypes.FLOAT_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.FLOAT_LIT, "<float lit>");
    result_ = consumeTokenSmart(builder_, JuliaTypes.FLOAT_LITERAL);
    if (!result_) result_ = consumeTokenSmart(builder_, JuliaTypes.FLOAT_CONSTANT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // TRUE_KEYWORD | FALSE_KEYWORD
  public static boolean booleanLit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "booleanLit")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.FALSE_KEYWORD, JuliaTypes.TRUE_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.BOOLEAN_LIT, "<boolean lit>");
    result_ = consumeTokenSmart(builder_, JuliaTypes.TRUE_KEYWORD);
    if (!result_) result_ = consumeTokenSmart(builder_, JuliaTypes.FALSE_KEYWORD);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  public static boolean ifExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ifExpr")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.IF_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokenSmart(builder_, JuliaTypes.IF_KEYWORD);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, -1);
    result_ = pinned_ && report_error_(builder_, ifExpr_1(builder_, level_ + 1)) && result_;
    exit_section_(builder_, level_, marker_, JuliaTypes.IF_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // endOfLine statements elseIfClause* elseClause? END_KEYWORD
  private static boolean ifExpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ifExpr_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = endOfLine(builder_, level_ + 1);
    result_ = result_ && statements(builder_, level_ + 1);
    result_ = result_ && ifExpr_1_2(builder_, level_ + 1);
    result_ = result_ && ifExpr_1_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.END_KEYWORD);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // elseIfClause*
  private static boolean ifExpr_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ifExpr_1_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!elseIfClause(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ifExpr_1_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // elseClause?
  private static boolean ifExpr_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ifExpr_1_3")) return false;
    elseClause(builder_, level_ + 1);
    return true;
  }

  // FOR_KEYWORD endOfLine indexer (commaSep indexer)* statements END_KEYWORD
  public static boolean forExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forExpr")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.FOR_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.FOR_KEYWORD);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && indexer(builder_, level_ + 1);
    result_ = result_ && forExpr_3(builder_, level_ + 1);
    result_ = result_ && statements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.END_KEYWORD);
    exit_section_(builder_, marker_, JuliaTypes.FOR_EXPR, result_);
    return result_;
  }

  // (commaSep indexer)*
  private static boolean forExpr_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forExpr_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!forExpr_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "forExpr_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // commaSep indexer
  private static boolean forExpr_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forExpr_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = commaSep(builder_, level_ + 1);
    result_ = result_ && indexer(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LEFT_M_BRACKET endOfLine
  //   comprehensionElement+ endOfLine
  //  RIGHT_M_BRACKET
  public static boolean forComprehension(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forComprehension")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.LEFT_M_BRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.LEFT_M_BRACKET);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && forComprehension_2(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.RIGHT_M_BRACKET);
    exit_section_(builder_, marker_, JuliaTypes.FOR_COMPREHENSION, result_);
    return result_;
  }

  // comprehensionElement+
  private static boolean forComprehension_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forComprehension_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comprehensionElement(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!comprehensionElement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "forComprehension_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  public static boolean whileExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "whileExpr")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.WHILE_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = whileExpr_0(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, -1);
    result_ = pinned_ && report_error_(builder_, whileExpr_1(builder_, level_ + 1)) && result_;
    exit_section_(builder_, level_, marker_, JuliaTypes.WHILE_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // WHILE_KEYWORD endOfLine
  private static boolean whileExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "whileExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.WHILE_KEYWORD);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // endOfLine statements END_KEYWORD
  private static boolean whileExpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "whileExpr_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = endOfLine(builder_, level_ + 1);
    result_ = result_ && statements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.END_KEYWORD);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  public static boolean function(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.FUNCTION_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = function_0(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 19);
    result_ = pinned_ && report_error_(builder_, function_1(builder_, level_ + 1)) && result_;
    exit_section_(builder_, level_, marker_, JuliaTypes.FUNCTION, result_, pinned_, null);
    return result_ || pinned_;
  }

  // FUNCTION_KEYWORD endOfLine (SYM DOT_SYM)?
  private static boolean function_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.FUNCTION_KEYWORD);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && function_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (SYM DOT_SYM)?
  private static boolean function_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_0_2")) return false;
    function_0_2_0(builder_, level_ + 1);
    return true;
  }

  // SYM DOT_SYM
  private static boolean function_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokensSmart(builder_, 0, JuliaTypes.SYM, JuliaTypes.DOT_SYM);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (typeParameters endOfLine)? (functionSignature endOfLine)? (whereClause endOfLine)? statements END_KEYWORD
  private static boolean function_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = function_1_0(builder_, level_ + 1);
    result_ = result_ && function_1_1(builder_, level_ + 1);
    result_ = result_ && function_1_2(builder_, level_ + 1);
    result_ = result_ && statements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.END_KEYWORD);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (typeParameters endOfLine)?
  private static boolean function_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_1_0")) return false;
    function_1_0_0(builder_, level_ + 1);
    return true;
  }

  // typeParameters endOfLine
  private static boolean function_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = typeParameters(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (functionSignature endOfLine)?
  private static boolean function_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_1_1")) return false;
    function_1_1_0(builder_, level_ + 1);
    return true;
  }

  // functionSignature endOfLine
  private static boolean function_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = functionSignature(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (whereClause endOfLine)?
  private static boolean function_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_1_2")) return false;
    function_1_2_0(builder_, level_ + 1);
    return true;
  }

  // whereClause endOfLine
  private static boolean function_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_1_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = whereClause(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // RETURN_KEYWORD (expr (COMMA_SYM expr)*)?
  public static boolean returnExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "returnExpr")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.RETURN_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.RETURN_KEYWORD);
    result_ = result_ && returnExpr_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, JuliaTypes.RETURN_EXPR, result_);
    return result_;
  }

  // (expr (COMMA_SYM expr)*)?
  private static boolean returnExpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "returnExpr_1")) return false;
    returnExpr_1_0(builder_, level_ + 1);
    return true;
  }

  // expr (COMMA_SYM expr)*
  private static boolean returnExpr_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "returnExpr_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1, -1);
    result_ = result_ && returnExpr_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA_SYM expr)*
  private static boolean returnExpr_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "returnExpr_1_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!returnExpr_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "returnExpr_1_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // COMMA_SYM expr
  private static boolean returnExpr_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "returnExpr_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.COMMA_SYM);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // BREAK_KEYWORD
  public static boolean breakExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "breakExpr")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.BREAK_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.BREAK_KEYWORD);
    exit_section_(builder_, marker_, JuliaTypes.BREAK_EXPR, result_);
    return result_;
  }

  // TRY_KEYWORD endOfLine
  //   statements
  //  catchClause?
  //  finallyClause?
  //  END_KEYWORD
  public static boolean tryCatch(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tryCatch")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.TRY_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.TRY_KEYWORD);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && statements(builder_, level_ + 1);
    result_ = result_ && tryCatch_3(builder_, level_ + 1);
    result_ = result_ && tryCatch_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.END_KEYWORD);
    exit_section_(builder_, marker_, JuliaTypes.TRY_CATCH, result_);
    return result_;
  }

  // catchClause?
  private static boolean tryCatch_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tryCatch_3")) return false;
    catchClause(builder_, level_ + 1);
    return true;
  }

  // finallyClause?
  private static boolean tryCatch_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tryCatch_4")) return false;
    finallyClause(builder_, level_ + 1);
    return true;
  }

  // CONTINUE_KEYWORD
  public static boolean continueExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "continueExpr")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.CONTINUE_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.CONTINUE_KEYWORD);
    exit_section_(builder_, marker_, JuliaTypes.CONTINUE_EXPR, result_);
    return result_;
  }

  // LEFT_M_BRACKET endOfLine
  //   (
  //    (expr (commaSep? expr)*)
  //    (SEMICOLON_SYM endOfLine
  //     (expr (commaSep? expr)* COMMA_SYM?)?)*
  //   )?
  //   endOfLine
  //  RIGHT_M_BRACKET
  public static boolean array(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.LEFT_M_BRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.LEFT_M_BRACKET);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && array_2(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.RIGHT_M_BRACKET);
    exit_section_(builder_, marker_, JuliaTypes.ARRAY, result_);
    return result_;
  }

  // (
  //    (expr (commaSep? expr)*)
  //    (SEMICOLON_SYM endOfLine
  //     (expr (commaSep? expr)* COMMA_SYM?)?)*
  //   )?
  private static boolean array_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_2")) return false;
    array_2_0(builder_, level_ + 1);
    return true;
  }

  // (expr (commaSep? expr)*)
  //    (SEMICOLON_SYM endOfLine
  //     (expr (commaSep? expr)* COMMA_SYM?)?)*
  private static boolean array_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = array_2_0_0(builder_, level_ + 1);
    result_ = result_ && array_2_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // expr (commaSep? expr)*
  private static boolean array_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1, -1);
    result_ = result_ && array_2_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (commaSep? expr)*
  private static boolean array_2_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_2_0_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!array_2_0_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "array_2_0_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // commaSep? expr
  private static boolean array_2_0_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_2_0_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = array_2_0_0_1_0_0(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // commaSep?
  private static boolean array_2_0_0_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_2_0_0_1_0_0")) return false;
    commaSep(builder_, level_ + 1);
    return true;
  }

  // (SEMICOLON_SYM endOfLine
  //     (expr (commaSep? expr)* COMMA_SYM?)?)*
  private static boolean array_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_2_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!array_2_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "array_2_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // SEMICOLON_SYM endOfLine
  //     (expr (commaSep? expr)* COMMA_SYM?)?
  private static boolean array_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.SEMICOLON_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && array_2_0_1_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (expr (commaSep? expr)* COMMA_SYM?)?
  private static boolean array_2_0_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_2_0_1_0_2")) return false;
    array_2_0_1_0_2_0(builder_, level_ + 1);
    return true;
  }

  // expr (commaSep? expr)* COMMA_SYM?
  private static boolean array_2_0_1_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_2_0_1_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expr(builder_, level_ + 1, -1);
    result_ = result_ && array_2_0_1_0_2_0_1(builder_, level_ + 1);
    result_ = result_ && array_2_0_1_0_2_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (commaSep? expr)*
  private static boolean array_2_0_1_0_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_2_0_1_0_2_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!array_2_0_1_0_2_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "array_2_0_1_0_2_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // commaSep? expr
  private static boolean array_2_0_1_0_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_2_0_1_0_2_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = array_2_0_1_0_2_0_1_0_0(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // commaSep?
  private static boolean array_2_0_1_0_2_0_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_2_0_1_0_2_0_1_0_0")) return false;
    commaSep(builder_, level_ + 1);
    return true;
  }

  // COMMA_SYM?
  private static boolean array_2_0_1_0_2_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "array_2_0_1_0_2_0_2")) return false;
    consumeTokenSmart(builder_, JuliaTypes.COMMA_SYM);
    return true;
  }

  public static boolean union(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "union")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.UNION_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokenSmart(builder_, JuliaTypes.UNION_KEYWORD);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 19);
    exit_section_(builder_, level_, marker_, JuliaTypes.UNION, result_, pinned_, null);
    return result_ || pinned_;
  }

  // LEFT_BRACKET endOfLine
  //   expr (commaSep expr)* endOfLine COMMA_SYM? endOfLine
  //  RIGHT_BRACKET
  public static boolean tuple(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.LEFT_BRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.LEFT_BRACKET);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && tuple_3(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && tuple_5(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.RIGHT_BRACKET);
    exit_section_(builder_, marker_, JuliaTypes.TUPLE, result_);
    return result_;
  }

  // (commaSep expr)*
  private static boolean tuple_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!tuple_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "tuple_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // commaSep expr
  private static boolean tuple_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = commaSep(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // COMMA_SYM?
  private static boolean tuple_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_5")) return false;
    consumeTokenSmart(builder_, JuliaTypes.COMMA_SYM);
    return true;
  }

  public static boolean macro(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.MACRO_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = macro_0(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 19);
    result_ = pinned_ && report_error_(builder_, macro_1(builder_, level_ + 1)) && result_;
    exit_section_(builder_, level_, marker_, JuliaTypes.MACRO, result_, pinned_, null);
    return result_ || pinned_;
  }

  // MACRO_KEYWORD endOfLine
  private static boolean macro_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.MACRO_KEYWORD);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // endOfLine untypedVariables endOfLine statements END_KEYWORD
  private static boolean macro_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = endOfLine(builder_, level_ + 1);
    result_ = result_ && untypedVariables(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && statements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.END_KEYWORD);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LET_KEYWORD statements END_KEYWORD
  public static boolean let(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "let")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.LET_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.LET_KEYWORD);
    result_ = result_ && statements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.END_KEYWORD);
    exit_section_(builder_, marker_, JuliaTypes.LET, result_);
    return result_;
  }

  // BEGIN_KEYWORD statements END_KEYWORD
  public static boolean block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "block")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.BEGIN_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.BEGIN_KEYWORD);
    result_ = result_ && statements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.END_KEYWORD);
    exit_section_(builder_, marker_, JuliaTypes.BLOCK, result_);
    return result_;
  }

  // COLON_BEGIN_SYM statements RIGHT_BRACKET
  public static boolean colonBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "colonBlock")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.COLON_BEGIN_SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.COLON_BEGIN_SYM);
    result_ = result_ && statements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.RIGHT_BRACKET);
    exit_section_(builder_, marker_, JuliaTypes.COLON_BLOCK, result_);
    return result_;
  }

  // EXPORT_KEYWORD endOfLine
  //   memberAccess
  //   (commaSep memberAccess)*
  public static boolean export(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "export")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.EXPORT_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.EXPORT_KEYWORD);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && memberAccess(builder_, level_ + 1);
    result_ = result_ && export_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, JuliaTypes.EXPORT, result_);
    return result_;
  }

  // (commaSep memberAccess)*
  private static boolean export_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "export_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!export_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "export_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // commaSep memberAccess
  private static boolean export_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "export_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = commaSep(builder_, level_ + 1);
    result_ = result_ && memberAccess(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IMPORT_KEYWORD endOfLine imported
  public static boolean importExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "importExpr")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.IMPORT_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.IMPORT_KEYWORD);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && imported(builder_, level_ + 1);
    exit_section_(builder_, marker_, JuliaTypes.IMPORT_EXPR, result_);
    return result_;
  }

  // IMPORTALL_KEYWORD access
  public static boolean importAllExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "importAllExpr")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.IMPORTALL_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.IMPORTALL_KEYWORD);
    result_ = result_ && access(builder_, level_ + 1);
    exit_section_(builder_, marker_, JuliaTypes.IMPORT_ALL_EXPR, result_);
    return result_;
  }

  // USING_KEYWORD endOfLine imported
  public static boolean using(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "using")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.USING_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.USING_KEYWORD);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && imported(builder_, level_ + 1);
    exit_section_(builder_, marker_, JuliaTypes.USING, result_);
    return result_;
  }

  // ABSTRACT_KEYWORD TYPE_KEYWORD endOfLine
  //   symbol (SUBTYPE_SYM endOfLine expr)? endOfLine
  //  END_KEYWORD
  public static boolean abstractTypeDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "abstractTypeDeclaration")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.ABSTRACT_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokensSmart(builder_, 0, JuliaTypes.ABSTRACT_KEYWORD, JuliaTypes.TYPE_KEYWORD);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && symbol(builder_, level_ + 1);
    result_ = result_ && abstractTypeDeclaration_4(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.END_KEYWORD);
    exit_section_(builder_, marker_, JuliaTypes.ABSTRACT_TYPE_DECLARATION, result_);
    return result_;
  }

  // (SUBTYPE_SYM endOfLine expr)?
  private static boolean abstractTypeDeclaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "abstractTypeDeclaration_4")) return false;
    abstractTypeDeclaration_4_0(builder_, level_ + 1);
    return true;
  }

  // SUBTYPE_SYM endOfLine expr
  private static boolean abstractTypeDeclaration_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "abstractTypeDeclaration_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.SUBTYPE_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // PRIMITIVE_KEYWORD TYPE_KEYWORD endOfLine
  //   symbol (SUBTYPE_SYM endOfLine expr)? expr endOfLine
  //  END_KEYWORD
  public static boolean primitiveTypeDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primitiveTypeDeclaration")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.PRIMITIVE_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokensSmart(builder_, 0, JuliaTypes.PRIMITIVE_KEYWORD, JuliaTypes.TYPE_KEYWORD);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && symbol(builder_, level_ + 1);
    result_ = result_ && primitiveTypeDeclaration_4(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.END_KEYWORD);
    exit_section_(builder_, marker_, JuliaTypes.PRIMITIVE_TYPE_DECLARATION, result_);
    return result_;
  }

  // (SUBTYPE_SYM endOfLine expr)?
  private static boolean primitiveTypeDeclaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primitiveTypeDeclaration_4")) return false;
    primitiveTypeDeclaration_4_0(builder_, level_ + 1);
    return true;
  }

  // SUBTYPE_SYM endOfLine expr
  private static boolean primitiveTypeDeclaration_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primitiveTypeDeclaration_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.SUBTYPE_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (typeModifiers? (TYPE_KEYWORD | STRUCT_KEYWORD) | typeModifiers) endOfLine
  //   symbol typeParameters? (SUBTYPE_SYM endOfLine expr)? endOfLine
  //   statements
  //  END_KEYWORD
  public static boolean typeDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeDeclaration")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.TYPE_DECLARATION, "<type declaration>");
    result_ = typeDeclaration_0(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && symbol(builder_, level_ + 1);
    result_ = result_ && typeDeclaration_3(builder_, level_ + 1);
    result_ = result_ && typeDeclaration_4(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && statements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.END_KEYWORD);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // typeModifiers? (TYPE_KEYWORD | STRUCT_KEYWORD) | typeModifiers
  private static boolean typeDeclaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeDeclaration_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = typeDeclaration_0_0(builder_, level_ + 1);
    if (!result_) result_ = typeModifiers(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // typeModifiers? (TYPE_KEYWORD | STRUCT_KEYWORD)
  private static boolean typeDeclaration_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeDeclaration_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = typeDeclaration_0_0_0(builder_, level_ + 1);
    result_ = result_ && typeDeclaration_0_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // typeModifiers?
  private static boolean typeDeclaration_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeDeclaration_0_0_0")) return false;
    typeModifiers(builder_, level_ + 1);
    return true;
  }

  // TYPE_KEYWORD | STRUCT_KEYWORD
  private static boolean typeDeclaration_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeDeclaration_0_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.TYPE_KEYWORD);
    if (!result_) result_ = consumeTokenSmart(builder_, JuliaTypes.STRUCT_KEYWORD);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // typeParameters?
  private static boolean typeDeclaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeDeclaration_3")) return false;
    typeParameters(builder_, level_ + 1);
    return true;
  }

  // (SUBTYPE_SYM endOfLine expr)?
  private static boolean typeDeclaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeDeclaration_4")) return false;
    typeDeclaration_4_0(builder_, level_ + 1);
    return true;
  }

  // SUBTYPE_SYM endOfLine expr
  private static boolean typeDeclaration_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeDeclaration_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.SUBTYPE_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  public static boolean typeAlias(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeAlias")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.TYPEALIAS_KEYWORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = consumeTokenSmart(builder_, JuliaTypes.TYPEALIAS_KEYWORD);
    pinned_ = result_;
    result_ = pinned_ && expr(builder_, level_, 19);
    result_ = pinned_ && report_error_(builder_, typeAlias_1(builder_, level_ + 1)) && result_;
    exit_section_(builder_, level_, marker_, JuliaTypes.TYPE_ALIAS, result_, pinned_, null);
    return result_ || pinned_;
  }

  // typeParameters? userType
  private static boolean typeAlias_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeAlias_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = typeAlias_1_0(builder_, level_ + 1);
    result_ = result_ && userType(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // typeParameters?
  private static boolean typeAlias_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeAlias_1_0")) return false;
    typeParameters(builder_, level_ + 1);
    return true;
  }

  // ((LOCAL_KEYWORD | CONST_KEYWORD) endOfLine)
  //  symbolLhsInternal (commaSep symbolLhsInternal)*
  public static boolean symbolLhs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbolLhs")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.CONST_KEYWORD, JuliaTypes.LOCAL_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _COLLAPSE_, JuliaTypes.SYMBOL_LHS, "<symbol lhs>");
    result_ = symbolLhs_0(builder_, level_ + 1);
    result_ = result_ && symbolLhsInternal(builder_, level_ + 1);
    result_ = result_ && symbolLhs_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (LOCAL_KEYWORD | CONST_KEYWORD) endOfLine
  private static boolean symbolLhs_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbolLhs_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = symbolLhs_0_0(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LOCAL_KEYWORD | CONST_KEYWORD
  private static boolean symbolLhs_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbolLhs_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.LOCAL_KEYWORD);
    if (!result_) result_ = consumeTokenSmart(builder_, JuliaTypes.CONST_KEYWORD);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (commaSep symbolLhsInternal)*
  private static boolean symbolLhs_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbolLhs_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!symbolLhs_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "symbolLhs_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // commaSep symbolLhsInternal
  private static boolean symbolLhs_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbolLhs_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = commaSep(builder_, level_ + 1);
    result_ = result_ && symbolLhsInternal(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // SYM
  public static boolean symbol(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "symbol")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.SYM);
    exit_section_(builder_, marker_, JuliaTypes.SYMBOL, result_);
    return result_;
  }

  // IN_KEYWORD
  public static boolean inAsOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inAsOp")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.IN_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.IN_KEYWORD);
    exit_section_(builder_, marker_, JuliaTypes.IN_AS_OP, result_);
    return result_;
  }

  // MACRO_SYM
  public static boolean macroSymbol(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macroSymbol")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.MACRO_SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.MACRO_SYM);
    exit_section_(builder_, marker_, JuliaTypes.MACRO_SYMBOL, result_);
    return result_;
  }

  // LEFT_BRACKET endOfLine
  //   (opAsSymbol | unaryOpAsSymbol)?
  //    statements? endOfLine (COMMA_SYM endOfLine)? (FOR_KEYWORD expr IN_KEYWORD expr)*
  //  RIGHT_BRACKET
  public static boolean bracketedExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketedExpr")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.LEFT_BRACKET)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.LEFT_BRACKET);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && bracketedExpr_2(builder_, level_ + 1);
    result_ = result_ && bracketedExpr_3(builder_, level_ + 1);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    result_ = result_ && bracketedExpr_5(builder_, level_ + 1);
    result_ = result_ && bracketedExpr_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.RIGHT_BRACKET);
    exit_section_(builder_, marker_, JuliaTypes.BRACKETED_EXPR, result_);
    return result_;
  }

  // (opAsSymbol | unaryOpAsSymbol)?
  private static boolean bracketedExpr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketedExpr_2")) return false;
    bracketedExpr_2_0(builder_, level_ + 1);
    return true;
  }

  // opAsSymbol | unaryOpAsSymbol
  private static boolean bracketedExpr_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketedExpr_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = opAsSymbol(builder_, level_ + 1);
    if (!result_) result_ = unaryOpAsSymbol(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // statements?
  private static boolean bracketedExpr_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketedExpr_3")) return false;
    statements(builder_, level_ + 1);
    return true;
  }

  // (COMMA_SYM endOfLine)?
  private static boolean bracketedExpr_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketedExpr_5")) return false;
    bracketedExpr_5_0(builder_, level_ + 1);
    return true;
  }

  // COMMA_SYM endOfLine
  private static boolean bracketedExpr_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketedExpr_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.COMMA_SYM);
    result_ = result_ && endOfLine(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (FOR_KEYWORD expr IN_KEYWORD expr)*
  private static boolean bracketedExpr_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketedExpr_6")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!bracketedExpr_6_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "bracketedExpr_6", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // FOR_KEYWORD expr IN_KEYWORD expr
  private static boolean bracketedExpr_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracketedExpr_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.FOR_KEYWORD);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    result_ = result_ && consumeToken(builder_, JuliaTypes.IN_KEYWORD);
    result_ = result_ && expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // Expression root: exprOrEnd
  // Operator priority table:
  // 0: BINARY(plusIndexing)
  // 1: BINARY(multiplyIndexing)
  // 2: BINARY(rangeIndexing)
  // 3: ATOM(end)
  // 4: ATOM(exprWrapper)
  public static boolean exprOrEnd(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "exprOrEnd")) return false;
    addVariant(builder_, "<expr or end>");
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expr or end>");
    result_ = end(builder_, level_ + 1);
    if (!result_) result_ = exprWrapper(builder_, level_ + 1);
    pinned_ = result_;
    result_ = result_ && exprOrEnd_0(builder_, level_ + 1, priority_);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean exprOrEnd_0(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "exprOrEnd_0")) return false;
    boolean result_ = true;
    while (true) {
      Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
      if (priority_ < 0 && plusLevelOperator(builder_, level_ + 1)) {
        result_ = exprOrEnd(builder_, level_, 0);
        exit_section_(builder_, level_, marker_, JuliaTypes.PLUS_INDEXING, result_, true, null);
      }
      else if (priority_ < 1 && multiplyLevelOperator(builder_, level_ + 1)) {
        result_ = exprOrEnd(builder_, level_, 1);
        exit_section_(builder_, level_, marker_, JuliaTypes.MULTIPLY_INDEXING, result_, true, null);
      }
      else if (priority_ < 2 && consumeTokenSmart(builder_, JuliaTypes.COLON_SYM)) {
        result_ = exprOrEnd(builder_, level_, 2);
        exit_section_(builder_, level_, marker_, JuliaTypes.RANGE_INDEXING, result_, true, null);
      }
      else {
        exit_section_(builder_, level_, marker_, null, false, false, null);
        break;
      }
    }
    return result_;
  }

  // END_KEYWORD
  public static boolean end(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "end")) return false;
    if (!nextTokenIsSmart(builder_, JuliaTypes.END_KEYWORD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, JuliaTypes.END_KEYWORD);
    exit_section_(builder_, marker_, JuliaTypes.END, result_);
    return result_;
  }

  // primaryExpr
  public static boolean exprWrapper(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exprWrapper")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, JuliaTypes.EXPR_WRAPPER, "<expr wrapper>");
    result_ = expr(builder_, level_ + 1, 19);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

}
