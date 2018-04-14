// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiNameIdentifierOwner;

public interface JuliaTypedNamedVariable extends PsiNameIdentifierOwner {

  @NotNull
  List<JuliaExpr> getExprList();

  @Nullable
  JuliaTypeAnnotation getTypeAnnotation();

}
