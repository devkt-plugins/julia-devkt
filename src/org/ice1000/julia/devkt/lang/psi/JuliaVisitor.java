// This is a generated file. Not intended for manual editing.
package org.ice1000.julia.devkt.lang.psi;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.ice1000.julia.devkt.lang.psi.impl.IJuliaModuleDeclaration;
import org.jetbrains.kotlin.com.intellij.psi.PsiNameIdentifierOwner;
import org.ice1000.julia.devkt.lang.psi.impl.IJuliaExpr;

public class JuliaVisitor extends PsiElementVisitor {

  public void visitAbstractTypeDeclaration(@NotNull JuliaAbstractTypeDeclaration o) {
    visitExpr(o);
  }

  public void visitAndOp(@NotNull JuliaAndOp o) {
    visitExpr(o);
  }

  public void visitApplyFunctionOp(@NotNull JuliaApplyFunctionOp o) {
    visitExpr(o);
  }

  public void visitApplyIndexOp(@NotNull JuliaApplyIndexOp o) {
    visitExpr(o);
  }

  public void visitApplyMacroOp(@NotNull JuliaApplyMacroOp o) {
    visitExpr(o);
  }

  public void visitApplyWhereOp(@NotNull JuliaApplyWhereOp o) {
    visitExpr(o);
  }

  public void visitArguments(@NotNull JuliaArguments o) {
    visitPsiElement(o);
  }

  public void visitArray(@NotNull JuliaArray o) {
    visitExpr(o);
  }

  public void visitArrowOp(@NotNull JuliaArrowOp o) {
    visitExpr(o);
  }

  public void visitAssignLevelOp(@NotNull JuliaAssignLevelOp o) {
    visitExpr(o);
  }

  public void visitAssignLevelOperator(@NotNull JuliaAssignLevelOperator o) {
    visitPsiElement(o);
  }

  public void visitAssignOp(@NotNull JuliaAssignOp o) {
    visitExpr(o);
    // visitPsiNameIdentifierOwner(o);
  }

  public void visitBitWiseNotOp(@NotNull JuliaBitWiseNotOp o) {
    visitExpr(o);
  }

  public void visitBitwiseLevelOp(@NotNull JuliaBitwiseLevelOp o) {
    visitExpr(o);
  }

  public void visitBitwiseLevelOperator(@NotNull JuliaBitwiseLevelOperator o) {
    visitPsiElement(o);
  }

  public void visitBlock(@NotNull JuliaBlock o) {
    visitExpr(o);
  }

  public void visitBooleanLit(@NotNull JuliaBooleanLit o) {
    visitExpr(o);
  }

  public void visitBracketedExpr(@NotNull JuliaBracketedExpr o) {
    visitExpr(o);
  }

  public void visitBreakExpr(@NotNull JuliaBreakExpr o) {
    visitExpr(o);
  }

  public void visitByteArray(@NotNull JuliaByteArray o) {
    visitExpr(o);
  }

  public void visitCatchClause(@NotNull JuliaCatchClause o) {
    visitPsiNameIdentifierOwner(o);
  }

  public void visitCharLit(@NotNull JuliaCharLit o) {
    visitExpr(o);
  }

  public void visitColonBlock(@NotNull JuliaColonBlock o) {
    visitExpr(o);
  }

  public void visitColonOp(@NotNull JuliaColonOp o) {
    visitExpr(o);
  }

  public void visitColonSymBegins(@NotNull JuliaColonSymBegins o) {
    visitPsiElement(o);
  }

  public void visitCommand(@NotNull JuliaCommand o) {
    visitExpr(o);
  }

  public void visitCompactFunction(@NotNull JuliaCompactFunction o) {
    visitExpr(o);
    // visitIJuliaFunctionDeclaration(o);
  }

  public void visitComparisonLevelOp(@NotNull JuliaComparisonLevelOp o) {
    visitExpr(o);
  }

  public void visitComparisonLevelOperator(@NotNull JuliaComparisonLevelOperator o) {
    visitPsiElement(o);
  }

  public void visitCompoundQuoteOp(@NotNull JuliaCompoundQuoteOp o) {
    visitExpr(o);
  }

  public void visitComprehensionElement(@NotNull JuliaComprehensionElement o) {
    visitPsiElement(o);
  }

  public void visitContinueExpr(@NotNull JuliaContinueExpr o) {
    visitExpr(o);
  }

  public void visitDoBlock(@NotNull JuliaDoBlock o) {
    visitExpr(o);
  }

  public void visitElseClause(@NotNull JuliaElseClause o) {
    visitPsiElement(o);
  }

  public void visitElseIfClause(@NotNull JuliaElseIfClause o) {
    visitPsiElement(o);
  }

  public void visitEnd(@NotNull JuliaEnd o) {
    visitExprOrEnd(o);
  }

  public void visitExponentOp(@NotNull JuliaExponentOp o) {
    visitExpr(o);
  }

