// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;

public interface JuliaApplyIndexOp extends JuliaExpr {

  @Nullable
  JuliaComprehensionElement getComprehensionElement();

  @NotNull
  JuliaExpr getExpr();

  @NotNull
  List<JuliaExprOrEnd> getExprOrEndList();

}
