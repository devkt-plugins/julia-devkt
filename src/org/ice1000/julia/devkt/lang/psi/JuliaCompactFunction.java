// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;

public interface JuliaCompactFunction extends JuliaExpr {

  @NotNull
  List<JuliaExpr> getExprList();

  @NotNull
  JuliaFunctionSignature getFunctionSignature();

  @Nullable
  JuliaTypeParameters getTypeParameters();

  @Nullable
  JuliaWhereClause getWhereClause();

}
