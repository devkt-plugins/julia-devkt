// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;

public interface JuliaForExpr extends JuliaExpr {

  @NotNull
  List<JuliaMultiIndexer> getMultiIndexerList();

  @NotNull
  List<JuliaSingleIndexer> getSingleIndexerList();

  @NotNull
  JuliaStatements getStatements();

}
