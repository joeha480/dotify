package org.daisy.dotify.impl.hyphenator.latex;

import org.daisy.dotify.hyphenator.AbstractHyphenator;
import org.daisy.dotify.hyphenator.UnsupportedLocaleException;
import org.daisy.dotify.text.FilterLocale;

class CWHyphenator extends AbstractHyphenator {
	private final CWHyphenatorAtom hyphenator;

	public CWHyphenator(FilterLocale locale) throws UnsupportedLocaleException {
		this.hyphenator = CWHyphenatorCore.getInstance().getHyphenator(locale);
		this.beginLimit = hyphenator.getDefaultBeginLimit();
		this.endLimit = hyphenator.getDefaultEndLimit();
	}

	static boolean supportsLocale(FilterLocale locale) {
		return CWHyphenatorCore.getInstance().supportsLocale(locale);
	}

	public String hyphenate(String phrase) {
		return hyphenator.hyphenate(phrase, getBeginLimit(), getEndLimit());
	}

}
