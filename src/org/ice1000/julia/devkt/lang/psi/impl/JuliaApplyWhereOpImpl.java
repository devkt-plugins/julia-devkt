// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi.impl;

import org.ice1000.julia.devkt.lang.psi.JuliaApplyWhereOp;
import org.ice1000.julia.devkt.lang.psi.JuliaExpr;
import org.ice1000.julia.devkt.lang.psi.JuliaVisitor;
import org.ice1000.julia.devkt.lang.psi.JuliaWhereClause;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import org.ice1000.julia.devkt.lang.psi.*;

public class JuliaApplyWhereOpImpl extends JuliaExprImpl implements JuliaApplyWhereOp {

  public JuliaApplyWhereOpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JuliaVisitor visitor) {
    visitor.visitApplyWhereOp(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JuliaVisitor) accept((JuliaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JuliaExpr getExpr() {
    return findNotNullChildByClass(JuliaExpr.class);
  }

  @Override
  @NotNull
  public JuliaWhereClause getWhereClause() {
    return findNotNullChildByClass(JuliaWhereClause.class);
  }

}
