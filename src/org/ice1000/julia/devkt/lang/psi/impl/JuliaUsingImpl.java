// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import org.ice1000.julia.devkt.lang.psi.*;

public class JuliaUsingImpl extends JuliaExprImpl implements JuliaUsing {

  public JuliaUsingImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JuliaVisitor visitor) {
    visitor.visitUsing(this);
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
  @NotNull
  public List<JuliaMemberAccess> getMemberAccessList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JuliaMemberAccess.class);
  }

}