  public void visitExport(@NotNull JuliaExport o) {
    visitExpr(o);
  }

  public void visitExpr(@NotNull JuliaExpr o) {
    visitIJuliaExpr(o);
  }

  public void visitExprOrEnd(@NotNull JuliaExprOrEnd o) {
    visitPsiElement(o);
  }

  public void visitExprWrapper(@NotNull JuliaExprWrapper o) {
    visitExprOrEnd(o);
  }

  public void visitFinallyClause(@NotNull JuliaFinallyClause o) {
    visitPsiElement(o);
  }

  public void visitFloatLit(@NotNull JuliaFloatLit o) {
    visitExpr(o);
  }

  public void visitForComprehension(@NotNull JuliaForComprehension o) {
    visitExpr(o);
  }

  public void visitForExpr(@NotNull JuliaForExpr o) {
    visitExpr(o);
  }

  public void visitFractionOp(@NotNull JuliaFractionOp o) {
    visitExpr(o);
  }

  public void visitFunction(@NotNull JuliaFunction o) {
    visitExpr(o);
    // visitIJuliaFunctionDeclaration(o);
  }

  public void visitFunctionSignature(@NotNull JuliaFunctionSignature o) {
    visitPsiElement(o);
  }

  public void visitGlobalStatement(@NotNull JuliaGlobalStatement o) {
    visitPsiElement(o);
  }

  public void visitIfExpr(@NotNull JuliaIfExpr o) {
    visitExpr(o);
  }

  public void visitImplicitMultiplyOp(@NotNull JuliaImplicitMultiplyOp o) {
    visitExpr(o);
  }

  public void visitImportAllExpr(@NotNull JuliaImportAllExpr o) {
    visitExpr(o);
  }

  public void visitImportExpr(@NotNull JuliaImportExpr o) {
    visitExpr(o);
  }

  public void visitInAsOp(@NotNull JuliaInAsOp o) {
    visitExpr(o);
  }

  public void visitInOp(@NotNull JuliaInOp o) {
    visitExpr(o);
  }

  public void visitInteger(@NotNull JuliaInteger o) {
    visitExpr(o);
  }

  public void visitLambda(@NotNull JuliaLambda o) {
    visitExpr(o);
  }

  public void visitLet(@NotNull JuliaLet o) {
    visitExpr(o);
  }

  public void visitMacro(@NotNull JuliaMacro o) {
    visitExpr(o);
    // visitPsiNameIdentifierOwner(o);
    // visitDocStringOwner(o);
  }

  public void visitMacroSymbol(@NotNull JuliaMacroSymbol o) {
    visitExpr(o);
    // visitPsiNameIdentifierOwner(o);
  }

  public void visitMemberAccess(@NotNull JuliaMemberAccess o) {
    visitPsiElement(o);
  }

  public void visitMemberAccessOp(@NotNull JuliaMemberAccessOp o) {
    visitExpr(o);
  }

  public void visitMiscArrowsOp(@NotNull JuliaMiscArrowsOp o) {
    visitExpr(o);
  }

  public void visitMiscExponentOp(@NotNull JuliaMiscExponentOp o) {
    visitExpr(o);
  }

  public void visitModuleDeclaration(@NotNull JuliaModuleDeclaration o) {
    visitIJuliaModuleDeclaration(o);
  }

  public void visitMultiIndexer(@NotNull JuliaMultiIndexer o) {
    visitPsiElement(o);
  }

  public void visitMultiplyIndexing(@NotNull JuliaMultiplyIndexing o) {
    visitExprOrEnd(o);
  }

  public void visitMultiplyLevelOp(@NotNull JuliaMultiplyLevelOp o) {
    visitExpr(o);
  }

  public void visitMultiplyLevelOperator(@NotNull JuliaMultiplyLevelOperator o) {
    visitPsiElement(o);
  }

  public void visitNamedParameter(@NotNull JuliaNamedParameter o) {
    visitPsiElement(o);
  }

  public void visitNotOp(@NotNull JuliaNotOp o) {
    visitExpr(o);
  }

  public void visitOpAsSymbol(@NotNull JuliaOpAsSymbol o) {
    visitExpr(o);
  }

  public void visitOrOp(@NotNull JuliaOrOp o) {
    visitExpr(o);
  }

  public void visitPipeLevelOp(@NotNull JuliaPipeLevelOp o) {
    visitExpr(o);
  }

  public void visitPipeLevelOperator(@NotNull JuliaPipeLevelOperator o) {
    visitPsiElement(o);
  }

  public void visitPlusIndexing(@NotNull JuliaPlusIndexing o) {
    visitExprOrEnd(o);
  }

  public void visitPlusLevelOp(@NotNull JuliaPlusLevelOp o) {
    visitExpr(o);
  }

  public void visitPlusLevelOperator(@NotNull JuliaPlusLevelOperator o) {
    visitPsiElement(o);
  }

  public void visitPrimitiveTypeDeclaration(@NotNull JuliaPrimitiveTypeDeclaration o) {
    visitExpr(o);
  }

