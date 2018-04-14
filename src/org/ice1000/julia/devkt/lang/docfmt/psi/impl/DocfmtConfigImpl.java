// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.docfmt.psi.impl;

import org.ice1000.julia.devkt.lang.docfmt.DocfmtConfigMixin;
import org.ice1000.julia.devkt.lang.docfmt.psi.DocfmtConfig;
import org.ice1000.julia.devkt.lang.docfmt.psi.DocfmtValue;
import org.ice1000.julia.devkt.lang.docfmt.psi.DocfmtVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;

public class DocfmtConfigImpl extends DocfmtConfigMixin implements DocfmtConfig {

  public DocfmtConfigImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DocfmtVisitor visitor) {
    visitor.visitConfig(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DocfmtVisitor) accept((DocfmtVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DocfmtValue getValue() {
    return findNotNullChildByClass(DocfmtValue.class);
  }

}
