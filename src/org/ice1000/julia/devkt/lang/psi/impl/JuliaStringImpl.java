// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi.impl;

import java.util.List;

import org.ice1000.julia.devkt.lang.psi.JuliaString;
import org.ice1000.julia.devkt.lang.psi.JuliaStringContent;
import org.ice1000.julia.devkt.lang.psi.JuliaTemplate;
import org.ice1000.julia.devkt.lang.psi.JuliaVisitor;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import org.ice1000.julia.devkt.lang.psi.*;

public class JuliaStringImpl extends JuliaStringMixin implements JuliaString {

  public JuliaStringImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JuliaVisitor visitor) {
    visitor.visitString(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JuliaVisitor) accept((JuliaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<JuliaStringContent> getStringContentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JuliaStringContent.class);
  }

  @Override
  @NotNull
  public List<JuliaTemplate> getTemplateList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, JuliaTemplate.class);
  }

}
