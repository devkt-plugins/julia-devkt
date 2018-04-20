// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import org.ice1000.julia.devkt.lang.psi.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;

public class JuliaIfExprImpl extends JuliaExprImpl implements JuliaIfExpr {

  public JuliaIfExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JuliaVisitor visitor) {
    visitor.visitIfExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JuliaVisitor) accept((JuliaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JuliaElseClause getElseClause() {
    return findChildByClass(JuliaElseClause.class);
  }

  @Override
  @NotNull
  public List<JuliaElseIfClause> getElseIfClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JuliaElseIfClause.class);
  }

  @Override
  @Nullable
  public JuliaExpr getExpr() {
    return findChildByClass(JuliaExpr.class);
  }

  @Override
  @Nullable
  public JuliaStatements getStatements() {
    return findChildByClass(JuliaStatements.class);
  }

}
