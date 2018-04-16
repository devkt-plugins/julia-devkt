// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi.impl;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.ice1000.julia.devkt.lang.psi.*;

public class JuliaExprWrapperImpl extends JuliaExprOrEndImpl implements JuliaExprWrapper {

  public JuliaExprWrapperImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JuliaVisitor visitor) {
    visitor.visitExprWrapper(this);
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

}
