package org.daisy.dotify.engine.impl;

import java.io.IOException;

import org.daisy.dotify.api.engine.LayoutEngineException;
import org.daisy.dotify.api.writer.PagedMediaWriterConfigurationException;
import org.junit.Ignore;
import org.junit.Test;

public class TableTest extends AbstractFormatterEngineTest {
	
	@Ignore // not implemented yet
	@Test
	public void testSimpleTable() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/simple-table-input.obfl",
		        "resource-files/dp2/simple-table-expected.pef", false);
	}
	@Ignore // not implemented yet
	@Test
	public void testTableColSpacing() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/table-col-spacing-input.obfl",
		        "resource-files/dp2/table-col-spacing-expected.pef", false);
	}
	@Ignore // not implemented yet
	@Test
	public void testTableHeaderUnderline() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/table-header-underline-input.obfl",
		        "resource-files/dp2/table-header-underline-expected.pef", false);
	}
	@Ignore // not implemented yet
	@Test
	public void testTableFixedWidth() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/table-fixed-width-input.obfl",
		        "resource-files/dp2/table-fixed-width-expected.pef", false);
	}
	@Ignore // not implemented yet
	@Test
	public void testTableAutoColumnWidth() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/table-auto-column-width-input.obfl",
		        "resource-files/dp2/table-auto-column-width-expected.pef", false);
	}
	@Ignore // not implemented yet
	@Test
	public void testTableAutoColumnWidthCellWrapping() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/table-auto-column-width-cell-wrapping-input.obfl",
		        "resource-files/dp2/table-auto-column-width-cell-wrapping-expected.pef", false);
	}
	@Ignore // not implemented yet
	@Test
	public void testTableHeaderRepeat() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/table-header-repeat-input.obfl",
		        "resource-files/dp2/table-header-repeat-expected.pef", false);
	}
	@Ignore // not implemented yet
	@Test
	public void testTableLeaders() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/table-leaders-input.obfl",
		        "resource-files/dp2/table-leaders-expected.pef", false);
	}
	@Ignore // not implemented yet
	@Test
	public void testTableColspan() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/table-colspan-input.obfl",
		        "resource-files/dp2/table-colspan-expected.pef", false);
	}
	@Ignore // not implemented yet
	@Test
	public void testTableColspanFill() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/table-colspan-fill-input.obfl",
		        "resource-files/dp2/table-colspan-fill-expected.pef", false);
	}
}
