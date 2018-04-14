// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi.impl;

import org.ice1000.julia.devkt.lang.psi.JuliaModuleDeclaration;
import org.ice1000.julia.devkt.lang.psi.JuliaStatements;
import org.ice1000.julia.devkt.lang.psi.JuliaSymbol;
import org.ice1000.julia.devkt.lang.psi.JuliaVisitor;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import org.ice1000.julia.devkt.lang.psi.*;

public class JuliaModuleDeclarationImpl extends JuliaModuleDeclarationMixin implements JuliaModuleDeclaration {

  public JuliaModuleDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JuliaVisitor visitor) {
    visitor.visitModuleDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JuliaVisitor) accept((JuliaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public JuliaStatements getStatements() {
    return findNotNullChildByClass(JuliaStatements.class);
  }

  @Override
  @NotNull
  public JuliaSymbol getSymbol() {
    return findNotNullChildByClass(JuliaSymbol.class);
  }

}
