// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi.impl;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.ice1000.julia.devkt.lang.psi.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;

public class JuliaSingleComprehensionImpl extends ASTWrapperPsiElement implements JuliaSingleComprehension {

  public JuliaSingleComprehensionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JuliaVisitor visitor) {
    visitor.visitSingleComprehension(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JuliaVisitor) accept((JuliaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JuliaExpr getExpr() {
    return findChildByClass(JuliaExpr.class);
  }

  @Override
  @Nullable
  public JuliaMultiIndexer getMultiIndexer() {
    return findChildByClass(JuliaMultiIndexer.class);
  }

  @Override
  @Nullable
  public JuliaSingleIndexer getSingleIndexer() {
    return findChildByClass(JuliaSingleIndexer.class);
  }

}
