package org.daisy.dotify.translator.attributes;

public interface TextAttributeFilter {

	/**
	 * Returns true if the filter allows the specified text attributes, false
	 * otherwise.
	 * 
	 * @param atts
	 *            the attributes to test
	 * @return returns true if the filter allows the specified text attributes,
	 *         false otherwise
	 */
	public boolean appliesTo(TextAttribute atts);
}