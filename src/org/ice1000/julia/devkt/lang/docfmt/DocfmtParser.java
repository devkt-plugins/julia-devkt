// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.docfmt;

import org.jetbrains.kotlin.com.intellij.lang.PsiBuilder;
import org.jetbrains.kotlin.com.intellij.lang.PsiBuilder.Marker;

import static org.jetbrains.kotlin.com.intellij.lang.parser.GeneratedParserUtilBase.*;
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.tree.TokenSet;
import org.jetbrains.kotlin.com.intellij.lang.PsiParser;
import org.jetbrains.kotlin.com.intellij.lang.LightPsiParser;
import org.ice1000.julia.devkt.lang.docfmt.psi.DocfmtTypes;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DocfmtParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == DocfmtTypes.CONFIG) {
      result_ = config(builder_, 0);
    }
    else if (root_ == DocfmtTypes.VALUE) {
      result_ = value(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return configFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // SYM EQ_SYM value
  public static boolean config(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "config")) return false;
    if (!nextTokenIs(builder_, DocfmtTypes.SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, DocfmtTypes.SYM, DocfmtTypes.EQ_SYM);
    result_ = result_ && value(builder_, level_ + 1);
    exit_section_(builder_, marker_, DocfmtTypes.CONFIG, result_);
    return result_;
  }

  /* ********************************************************** */
  // EOL* ((config | LINE_COMMENT) (EOL+ (config | LINE_COMMENT))*)? EOL*
  static boolean configFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "configFile")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = configFile_0(builder_, level_ + 1);
    result_ = result_ && configFile_1(builder_, level_ + 1);
    result_ = result_ && configFile_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // EOL*
  private static boolean configFile_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "configFile_0")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!consumeToken(builder_, DocfmtTypes.EOL)) break;
      if (!empty_element_parsed_guard_(builder_, "configFile_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ((config | LINE_COMMENT) (EOL+ (config | LINE_COMMENT))*)?
  private static boolean configFile_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "configFile_1")) return false;
    configFile_1_0(builder_, level_ + 1);
    return true;
  }

  // (config | LINE_COMMENT) (EOL+ (config | LINE_COMMENT))*
  private static boolean configFile_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "configFile_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = configFile_1_0_0(builder_, level_ + 1);
    result_ = result_ && configFile_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // config | LINE_COMMENT
  private static boolean configFile_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "configFile_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = config(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, DocfmtTypes.LINE_COMMENT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (EOL+ (config | LINE_COMMENT))*
  private static boolean configFile_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "configFile_1_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!configFile_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "configFile_1_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // EOL+ (config | LINE_COMMENT)
  private static boolean configFile_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "configFile_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = configFile_1_0_1_0_0(builder_, level_ + 1);
    result_ = result_ && configFile_1_0_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // EOL+
  private static boolean configFile_1_0_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "configFile_1_0_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DocfmtTypes.EOL);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!consumeToken(builder_, DocfmtTypes.EOL)) break;
      if (!empty_element_parsed_guard_(builder_, "configFile_1_0_1_0_0", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // config | LINE_COMMENT
  private static boolean configFile_1_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "configFile_1_0_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = config(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, DocfmtTypes.LINE_COMMENT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // EOL*
  private static boolean configFile_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "configFile_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!consumeToken(builder_, DocfmtTypes.EOL)) break;
      if (!empty_element_parsed_guard_(builder_, "configFile_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // SYM | INT
  public static boolean value(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "value")) return false;
    if (!nextTokenIs(builder_, "<value>", DocfmtTypes.INT, DocfmtTypes.SYM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DocfmtTypes.VALUE, "<value>");
    result_ = consumeToken(builder_, DocfmtTypes.SYM);
    if (!result_) result_ = consumeToken(builder_, DocfmtTypes.INT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

}
