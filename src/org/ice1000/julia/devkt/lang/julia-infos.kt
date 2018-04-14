package org.ice1000.julia.devkt.lang

import org.jetbrains.kotlin.com.intellij.extapi.psi.PsiFileBase
import org.jetbrains.kotlin.com.intellij.openapi.fileTypes.LanguageFileType
import org.jetbrains.kotlin.com.intellij.psi.FileViewProvider

object JuliaFileType : LanguageFileType(JuliaLanguage.INSTANCE) {
	override fun getDefaultExtension() = JULIA_EXTENSION
	override fun getName() = "Julia"
	override fun getIcon() = null
	override fun getDescription() = ""
}

class JuliaFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, JuliaLanguage.INSTANCE) {
	override fun getFileType() = JuliaFileType
}
