// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.ice1000.julia.devkt.lang.psi.impl.IJuliaString;

public interface JuliaString extends JuliaExpr, IJuliaString {

  @NotNull
  List<JuliaStringContent> getStringContentList();

  @NotNull
  List<JuliaTemplate> getTemplateList();

}
