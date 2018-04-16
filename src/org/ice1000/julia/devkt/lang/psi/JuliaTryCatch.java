// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import org.jetbrains.annotations.*;

public interface JuliaTryCatch extends JuliaExpr {

  @Nullable
  JuliaCatchClause getCatchClause();

  @Nullable
  JuliaFinallyClause getFinallyClause();

  @NotNull
  JuliaStatements getStatements();

}
