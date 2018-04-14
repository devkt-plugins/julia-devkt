package org.ice1000.julia.devkt.lang.docfmt;

import org.jetbrains.kotlin.com.intellij.lexer.FlexAdapter;

public class DocfmtLexerAdapter extends FlexAdapter {
	public DocfmtLexerAdapter() {
		super(new DocfmtLexer());
	}
}
