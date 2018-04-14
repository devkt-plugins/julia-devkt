// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi.impl;

import java.util.List;

import org.ice1000.julia.devkt.lang.psi.JuliaExprOrEnd;
import org.ice1000.julia.devkt.lang.psi.JuliaRangeIndexing;
import org.ice1000.julia.devkt.lang.psi.JuliaVisitor;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import org.ice1000.julia.devkt.lang.psi.*;

public class JuliaRangeIndexingImpl extends JuliaExprOrEndImpl implements JuliaRangeIndexing {

  public JuliaRangeIndexingImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JuliaVisitor visitor) {
    visitor.visitRangeIndexing(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JuliaVisitor) accept((JuliaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JuliaExprOrEnd> getExprOrEndList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JuliaExprOrEnd.class);
  }

}
