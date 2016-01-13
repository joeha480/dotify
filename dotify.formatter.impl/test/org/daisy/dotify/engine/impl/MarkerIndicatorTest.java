package org.daisy.dotify.engine.impl;

import java.io.IOException;

import org.daisy.dotify.api.engine.LayoutEngineException;
import org.daisy.dotify.api.writer.PagedMediaWriterConfigurationException;
import org.junit.Test;
public class MarkerIndicatorTest extends AbstractFormatterEngineTest {
	
	@Test
	public void testPageMargin_01() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/marker-indicator-input.obfl", "resource-files/marker-indicator-expected.pef", false);
	}
	@Test
	public void testObflToPef_27() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_27-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_27-expected.pef", false);
	}
	@Test
	public void testObflToPef_28() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_28-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_28-expected.pef", false);
	}
}
