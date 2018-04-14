// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi.impl;

import java.util.List;

import org.ice1000.julia.devkt.lang.psi.JuliaColonOp;
import org.ice1000.julia.devkt.lang.psi.JuliaColonSymBegins;
import org.ice1000.julia.devkt.lang.psi.JuliaExpr;
import org.ice1000.julia.devkt.lang.psi.JuliaVisitor;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import org.ice1000.julia.devkt.lang.psi.*;

public class JuliaColonOpImpl extends JuliaExprImpl implements JuliaColonOp {

  public JuliaColonOpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JuliaVisitor visitor) {
    visitor.visitColonOp(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JuliaVisitor) accept((JuliaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JuliaColonSymBegins getColonSymBegins() {
    return findNotNullChildByClass(JuliaColonSymBegins.class);
  }

  @Override
  @NotNull
  public List<JuliaExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JuliaExpr.class);
  }

}
