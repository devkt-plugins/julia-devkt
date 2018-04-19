// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import org.ice1000.julia.devkt.lang.psi.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;

public class JuliaPlusIndexingImpl extends JuliaExprOrEndImpl implements JuliaPlusIndexing {

  public JuliaPlusIndexingImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JuliaVisitor visitor) {
    visitor.visitPlusIndexing(this);
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

  @Override
  @NotNull
  public JuliaPlusLevelOperator getPlusLevelOperator() {
    return findNotNullChildByClass(JuliaPlusLevelOperator.class);
  }

}
