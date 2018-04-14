// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi.impl;

import org.ice1000.julia.devkt.lang.psi.JuliaTuple;
import org.ice1000.julia.devkt.lang.psi.JuliaUnion;
import org.ice1000.julia.devkt.lang.psi.JuliaVisitor;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import org.ice1000.julia.devkt.lang.psi.*;

public class JuliaUnionImpl extends JuliaExprImpl implements JuliaUnion {

  public JuliaUnionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JuliaVisitor visitor) {
    visitor.visitUnion(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JuliaVisitor) accept((JuliaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JuliaTuple getTuple() {
    return findChildByClass(JuliaTuple.class);
  }

}
