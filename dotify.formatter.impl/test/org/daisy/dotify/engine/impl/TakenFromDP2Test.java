package org.daisy.dotify.engine.impl;

import java.io.IOException;

import org.daisy.dotify.api.engine.LayoutEngineException;
import org.daisy.dotify.api.writer.PagedMediaWriterConfigurationException;
import org.junit.Ignore;
import org.junit.Test;

public class TakenFromDP2Test extends AbstractFormatterEngineTest {
	
	@Test
	public void testObflToPef_01() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_01-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_01-expected.pef", false);
	}
	@Test
	public void testObflToPef_02() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_02-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_02-expected.pef", false);
	}
	@Ignore // issue with cross-referencing between sequences
	        // (https://github.com/joeha480/dotify/issues/97)
	@Test
	public void testObflToPef_03() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_03-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_03-expected.pef", false);
	}
	@Ignore // issue with leader (https://github.com/joeha480/obfl/issues/31)
	@Test
	public void testObflToPef_04() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_04-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_04-expected.pef", false);
	}
	@Test
	public void testObflToPef_05() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_05-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_05-expected.pef", false);
	}
	@Test
	public void testObflToPef_06() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_06-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_06-expected.pef", false);
	}
	@Ignore // depends on a custom translator
	@Test
	public void testObflToPef_07() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_07-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_07-expected.pef", false);
	}
	@Test
	public void testObflToPef_08() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_08-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_08-expected.pef", false);
	}
	@Test
	public void testObflToPef_09() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_09-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_09-expected.pef", false);
	}
	@Ignore // depends on org.daisy.pipeline.braille.dotify.impl.BrailleFilterFactoryImpl
	        // (breaks lines according to css line breaking rules)
	@Test
	public void testObflToPef_10() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_10-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_10-expected.pef", false);
	}
	@Test
	public void testObflToPef_11() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_11-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_11-expected.pef", false);
	}
	@Test
	public void testObflToPef_12() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_12-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_12-expected.pef", false);
	}
	@Test
	public void testObflToPef_13() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_13-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_13-expected.pef", false);
	}
	@Test
	public void testObflToPef_14() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_14-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_14-expected.pef", false);
	}
	@Test
	public void testObflToPef_15() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_15-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_15-expected.pef", false);
	}
	@Test
	public void testObflToPef_16() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_16-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_16-expected.pef", false);
	}
	@Test
	public void testObflToPef_17() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_17-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_17-expected.pef", false);
	}
	@Test
	public void testObflToPef_18() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_18-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_18-expected.pef", false);
	}
	@Test
	public void testObflToPef_19() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_19-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_19-expected.pef", false);
	}
	@Test
	public void testObflToPef_20() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_20-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_20-expected.pef", false);
	}
	@Test
	public void testObflToPef_21() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_21-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_21-expected.pef", false);
	}
	@Test
	public void testObflToPef_22() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_obfl-to-pef.xprocspec/test_22-input.obfl",
		        "resource-files/test_obfl-to-pef.xprocspec/test_22-expected.pef", false);
	}
	@Test
	public void testFormat_01() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_01-input.obfl",
		        "resource-files/test_format.xprocspec/test_01-expected.pef", false);
	}
	@Ignore // * depends on org.daisy.pipeline.braille.dotify.impl.BrailleFilterFactoryImpl
	        // * position of middle field of header/footer depends on width of
	        //   fields in left and right corner, so centering is not perfect
	        //   (not sure if this is a requirement though)
	@Test
	public void testFormat_02() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_02-input.obfl",
		        "resource-files/test_format.xprocspec/test_02-expected.pef", false);
	}
	@Ignore // depends on org.daisy.pipeline.braille.dotify.impl.BrailleFilterFactoryImpl
	@Test
	public void testFormat_03() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_03-input.obfl",
		        "resource-files/test_format.xprocspec/test_03-expected.pef", false);
	}
	@Ignore // is this a page numbering bug?
	@Test
	public void testFormat_04() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_04-input.obfl",
		        "resource-files/test_format.xprocspec/test_04-expected.pef", false);
	}
	@Test
	public void testFormat_05() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_05-input.obfl",
		        "resource-files/test_format.xprocspec/test_05-expected.pef", false);
	}
	@Ignore // depends on org.daisy.pipeline.braille.dotify.impl.BrailleFilterFactoryImpl
	@Test
	public void testFormat_06() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_06-input.obfl",
		        "resource-files/test_format.xprocspec/test_06-expected.pef", false);
	}
	@Test
	public void testFormat_07() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_07-input.obfl",
		        "resource-files/test_format.xprocspec/test_07-expected.pef", false);
	}
	@Test
	public void testFormat_08() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_08-input.obfl",
		        "resource-files/test_format.xprocspec/test_08-expected.pef", false);
	}
	@Test
	public void testFormat_09() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_09-input.obfl",
		        "resource-files/test_format.xprocspec/test_09-expected.pef", false);
	}
	@Test
	public void testFormat_10() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_10-input.obfl",
		        "resource-files/test_format.xprocspec/test_10-expected.pef", false);
	}
	@Test
	public void testFormat_11() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_11-input.obfl",
		        "resource-files/test_format.xprocspec/test_11-expected.pef", false);
	}
	@Test
	public void testFormat_12() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_12-input.obfl",
		        "resource-files/test_format.xprocspec/test_12-expected.pef", false);
	}
	@Test
	public void testFormat_13() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_13-input.obfl",
		        "resource-files/test_format.xprocspec/test_13-expected.pef", false);
	}
	@Test
	public void testFormat_14() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_14-input.obfl",
		        "resource-files/test_format.xprocspec/test_14-expected.pef", false);
	}
	@Test
	public void testFormat_15() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_15-input.obfl",
		        "resource-files/test_format.xprocspec/test_15-expected.pef", false);
	}
	@Test
	public void testFormat_16() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_16-input.obfl",
		        "resource-files/test_format.xprocspec/test_16-expected.pef", false);
	}
	@Test
	public void testFormat_17() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_17-input.obfl",
		        "resource-files/test_format.xprocspec/test_17-expected.pef", false);
	}
	@Test
	public void testFormat_18() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_18-input.obfl",
		        "resource-files/test_format.xprocspec/test_18-expected.pef", false);
	}
	@Ignore // leader issue
	@Test
	public void testFormat_19() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_19-input.obfl",
		        "resource-files/test_format.xprocspec/test_19-expected.pef", false);
	}
	@Ignore // leader issue
	@Test
	public void testFormat_20() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_20-input.obfl",
		        "resource-files/test_format.xprocspec/test_20-expected.pef", false);
	}
	@Ignore // reference (<page-number ref-id="foo">) to inline element (<span id="foo">)
	        // not sure whether this is a bug?
	@Test
	public void testFormat_21() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_21-input.obfl",
		        "resource-files/test_format.xprocspec/test_21-expected.pef", false);
	}
	@Test
	public void testFormat_22() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_22-input.obfl",
		        "resource-files/test_format.xprocspec/test_22-expected.pef", false);
	}
	@Test
	public void testFormat_23() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_23-input.obfl",
		        "resource-files/test_format.xprocspec/test_23-expected.pef", false);
	}
	@Test
	public void testFormat_24() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_24-input.obfl",
		        "resource-files/test_format.xprocspec/test_24-expected.pef", false);
	}
	@Test
	public void testFormat_25() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_25-input.obfl",
		        "resource-files/test_format.xprocspec/test_25-expected.pef", false);
	}
	@Test
	public void testFormat_26() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_26-input.obfl",
		        "resource-files/test_format.xprocspec/test_26-expected.pef", false);
	}
	@Test
	public void testFormat_27() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_27-input.obfl",
		        "resource-files/test_format.xprocspec/test_27-expected.pef", false);
	}
	@Test
	public void testFormat_28() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_28-input.obfl",
		        "resource-files/test_format.xprocspec/test_28-expected.pef", false);
	}
	@Test
	public void testFormat_29() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_29-input.obfl",
		        "resource-files/test_format.xprocspec/test_29-expected.pef", false);
	}
	@Test
	public void testFormat_30() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_30-input.obfl",
		        "resource-files/test_format.xprocspec/test_30-expected.pef", false);
	}
	@Test
	public void testFormat_31() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_31-input.obfl",
		        "resource-files/test_format.xprocspec/test_31-expected.pef", false);
	}
	@Test
	public void testFormat_32() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_32-input.obfl",
		        "resource-files/test_format.xprocspec/test_32-expected.pef", false);
	}
	@Test
	public void testFormat_33() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_33-input.obfl",
		        "resource-files/test_format.xprocspec/test_33-expected.pef", false);
	}
	@Test
	public void testFormat_34() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_34-input.obfl",
		        "resource-files/test_format.xprocspec/test_34-expected.pef", false);
	}
	@Test
	public void testFormat_35() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_35-input.obfl",
		        "resource-files/test_format.xprocspec/test_35-expected.pef", false);
	}
	@Test
	public void testFormat_36() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_36-input.obfl",
		        "resource-files/test_format.xprocspec/test_36-expected.pef", false);
	}
	@Test
	public void testFormat_37() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_37-input.obfl",
		        "resource-files/test_format.xprocspec/test_37-expected.pef", false);
	}
	@Test
	public void testFormat_38() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_38-input.obfl",
		        "resource-files/test_format.xprocspec/test_38-expected.pef", false);
	}
	@Test
	public void testFormat_39() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_39-input.obfl",
		        "resource-files/test_format.xprocspec/test_39-expected.pef", false);
	}
	@Test
	public void testFormat_40() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_40-input.obfl",
		        "resource-files/test_format.xprocspec/test_40-expected.pef", false);
	}
	@Test
	public void testFormat_41() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_41-input.obfl",
		        "resource-files/test_format.xprocspec/test_41-expected.pef", false);
	}
	@Test
	public void testFormat_42() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_42-input.obfl",
		        "resource-files/test_format.xprocspec/test_42-expected.pef", false);
	}
	@Test
	public void testFormat_43() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_43-input.obfl",
		        "resource-files/test_format.xprocspec/test_43-expected.pef", false);
	}
	@Test
	public void testFormat_44() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_44-input.obfl",
		        "resource-files/test_format.xprocspec/test_44-expected.pef", false);
	}
	@Test
	public void testFormat_45() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_45-input.obfl",
		        "resource-files/test_format.xprocspec/test_45-expected.pef", false);
	}
	@Test
	public void testFormat_46() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_46-input.obfl",
		        "resource-files/test_format.xprocspec/test_46-expected.pef", false);
	}
	@Ignore // depends on org.daisy.pipeline.braille.dotify.impl.BrailleFilterFactoryImpl
	@Test
	public void testFormat_47() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_47-input.obfl",
		        "resource-files/test_format.xprocspec/test_47-expected.pef", false);
	}
	@Test
	public void testFormat_48() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_48-input.obfl",
		        "resource-files/test_format.xprocspec/test_48-expected.pef", false);
	}
	@Test
	public void testFormat_49() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_49-input.obfl",
		        "resource-files/test_format.xprocspec/test_49-expected.pef", false);
	}
	@Ignore // implementation does not support different target volume size
	@Test
	public void testFormat_50() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/test_format.xprocspec/test_50-input.obfl",
		        "resource-files/test_format.xprocspec/test_50-expected.pef", false);
	}
}
