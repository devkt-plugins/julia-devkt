// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import java.util.List;

import org.ice1000.julia.devkt.lang.psi.impl.IJuliaTypeDeclaration;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface JuliaTypeDeclaration extends JuliaExpr, IJuliaTypeDeclaration {

  @NotNull
  List<JuliaExpr> getExprList();

  @NotNull
  JuliaStatements getStatements();

  @Nullable
  JuliaTypeParameters getTypeParameters();

}
