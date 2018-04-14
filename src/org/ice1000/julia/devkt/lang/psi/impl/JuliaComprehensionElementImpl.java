// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi.impl;

import java.util.List;

import org.ice1000.julia.devkt.lang.psi.JuliaComprehensionElement;
import org.ice1000.julia.devkt.lang.psi.JuliaExpr;
import org.ice1000.julia.devkt.lang.psi.JuliaSingleComprehension;
import org.ice1000.julia.devkt.lang.psi.JuliaVisitor;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.kotlin.com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.ice1000.julia.devkt.lang.psi.*;

public class JuliaComprehensionElementImpl extends ASTWrapperPsiElement implements JuliaComprehensionElement {

  public JuliaComprehensionElementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JuliaVisitor visitor) {
    visitor.visitComprehensionElement(this);
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
  public List<JuliaSingleComprehension> getSingleComprehensionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JuliaSingleComprehension.class);
  }

}
