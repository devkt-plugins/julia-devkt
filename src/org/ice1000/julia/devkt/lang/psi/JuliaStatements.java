// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface JuliaStatements extends PsiElement {

  @NotNull
  List<JuliaExpr> getExprList();

  @NotNull
  List<JuliaGlobalStatement> getGlobalStatementList();

  @NotNull
  List<JuliaModuleDeclaration> getModuleDeclarationList();

}
