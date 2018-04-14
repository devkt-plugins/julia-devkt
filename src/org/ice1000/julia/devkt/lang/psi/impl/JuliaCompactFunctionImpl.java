// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi.impl;

import java.util.List;

import org.ice1000.julia.devkt.lang.psi.*;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import org.ice1000.julia.devkt.lang.psi.*;

public class JuliaCompactFunctionImpl extends JuliaCompactFunctionMixin implements JuliaCompactFunction {

  public JuliaCompactFunctionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JuliaVisitor visitor) {
    visitor.visitCompactFunction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JuliaVisitor) accept((JuliaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JuliaExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JuliaExpr.class);
  }

  @Override
  @NotNull
  public JuliaFunctionSignature getFunctionSignature() {
    return findNotNullChildByClass(JuliaFunctionSignature.class);
  }

  @Override
  @Nullable
  public JuliaTypeParameters getTypeParameters() {
    return findChildByClass(JuliaTypeParameters.class);
  }

  @Override
  @Nullable
  public JuliaWhereClause getWhereClause() {
    return findChildByClass(JuliaWhereClause.class);
  }

}
