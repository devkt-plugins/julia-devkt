// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import java.util.List;

import org.ice1000.julia.devkt.lang.psi.impl.IJuliaFunctionDeclaration;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface JuliaCompactFunction extends JuliaExpr, IJuliaFunctionDeclaration {

  @NotNull
  List<JuliaExpr> getExprList();

  @NotNull
  JuliaFunctionSignature getFunctionSignature();

  @Nullable
  JuliaTypeParameters getTypeParameters();

  @Nullable
  JuliaWhereClause getWhereClause();

}
