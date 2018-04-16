package org.ice1000.julia.devkt.lang.docfmt;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.lang.Language;
import org.jetbrains.kotlin.com.intellij.openapi.fileTypes.LanguageFileType;

import static org.ice1000.julia.devkt.lang.Julia_constantsKt.DOCFMT_EXTENSION;
import static org.ice1000.julia.devkt.lang.Julia_constantsKt.DOCFMT_LANGUAGE_NAME;

/**
 * Language support for https://github.com/ZacLN/DocumentFormat.jl
 *
 * @author ice1000
 */
public final class DocfmtLanguage extends Language {
	public static final @NotNull DocfmtLanguage INSTANCE = new DocfmtLanguage();

	private DocfmtLanguage() {
		super(DOCFMT_LANGUAGE_NAME, "text/" + DOCFMT_EXTENSION);
	}

	@Override public @NotNull LanguageFileType getAssociatedFileType() {
		return DocfmtFileType.INSTANCE;
	}

	@Override @Contract(pure = true) public boolean isCaseSensitive() {
		return true;
	}
}
