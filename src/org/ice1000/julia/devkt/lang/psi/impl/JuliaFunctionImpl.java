// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi.impl;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.ice1000.julia.devkt.lang.psi.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;

public class JuliaFunctionImpl extends JuliaExprImpl implements JuliaFunction {

  public JuliaFunctionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JuliaVisitor visitor) {
    visitor.visitFunction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JuliaVisitor) accept((JuliaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public JuliaFunctionSignature getFunctionSignature() {
    return findChildByClass(JuliaFunctionSignature.class);
  }

  @Override
  @Nullable
  public JuliaStatements getStatements() {
    return findChildByClass(JuliaStatements.class);
  }

  @Override
  @Nullable
  public JuliaSymbol getSymbol() {
    return findChildByClass(JuliaSymbol.class);
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
