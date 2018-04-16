// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;

public interface JuliaApplyFunctionOp extends JuliaExpr {

  @Nullable
  JuliaArguments getArguments();

  @NotNull
  List<JuliaComprehensionElement> getComprehensionElementList();

  @NotNull
  List<JuliaExpr> getExprList();

}
