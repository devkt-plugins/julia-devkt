// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;

public interface JuliaIfExpr extends JuliaExpr {

  @Nullable
  JuliaElseClause getElseClause();

  @NotNull
  List<JuliaElseIfClause> getElseIfClauseList();

  @Nullable
  JuliaExpr getExpr();

  @Nullable
  JuliaStatements getStatements();

}
