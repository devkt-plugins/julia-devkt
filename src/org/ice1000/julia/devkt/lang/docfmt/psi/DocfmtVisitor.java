// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.docfmt.psi;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.ice1000.julia.devkt.lang.docfmt.IDocfmtConfig;

public class DocfmtVisitor extends PsiElementVisitor {

  public void visitConfig(@NotNull DocfmtConfig o) {
    visitIDocfmtConfig(o);
  }

  public void visitValue(@NotNull DocfmtValue o) {
    visitPsiElement(o);
  }

  public void visitIDocfmtConfig(@NotNull IDocfmtConfig o) {
    visitElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
