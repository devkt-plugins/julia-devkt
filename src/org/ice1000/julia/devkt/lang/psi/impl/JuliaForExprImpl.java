// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import org.ice1000.julia.devkt.lang.psi.*;

public class JuliaForExprImpl extends JuliaLoopDeclarationMixin implements JuliaForExpr {

  public JuliaForExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JuliaVisitor visitor) {
    visitor.visitForExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JuliaVisitor) accept((JuliaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JuliaMultiIndexer> getMultiIndexerList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JuliaMultiIndexer.class);
  }

  @Override
  @NotNull
  public List<JuliaSingleIndexer> getSingleIndexerList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JuliaSingleIndexer.class);
  }

  @Override
  @NotNull
  public JuliaStatements getStatements() {
    return findNotNullChildByClass(JuliaStatements.class);
  }

}
