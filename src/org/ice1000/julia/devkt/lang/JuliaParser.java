// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang;

import org.jetbrains.kotlin.com.intellij.lang.PsiBuilder;
import org.jetbrains.kotlin.com.intellij.lang.PsiBuilder.Marker;
import static org.ice1000.julia.devkt.lang.psi.JuliaTypes.*;

import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.tree.TokenSet;
import org.jetbrains.kotlin.com.intellij.lang.PsiParser;
import org.jetbrains.kotlin.com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class JuliaParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ARGUMENTS) {
      r = arguments(b, 0);
    }
    else if (t == ASSIGN_LEVEL_OPERATOR) {
      r = assignLevelOperator(b, 0);
    }
    else if (t == BITWISE_LEVEL_OPERATOR) {
      r = bitwiseLevelOperator(b, 0);
    }
    else if (t == CATCH_CLAUSE) {
      r = catchClause(b, 0);
    }
    else if (t == COLON_SYM_BEGINS) {
      r = colonSymBegins(b, 0);
    }
    else if (t == COMPARISON_LEVEL_OPERATOR) {
      r = comparisonLevelOperator(b, 0);
    }
    else if (t == COMPREHENSION_ELEMENT) {
      r = comprehensionElement(b, 0);
    }
    else if (t == DO_BLOCK) {
      r = doBlock(b, 0);
    }
    else if (t == ELSE_CLAUSE) {
      r = elseClause(b, 0);
    }
    else if (t == ELSE_IF_CLAUSE) {
      r = elseIfClause(b, 0);
    }
    else if (t == EXPR) {
      r = expr(b, 0, -1);
    }
    else if (t == EXPR_OR_END) {
      r = exprOrEnd(b, 0, -1);
    }
    else if (t == FINALLY_CLAUSE) {
      r = finallyClause(b, 0);
    }
    else if (t == FUNCTION_SIGNATURE) {
      r = functionSignature(b, 0);
    }
    else if (t == GLOBAL_STATEMENT) {
      r = globalStatement(b, 0);
    }
    else if (t == MEMBER_ACCESS) {
      r = memberAccess(b, 0);
    }
    else if (t == MODULE_DECLARATION) {
      r = moduleDeclaration(b, 0);
    }
    else if (t == MULTI_INDEXER) {
      r = multiIndexer(b, 0);
    }
    else if (t == MULTIPLY_LEVEL_OPERATOR) {
      r = multiplyLevelOperator(b, 0);
    }
    else if (t == NAMED_PARAMETER) {
      r = namedParameter(b, 0);
    }
    else if (t == OP_AS_SYMBOL) {
      r = opAsSymbol(b, 0);
    }
    else if (t == PIPE_LEVEL_OPERATOR) {
      r = pipeLevelOperator(b, 0);
    }
    else if (t == PLUS_LEVEL_OPERATOR) {
      r = plusLevelOperator(b, 0);
    }
    else if (t == SINGLE_COMPREHENSION) {
      r = singleComprehension(b, 0);
    }
    else if (t == SINGLE_INDEXER) {
      r = singleIndexer(b, 0);
    }
    else if (t == STATEMENTS) {
      r = statements(b, 0);
    }
    else if (t == STRING_CONTENT) {
      r = stringContent(b, 0);
    }
    else if (t == TEMPLATE) {
      r = template(b, 0);
    }
    else if (t == TYPE_ANNOTATION) {
      r = typeAnnotation(b, 0);
    }
    else if (t == TYPE_PARAMETERS) {
      r = typeParameters(b, 0);
    }
    else if (t == TYPED_NAMED_VARIABLE) {
      r = typedNamedVariable(b, 0);
    }
    else if (t == UNARY_OP_AS_SYMBOL) {
      r = unaryOpAsSymbol(b, 0);
    }
    else if (t == UNTYPED_VARIABLES) {
      r = untypedVariables(b, 0);
    }
    else if (t == USER_TYPE) {
      r = userType(b, 0);
    }
    else if (t == WHERE_CLAUSE) {
      r = whereClause(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return juliaFile(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(END, EXPR_OR_END, EXPR_WRAPPER, MULTIPLY_INDEXING,
      PLUS_INDEXING, RANGE_INDEXING),
    create_token_set_(ABSTRACT_TYPE_DECLARATION, AND_OP, APPLY_FUNCTION_OP, APPLY_INDEX_OP,
      APPLY_MACRO_OP, APPLY_WHERE_OP, ARRAY, ARROW_OP,
      ASSIGN_LEVEL_OP, ASSIGN_OP, BITWISE_LEVEL_OP, BIT_WISE_NOT_OP,
      BLOCK, BOOLEAN_LIT, BRACKETED_EXPR, BREAK_EXPR,
      BYTE_ARRAY, CHAR_LIT, COLON_BLOCK, COLON_OP,
      COMMAND, COMPACT_FUNCTION, COMPARISON_LEVEL_OP, COMPOUND_QUOTE_OP,
      CONTINUE_EXPR, DO_BLOCK, EXPONENT_OP, EXPORT,
      EXPR, FLOAT_LIT, FOR_COMPREHENSION, FOR_EXPR,
      FRACTION_OP, FUNCTION, IF_EXPR, IMPLICIT_MULTIPLY_OP,
      IMPORT_ALL_EXPR, IMPORT_EXPR, INTEGER, IN_AS_OP,
      IN_OP, LAMBDA, LET, MACRO,
      MACRO_SYMBOL, MEMBER_ACCESS_OP, MISC_ARROWS_OP, MISC_EXPONENT_OP,
      MULTIPLY_LEVEL_OP, NOT_OP, OP_AS_SYMBOL, OR_OP,
      PIPE_LEVEL_OP, PLUS_LEVEL_OP, PRIMITIVE_TYPE_DECLARATION, QUOTE_OP,
      RANGE_OP, RAW_STRING, REGEX, RETURN_EXPR,
      SPLICE_OP, STRING, SYMBOL, SYMBOL_LHS,
      TERNARY_OP, TRANSPOSE_OP, TRY_CATCH, TUPLE,
      TYPE, TYPE_ALIAS, TYPE_DECLARATION, TYPE_OP,
      UNARY_INTERPOLATE_OP, UNARY_MINUS_OP, UNARY_OP_AS_SYMBOL, UNARY_PLUS_OP,
      UNARY_SUBTYPE_OP, UNARY_TYPE_OP, UNION, USING,
      VERSION_NUMBER, WHILE_EXPR),
  };

  /* ********************************************************** */
  // (DOT_SYM | DOUBLE_DOT_SYM | SLICE_SYM)? memberAccess
  static boolean access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = access_0(b, l + 1);
    r = r && memberAccess(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DOT_SYM | DOUBLE_DOT_SYM | SLICE_SYM)?
  private static boolean access_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_0")) return false;
    access_0_0(b, l + 1);
    return true;
  }

  // DOT_SYM | DOUBLE_DOT_SYM | SLICE_SYM
  private static boolean access_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "access_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT_SYM);
    if (!r) r = consumeToken(b, DOUBLE_DOT_SYM);
    if (!r) r = consumeToken(b, SLICE_SYM);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (symbol | LEFT_B_BRACKET symbol RIGHT_B_BRACKET)
  //     ((SUBTYPE_SYM | EQ_SYM) endOfLine expr)?
  //  | LEFT_B_BRACKET
  //     (afterWhere (commaSep afterWhere)*)?
  //      COMMA_SYM? endOfLine
  //    RIGHT_B_BRACKET
  static boolean afterWhere(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "afterWhere")) return false;
    if (!nextTokenIs(b, "", LEFT_B_BRACKET, SYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = afterWhere_0(b, l + 1);
    if (!r) r = afterWhere_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (symbol | LEFT_B_BRACKET symbol RIGHT_B_BRACKET)
  //     ((SUBTYPE_SYM | EQ_SYM) endOfLine expr)?
  private static boolean afterWhere_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "afterWhere_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = afterWhere_0_0(b, l + 1);
    r = r && afterWhere_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // symbol | LEFT_B_BRACKET symbol RIGHT_B_BRACKET
  private static boolean afterWhere_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "afterWhere_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    if (!r) r = afterWhere_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_B_BRACKET symbol RIGHT_B_BRACKET
  private static boolean afterWhere_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "afterWhere_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_B_BRACKET);
    r = r && symbol(b, l + 1);
    r = r && consumeToken(b, RIGHT_B_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((SUBTYPE_SYM | EQ_SYM) endOfLine expr)?
  private static boolean afterWhere_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "afterWhere_0_1")) return false;
    afterWhere_0_1_0(b, l + 1);
    return true;
  }

  // (SUBTYPE_SYM | EQ_SYM) endOfLine expr
  private static boolean afterWhere_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "afterWhere_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = afterWhere_0_1_0_0(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SUBTYPE_SYM | EQ_SYM
  private static boolean afterWhere_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "afterWhere_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SUBTYPE_SYM);
    if (!r) r = consumeToken(b, EQ_SYM);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_B_BRACKET
  //     (afterWhere (commaSep afterWhere)*)?
  //      COMMA_SYM? endOfLine
  //    RIGHT_B_BRACKET
  private static boolean afterWhere_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "afterWhere_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_B_BRACKET);
    r = r && afterWhere_1_1(b, l + 1);
    r = r && afterWhere_1_2(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && consumeToken(b, RIGHT_B_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // (afterWhere (commaSep afterWhere)*)?
  private static boolean afterWhere_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "afterWhere_1_1")) return false;
    afterWhere_1_1_0(b, l + 1);
    return true;
  }

  // afterWhere (commaSep afterWhere)*
  private static boolean afterWhere_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "afterWhere_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = afterWhere(b, l + 1);
    r = r && afterWhere_1_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (commaSep afterWhere)*
  private static boolean afterWhere_1_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "afterWhere_1_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!afterWhere_1_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "afterWhere_1_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // commaSep afterWhere
  private static boolean afterWhere_1_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "afterWhere_1_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = commaSep(b, l + 1);
    r = r && afterWhere(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA_SYM?
  private static boolean afterWhere_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "afterWhere_1_2")) return false;
    consumeToken(b, COMMA_SYM);
    return true;
  }

  /* ********************************************************** */
  // SEMICOLON_SYM endOfLine
  //  (
  //    namedParameter
  //   (commaSep namedParameter)*
  //  )?
  //  endOfLine
  public static boolean arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments")) return false;
    if (!nextTokenIs(b, SEMICOLON_SYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON_SYM);
    r = r && endOfLine(b, l + 1);
    r = r && arguments_2(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, ARGUMENTS, r);
    return r;
  }

  // (
  //    namedParameter
  //   (commaSep namedParameter)*
  //  )?
  private static boolean arguments_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_2")) return false;
    arguments_2_0(b, l + 1);
    return true;
  }

  // namedParameter
  //   (commaSep namedParameter)*
  private static boolean arguments_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namedParameter(b, l + 1);
    r = r && arguments_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (commaSep namedParameter)*
  private static boolean arguments_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!arguments_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arguments_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // commaSep namedParameter
  private static boolean arguments_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = commaSep(b, l + 1);
    r = r && namedParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
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
  public static boolean assignLevelOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignLevelOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGN_LEVEL_OPERATOR, "<assign level operator>");
    r = consumeToken(b, COLON_ASSIGN_SYM);
    if (!r) r = consumeToken(b, BITWISE_AND_ASSIGN_SYM);
    if (!r) r = consumeToken(b, BITWISE_OR_ASSIGN_SYM);
    if (!r) r = consumeToken(b, BITWISE_XOR_ASSIGN_SYM);
    if (!r) r = consumeToken(b, INVERSE_DIV_ASSIGN_SYM);
    if (!r) r = consumeToken(b, SHL_ASSIGN_SYM);
    if (!r) r = consumeToken(b, SHR_ASSIGN_SYM);
    if (!r) r = consumeToken(b, REMAINDER_ASSIGN_SYM);
    if (!r) r = consumeToken(b, USHR_ASSIGN_SYM);
    if (!r) r = consumeToken(b, PLUS_ASSIGN_SYM);
    if (!r) r = consumeToken(b, MINUS_ASSIGN_SYM);
    if (!r) r = consumeToken(b, MULTIPLY_ASSIGN_SYM);
    if (!r) r = consumeToken(b, FRACTION_ASSIGN_SYM);
    if (!r) r = consumeToken(b, DIVIDE_ASSIGN_SYM);
    if (!r) r = consumeToken(b, FACTORISE_ASSIGN_SYM);
    if (!r) r = consumeToken(b, EXPONENT_ASSIGN_SYM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SHR_SYM
  //  | USHR_SYM
  //  | SHL_SYM
  public static boolean bitwiseLevelOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwiseLevelOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BITWISE_LEVEL_OPERATOR, "<bitwise level operator>");
    r = consumeToken(b, SHR_SYM);
    if (!r) r = consumeToken(b, USHR_SYM);
    if (!r) r = consumeToken(b, SHL_SYM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BLOCK_COMMENT_START (BLOCK_COMMENT_BODY | blockComment)* BLOCK_COMMENT_END
  static boolean blockComment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockComment")) return false;
    if (!nextTokenIs(b, BLOCK_COMMENT_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BLOCK_COMMENT_START);
    r = r && blockComment_1(b, l + 1);
    r = r && consumeToken(b, BLOCK_COMMENT_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // (BLOCK_COMMENT_BODY | blockComment)*
  private static boolean blockComment_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockComment_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!blockComment_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "blockComment_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // BLOCK_COMMENT_BODY | blockComment
  private static boolean blockComment_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockComment_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BLOCK_COMMENT_BODY);
    if (!r) r = blockComment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CATCH_KEYWORD symbol? endOfLine
  //  statements
  public static boolean catchClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catchClause")) return false;
    if (!nextTokenIs(b, CATCH_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CATCH_KEYWORD);
    r = r && catchClause_1(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && statements(b, l + 1);
    exit_section_(b, m, CATCH_CLAUSE, r);
    return r;
  }

  // symbol?
  private static boolean catchClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catchClause_1")) return false;
    symbol(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // COLON_SYM endOfLine LEFT_BRACKET
  public static boolean colonSymBegins(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colonSymBegins")) return false;
    if (!nextTokenIs(b, COLON_SYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON_SYM);
    r = r && endOfLine(b, l + 1);
    r = r && consumeToken(b, LEFT_BRACKET);
    exit_section_(b, m, COLON_SYM_BEGINS, r);
    return r;
  }

  /* ********************************************************** */
  // endOfLine COMMA_SYM endOfLine
  static boolean commaSep(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "commaSep")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = endOfLine(b, l + 1);
    r = r && consumeToken(b, COMMA_SYM);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // blockComment | LINE_COMMENT
  static boolean comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment")) return false;
    if (!nextTokenIs(b, "", BLOCK_COMMENT_START, LINE_COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = blockComment(b, l + 1);
    if (!r) r = consumeToken(b, LINE_COMMENT);
    exit_section_(b, m, null, r);
    return r;
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
  public static boolean comparisonLevelOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonLevelOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON_LEVEL_OPERATOR, "<comparison level operator>");
    r = consumeToken(b, LESS_THAN_SYM);
    if (!r) r = consumeToken(b, LESS_THAN_OR_EQUAL_SYM);
    if (!r) r = consumeToken(b, GREATER_THAN_SYM);
    if (!r) r = consumeToken(b, GREATER_THAN_OR_EQUAL_SYM);
    if (!r) r = consumeToken(b, EQUALS_SYM);
    if (!r) r = consumeToken(b, UNEQUAL_SYM);
    if (!r) r = consumeToken(b, IS_SYM);
    if (!r) r = consumeToken(b, ISNT_SYM);
    if (!r) r = consumeToken(b, SUBTYPE_SYM);
    if (!r) r = consumeToken(b, MISC_COMPARISON_SYM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // endOfLine expr endOfLine
  //  (
  //   FOR_KEYWORD
  //   singleComprehension
  //    (commaSep singleComprehension)?)+
  public static boolean comprehensionElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comprehensionElement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPREHENSION_ELEMENT, "<comprehension element>");
    r = endOfLine(b, l + 1);
    r = r && expr(b, l + 1, -1);
    r = r && endOfLine(b, l + 1);
    r = r && comprehensionElement_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (
  //   FOR_KEYWORD
  //   singleComprehension
  //    (commaSep singleComprehension)?)+
  private static boolean comprehensionElement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comprehensionElement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comprehensionElement_3_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!comprehensionElement_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "comprehensionElement_3", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // FOR_KEYWORD
  //   singleComprehension
  //    (commaSep singleComprehension)?
  private static boolean comprehensionElement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comprehensionElement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR_KEYWORD);
    r = r && singleComprehension(b, l + 1);
    r = r && comprehensionElement_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (commaSep singleComprehension)?
  private static boolean comprehensionElement_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comprehensionElement_3_0_2")) return false;
    comprehensionElement_3_0_2_0(b, l + 1);
    return true;
  }

  // commaSep singleComprehension
  private static boolean comprehensionElement_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comprehensionElement_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = commaSep(b, l + 1);
    r = r && singleComprehension(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DO_KEYWORD statements END_KEYWORD
  public static boolean doBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doBlock")) return false;
    if (!nextTokenIs(b, DO_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DO_KEYWORD);
    r = r && statements(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, DO_BLOCK, r);
    return r;
  }

  /* ********************************************************** */
  // ELSE_KEYWORD statements
  public static boolean elseClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elseClause")) return false;
    if (!nextTokenIs(b, ELSE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE_KEYWORD);
    r = r && statements(b, l + 1);
    exit_section_(b, m, ELSE_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // ELSEIF_KEYWORD expr endOfLine
  //  statements
  public static boolean elseIfClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elseIfClause")) return false;
    if (!nextTokenIs(b, ELSEIF_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSEIF_KEYWORD);
    r = r && expr(b, l + 1, -1);
    r = r && endOfLine(b, l + 1);
    r = r && statements(b, l + 1);
    exit_section_(b, m, ELSE_IF_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // endOfLineImpl*
  static boolean endOfLine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endOfLine")) return false;
    int c = current_position_(b);
    while (true) {
      if (!endOfLineImpl(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "endOfLine", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // EOL | comment
  static boolean endOfLineImpl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "endOfLineImpl")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EOL);
    if (!r) r = comment(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expr (commaSep expr)* COMMA_SYM?
  static boolean expressionList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && expressionList_1(b, l + 1);
    r = r && expressionList_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (commaSep expr)*
  private static boolean expressionList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expressionList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expressionList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // commaSep expr
  private static boolean expressionList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = commaSep(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA_SYM?
  private static boolean expressionList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionList_2")) return false;
    consumeToken(b, COMMA_SYM);
    return true;
  }

  /* ********************************************************** */
  // FINALLY_KEYWORD statements
  public static boolean finallyClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "finallyClause")) return false;
    if (!nextTokenIs(b, FINALLY_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FINALLY_KEYWORD);
    r = r && statements(b, l + 1);
    exit_section_(b, m, FINALLY_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACKET endOfLine
  //   (typedNamedVariable (commaSep typedNamedVariable)*)?
  //   (SEMICOLON_SYM endOfLine
  //    (typedNamedVariable (commaSep typedNamedVariable)*)?)?
  //   commaSep?
  //   (SLICE_SYM endOfLine)?
  //  RIGHT_BRACKET
  public static boolean functionSignature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionSignature")) return false;
    if (!nextTokenIs(b, LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && endOfLine(b, l + 1);
    r = r && functionSignature_2(b, l + 1);
    r = r && functionSignature_3(b, l + 1);
    r = r && functionSignature_4(b, l + 1);
    r = r && functionSignature_5(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, FUNCTION_SIGNATURE, r);
    return r;
  }

  // (typedNamedVariable (commaSep typedNamedVariable)*)?
  private static boolean functionSignature_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionSignature_2")) return false;
    functionSignature_2_0(b, l + 1);
    return true;
  }

  // typedNamedVariable (commaSep typedNamedVariable)*
  private static boolean functionSignature_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionSignature_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typedNamedVariable(b, l + 1);
    r = r && functionSignature_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (commaSep typedNamedVariable)*
  private static boolean functionSignature_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionSignature_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!functionSignature_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionSignature_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // commaSep typedNamedVariable
  private static boolean functionSignature_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionSignature_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = commaSep(b, l + 1);
    r = r && typedNamedVariable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SEMICOLON_SYM endOfLine
  //    (typedNamedVariable (commaSep typedNamedVariable)*)?)?
  private static boolean functionSignature_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionSignature_3")) return false;
    functionSignature_3_0(b, l + 1);
    return true;
  }

  // SEMICOLON_SYM endOfLine
  //    (typedNamedVariable (commaSep typedNamedVariable)*)?
  private static boolean functionSignature_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionSignature_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON_SYM);
    r = r && endOfLine(b, l + 1);
    r = r && functionSignature_3_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (typedNamedVariable (commaSep typedNamedVariable)*)?
  private static boolean functionSignature_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionSignature_3_0_2")) return false;
    functionSignature_3_0_2_0(b, l + 1);
    return true;
  }

  // typedNamedVariable (commaSep typedNamedVariable)*
  private static boolean functionSignature_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionSignature_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typedNamedVariable(b, l + 1);
    r = r && functionSignature_3_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (commaSep typedNamedVariable)*
  private static boolean functionSignature_3_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionSignature_3_0_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!functionSignature_3_0_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionSignature_3_0_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // commaSep typedNamedVariable
  private static boolean functionSignature_3_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionSignature_3_0_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = commaSep(b, l + 1);
    r = r && typedNamedVariable(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // commaSep?
  private static boolean functionSignature_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionSignature_4")) return false;
    commaSep(b, l + 1);
    return true;
  }

  // (SLICE_SYM endOfLine)?
  private static boolean functionSignature_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionSignature_5")) return false;
    functionSignature_5_0(b, l + 1);
    return true;
  }

  // SLICE_SYM endOfLine
  private static boolean functionSignature_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionSignature_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SLICE_SYM);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GLOBAL_KEYWORD endOfLine
  //  symbol (COMMA_SYM endOfLine symbol)*
  public static boolean globalStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "globalStatement")) return false;
    if (!nextTokenIs(b, GLOBAL_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GLOBAL_KEYWORD);
    r = r && endOfLine(b, l + 1);
    r = r && symbol(b, l + 1);
    r = r && globalStatement_3(b, l + 1);
    exit_section_(b, m, GLOBAL_STATEMENT, r);
    return r;
  }

  // (COMMA_SYM endOfLine symbol)*
  private static boolean globalStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "globalStatement_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!globalStatement_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "globalStatement_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA_SYM endOfLine symbol
  private static boolean globalStatement_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "globalStatement_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA_SYM);
    r = r && endOfLine(b, l + 1);
    r = r && symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // access (COLON_SYM symbolAndMacroSymbol)? (commaSep access)*
  static boolean imported(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imported")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = access(b, l + 1);
    r = r && imported_1(b, l + 1);
    r = r && imported_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COLON_SYM symbolAndMacroSymbol)?
  private static boolean imported_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imported_1")) return false;
    imported_1_0(b, l + 1);
    return true;
  }

  // COLON_SYM symbolAndMacroSymbol
  private static boolean imported_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imported_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON_SYM);
    r = r && symbolAndMacroSymbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (commaSep access)*
  private static boolean imported_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imported_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!imported_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "imported_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // commaSep access
  private static boolean imported_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "imported_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = commaSep(b, l + 1);
    r = r && access(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // multiIndexer | singleIndexer
  static boolean indexer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexer")) return false;
    if (!nextTokenIs(b, "", LEFT_BRACKET, SYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiIndexer(b, l + 1);
    if (!r) r = singleIndexer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IN_KEYWORD | IN_SYM | EQ_SYM
  static boolean infixIndexer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixIndexer")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IN_KEYWORD);
    if (!r) r = consumeToken(b, IN_SYM);
    if (!r) r = consumeToken(b, EQ_SYM);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // endOfLine statements
  static boolean juliaFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "juliaFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = endOfLine(b, l + 1);
    r = r && statements(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IN_KEYWORD
  //  | UNION_KEYWORD
  //  | opAsSymbol
  //  | symbolAndMacroSymbol (DOT_SYM symbolAndMacroSymbol)*
  public static boolean memberAccess(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberAccess")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMBER_ACCESS, "<member access>");
    r = consumeToken(b, IN_KEYWORD);
    if (!r) r = consumeToken(b, UNION_KEYWORD);
    if (!r) r = opAsSymbol(b, l + 1);
    if (!r) r = memberAccess_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // symbolAndMacroSymbol (DOT_SYM symbolAndMacroSymbol)*
  private static boolean memberAccess_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberAccess_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbolAndMacroSymbol(b, l + 1);
    r = r && memberAccess_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DOT_SYM symbolAndMacroSymbol)*
  private static boolean memberAccess_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberAccess_3_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!memberAccess_3_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "memberAccess_3_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DOT_SYM symbolAndMacroSymbol
  private static boolean memberAccess_3_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberAccess_3_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT_SYM);
    r = r && symbolAndMacroSymbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (BAREMODULE_KEYWORD | MODULE_KEYWORD) symbol endOfLine
  //   statements
  //  END_KEYWORD {
  // }
  public static boolean moduleDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleDeclaration")) return false;
    if (!nextTokenIs(b, "<module declaration>", BAREMODULE_KEYWORD, MODULE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_DECLARATION, "<module declaration>");
    r = moduleDeclaration_0(b, l + 1);
    r = r && symbol(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && statements(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    r = r && moduleDeclaration_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BAREMODULE_KEYWORD | MODULE_KEYWORD
  private static boolean moduleDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BAREMODULE_KEYWORD);
    if (!r) r = consumeToken(b, MODULE_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  // }
  private static boolean moduleDeclaration_5(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // tuple infixIndexer endOfLine expr
  public static boolean multiIndexer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiIndexer")) return false;
    if (!nextTokenIs(b, LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tuple(b, l + 1);
    r = r && infixIndexer(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, MULTI_INDEXER, r);
    return r;
  }

  /* ********************************************************** */
  // MULTIPLY_SYM
  //  | DIVIDE_SYM
  //  | REMAINDER_SYM
  //  | INVERSE_DIV_SYM
  //  | FACTORISE_SYM
  //  | BITWISE_AND_SYM
  //  | MISC_MULTIPLY_SYM
  public static boolean multiplyLevelOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplyLevelOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIPLY_LEVEL_OPERATOR, "<multiply level operator>");
    r = consumeToken(b, MULTIPLY_SYM);
    if (!r) r = consumeToken(b, DIVIDE_SYM);
    if (!r) r = consumeToken(b, REMAINDER_SYM);
    if (!r) r = consumeToken(b, INVERSE_DIV_SYM);
    if (!r) r = consumeToken(b, FACTORISE_SYM);
    if (!r) r = consumeToken(b, BITWISE_AND_SYM);
    if (!r) r = consumeToken(b, MISC_MULTIPLY_SYM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // symbol endOfLine EQ_SYM endOfLine expr
  public static boolean namedParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namedParameter")) return false;
    if (!nextTokenIs(b, SYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && consumeToken(b, EQ_SYM);
    r = r && endOfLine(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, NAMED_PARAMETER, r);
    return r;
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
  public static boolean opAsSymbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "opAsSymbol")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OP_AS_SYMBOL, "<op as symbol>");
    r = consumeToken(b, SEMICOLON_SYM);
    if (!r) r = consumeToken(b, QUESTION_SYM);
    if (!r) r = consumeToken(b, SUBTYPE_SYM);
    if (!r) r = consumeToken(b, INVERSE_DIV_SYM);
    if (!r) r = consumeToken(b, IS_SYM);
    if (!r) r = consumeToken(b, ISNT_SYM);
    if (!r) r = consumeToken(b, EQ_SYM);
    if (!r) r = consumeToken(b, LAMBDA_ABSTRACTION);
    if (!r) r = consumeToken(b, ARROW_SYM);
    if (!r) r = consumeToken(b, SLICE_SYM);
    if (!r) r = consumeToken(b, LESS_THAN_SYM);
    if (!r) r = consumeToken(b, LESS_THAN_OR_EQUAL_SYM);
    if (!r) r = consumeToken(b, AND_SYM);
    if (!r) r = consumeToken(b, OR_SYM);
    if (!r) r = consumeToken(b, PIPE_SYM);
    if (!r) r = consumeToken(b, INVRESE_PIPE_SYM);
    if (!r) r = consumeToken(b, SHL_SYM);
    if (!r) r = consumeToken(b, SHR_SYM);
    if (!r) r = consumeToken(b, USHR_SYM);
    if (!r) r = consumeToken(b, FRACTION_SYM);
    if (!r) r = consumeToken(b, DIVIDE_SYM);
    if (!r) r = consumeToken(b, REMAINDER_SYM);
    if (!r) r = consumeToken(b, EXPONENT_SYM);
    if (!r) r = consumeToken(b, MULTIPLY_SYM);
    if (!r) r = consumeToken(b, EQUALS_SYM);
    if (!r) r = consumeToken(b, UNEQUAL_SYM);
    if (!r) r = consumeToken(b, GREATER_THAN_SYM);
    if (!r) r = consumeToken(b, GREATER_THAN_OR_EQUAL_SYM);
    if (!r) r = consumeToken(b, TRANSPOSE_SYM);
    if (!r) r = consumeToken(b, IN_SYM);
    if (!r) r = consumeToken(b, MISC_COMPARISON_SYM);
    if (!r) r = consumeToken(b, MISC_PLUS_SYM);
    if (!r) r = consumeToken(b, MISC_MULTIPLY_SYM);
    if (!r) r = consumeToken(b, MISC_EXPONENT_SYM);
    if (!r) r = consumeToken(b, FACTORISE_SYM);
    if (!r) r = consumeToken(b, BITWISE_AND_SYM);
    if (!r) r = consumeToken(b, BITWISE_OR_SYM);
    if (!r) r = consumeToken(b, BITWISE_XOR_SYM);
    if (!r) r = consumeToken(b, SPECIAL_ARROW_SYM);
    if (!r) r = consumeToken(b, MISC_ARROW_SYM);
    if (!r) r = consumeToken(b, BITWISE_NOT_SYM);
    if (!r) r = consumeToken(b, ASSIGN_SYM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PIPE_SYM | INVERSE_PIPE_SYM
  public static boolean pipeLevelOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pipeLevelOperator")) return false;
    if (!nextTokenIs(b, "<pipe level operator>", INVERSE_PIPE_SYM, PIPE_SYM)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PIPE_LEVEL_OPERATOR, "<pipe level operator>");
    r = consumeToken(b, PIPE_SYM);
    if (!r) r = consumeToken(b, INVERSE_PIPE_SYM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INTERPOLATE_SYM
  //  | BITWISE_XOR_SYM
  //  | BITWISE_OR_SYM
  //  | PLUS_SYM
  //  | MINUS_SYM
  //  | MISC_PLUS_SYM
  public static boolean plusLevelOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plusLevelOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PLUS_LEVEL_OPERATOR, "<plus level operator>");
    r = consumeToken(b, INTERPOLATE_SYM);
    if (!r) r = consumeToken(b, BITWISE_XOR_SYM);
    if (!r) r = consumeToken(b, BITWISE_OR_SYM);
    if (!r) r = consumeToken(b, PLUS_SYM);
    if (!r) r = consumeToken(b, MINUS_SYM);
    if (!r) r = consumeToken(b, MISC_PLUS_SYM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // unaryOpAsSymbol
  //  | opAsSymbol
  //  | QUOTE_KEYWORD
  //  | expr
  static boolean quotable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quotable")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unaryOpAsSymbol(b, l + 1);
    if (!r) r = opAsSymbol(b, l + 1);
    if (!r) r = consumeToken(b, QUOTE_KEYWORD);
    if (!r) r = expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // endOfLineImpl | SEMICOLON_SYM
  static boolean semi(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "semi")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = endOfLineImpl(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON_SYM);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // indexer (IF_KEYWORD expr)?
  public static boolean singleComprehension(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleComprehension")) return false;
    if (!nextTokenIs(b, "<single comprehension>", LEFT_BRACKET, SYM)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_COMPREHENSION, "<single comprehension>");
    r = indexer(b, l + 1);
    r = r && singleComprehension_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (IF_KEYWORD expr)?
  private static boolean singleComprehension_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleComprehension_1")) return false;
    singleComprehension_1_0(b, l + 1);
    return true;
  }

  // IF_KEYWORD expr
  private static boolean singleComprehension_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleComprehension_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF_KEYWORD);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // symbol infixIndexer endOfLine expr
  public static boolean singleIndexer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleIndexer")) return false;
    if (!nextTokenIs(b, SYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    r = r && infixIndexer(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, SINGLE_INDEXER, r);
    return r;
  }

  /* ********************************************************** */
  // QUOTE_START stringTemplateElement* QUOTE_END
  static boolean singleQuoteString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleQuoteString")) return false;
    if (!nextTokenIs(b, QUOTE_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTE_START);
    r = r && singleQuoteString_1(b, l + 1);
    r = r && consumeToken(b, QUOTE_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // stringTemplateElement*
  private static boolean singleQuoteString_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleQuoteString_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!stringTemplateElement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "singleQuoteString_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // integer | floatLit | symbol | string
  static boolean specialLhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specialLhs")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = integer(b, l + 1);
    if (!r) r = floatLit(b, l + 1);
    if (!r) r = symbol(b, l + 1);
    if (!r) r = string(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // symbol | string | charLit | integer | floatLit
  static boolean specialRhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specialRhs")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = charLit(b, l + 1);
    if (!r) r = integer(b, l + 1);
    if (!r) r = floatLit(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // moduleDeclaration
  //  | globalStatement
  //  | expr (COMMA_SYM expr)*
  static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = moduleDeclaration(b, l + 1);
    if (!r) r = globalStatement(b, l + 1);
    if (!r) r = statement_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr (COMMA_SYM expr)*
  private static boolean statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && statement_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA_SYM expr)*
  private static boolean statement_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_2_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!statement_2_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statement_2_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA_SYM expr
  private static boolean statement_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA_SYM);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // semi* (statement (semi+ statement)*)? semi* {
  // }
  public static boolean statements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENTS, "<statements>");
    r = statements_0(b, l + 1);
    r = r && statements_1(b, l + 1);
    r = r && statements_2(b, l + 1);
    r = r && statements_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // semi*
  private static boolean statements_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!semi(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statements_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (statement (semi+ statement)*)?
  private static boolean statements_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_1")) return false;
    statements_1_0(b, l + 1);
    return true;
  }

  // statement (semi+ statement)*
  private static boolean statements_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    r = r && statements_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (semi+ statement)*
  private static boolean statements_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!statements_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statements_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // semi+ statement
  private static boolean statements_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statements_1_0_1_0_0(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // semi+
  private static boolean statements_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_1_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = semi(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!semi(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statements_1_0_1_0_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // semi*
  private static boolean statements_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statements_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!semi(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statements_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // {
  // }
  private static boolean statements_3(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // REGULAR_STRING_PART_LITERAL
  public static boolean stringContent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringContent")) return false;
    if (!nextTokenIs(b, REGULAR_STRING_PART_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REGULAR_STRING_PART_LITERAL);
    exit_section_(b, m, STRING_CONTENT, r);
    return r;
  }

  /* ********************************************************** */
  // STRING_UNICODE
  //  | STRING_ESCAPE
  //  | template
  //  | stringContent
  static boolean stringTemplateElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stringTemplateElement")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_UNICODE);
    if (!r) r = consumeToken(b, STRING_ESCAPE);
    if (!r) r = template(b, l + 1);
    if (!r) r = stringContent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // symbol | macroSymbol
  static boolean symbolAndMacroSymbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbolAndMacroSymbol")) return false;
    if (!nextTokenIs(b, "", MACRO_SYM, SYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    if (!r) r = macroSymbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // symbol | LEFT_BRACKET symbol RIGHT_BRACKET
  static boolean symbolLhsInternal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbolLhsInternal")) return false;
    if (!nextTokenIs(b, "", LEFT_BRACKET, SYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    if (!r) r = symbolLhsInternal_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_BRACKET symbol RIGHT_BRACKET
  private static boolean symbolLhsInternal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbolLhsInternal_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && symbol(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SHORT_INTERPOLATE_SYM symbol | STRING_INTERPOLATE_START expr STRING_INTERPOLATE_END
  public static boolean template(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template")) return false;
    if (!nextTokenIs(b, "<template>", SHORT_INTERPOLATE_SYM, STRING_INTERPOLATE_START)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEMPLATE, "<template>");
    r = template_0(b, l + 1);
    if (!r) r = template_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SHORT_INTERPOLATE_SYM symbol
  private static boolean template_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SHORT_INTERPOLATE_SYM);
    r = r && symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING_INTERPOLATE_START expr STRING_INTERPOLATE_END
  private static boolean template_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "template_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING_INTERPOLATE_START);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, STRING_INTERPOLATE_END);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TRIPLE_QUOTE_START stringTemplateElement* TRIPLE_QUOTE_END
  static boolean tripleQuoteString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tripleQuoteString")) return false;
    if (!nextTokenIs(b, TRIPLE_QUOTE_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRIPLE_QUOTE_START);
    r = r && tripleQuoteString_1(b, l + 1);
    r = r && consumeToken(b, TRIPLE_QUOTE_END);
    exit_section_(b, m, null, r);
    return r;
  }

  // stringTemplateElement*
  private static boolean tripleQuoteString_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tripleQuoteString_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!stringTemplateElement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tripleQuoteString_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // DOUBLE_COLON endOfLine
  //  primaryExpr endOfLine
  //  typeParameters?
  public static boolean typeAnnotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeAnnotation")) return false;
    if (!nextTokenIs(b, DOUBLE_COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_COLON);
    r = r && endOfLine(b, l + 1);
    r = r && expr(b, l + 1, 19);
    r = r && endOfLine(b, l + 1);
    r = r && typeAnnotation_4(b, l + 1);
    exit_section_(b, m, TYPE_ANNOTATION, r);
    return r;
  }

  // typeParameters?
  private static boolean typeAnnotation_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeAnnotation_4")) return false;
    typeParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IMMUTABLE_KEYWORD | MUTABLE_KEYWORD
  static boolean typeModifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeModifiers")) return false;
    if (!nextTokenIs(b, "", IMMUTABLE_KEYWORD, MUTABLE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMMUTABLE_KEYWORD);
    if (!r) r = consumeToken(b, MUTABLE_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LEFT_B_BRACKET endOfLine
  //   expr? (commaSep expr?)* endOfLine
  //  RIGHT_B_BRACKET
  public static boolean typeParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameters")) return false;
    if (!nextTokenIs(b, LEFT_B_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_B_BRACKET);
    r = r && endOfLine(b, l + 1);
    r = r && typeParameters_2(b, l + 1);
    r = r && typeParameters_3(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && consumeToken(b, RIGHT_B_BRACKET);
    exit_section_(b, m, TYPE_PARAMETERS, r);
    return r;
  }

  // expr?
  private static boolean typeParameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameters_2")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  // (commaSep expr?)*
  private static boolean typeParameters_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameters_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!typeParameters_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeParameters_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // commaSep expr?
  private static boolean typeParameters_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameters_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = commaSep(b, l + 1);
    r = r && typeParameters_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr?
  private static boolean typeParameters_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeParameters_3_0_1")) return false;
    expr(b, l + 1, -1);
    return true;
  }

  /* ********************************************************** */
  // (
  //    symbol typeAnnotation?
  //  | symbol? typeAnnotation
  //  ) (EQ_SYM expr)?
  public static boolean typedNamedVariable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedNamedVariable")) return false;
    if (!nextTokenIs(b, "<typed named variable>", DOUBLE_COLON, SYM)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPED_NAMED_VARIABLE, "<typed named variable>");
    r = typedNamedVariable_0(b, l + 1);
    r = r && typedNamedVariable_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // symbol typeAnnotation?
  //  | symbol? typeAnnotation
  private static boolean typedNamedVariable_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedNamedVariable_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typedNamedVariable_0_0(b, l + 1);
    if (!r) r = typedNamedVariable_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // symbol typeAnnotation?
  private static boolean typedNamedVariable_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedNamedVariable_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    r = r && typedNamedVariable_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeAnnotation?
  private static boolean typedNamedVariable_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedNamedVariable_0_0_1")) return false;
    typeAnnotation(b, l + 1);
    return true;
  }

  // symbol? typeAnnotation
  private static boolean typedNamedVariable_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedNamedVariable_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typedNamedVariable_0_1_0(b, l + 1);
    r = r && typeAnnotation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // symbol?
  private static boolean typedNamedVariable_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedNamedVariable_0_1_0")) return false;
    symbol(b, l + 1);
    return true;
  }

  // (EQ_SYM expr)?
  private static boolean typedNamedVariable_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedNamedVariable_1")) return false;
    typedNamedVariable_1_0(b, l + 1);
    return true;
  }

  // EQ_SYM expr
  private static boolean typedNamedVariable_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedNamedVariable_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ_SYM);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MINUS_SYM
  //  | DOT_SYM
  //  | PLUS_SYM
  //  | NOT_SYM
  //  | INTERPOLATE_SYM
  public static boolean unaryOpAsSymbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryOpAsSymbol")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_OP_AS_SYMBOL, "<unary op as symbol>");
    r = consumeToken(b, MINUS_SYM);
    if (!r) r = consumeToken(b, DOT_SYM);
    if (!r) r = consumeToken(b, PLUS_SYM);
    if (!r) r = consumeToken(b, NOT_SYM);
    if (!r) r = consumeToken(b, INTERPOLATE_SYM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LEFT_BRACKET endOfLine
  //   (symbol (commaSep symbol)*)? endOfLine
  //  RIGHT_BRACKET
  public static boolean untypedVariables(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "untypedVariables")) return false;
    if (!nextTokenIs(b, LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && endOfLine(b, l + 1);
    r = r && untypedVariables_2(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, UNTYPED_VARIABLES, r);
    return r;
  }

  // (symbol (commaSep symbol)*)?
  private static boolean untypedVariables_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "untypedVariables_2")) return false;
    untypedVariables_2_0(b, l + 1);
    return true;
  }

  // symbol (commaSep symbol)*
  private static boolean untypedVariables_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "untypedVariables_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    r = r && untypedVariables_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (commaSep symbol)*
  private static boolean untypedVariables_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "untypedVariables_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!untypedVariables_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "untypedVariables_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // commaSep symbol
  private static boolean untypedVariables_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "untypedVariables_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = commaSep(b, l + 1);
    r = r && symbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primaryExpr typeParameters?
  public static boolean userType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "userType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, USER_TYPE, "<user type>");
    r = expr(b, l + 1, 19);
    r = r && userType_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // typeParameters?
  private static boolean userType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "userType_1")) return false;
    typeParameters(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // WHERE_KEYWORD afterWhere
  public static boolean whereClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereClause")) return false;
    if (!nextTokenIs(b, WHERE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE_KEYWORD);
    r = r && afterWhere(b, l + 1);
    exit_section_(b, m, WHERE_CLAUSE, r);
    return r;
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
  // 20: ATOM(string) ATOM(command) ATOM(regex) ATOM(rawString)
  //    ATOM(versionNumber) ATOM(byteArray) ATOM(charLit) ATOM(integer)
  //    ATOM(floatLit) ATOM(booleanLit) PREFIX(ifExpr) ATOM(forExpr)
  //    ATOM(forComprehension) PREFIX(whileExpr) PREFIX(function) ATOM(returnExpr)
  //    ATOM(breakExpr) ATOM(tryCatch) ATOM(continueExpr) ATOM(array)
  //    PREFIX(union) ATOM(tuple) PREFIX(macro) ATOM(let)
  //    ATOM(block) ATOM(colonBlock) ATOM(export) ATOM(importExpr)
  //    ATOM(importAllExpr) ATOM(using) ATOM(abstractTypeDeclaration) ATOM(primitiveTypeDeclaration)
  //    ATOM(typeDeclaration) PREFIX(typeAlias) ATOM(symbolLhs) ATOM(symbol)
  //    ATOM(inAsOp) ATOM(macroSymbol) ATOM(bracketedExpr)
  public static boolean expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = applyMacroOp(b, l + 1);
    if (!r) r = lambda(b, l + 1);
    if (!r) r = quoteOp(b, l + 1);
    if (!r) r = compoundQuoteOp(b, l + 1);
    if (!r) r = implicitMultiplyOp(b, l + 1);
    if (!r) r = unaryPlusOp(b, l + 1);
    if (!r) r = unaryMinusOp(b, l + 1);
    if (!r) r = unaryTypeOp(b, l + 1);
    if (!r) r = unarySubtypeOp(b, l + 1);
    if (!r) r = unaryInterpolateOp(b, l + 1);
    if (!r) r = notOp(b, l + 1);
    if (!r) r = bitWiseNotOp(b, l + 1);
    if (!r) r = string(b, l + 1);
    if (!r) r = command(b, l + 1);
    if (!r) r = regex(b, l + 1);
    if (!r) r = rawString(b, l + 1);
    if (!r) r = versionNumber(b, l + 1);
    if (!r) r = byteArray(b, l + 1);
    if (!r) r = charLit(b, l + 1);
    if (!r) r = integer(b, l + 1);
    if (!r) r = floatLit(b, l + 1);
    if (!r) r = booleanLit(b, l + 1);
    if (!r) r = ifExpr(b, l + 1);
    if (!r) r = forExpr(b, l + 1);
    if (!r) r = forComprehension(b, l + 1);
    if (!r) r = whileExpr(b, l + 1);
    if (!r) r = function(b, l + 1);
    if (!r) r = returnExpr(b, l + 1);
    if (!r) r = breakExpr(b, l + 1);
    if (!r) r = tryCatch(b, l + 1);
    if (!r) r = continueExpr(b, l + 1);
    if (!r) r = array(b, l + 1);
    if (!r) r = union(b, l + 1);
    if (!r) r = tuple(b, l + 1);
    if (!r) r = macro(b, l + 1);
    if (!r) r = let(b, l + 1);
    if (!r) r = block(b, l + 1);
    if (!r) r = colonBlock(b, l + 1);
    if (!r) r = export(b, l + 1);
    if (!r) r = importExpr(b, l + 1);
    if (!r) r = importAllExpr(b, l + 1);
    if (!r) r = using(b, l + 1);
    if (!r) r = abstractTypeDeclaration(b, l + 1);
    if (!r) r = primitiveTypeDeclaration(b, l + 1);
    if (!r) r = typeDeclaration(b, l + 1);
    if (!r) r = typeAlias(b, l + 1);
    if (!r) r = symbolLhs(b, l + 1);
    if (!r) r = symbol(b, l + 1);
    if (!r) r = inAsOp(b, l + 1);
    if (!r) r = macroSymbol(b, l + 1);
    if (!r) r = bracketedExpr(b, l + 1);
    p = r;
    r = r && expr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && leftMarkerIs(b, SYMBOL) && compactFunction_0(b, l + 1)) {
        r = expr(b, l, 0);
        exit_section_(b, l, m, COMPACT_FUNCTION, r, true, null);
      }
      else if (g < 2 && assignOp_0(b, l + 1)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, ASSIGN_OP, r, true, null);
      }
      else if (g < 2 && assignLevelOp_0(b, l + 1)) {
        r = expr(b, l, 1);
        exit_section_(b, l, m, ASSIGN_LEVEL_OP, r, true, null);
      }
      else if (g < 3 && arrowOp_0(b, l + 1)) {
        r = expr(b, l, 2);
        exit_section_(b, l, m, ARROW_OP, r, true, null);
      }
      else if (g < 4 && ternaryOp_0(b, l + 1)) {
        r = expr(b, l, 12);
        exit_section_(b, l, m, TERNARY_OP, r, true, null);
      }
      else if (g < 6 && miscArrowsOp_0(b, l + 1)) {
        r = expr(b, l, 6);
        exit_section_(b, l, m, MISC_ARROWS_OP, r, true, null);
      }
      else if (g < 7 && orOp_0(b, l + 1)) {
        r = expr(b, l, 7);
        exit_section_(b, l, m, OR_OP, r, true, null);
      }
      else if (g < 8 && andOp_0(b, l + 1)) {
        r = expr(b, l, 8);
        exit_section_(b, l, m, AND_OP, r, true, null);
      }
      else if (g < 9 && comparisonLevelOp_0(b, l + 1)) {
        r = expr(b, l, 9);
        exit_section_(b, l, m, COMPARISON_LEVEL_OP, r, true, null);
      }
      else if (g < 10 && pipeLevelOp_0(b, l + 1)) {
        r = expr(b, l, 10);
        exit_section_(b, l, m, PIPE_LEVEL_OP, r, true, null);
      }
      else if (g < 11 && consumeTokenSmart(b, SLICE_SYM)) {
        r = true;
        exit_section_(b, l, m, SPLICE_OP, r, true, null);
      }
      else if (g < 11 && colonSymBegins(b, l + 1)) {
        r = report_error_(b, expr(b, l, 11));
        r = consumeToken(b, RIGHT_BRACKET) && r;
        exit_section_(b, l, m, COLON_OP, r, true, null);
      }
      else if (g < 12 && plusLevelOp_0(b, l + 1)) {
        r = expr(b, l, 12);
        exit_section_(b, l, m, PLUS_LEVEL_OP, r, true, null);
      }
      else if (g < 13 && bitwiseLevelOp_0(b, l + 1)) {
        r = expr(b, l, 13);
        exit_section_(b, l, m, BITWISE_LEVEL_OP, r, true, null);
      }
      else if (g < 13 && rangeOp_0(b, l + 1)) {
        r = expr(b, l, 13);
        exit_section_(b, l, m, RANGE_OP, r, true, null);
      }
      else if (g < 13 && consumeTokenSmart(b, TRANSPOSE_SYM)) {
        r = true;
        exit_section_(b, l, m, TRANSPOSE_OP, r, true, null);
      }
      else if (g < 14 && multiplyLevelOp_0(b, l + 1)) {
        r = expr(b, l, 14);
        exit_section_(b, l, m, MULTIPLY_LEVEL_OP, r, true, null);
      }
      else if (g < 15 && fractionOp_0(b, l + 1)) {
        r = expr(b, l, 15);
        exit_section_(b, l, m, FRACTION_OP, r, true, null);
      }
      else if (g < 15 && inOp_0(b, l + 1)) {
        r = expr(b, l, 15);
        exit_section_(b, l, m, IN_OP, r, true, null);
      }
      else if (g < 16 && miscExponentOp_0(b, l + 1)) {
        r = expr(b, l, 16);
        exit_section_(b, l, m, MISC_EXPONENT_OP, r, true, null);
      }
      else if (g < 16 && exponentOp_0(b, l + 1)) {
        r = expr(b, l, 16);
        exit_section_(b, l, m, EXPONENT_OP, r, true, null);
      }
      else if (g < 17 && typeOp_0(b, l + 1)) {
        r = expr(b, l, 17);
        exit_section_(b, l, m, TYPE_OP, r, true, null);
      }
      else if (g < 19 && applyFunctionOp_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, APPLY_FUNCTION_OP, r, true, null);
      }
      else if (g < 19 && applyIndexOp_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, APPLY_INDEX_OP, r, true, null);
      }
      else if (g < 19 && consumeTokenSmart(b, DOT_SYM)) {
        r = expr(b, l, 19);
        exit_section_(b, l, m, MEMBER_ACCESS_OP, r, true, null);
      }
      else if (g < 19 && whereClause(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, APPLY_WHERE_OP, r, true, null);
      }
      else if (g < 19 && typeParameters(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, TYPE, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // (typeParameters endOfLine)? functionSignature endOfLine (whereClause endOfLine)? EQ_SYM endOfLine
  private static boolean compactFunction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compactFunction_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = compactFunction_0_0(b, l + 1);
    r = r && functionSignature(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && compactFunction_0_3(b, l + 1);
    r = r && consumeToken(b, EQ_SYM);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (typeParameters endOfLine)?
  private static boolean compactFunction_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compactFunction_0_0")) return false;
    compactFunction_0_0_0(b, l + 1);
    return true;
  }

  // typeParameters endOfLine
  private static boolean compactFunction_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compactFunction_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeParameters(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (whereClause endOfLine)?
  private static boolean compactFunction_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compactFunction_0_3")) return false;
    compactFunction_0_3_0(b, l + 1);
    return true;
  }

  // whereClause endOfLine
  private static boolean compactFunction_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compactFunction_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whereClause(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // macroSymbol expr expr*
  public static boolean applyMacroOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyMacroOp")) return false;
    if (!nextTokenIsSmart(b, MACRO_SYM)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, APPLY_MACRO_OP, null);
    r = macroSymbol(b, l + 1);
    r = r && expr(b, l + 1, -1);
    r = r && applyMacroOp_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expr*
  private static boolean applyMacroOp_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyMacroOp_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expr(b, l + 1, -1)) break;
      if (!empty_element_parsed_guard_(b, "applyMacroOp_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (EQ_SYM | ASSIGN_SYM) endOfLine
  private static boolean assignOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignOp_0_0(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQ_SYM | ASSIGN_SYM
  private static boolean assignOp_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignOp_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, EQ_SYM);
    if (!r) r = consumeTokenSmart(b, ASSIGN_SYM);
    exit_section_(b, m, null, r);
    return r;
  }

  // assignLevelOperator endOfLine
  private static boolean assignLevelOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignLevelOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignLevelOperator(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ARROW_SYM endOfLine
  private static boolean arrowOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrowOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ARROW_SYM);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // QUESTION_SYM endOfLine
  private static boolean ternaryOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ternaryOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, QUESTION_SYM);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (symbol | tuple | LEFT_BRACKET RIGHT_BRACKET)
  //   LAMBDA_ABSTRACTION expr
  public static boolean lambda(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda")) return false;
    if (!nextTokenIsSmart(b, LEFT_BRACKET, SYM)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAMBDA, "<lambda>");
    r = lambda_0(b, l + 1);
    r = r && consumeToken(b, LAMBDA_ABSTRACTION);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // symbol | tuple | LEFT_BRACKET RIGHT_BRACKET
  private static boolean lambda_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbol(b, l + 1);
    if (!r) r = tuple(b, l + 1);
    if (!r) r = parseTokensSmart(b, 0, LEFT_BRACKET, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SPECIAL_ARROW_SYM | MISC_ARROW_SYM) endOfLine
  private static boolean miscArrowsOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "miscArrowsOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = miscArrowsOp_0_0(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SPECIAL_ARROW_SYM | MISC_ARROW_SYM
  private static boolean miscArrowsOp_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "miscArrowsOp_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, SPECIAL_ARROW_SYM);
    if (!r) r = consumeTokenSmart(b, MISC_ARROW_SYM);
    exit_section_(b, m, null, r);
    return r;
  }

  // OR_SYM endOfLine
  private static boolean orOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, OR_SYM);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AND_SYM endOfLine
  private static boolean andOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, AND_SYM);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comparisonLevelOperator endOfLine
  private static boolean comparisonLevelOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparisonLevelOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comparisonLevelOperator(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // pipeLevelOperator endOfLine
  private static boolean pipeLevelOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pipeLevelOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pipeLevelOperator(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLON_SYM endOfLine quotable
  public static boolean quoteOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "quoteOp")) return false;
    if (!nextTokenIsSmart(b, COLON_SYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COLON_SYM);
    r = r && endOfLine(b, l + 1);
    r = r && quotable(b, l + 1);
    exit_section_(b, m, QUOTE_OP, r);
    return r;
  }

  // QUOTE_KEYWORD endOfLine (expr endOfLine)* END_KEYWORD
  public static boolean compoundQuoteOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compoundQuoteOp")) return false;
    if (!nextTokenIsSmart(b, QUOTE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, QUOTE_KEYWORD);
    r = r && endOfLine(b, l + 1);
    r = r && compoundQuoteOp_2(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, COMPOUND_QUOTE_OP, r);
    return r;
  }

  // (expr endOfLine)*
  private static boolean compoundQuoteOp_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compoundQuoteOp_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!compoundQuoteOp_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "compoundQuoteOp_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // expr endOfLine
  private static boolean compoundQuoteOp_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compoundQuoteOp_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // plusLevelOperator endOfLine
  private static boolean plusLevelOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plusLevelOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = plusLevelOperator(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // bitwiseLevelOperator endOfLine
  private static boolean bitwiseLevelOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitwiseLevelOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = bitwiseLevelOperator(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLON_SYM endOfLine
  private static boolean rangeOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rangeOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COLON_SYM);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // multiplyLevelOperator endOfLine
  private static boolean multiplyLevelOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplyLevelOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiplyLevelOperator(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // specialLhs blockComment? IMPLICIT_MULTIPLY_SYM specialRhs
  public static boolean implicitMultiplyOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implicitMultiplyOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, IMPLICIT_MULTIPLY_OP, "<implicit multiply op>");
    r = specialLhs(b, l + 1);
    r = r && implicitMultiplyOp_1(b, l + 1);
    r = r && consumeToken(b, IMPLICIT_MULTIPLY_SYM);
    r = r && specialRhs(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // blockComment?
  private static boolean implicitMultiplyOp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implicitMultiplyOp_1")) return false;
    blockComment(b, l + 1);
    return true;
  }

  // FRACTION_SYM endOfLine
  private static boolean fractionOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fractionOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, FRACTION_SYM);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (IN_KEYWORD | IN_SYM) endOfLine
  private static boolean inOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inOp_0_0(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IN_KEYWORD | IN_SYM
  private static boolean inOp_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inOp_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IN_KEYWORD);
    if (!r) r = consumeTokenSmart(b, IN_SYM);
    exit_section_(b, m, null, r);
    return r;
  }

  // MISC_EXPONENT_SYM endOfLine
  private static boolean miscExponentOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "miscExponentOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, MISC_EXPONENT_SYM);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EXPONENT_SYM endOfLine
  private static boolean exponentOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exponentOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, EXPONENT_SYM);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOUBLE_COLON endOfLine
  private static boolean typeOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DOUBLE_COLON);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean unaryPlusOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryPlusOp")) return false;
    if (!nextTokenIsSmart(b, PLUS_SYM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = unaryPlusOp_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 18);
    exit_section_(b, l, m, UNARY_PLUS_OP, r, p, null);
    return r || p;
  }

  // PLUS_SYM endOfLine
  private static boolean unaryPlusOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryPlusOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, PLUS_SYM);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean unaryMinusOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryMinusOp")) return false;
    if (!nextTokenIsSmart(b, MINUS_SYM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = unaryMinusOp_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 18);
    exit_section_(b, l, m, UNARY_MINUS_OP, r, p, null);
    return r || p;
  }

  // MINUS_SYM endOfLine
  private static boolean unaryMinusOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryMinusOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, MINUS_SYM);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean unaryTypeOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryTypeOp")) return false;
    if (!nextTokenIsSmart(b, DOUBLE_COLON)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = unaryTypeOp_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 18);
    exit_section_(b, l, m, UNARY_TYPE_OP, r, p, null);
    return r || p;
  }

  // DOUBLE_COLON endOfLine
  private static boolean unaryTypeOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryTypeOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DOUBLE_COLON);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean unarySubtypeOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unarySubtypeOp")) return false;
    if (!nextTokenIsSmart(b, SUBTYPE_SYM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = unarySubtypeOp_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 18);
    exit_section_(b, l, m, UNARY_SUBTYPE_OP, r, p, null);
    return r || p;
  }

  // SUBTYPE_SYM endOfLine
  private static boolean unarySubtypeOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unarySubtypeOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, SUBTYPE_SYM);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean unaryInterpolateOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryInterpolateOp")) return false;
    if (!nextTokenIsSmart(b, INTERPOLATE_SYM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = unaryInterpolateOp_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 18);
    exit_section_(b, l, m, UNARY_INTERPOLATE_OP, r, p, null);
    return r || p;
  }

  // INTERPOLATE_SYM endOfLine
  private static boolean unaryInterpolateOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryInterpolateOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, INTERPOLATE_SYM);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean notOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "notOp")) return false;
    if (!nextTokenIsSmart(b, NOT_SYM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = notOp_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 18);
    exit_section_(b, l, m, NOT_OP, r, p, null);
    return r || p;
  }

  // NOT_SYM endOfLine
  private static boolean notOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "notOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, NOT_SYM);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean bitWiseNotOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitWiseNotOp")) return false;
    if (!nextTokenIsSmart(b, BITWISE_NOT_SYM)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = bitWiseNotOp_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 18);
    exit_section_(b, l, m, BIT_WISE_NOT_OP, r, p, null);
    return r || p;
  }

  // BITWISE_NOT_SYM endOfLine
  private static boolean bitWiseNotOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bitWiseNotOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, BITWISE_NOT_SYM);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOT_SYM? LEFT_BRACKET endOfLine (
  //      comprehensionElement+
  //    | (expressionList endOfLine)
  //   )? arguments? endOfLine RIGHT_BRACKET doBlock?
  private static boolean applyFunctionOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyFunctionOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = applyFunctionOp_0_0(b, l + 1);
    r = r && consumeToken(b, LEFT_BRACKET);
    r = r && endOfLine(b, l + 1);
    r = r && applyFunctionOp_0_3(b, l + 1);
    r = r && applyFunctionOp_0_4(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    r = r && applyFunctionOp_0_7(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DOT_SYM?
  private static boolean applyFunctionOp_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyFunctionOp_0_0")) return false;
    consumeTokenSmart(b, DOT_SYM);
    return true;
  }

  // (
  //      comprehensionElement+
  //    | (expressionList endOfLine)
  //   )?
  private static boolean applyFunctionOp_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyFunctionOp_0_3")) return false;
    applyFunctionOp_0_3_0(b, l + 1);
    return true;
  }

  // comprehensionElement+
  //    | (expressionList endOfLine)
  private static boolean applyFunctionOp_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyFunctionOp_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = applyFunctionOp_0_3_0_0(b, l + 1);
    if (!r) r = applyFunctionOp_0_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // comprehensionElement+
  private static boolean applyFunctionOp_0_3_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyFunctionOp_0_3_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comprehensionElement(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!comprehensionElement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "applyFunctionOp_0_3_0_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // expressionList endOfLine
  private static boolean applyFunctionOp_0_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyFunctionOp_0_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expressionList(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arguments?
  private static boolean applyFunctionOp_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyFunctionOp_0_4")) return false;
    arguments(b, l + 1);
    return true;
  }

  // doBlock?
  private static boolean applyFunctionOp_0_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyFunctionOp_0_7")) return false;
    doBlock(b, l + 1);
    return true;
  }

  // LEFT_M_BRACKET (
  //    comprehensionElement
  //  | exprOrEnd (COMMA_SYM exprOrEnd)*
  //  )? endOfLine RIGHT_M_BRACKET
  private static boolean applyIndexOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyIndexOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LEFT_M_BRACKET);
    r = r && applyIndexOp_0_1(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && consumeToken(b, RIGHT_M_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // (
  //    comprehensionElement
  //  | exprOrEnd (COMMA_SYM exprOrEnd)*
  //  )?
  private static boolean applyIndexOp_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyIndexOp_0_1")) return false;
    applyIndexOp_0_1_0(b, l + 1);
    return true;
  }

  // comprehensionElement
  //  | exprOrEnd (COMMA_SYM exprOrEnd)*
  private static boolean applyIndexOp_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyIndexOp_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comprehensionElement(b, l + 1);
    if (!r) r = applyIndexOp_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // exprOrEnd (COMMA_SYM exprOrEnd)*
  private static boolean applyIndexOp_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyIndexOp_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exprOrEnd(b, l + 1, -1);
    r = r && applyIndexOp_0_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA_SYM exprOrEnd)*
  private static boolean applyIndexOp_0_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyIndexOp_0_1_0_1_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!applyIndexOp_0_1_0_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "applyIndexOp_0_1_0_1_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA_SYM exprOrEnd
  private static boolean applyIndexOp_0_1_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "applyIndexOp_0_1_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA_SYM);
    r = r && exprOrEnd(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // singleQuoteString | tripleQuoteString
  public static boolean string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string")) return false;
    if (!nextTokenIsSmart(b, QUOTE_START, TRIPLE_QUOTE_START)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING, "<string>");
    r = singleQuoteString(b, l + 1);
    if (!r) r = tripleQuoteString(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CMD_QUOTE_START stringTemplateElement* CMD_QUOTE_END
  public static boolean command(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command")) return false;
    if (!nextTokenIsSmart(b, CMD_QUOTE_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, CMD_QUOTE_START);
    r = r && command_1(b, l + 1);
    r = r && consumeToken(b, CMD_QUOTE_END);
    exit_section_(b, m, COMMAND, r);
    return r;
  }

  // stringTemplateElement*
  private static boolean command_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!stringTemplateElement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "command_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // REGEX_START (stringContent | STRING_ESCAPE)* REGEX_END
  public static boolean regex(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex")) return false;
    if (!nextTokenIsSmart(b, REGEX_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, REGEX_START);
    r = r && regex_1(b, l + 1);
    r = r && consumeToken(b, REGEX_END);
    exit_section_(b, m, REGEX, r);
    return r;
  }

  // (stringContent | STRING_ESCAPE)*
  private static boolean regex_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!regex_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "regex_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // stringContent | STRING_ESCAPE
  private static boolean regex_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "regex_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stringContent(b, l + 1);
    if (!r) r = consumeTokenSmart(b, STRING_ESCAPE);
    exit_section_(b, m, null, r);
    return r;
  }

  // RAW_STR_START stringContent* RAW_STR_END
  public static boolean rawString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rawString")) return false;
    if (!nextTokenIsSmart(b, RAW_STR_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, RAW_STR_START);
    r = r && rawString_1(b, l + 1);
    r = r && consumeToken(b, RAW_STR_END);
    exit_section_(b, m, RAW_STRING, r);
    return r;
  }

  // stringContent*
  private static boolean rawString_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rawString_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!stringContent(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rawString_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // VERSION_START stringContent* VERSION_END
  public static boolean versionNumber(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "versionNumber")) return false;
    if (!nextTokenIsSmart(b, VERSION_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, VERSION_START);
    r = r && versionNumber_1(b, l + 1);
    r = r && consumeToken(b, VERSION_END);
    exit_section_(b, m, VERSION_NUMBER, r);
    return r;
  }

  // stringContent*
  private static boolean versionNumber_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "versionNumber_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!stringContent(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "versionNumber_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // BYTE_ARRAY_START
  //   (stringContent | STRING_UNICODE | STRING_ESCAPE)*
  //  BYTE_ARRAY_END
  public static boolean byteArray(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "byteArray")) return false;
    if (!nextTokenIsSmart(b, BYTE_ARRAY_START)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, BYTE_ARRAY_START);
    r = r && byteArray_1(b, l + 1);
    r = r && consumeToken(b, BYTE_ARRAY_END);
    exit_section_(b, m, BYTE_ARRAY, r);
    return r;
  }

  // (stringContent | STRING_UNICODE | STRING_ESCAPE)*
  private static boolean byteArray_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "byteArray_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!byteArray_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "byteArray_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // stringContent | STRING_UNICODE | STRING_ESCAPE
  private static boolean byteArray_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "byteArray_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stringContent(b, l + 1);
    if (!r) r = consumeTokenSmart(b, STRING_UNICODE);
    if (!r) r = consumeTokenSmart(b, STRING_ESCAPE);
    exit_section_(b, m, null, r);
    return r;
  }

  // CHAR_LITERAL
  public static boolean charLit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "charLit")) return false;
    if (!nextTokenIsSmart(b, CHAR_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, CHAR_LITERAL);
    exit_section_(b, m, CHAR_LIT, r);
    return r;
  }

  // INT_LITERAL
  public static boolean integer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integer")) return false;
    if (!nextTokenIsSmart(b, INT_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, INT_LITERAL);
    exit_section_(b, m, INTEGER, r);
    return r;
  }

  // FLOAT_LITERAL | FLOAT_CONSTANT
  public static boolean floatLit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floatLit")) return false;
    if (!nextTokenIsSmart(b, FLOAT_CONSTANT, FLOAT_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FLOAT_LIT, "<float lit>");
    r = consumeTokenSmart(b, FLOAT_LITERAL);
    if (!r) r = consumeTokenSmart(b, FLOAT_CONSTANT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TRUE_KEYWORD | FALSE_KEYWORD
  public static boolean booleanLit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "booleanLit")) return false;
    if (!nextTokenIsSmart(b, FALSE_KEYWORD, TRUE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_LIT, "<boolean lit>");
    r = consumeTokenSmart(b, TRUE_KEYWORD);
    if (!r) r = consumeTokenSmart(b, FALSE_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  public static boolean ifExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpr")) return false;
    if (!nextTokenIsSmart(b, IF_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, IF_KEYWORD);
    p = r;
    r = p && expr(b, l, -1);
    r = p && report_error_(b, ifExpr_1(b, l + 1)) && r;
    exit_section_(b, l, m, IF_EXPR, r, p, null);
    return r || p;
  }

  // endOfLine statements elseIfClause* elseClause? END_KEYWORD
  private static boolean ifExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = endOfLine(b, l + 1);
    r = r && statements(b, l + 1);
    r = r && ifExpr_1_2(b, l + 1);
    r = r && ifExpr_1_3(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  // elseIfClause*
  private static boolean ifExpr_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpr_1_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!elseIfClause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ifExpr_1_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // elseClause?
  private static boolean ifExpr_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpr_1_3")) return false;
    elseClause(b, l + 1);
    return true;
  }

  // FOR_KEYWORD endOfLine indexer (commaSep indexer)* statements END_KEYWORD
  public static boolean forExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forExpr")) return false;
    if (!nextTokenIsSmart(b, FOR_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, FOR_KEYWORD);
    r = r && endOfLine(b, l + 1);
    r = r && indexer(b, l + 1);
    r = r && forExpr_3(b, l + 1);
    r = r && statements(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, FOR_EXPR, r);
    return r;
  }

  // (commaSep indexer)*
  private static boolean forExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forExpr_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!forExpr_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "forExpr_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // commaSep indexer
  private static boolean forExpr_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forExpr_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = commaSep(b, l + 1);
    r = r && indexer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_M_BRACKET endOfLine
  //   comprehensionElement+ endOfLine
  //  RIGHT_M_BRACKET
  public static boolean forComprehension(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forComprehension")) return false;
    if (!nextTokenIsSmart(b, LEFT_M_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LEFT_M_BRACKET);
    r = r && endOfLine(b, l + 1);
    r = r && forComprehension_2(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && consumeToken(b, RIGHT_M_BRACKET);
    exit_section_(b, m, FOR_COMPREHENSION, r);
    return r;
  }

  // comprehensionElement+
  private static boolean forComprehension_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forComprehension_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comprehensionElement(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!comprehensionElement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "forComprehension_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean whileExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileExpr")) return false;
    if (!nextTokenIsSmart(b, WHILE_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = whileExpr_0(b, l + 1);
    p = r;
    r = p && expr(b, l, -1);
    r = p && report_error_(b, whileExpr_1(b, l + 1)) && r;
    exit_section_(b, l, m, WHILE_EXPR, r, p, null);
    return r || p;
  }

  // WHILE_KEYWORD endOfLine
  private static boolean whileExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, WHILE_KEYWORD);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // endOfLine statements END_KEYWORD
  private static boolean whileExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileExpr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = endOfLine(b, l + 1);
    r = r && statements(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function")) return false;
    if (!nextTokenIsSmart(b, FUNCTION_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = function_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 19);
    r = p && report_error_(b, function_1(b, l + 1)) && r;
    exit_section_(b, l, m, FUNCTION, r, p, null);
    return r || p;
  }

  // FUNCTION_KEYWORD endOfLine (SYM DOT_SYM)?
  private static boolean function_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, FUNCTION_KEYWORD);
    r = r && endOfLine(b, l + 1);
    r = r && function_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SYM DOT_SYM)?
  private static boolean function_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_0_2")) return false;
    function_0_2_0(b, l + 1);
    return true;
  }

  // SYM DOT_SYM
  private static boolean function_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, SYM, DOT_SYM);
    exit_section_(b, m, null, r);
    return r;
  }

  // (typeParameters endOfLine)? (functionSignature endOfLine)? (whereClause endOfLine)? statements END_KEYWORD
  private static boolean function_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = function_1_0(b, l + 1);
    r = r && function_1_1(b, l + 1);
    r = r && function_1_2(b, l + 1);
    r = r && statements(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  // (typeParameters endOfLine)?
  private static boolean function_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_0")) return false;
    function_1_0_0(b, l + 1);
    return true;
  }

  // typeParameters endOfLine
  private static boolean function_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeParameters(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (functionSignature endOfLine)?
  private static boolean function_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_1")) return false;
    function_1_1_0(b, l + 1);
    return true;
  }

  // functionSignature endOfLine
  private static boolean function_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionSignature(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (whereClause endOfLine)?
  private static boolean function_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_2")) return false;
    function_1_2_0(b, l + 1);
    return true;
  }

  // whereClause endOfLine
  private static boolean function_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = whereClause(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RETURN_KEYWORD (expr (COMMA_SYM expr)*)?
  public static boolean returnExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnExpr")) return false;
    if (!nextTokenIsSmart(b, RETURN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, RETURN_KEYWORD);
    r = r && returnExpr_1(b, l + 1);
    exit_section_(b, m, RETURN_EXPR, r);
    return r;
  }

  // (expr (COMMA_SYM expr)*)?
  private static boolean returnExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnExpr_1")) return false;
    returnExpr_1_0(b, l + 1);
    return true;
  }

  // expr (COMMA_SYM expr)*
  private static boolean returnExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && returnExpr_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA_SYM expr)*
  private static boolean returnExpr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnExpr_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!returnExpr_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "returnExpr_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA_SYM expr
  private static boolean returnExpr_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnExpr_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA_SYM);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BREAK_KEYWORD
  public static boolean breakExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "breakExpr")) return false;
    if (!nextTokenIsSmart(b, BREAK_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, BREAK_KEYWORD);
    exit_section_(b, m, BREAK_EXPR, r);
    return r;
  }

  // TRY_KEYWORD endOfLine
  //   statements
  //  catchClause?
  //  finallyClause?
  //  END_KEYWORD
  public static boolean tryCatch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryCatch")) return false;
    if (!nextTokenIsSmart(b, TRY_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, TRY_KEYWORD);
    r = r && endOfLine(b, l + 1);
    r = r && statements(b, l + 1);
    r = r && tryCatch_3(b, l + 1);
    r = r && tryCatch_4(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, TRY_CATCH, r);
    return r;
  }

  // catchClause?
  private static boolean tryCatch_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryCatch_3")) return false;
    catchClause(b, l + 1);
    return true;
  }

  // finallyClause?
  private static boolean tryCatch_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryCatch_4")) return false;
    finallyClause(b, l + 1);
    return true;
  }

  // CONTINUE_KEYWORD
  public static boolean continueExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continueExpr")) return false;
    if (!nextTokenIsSmart(b, CONTINUE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, CONTINUE_KEYWORD);
    exit_section_(b, m, CONTINUE_EXPR, r);
    return r;
  }

  // LEFT_M_BRACKET endOfLine
  //   (
  //    (expr (commaSep? expr)*)
  //    (SEMICOLON_SYM endOfLine
  //     (expr (commaSep? expr)* COMMA_SYM?)?)*
  //   )?
  //   endOfLine
  //  RIGHT_M_BRACKET
  public static boolean array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array")) return false;
    if (!nextTokenIsSmart(b, LEFT_M_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LEFT_M_BRACKET);
    r = r && endOfLine(b, l + 1);
    r = r && array_2(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && consumeToken(b, RIGHT_M_BRACKET);
    exit_section_(b, m, ARRAY, r);
    return r;
  }

  // (
  //    (expr (commaSep? expr)*)
  //    (SEMICOLON_SYM endOfLine
  //     (expr (commaSep? expr)* COMMA_SYM?)?)*
  //   )?
  private static boolean array_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_2")) return false;
    array_2_0(b, l + 1);
    return true;
  }

  // (expr (commaSep? expr)*)
  //    (SEMICOLON_SYM endOfLine
  //     (expr (commaSep? expr)* COMMA_SYM?)?)*
  private static boolean array_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_2_0_0(b, l + 1);
    r = r && array_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expr (commaSep? expr)*
  private static boolean array_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && array_2_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (commaSep? expr)*
  private static boolean array_2_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_2_0_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!array_2_0_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_2_0_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // commaSep? expr
  private static boolean array_2_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_2_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_2_0_0_1_0_0(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // commaSep?
  private static boolean array_2_0_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_2_0_0_1_0_0")) return false;
    commaSep(b, l + 1);
    return true;
  }

  // (SEMICOLON_SYM endOfLine
  //     (expr (commaSep? expr)* COMMA_SYM?)?)*
  private static boolean array_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!array_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // SEMICOLON_SYM endOfLine
  //     (expr (commaSep? expr)* COMMA_SYM?)?
  private static boolean array_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, SEMICOLON_SYM);
    r = r && endOfLine(b, l + 1);
    r = r && array_2_0_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (expr (commaSep? expr)* COMMA_SYM?)?
  private static boolean array_2_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_2_0_1_0_2")) return false;
    array_2_0_1_0_2_0(b, l + 1);
    return true;
  }

  // expr (commaSep? expr)* COMMA_SYM?
  private static boolean array_2_0_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_2_0_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1, -1);
    r = r && array_2_0_1_0_2_0_1(b, l + 1);
    r = r && array_2_0_1_0_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (commaSep? expr)*
  private static boolean array_2_0_1_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_2_0_1_0_2_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!array_2_0_1_0_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_2_0_1_0_2_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // commaSep? expr
  private static boolean array_2_0_1_0_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_2_0_1_0_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_2_0_1_0_2_0_1_0_0(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // commaSep?
  private static boolean array_2_0_1_0_2_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_2_0_1_0_2_0_1_0_0")) return false;
    commaSep(b, l + 1);
    return true;
  }

  // COMMA_SYM?
  private static boolean array_2_0_1_0_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_2_0_1_0_2_0_2")) return false;
    consumeTokenSmart(b, COMMA_SYM);
    return true;
  }

  public static boolean union(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "union")) return false;
    if (!nextTokenIsSmart(b, UNION_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, UNION_KEYWORD);
    p = r;
    r = p && expr(b, l, 19);
    exit_section_(b, l, m, UNION, r, p, null);
    return r || p;
  }

  // LEFT_BRACKET endOfLine
  //   expr (commaSep expr)* endOfLine COMMA_SYM? endOfLine
  //  RIGHT_BRACKET
  public static boolean tuple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple")) return false;
    if (!nextTokenIsSmart(b, LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LEFT_BRACKET);
    r = r && endOfLine(b, l + 1);
    r = r && expr(b, l + 1, -1);
    r = r && tuple_3(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && tuple_5(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, TUPLE, r);
    return r;
  }

  // (commaSep expr)*
  private static boolean tuple_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!tuple_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tuple_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // commaSep expr
  private static boolean tuple_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = commaSep(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA_SYM?
  private static boolean tuple_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tuple_5")) return false;
    consumeTokenSmart(b, COMMA_SYM);
    return true;
  }

  public static boolean macro(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro")) return false;
    if (!nextTokenIsSmart(b, MACRO_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = macro_0(b, l + 1);
    p = r;
    r = p && expr(b, l, 19);
    r = p && report_error_(b, macro_1(b, l + 1)) && r;
    exit_section_(b, l, m, MACRO, r, p, null);
    return r || p;
  }

  // MACRO_KEYWORD endOfLine
  private static boolean macro_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, MACRO_KEYWORD);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // endOfLine untypedVariables endOfLine statements END_KEYWORD
  private static boolean macro_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macro_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = endOfLine(b, l + 1);
    r = r && untypedVariables(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && statements(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  // LET_KEYWORD statements END_KEYWORD
  public static boolean let(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let")) return false;
    if (!nextTokenIsSmart(b, LET_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LET_KEYWORD);
    r = r && statements(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, LET, r);
    return r;
  }

  // BEGIN_KEYWORD statements END_KEYWORD
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    if (!nextTokenIsSmart(b, BEGIN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, BEGIN_KEYWORD);
    r = r && statements(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, BLOCK, r);
    return r;
  }

  // COLON_BEGIN_SYM statements RIGHT_BRACKET
  public static boolean colonBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "colonBlock")) return false;
    if (!nextTokenIsSmart(b, COLON_BEGIN_SYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COLON_BEGIN_SYM);
    r = r && statements(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, COLON_BLOCK, r);
    return r;
  }

  // EXPORT_KEYWORD endOfLine
  //   memberAccess
  //   (commaSep memberAccess)*
  public static boolean export(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export")) return false;
    if (!nextTokenIsSmart(b, EXPORT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, EXPORT_KEYWORD);
    r = r && endOfLine(b, l + 1);
    r = r && memberAccess(b, l + 1);
    r = r && export_3(b, l + 1);
    exit_section_(b, m, EXPORT, r);
    return r;
  }

  // (commaSep memberAccess)*
  private static boolean export_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!export_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "export_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // commaSep memberAccess
  private static boolean export_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "export_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = commaSep(b, l + 1);
    r = r && memberAccess(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IMPORT_KEYWORD endOfLine imported
  public static boolean importExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importExpr")) return false;
    if (!nextTokenIsSmart(b, IMPORT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IMPORT_KEYWORD);
    r = r && endOfLine(b, l + 1);
    r = r && imported(b, l + 1);
    exit_section_(b, m, IMPORT_EXPR, r);
    return r;
  }

  // IMPORTALL_KEYWORD access
  public static boolean importAllExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importAllExpr")) return false;
    if (!nextTokenIsSmart(b, IMPORTALL_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IMPORTALL_KEYWORD);
    r = r && access(b, l + 1);
    exit_section_(b, m, IMPORT_ALL_EXPR, r);
    return r;
  }

  // USING_KEYWORD endOfLine imported
  public static boolean using(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using")) return false;
    if (!nextTokenIsSmart(b, USING_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, USING_KEYWORD);
    r = r && endOfLine(b, l + 1);
    r = r && imported(b, l + 1);
    exit_section_(b, m, USING, r);
    return r;
  }

  // ABSTRACT_KEYWORD TYPE_KEYWORD endOfLine
  //   symbol (SUBTYPE_SYM endOfLine expr)? endOfLine
  //  END_KEYWORD
  public static boolean abstractTypeDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstractTypeDeclaration")) return false;
    if (!nextTokenIsSmart(b, ABSTRACT_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, ABSTRACT_KEYWORD, TYPE_KEYWORD);
    r = r && endOfLine(b, l + 1);
    r = r && symbol(b, l + 1);
    r = r && abstractTypeDeclaration_4(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, ABSTRACT_TYPE_DECLARATION, r);
    return r;
  }

  // (SUBTYPE_SYM endOfLine expr)?
  private static boolean abstractTypeDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstractTypeDeclaration_4")) return false;
    abstractTypeDeclaration_4_0(b, l + 1);
    return true;
  }

  // SUBTYPE_SYM endOfLine expr
  private static boolean abstractTypeDeclaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstractTypeDeclaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, SUBTYPE_SYM);
    r = r && endOfLine(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PRIMITIVE_KEYWORD TYPE_KEYWORD endOfLine
  //   symbol (SUBTYPE_SYM endOfLine expr)? expr endOfLine
  //  END_KEYWORD
  public static boolean primitiveTypeDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primitiveTypeDeclaration")) return false;
    if (!nextTokenIsSmart(b, PRIMITIVE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, PRIMITIVE_KEYWORD, TYPE_KEYWORD);
    r = r && endOfLine(b, l + 1);
    r = r && symbol(b, l + 1);
    r = r && primitiveTypeDeclaration_4(b, l + 1);
    r = r && expr(b, l + 1, -1);
    r = r && endOfLine(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, m, PRIMITIVE_TYPE_DECLARATION, r);
    return r;
  }

  // (SUBTYPE_SYM endOfLine expr)?
  private static boolean primitiveTypeDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primitiveTypeDeclaration_4")) return false;
    primitiveTypeDeclaration_4_0(b, l + 1);
    return true;
  }

  // SUBTYPE_SYM endOfLine expr
  private static boolean primitiveTypeDeclaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primitiveTypeDeclaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, SUBTYPE_SYM);
    r = r && endOfLine(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (typeModifiers? (TYPE_KEYWORD | STRUCT_KEYWORD) | typeModifiers) endOfLine
  //   symbol typeParameters? (SUBTYPE_SYM endOfLine expr)? endOfLine
  //   statements
  //  END_KEYWORD
  public static boolean typeDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DECLARATION, "<type declaration>");
    r = typeDeclaration_0(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && symbol(b, l + 1);
    r = r && typeDeclaration_3(b, l + 1);
    r = r && typeDeclaration_4(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && statements(b, l + 1);
    r = r && consumeToken(b, END_KEYWORD);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // typeModifiers? (TYPE_KEYWORD | STRUCT_KEYWORD) | typeModifiers
  private static boolean typeDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeDeclaration_0_0(b, l + 1);
    if (!r) r = typeModifiers(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeModifiers? (TYPE_KEYWORD | STRUCT_KEYWORD)
  private static boolean typeDeclaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeDeclaration_0_0_0(b, l + 1);
    r = r && typeDeclaration_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeModifiers?
  private static boolean typeDeclaration_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration_0_0_0")) return false;
    typeModifiers(b, l + 1);
    return true;
  }

  // TYPE_KEYWORD | STRUCT_KEYWORD
  private static boolean typeDeclaration_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, TYPE_KEYWORD);
    if (!r) r = consumeTokenSmart(b, STRUCT_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeParameters?
  private static boolean typeDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration_3")) return false;
    typeParameters(b, l + 1);
    return true;
  }

  // (SUBTYPE_SYM endOfLine expr)?
  private static boolean typeDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration_4")) return false;
    typeDeclaration_4_0(b, l + 1);
    return true;
  }

  // SUBTYPE_SYM endOfLine expr
  private static boolean typeDeclaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeDeclaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, SUBTYPE_SYM);
    r = r && endOfLine(b, l + 1);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean typeAlias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeAlias")) return false;
    if (!nextTokenIsSmart(b, TYPEALIAS_KEYWORD)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, TYPEALIAS_KEYWORD);
    p = r;
    r = p && expr(b, l, 19);
    r = p && report_error_(b, typeAlias_1(b, l + 1)) && r;
    exit_section_(b, l, m, TYPE_ALIAS, r, p, null);
    return r || p;
  }

  // typeParameters? userType
  private static boolean typeAlias_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeAlias_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeAlias_1_0(b, l + 1);
    r = r && userType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeParameters?
  private static boolean typeAlias_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeAlias_1_0")) return false;
    typeParameters(b, l + 1);
    return true;
  }

  // ((LOCAL_KEYWORD | CONST_KEYWORD) endOfLine)
  //  symbolLhsInternal (commaSep symbolLhsInternal)*
  public static boolean symbolLhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbolLhs")) return false;
    if (!nextTokenIsSmart(b, CONST_KEYWORD, LOCAL_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, SYMBOL_LHS, "<symbol lhs>");
    r = symbolLhs_0(b, l + 1);
    r = r && symbolLhsInternal(b, l + 1);
    r = r && symbolLhs_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (LOCAL_KEYWORD | CONST_KEYWORD) endOfLine
  private static boolean symbolLhs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbolLhs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = symbolLhs_0_0(b, l + 1);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LOCAL_KEYWORD | CONST_KEYWORD
  private static boolean symbolLhs_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbolLhs_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LOCAL_KEYWORD);
    if (!r) r = consumeTokenSmart(b, CONST_KEYWORD);
    exit_section_(b, m, null, r);
    return r;
  }

  // (commaSep symbolLhsInternal)*
  private static boolean symbolLhs_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbolLhs_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!symbolLhs_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "symbolLhs_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // commaSep symbolLhsInternal
  private static boolean symbolLhs_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbolLhs_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = commaSep(b, l + 1);
    r = r && symbolLhsInternal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SYM
  public static boolean symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol")) return false;
    if (!nextTokenIsSmart(b, SYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, SYM);
    exit_section_(b, m, SYMBOL, r);
    return r;
  }

  // IN_KEYWORD
  public static boolean inAsOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inAsOp")) return false;
    if (!nextTokenIsSmart(b, IN_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, IN_KEYWORD);
    exit_section_(b, m, IN_AS_OP, r);
    return r;
  }

  // MACRO_SYM
  public static boolean macroSymbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "macroSymbol")) return false;
    if (!nextTokenIsSmart(b, MACRO_SYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, MACRO_SYM);
    exit_section_(b, m, MACRO_SYMBOL, r);
    return r;
  }

  // LEFT_BRACKET endOfLine
  //   (opAsSymbol | unaryOpAsSymbol)?
  //    statements? endOfLine (COMMA_SYM endOfLine)? (FOR_KEYWORD expr IN_KEYWORD expr)*
  //  RIGHT_BRACKET
  public static boolean bracketedExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracketedExpr")) return false;
    if (!nextTokenIsSmart(b, LEFT_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LEFT_BRACKET);
    r = r && endOfLine(b, l + 1);
    r = r && bracketedExpr_2(b, l + 1);
    r = r && bracketedExpr_3(b, l + 1);
    r = r && endOfLine(b, l + 1);
    r = r && bracketedExpr_5(b, l + 1);
    r = r && bracketedExpr_6(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, BRACKETED_EXPR, r);
    return r;
  }

  // (opAsSymbol | unaryOpAsSymbol)?
  private static boolean bracketedExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracketedExpr_2")) return false;
    bracketedExpr_2_0(b, l + 1);
    return true;
  }

  // opAsSymbol | unaryOpAsSymbol
  private static boolean bracketedExpr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracketedExpr_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = opAsSymbol(b, l + 1);
    if (!r) r = unaryOpAsSymbol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // statements?
  private static boolean bracketedExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracketedExpr_3")) return false;
    statements(b, l + 1);
    return true;
  }

  // (COMMA_SYM endOfLine)?
  private static boolean bracketedExpr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracketedExpr_5")) return false;
    bracketedExpr_5_0(b, l + 1);
    return true;
  }

  // COMMA_SYM endOfLine
  private static boolean bracketedExpr_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracketedExpr_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, COMMA_SYM);
    r = r && endOfLine(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (FOR_KEYWORD expr IN_KEYWORD expr)*
  private static boolean bracketedExpr_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracketedExpr_6")) return false;
    int c = current_position_(b);
    while (true) {
      if (!bracketedExpr_6_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "bracketedExpr_6", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // FOR_KEYWORD expr IN_KEYWORD expr
  private static boolean bracketedExpr_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bracketedExpr_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, FOR_KEYWORD);
    r = r && expr(b, l + 1, -1);
    r = r && consumeToken(b, IN_KEYWORD);
    r = r && expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: exprOrEnd
  // Operator priority table:
  // 0: BINARY(plusIndexing)
  // 1: BINARY(multiplyIndexing)
  // 2: BINARY(rangeIndexing)
  // 3: ATOM(end)
  // 4: ATOM(exprWrapper)
  public static boolean exprOrEnd(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "exprOrEnd")) return false;
    addVariant(b, "<expr or end>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr or end>");
    r = end(b, l + 1);
    if (!r) r = exprWrapper(b, l + 1);
    p = r;
    r = r && exprOrEnd_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean exprOrEnd_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "exprOrEnd_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && plusLevelOperator(b, l + 1)) {
        r = exprOrEnd(b, l, 0);
        exit_section_(b, l, m, PLUS_INDEXING, r, true, null);
      }
      else if (g < 1 && multiplyLevelOperator(b, l + 1)) {
        r = exprOrEnd(b, l, 1);
        exit_section_(b, l, m, MULTIPLY_INDEXING, r, true, null);
      }
      else if (g < 2 && consumeTokenSmart(b, COLON_SYM)) {
        r = exprOrEnd(b, l, 2);
        exit_section_(b, l, m, RANGE_INDEXING, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // END_KEYWORD
  public static boolean end(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "end")) return false;
    if (!nextTokenIsSmart(b, END_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, END_KEYWORD);
    exit_section_(b, m, END, r);
    return r;
  }

  // primaryExpr
  public static boolean exprWrapper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exprWrapper")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_WRAPPER, "<expr wrapper>");
    r = expr(b, l + 1, 19);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
