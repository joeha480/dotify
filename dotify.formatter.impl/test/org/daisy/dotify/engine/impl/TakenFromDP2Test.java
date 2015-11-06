package org.daisy.dotify.engine.impl;

import java.io.IOException;

import org.daisy.dotify.api.engine.LayoutEngineException;
import org.daisy.dotify.api.writer.PagedMediaWriterConfigurationException;
import org.junit.Ignore;
import org.junit.Test;

public class TakenFromDP2Test extends AbstractFormatterEngineTest {
	
	@Test
	public void testObflToPef() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_01-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_01-expected.pef", false);
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_02-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_02-expected.pef", false);
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_06-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_06-expected.pef", false);
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_08-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_08-expected.pef", false);
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_11-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_11-expected.pef", false);
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_12-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_12-expected.pef", false);
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_13-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_13-expected.pef", false);
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_14-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_14-expected.pef", false);
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_15-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_15-expected.pef", false);
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_16-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_16-expected.pef", false);
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_17-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_17-expected.pef", false);
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_19-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_19-expected.pef", false);
	}
	
	@Test
	public void testFormat() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_01-input.obfl",
		        "resource-files/test_format.xprocspec/test_01-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_03-input.obfl",
		        "resource-files/test_format.xprocspec/test_03-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_06-input.obfl",
		        "resource-files/test_format.xprocspec/test_06-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_08-input.obfl",
		        "resource-files/test_format.xprocspec/test_08-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_09-input.obfl",
		        "resource-files/test_format.xprocspec/test_09-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_11-input.obfl",
		        "resource-files/test_format.xprocspec/test_11-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_12-input.obfl",
		        "resource-files/test_format.xprocspec/test_12-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_13-input.obfl",
		        "resource-files/test_format.xprocspec/test_13-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_14-input.obfl",
		        "resource-files/test_format.xprocspec/test_14-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_15-input.obfl",
		        "resource-files/test_format.xprocspec/test_15-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_16-input.obfl",
		        "resource-files/test_format.xprocspec/test_16-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_17-input.obfl",
		        "resource-files/test_format.xprocspec/test_17-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_18-input.obfl",
		        "resource-files/test_format.xprocspec/test_18-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_22-input.obfl",
		        "resource-files/test_format.xprocspec/test_22-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_23-input.obfl",
		        "resource-files/test_format.xprocspec/test_23-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_24-input.obfl",
		        "resource-files/test_format.xprocspec/test_24-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_27-input.obfl",
		        "resource-files/test_format.xprocspec/test_27-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_28-input.obfl",
		        "resource-files/test_format.xprocspec/test_28-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_29-input.obfl",
		        "resource-files/test_format.xprocspec/test_29-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_30-input.obfl",
		        "resource-files/test_format.xprocspec/test_30-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_31-input.obfl",
		        "resource-files/test_format.xprocspec/test_31-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_39-input.obfl",
		        "resource-files/test_format.xprocspec/test_39-expected.pef", false);
		testPEF("resource-files/test_format.xprocspec/test_40-input.obfl",
		        "resource-files/test_format.xprocspec/test_40-expected.pef", false);
	}
	
	@Ignore
	@Test
	public void testPending() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		// pending in test_obfl-to-pef.xprocspec
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_03-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_03-expected.pef", false);
		// pending in test_obfl-to-pef.xprocspec
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_04-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_04-expected.pef", false);
		// bug in PEFFileCompare (trailing blank patterns in rows should be ignored)
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_05-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_05-expected.pef", false);
		// depends on a custom translator
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_07-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_07-expected.pef", false);
		// pending in test_obfl-to-pef.xprocspec
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_09-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_09-expected.pef", false);
		// depends on translator that breaks lines according to css line breaking rules
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_10-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_10-expected.pef", false);
		// pending in test_obfl-to-pef.xprocspec
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_18-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_18-expected.pef", false);
		// pending in test_format.xprocspec
		testPEF("resource-files/test_format.xprocspec/test_02-input.obfl",
		        "resource-files/test_format.xprocspec/test_02-expected.pef", false);
		// pending in test_format.xprocspec
		testPEF("resource-files/test_format.xprocspec/test_04-input.obfl",
		        "resource-files/test_format.xprocspec/test_04-expected.pef", false);
		// pending in test_format.xprocspec
		testPEF("resource-files/test_format.xprocspec/test_05-input.obfl",
		        "resource-files/test_format.xprocspec/test_05-expected.pef", false);
		// pending in test_format.xprocspec
		testPEF("resource-files/test_format.xprocspec/test_07-input.obfl",
		        "resource-files/test_format.xprocspec/test_07-expected.pef", false);
		// pending in test_format.xprocspec
		testPEF("resource-files/test_format.xprocspec/test_10-input.obfl",
		        "resource-files/test_format.xprocspec/test_10-expected.pef", false);
		// pending in test_format.xprocspec
		testPEF("resource-files/test_format.xprocspec/test_19-input.obfl",
		        "resource-files/test_format.xprocspec/test_19-expected.pef", false);
		// pending in test_format.xprocspec
		testPEF("resource-files/test_format.xprocspec/test_20-input.obfl",
		        "resource-files/test_format.xprocspec/test_20-expected.pef", false);
		// pending in test_format.xprocspec
		testPEF("resource-files/test_format.xprocspec/test_21-input.obfl",
		        "resource-files/test_format.xprocspec/test_21-expected.pef", false);
		// pending in test_format.xprocspec
		testPEF("resource-files/test_format.xprocspec/test_25-input.obfl",
		        "resource-files/test_format.xprocspec/test_25-expected.pef", false);
		// pending in test_format.xprocspec
		testPEF("resource-files/test_format.xprocspec/test_26-input.obfl",
		        "resource-files/test_format.xprocspec/test_26-expected.pef", false);
		// bug in PEFFileCompare (trailing blank patterns in rows should be ignored)
		testPEF("resource-files/test_format.xprocspec/test_32-input.obfl",
		        "resource-files/test_format.xprocspec/test_32-expected.pef", false);
		// bug in PEFFileCompare (trailing blank patterns in rows should be ignored)
		testPEF("resource-files/test_format.xprocspec/test_33-input.obfl",
		        "resource-files/test_format.xprocspec/test_33-expected.pef", false);
		// bug in PEFFileCompare (trailing blank patterns in rows should be ignored)
		testPEF("resource-files/test_format.xprocspec/test_34-input.obfl",
		        "resource-files/test_format.xprocspec/test_34-expected.pef", false);
		// bug in PEFFileCompare (trailing blank patterns in rows should be ignored)
		testPEF("resource-files/test_format.xprocspec/test_35-input.obfl",
		        "resource-files/test_format.xprocspec/test_35-expected.pef", false);
		// bug in PEFFileCompare (trailing blank patterns in rows should be ignored)
		testPEF("resource-files/test_format.xprocspec/test_36-input.obfl",
		        "resource-files/test_format.xprocspec/test_36-expected.pef", false);
		// bug in PEFFileCompare (trailing blank patterns in rows should be ignored)
		testPEF("resource-files/test_format.xprocspec/test_37-input.obfl",
		        "resource-files/test_format.xprocspec/test_37-expected.pef", false);
		// bug in PEFFileCompare (trailing blank patterns in rows should be ignored)
		testPEF("resource-files/test_format.xprocspec/test_38-input.obfl",
		        "resource-files/test_format.xprocspec/test_38-expected.pef", false);
		// bug in PEFFileCompare (trailing blank patterns in rows should be ignored)
		testPEF("resource-files/test_format.xprocspec/test_41-input.obfl",
		        "resource-files/test_format.xprocspec/test_41-expected.pef", false);
		// bug in PEFFileCompare (trailing blank patterns in rows should be ignored)
		testPEF("resource-files/test_format.xprocspec/test_42-input.obfl",
		        "resource-files/test_format.xprocspec/test_42-expected.pef", false);
		// bug in PEFFileCompare (trailing blank patterns in rows should be ignored)
		testPEF("resource-files/test_format.xprocspec/test_43-input.obfl",
		        "resource-files/test_format.xprocspec/test_43-expected.pef", false);
		// bug in PEFFileCompare (trailing blank patterns in rows should be ignored)
		testPEF("resource-files/test_format.xprocspec/test_44-input.obfl",
		        "resource-files/test_format.xprocspec/test_44-expected.pef", false);
		// bug in PEFFileCompare (trailing blank patterns in rows should be ignored)
		testPEF("resource-files/test_format.xprocspec/test_45-input.obfl",
		        "resource-files/test_format.xprocspec/test_45-expected.pef", false);
		// bug in PEFFileCompare (trailing blank patterns in rows should be ignored)
		testPEF("resource-files/test_format.xprocspec/test_46-input.obfl",
		        "resource-files/test_format.xprocspec/test_46-expected.pef", false);
	}
}
