// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import org.ice1000.julia.devkt.lang.psi.impl.IJuliaFunctionDeclaration;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface JuliaFunction extends JuliaExpr, IJuliaFunctionDeclaration {

  @Nullable
  JuliaFunctionSignature getFunctionSignature();

  @Nullable
  JuliaStatements getStatements();

  @Nullable
  JuliaSymbol getSymbol();

  @Nullable
  JuliaTypeParameters getTypeParameters();

  @Nullable
  JuliaWhereClause getWhereClause();

}
