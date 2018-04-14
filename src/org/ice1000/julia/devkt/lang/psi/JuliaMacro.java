// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import org.ice1000.julia.devkt.lang.psi.impl.DocStringOwner;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiNameIdentifierOwner;

public interface JuliaMacro extends JuliaExpr, PsiNameIdentifierOwner, DocStringOwner {

  @Nullable
  JuliaStatements getStatements();

  @Nullable
  JuliaSymbol getSymbol();

  @Nullable
  JuliaUntypedVariables getUntypedVariables();

}
