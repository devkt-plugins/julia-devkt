// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface JuliaBracketedExpr extends JuliaExpr {

  @NotNull
  List<JuliaExpr> getExprList();

  @Nullable
  JuliaStatements getStatements();

}
