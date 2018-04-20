// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.docfmt;

import org.jetbrains.kotlin.com.intellij.lang.PsiBuilder;
import org.jetbrains.kotlin.com.intellij.lang.PsiBuilder.Marker;
import static org.ice1000.julia.devkt.lang.docfmt.psi.DocfmtTypes.*;
import static org.jetbrains.kotlin.com.intellij.lang.parser.GeneratedParserUtilBase.*;

import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.lang.PsiParser;
import org.jetbrains.kotlin.com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DocfmtParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == CONFIG) {
      r = config(b, 0);
    }
    else if (t == VALUE) {
      r = value(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return configFile(b, l + 1);
  }

  /* ********************************************************** */
  // SYM EQ_SYM value
  public static boolean config(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "config")) return false;
    if (!nextTokenIs(b, SYM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYM, EQ_SYM);
    r = r && value(b, l + 1);
    exit_section_(b, m, CONFIG, r);
    return r;
  }

  /* ********************************************************** */
  // EOL* ((config | LINE_COMMENT) (EOL+ (config | LINE_COMMENT))*)? EOL*
  static boolean configFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = configFile_0(b, l + 1);
    r = r && configFile_1(b, l + 1);
    r = r && configFile_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean configFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configFile_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "configFile_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ((config | LINE_COMMENT) (EOL+ (config | LINE_COMMENT))*)?
  private static boolean configFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configFile_1")) return false;
    configFile_1_0(b, l + 1);
    return true;
  }

  // (config | LINE_COMMENT) (EOL+ (config | LINE_COMMENT))*
  private static boolean configFile_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configFile_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = configFile_1_0_0(b, l + 1);
    r = r && configFile_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // config | LINE_COMMENT
  private static boolean configFile_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configFile_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = config(b, l + 1);
    if (!r) r = consumeToken(b, LINE_COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (EOL+ (config | LINE_COMMENT))*
  private static boolean configFile_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configFile_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!configFile_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "configFile_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EOL+ (config | LINE_COMMENT)
  private static boolean configFile_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configFile_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = configFile_1_0_1_0_0(b, l + 1);
    r = r && configFile_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL+
  private static boolean configFile_1_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configFile_1_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EOL);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "configFile_1_0_1_0_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // config | LINE_COMMENT
  private static boolean configFile_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configFile_1_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = config(b, l + 1);
    if (!r) r = consumeToken(b, LINE_COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // EOL*
  private static boolean configFile_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "configFile_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, EOL)) break;
      if (!empty_element_parsed_guard_(b, "configFile_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // SYM | INT
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    if (!nextTokenIs(b, "<value>", INT, SYM)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = consumeToken(b, SYM);
    if (!r) r = consumeToken(b, INT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
