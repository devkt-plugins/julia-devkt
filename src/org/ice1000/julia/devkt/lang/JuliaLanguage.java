package org.ice1000.julia.devkt.lang;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.com.intellij.lang.Language;
import org.jetbrains.kotlin.com.intellij.openapi.fileTypes.LanguageFileType;

import static org.ice1000.julia.devkt.lang.Julia_constantsKt.JULIA_EXTENSION;
import static org.ice1000.julia.devkt.lang.Julia_constantsKt.JULIA_LANGUAGE_NAME;

/**
 * WARNINGS:
 * - This file MUST NOT be converted to Kotlin!
 * - DO NOT replace <code>String NAME = "Julia"</code> with
 * <code>String NAME = JuliaBundle.message("julia.name")</code>
 * but static import JULIA_LANGUAGE_NAME.
 * <p>
 * ERRORS:
 * - Tests will be failed.
 * - LanguageType `language="Julia"` in plugin.xml will become red.
 *
 * @author zxj5470
 */
public final class JuliaLanguage extends Language {
	public static final @NotNull
	JuliaLanguage INSTANCE = new JuliaLanguage();

	private JuliaLanguage() {
		super(JULIA_LANGUAGE_NAME, "text/" + JULIA_EXTENSION);
	}

	@Override
	public @Nullable
	LanguageFileType getAssociatedFileType() {
		return JuliaFileType.INSTANCE;
	}

	@Override
	@Contract(pure = true)
	public boolean isCaseSensitive() {
		return false;
	}
}