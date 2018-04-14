// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.docfmt.psi.impl;

import org.ice1000.julia.devkt.lang.docfmt.psi.DocfmtValue;
import org.ice1000.julia.devkt.lang.docfmt.psi.DocfmtVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;

public class DocfmtValueImpl extends ASTWrapperPsiElement implements DocfmtValue {

  public DocfmtValueImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DocfmtVisitor visitor) {
    visitor.visitValue(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DocfmtVisitor) accept((DocfmtVisitor)visitor);
    else super.accept(visitor);
  }

}
