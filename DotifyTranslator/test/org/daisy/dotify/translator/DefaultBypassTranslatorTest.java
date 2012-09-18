package org.daisy.dotify.translator;
import static org.junit.Assert.assertEquals;

import org.daisy.dotify.text.FilterLocale;
import org.junit.Test;

public class DefaultBypassTranslatorTest {
	private final BrailleTranslator bypass;
	
	public DefaultBypassTranslatorTest() throws UnsupportedSpecificationException {
		FilterLocale sv_SE = FilterLocale.parse("sv-SE");
		this.bypass = new DefaultBypassTranslatorFactory().newTranslator(sv_SE, BrailleTranslatorFactory.MODE_BYPASS);
	}
	
	@Test
	public void testBypass() {
		//Setup
		String text = "This is a test to see if the bypass feature works as intended";
		BrailleTranslatorResult btr = bypass.translate(text);
		//Test
		assertEquals("Assert that the output is equal to the input.", text, btr.nextTranslatedRow(100, false));
	}
	
	@Test
	public void testBypassZeroWidthSpace_01() {	
		BrailleTranslatorResult btr = bypass.translate("CD-versionen");
		assertEquals("CD-versionen", btr.getTranslatedRemainder());
	}
	
	@Test
	public void testBypassZeroWidthSpace_02() {	
		BrailleTranslatorResult btr = bypass.translate("CD-versionen");
		assertEquals("CD-", btr.nextTranslatedRow(4, false));
	}
	
	@Test
	public void testBypassZeroWidthSpace_03() {
		//Setup
		BrailleTranslatorResult btr = bypass.translate("CD-versionen");
		btr.nextTranslatedRow(3, false);
		
		//Test
		assertEquals("versionen", btr.getTranslatedRemainder());
	}

}