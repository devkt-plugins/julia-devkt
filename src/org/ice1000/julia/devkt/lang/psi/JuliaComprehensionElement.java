// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface JuliaComprehensionElement extends PsiElement {

  @NotNull
  JuliaExpr getExpr();

  @NotNull
  List<JuliaSingleComprehension> getSingleComprehensionList();

}
