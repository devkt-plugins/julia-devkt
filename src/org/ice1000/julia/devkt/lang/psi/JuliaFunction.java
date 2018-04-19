// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import org.jetbrains.annotations.*;

public interface JuliaFunction extends JuliaExpr {

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
