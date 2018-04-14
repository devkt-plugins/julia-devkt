// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import java.util.List;

import org.ice1000.julia.devkt.lang.psi.impl.IJuliaString;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface JuliaString extends JuliaExpr, IJuliaString {

  @NotNull
  List<JuliaStringContent> getStringContentList();

  @NotNull
  List<JuliaTemplate> getTemplateList();

}