  public void visitQuoteOp(@NotNull JuliaQuoteOp o) {
    visitExpr(o);
  }

  public void visitRangeIndexing(@NotNull JuliaRangeIndexing o) {
    visitExprOrEnd(o);
  }

  public void visitRangeOp(@NotNull JuliaRangeOp o) {
    visitExpr(o);
  }

  public void visitRawString(@NotNull JuliaRawString o) {
    visitExpr(o);
  }

  public void visitRegex(@NotNull JuliaRegex o) {
    visitExpr(o);
    // visitIJuliaRegex(o);
  }

  public void visitReturnExpr(@NotNull JuliaReturnExpr o) {
    visitExpr(o);
  }

  public void visitSingleComprehension(@NotNull JuliaSingleComprehension o) {
    visitPsiNameIdentifierOwner(o);
  }

  public void visitSingleIndexer(@NotNull JuliaSingleIndexer o) {
    visitPsiElement(o);
  }

  public void visitSpliceOp(@NotNull JuliaSpliceOp o) {
    visitExpr(o);
  }

  public void visitStatements(@NotNull JuliaStatements o) {
    visitPsiElement(o);
  }

  public void visitString(@NotNull JuliaString o) {
    visitExpr(o);
    // visitIJuliaString(o);
  }

  public void visitStringContent(@NotNull JuliaStringContent o) {
    visitPsiElement(o);
  }

  public void visitSymbol(@NotNull JuliaSymbol o) {
    visitExpr(o);
    // visitIJuliaSymbol(o);
  }

  public void visitSymbolLhs(@NotNull JuliaSymbolLhs o) {
    visitExpr(o);
  }

  public void visitTemplate(@NotNull JuliaTemplate o) {
    visitPsiElement(o);
  }

  public void visitTernaryOp(@NotNull JuliaTernaryOp o) {
    visitExpr(o);
  }

  public void visitTransposeOp(@NotNull JuliaTransposeOp o) {
    visitExpr(o);
  }

  public void visitTryCatch(@NotNull JuliaTryCatch o) {
    visitExpr(o);
  }

  public void visitTuple(@NotNull JuliaTuple o) {
    visitExpr(o);
  }

  public void visitType(@NotNull JuliaType o) {
    visitExpr(o);
  }

  public void visitTypeAlias(@NotNull JuliaTypeAlias o) {
    visitExpr(o);
  }

  public void visitTypeAnnotation(@NotNull JuliaTypeAnnotation o) {
    visitPsiElement(o);
  }

  public void visitTypeDeclaration(@NotNull JuliaTypeDeclaration o) {
    visitExpr(o);
    // visitIJuliaTypeDeclaration(o);
  }

  public void visitTypeOp(@NotNull JuliaTypeOp o) {
    visitExpr(o);
  }

  public void visitTypeParameters(@NotNull JuliaTypeParameters o) {
    visitPsiElement(o);
  }

  public void visitTypedNamedVariable(@NotNull JuliaTypedNamedVariable o) {
    visitPsiNameIdentifierOwner(o);
  }

  public void visitUnaryInterpolateOp(@NotNull JuliaUnaryInterpolateOp o) {
    visitExpr(o);
  }

  public void visitUnaryMinusOp(@NotNull JuliaUnaryMinusOp o) {
    visitExpr(o);
  }

  public void visitUnaryOpAsSymbol(@NotNull JuliaUnaryOpAsSymbol o) {
    visitExpr(o);
  }

  public void visitUnaryPlusOp(@NotNull JuliaUnaryPlusOp o) {
    visitExpr(o);
  }

  public void visitUnarySubtypeOp(@NotNull JuliaUnarySubtypeOp o) {
    visitExpr(o);
  }

  public void visitUnaryTypeOp(@NotNull JuliaUnaryTypeOp o) {
    visitExpr(o);
  }

  public void visitUnion(@NotNull JuliaUnion o) {
    visitExpr(o);
  }

  public void visitUntypedVariables(@NotNull JuliaUntypedVariables o) {
    visitPsiElement(o);
  }

  public void visitUserType(@NotNull JuliaUserType o) {
    visitPsiElement(o);
  }

  public void visitUsing(@NotNull JuliaUsing o) {
    visitExpr(o);
  }

  public void visitVersionNumber(@NotNull JuliaVersionNumber o) {
    visitExpr(o);
  }

  public void visitWhereClause(@NotNull JuliaWhereClause o) {
    visitPsiElement(o);
  }

  public void visitWhileExpr(@NotNull JuliaWhileExpr o) {
    visitExpr(o);
  }

  public void visitIJuliaExpr(@NotNull IJuliaExpr o) {
    visitElement(o);
  }

  public void visitIJuliaModuleDeclaration(@NotNull IJuliaModuleDeclaration o) {
    visitElement(o);
  }

  public void visitPsiNameIdentifierOwner(@NotNull PsiNameIdentifierOwner o) {
    visitElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
