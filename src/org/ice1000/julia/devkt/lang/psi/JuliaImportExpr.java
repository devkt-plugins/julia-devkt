// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;

public interface JuliaImportExpr extends JuliaExpr {

  @Nullable
  JuliaExpr getExpr();

  @NotNull
  List<JuliaMemberAccess> getMemberAccessList();

}
