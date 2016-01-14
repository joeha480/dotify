package org.daisy.dotify.engine.impl;

import java.io.IOException;

import org.daisy.dotify.api.engine.LayoutEngineException;
import org.daisy.dotify.api.writer.PagedMediaWriterConfigurationException;
import org.junit.Ignore;
import org.junit.Test;

public class TakenFromDP2Test extends AbstractFormatterEngineTest {
	
	@Test
	public void testPageNumber() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/page-number-input.obfl",
		        "resource-files/dp2/page-number-expected.pef", false);
	}
	@Ignore // issue with cross-referencing between sequences
	        // (https://github.com/joeha480/dotify/issues/97)
	@Test
	public void testPageNumberReferenceOtherSequence() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/page-number-reference-other-sequence-input.obfl",
		        "resource-files/dp2/page-number-reference-other-sequence-expected.pef", false);
	}
	@Ignore // issue with leader (https://github.com/joeha480/obfl/issues/31)
	@Test
	public void testPageNumberFollowsLeader() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/page-number-follows-leader-input.obfl",
		        "resource-files/dp2/page-number-follows-leader-expected.pef", false);
	}
	@Test
	public void testNestedBlocksWithBorders() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/nested-blocks-with-borders-input.obfl",
		        "resource-files/dp2/nested-blocks-with-borders-expected.pef", false);
	}
	@Test
	public void testBorderAlignCenter() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/border-align-center-input.obfl",
		        "resource-files/dp2/border-align-center-expected.pef", false);
	}
	@Test
	public void testVerticalPositionAlignBefore() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/vertical-position-align-before-input.obfl",
		        "resource-files/dp2/vertical-position-align-before-expected.pef", false);
	}
	@Test
	public void testVerticalPositionAlignBeforeNestedBlocks() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/vertical-position-align-before-nested-blocks-input.obfl",
		        "resource-files/dp2/vertical-position-align-before-nested-blocks-expected.pef", false);
	}
	@Test
	public void testLayoutMasterRowSpacing() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/layout-master-row-spacing-input.obfl",
		        "resource-files/dp2/layout-master-row-spacing-expected.pef", false);
	}
	@Test
	public void testBlockRowSpacing() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/block-row-spacing-input.obfl",
		        "resource-files/dp2/block-row-spacing-expected.pef", false);
	}
	@Test
	public void testRowSpacingAndMargins() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/row-spacing-and-margins-input.obfl",
		        "resource-files/dp2/row-spacing-and-margins-expected.pef", false);
	}
	@Test
	public void testRowSpacingAndCollapsingMargins() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/row-spacing-and-collapsing-margins-input.obfl",
		        "resource-files/dp2/row-spacing-and-collapsing-margins-expected.pef", false);
	}
	@Test
	public void testHeaderRowSpacing() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/header-row-spacing-input.obfl",
		        "resource-files/dp2/header-row-spacing-expected.pef", false);
	}
	@Test
	public void testKeepAll() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/keep-all-input.obfl",
		        "resource-files/dp2/keep-all-expected.pef", false);
	}
	@Test
	public void testKeepWithNext() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/keep-with-next-input.obfl",
		        "resource-files/dp2/keep-with-next-expected.pef", false);
	}
	@Test
	public void testKeepSeveralBlocks() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/keep-several-blocks-input.obfl",
		        "resource-files/dp2/keep-several-blocks-expected.pef", false);
	}
	@Test
	public void testKeepWithFollowingSiblingOfParent() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/keep-with-following-sibling-of-parent-input.obfl",
		        "resource-files/dp2/keep-with-following-sibling-of-parent-expected.pef", false);
	}
	@Test
	public void testPreAndPostContent() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/pre-and-post-content-input.obfl",
		        "resource-files/dp2/pre-and-post-content-expected.pef", false);
	}
	@Test
	public void testPreContentUseWhen() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/pre-content-use-when-input.obfl",
		        "resource-files/dp2/pre-content-use-when-expected.pef", false);
	}
	@Test
	public void testKeepContentWithBorder() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/keep-content-with-border-input.obfl",
		        "resource-files/dp2/keep-content-with-border-expected.pef", false);
	}
	@Test
	public void testOrphansWidowsCountingAndBorders() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/orphans-widows-counting-and-borders-input.obfl",
		        "resource-files/dp2/orphans-widows-counting-and-borders-expected.pef", false);
	}
	@Test
	public void testPageBreakingAndBorders() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/page-breaking-and-borders-input.obfl",
		        "resource-files/dp2/page-breaking-and-borders-expected.pef", false);
	}
	@Ignore // regression in dotify 2.0.0-SNAPSHOT?
	@Test
	public void testMarkerReferencePageContentForward() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/marker-reference-page-content-forward-input.obfl",
		        "resource-files/dp2/marker-reference-page-content-forward-expected.pef", false);
	}
	@Test
	public void testVariousPageWidths() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/various-page-widths-input.obfl",
		        "resource-files/dp2/various-page-widths-expected.pef", false);
	}
	@Ignore // is this a page numbering bug?
	@Test
	public void testCurrentPageVariousPositions() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/current-page-various-positions-input.obfl",
		        "resource-files/dp2/current-page-various-positions-expected.pef", false);
	}
	@Test
	public void testCurrentPageVariousNumberFormats() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/current-page-various-number-formats-input.obfl",
		        "resource-files/dp2/current-page-various-number-formats-expected.pef", false);
	}
	@Ignore // leader issue
	@Test
	public void testPageNumberBackwardReference() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/page-number-backward-reference-input.obfl",
		        "resource-files/dp2/page-number-backward-reference-expected.pef", false);
	}
	@Ignore // reference (<page-number ref-id="foo">) to inline element (<span id="foo">)
	        // not sure whether this is a bug?
	@Test
	public void testPageNumberReferenceSpan() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/page-number-reference-span-input.obfl",
		        "resource-files/dp2/page-number-reference-span-expected.pef", false);
	}
	@Test
	public void testPreHyphenation() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/pre-hyphenation-input.obfl",
		        "resource-files/dp2/pre-hyphenation-expected.pef", false);
	}
	@Test
	public void testCollapsingMarginsAdjacentBlocks() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/collapsing-margins-adjacent-blocks-input.obfl",
		        "resource-files/dp2/collapsing-margins-adjacent-blocks-expected.pef", false);
	}
	@Test
	public void testCollapsingMarginsEmptyBlock() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/collapsing-margins-empty-block-input.obfl",
		        "resource-files/dp2/collapsing-margins-empty-block-expected.pef", false);
	}
	@Test
	public void testRowSpacingNestedBlocks() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/row-spacing-nested-blocks-input.obfl",
		        "resource-files/dp2/row-spacing-nested-blocks-expected.pef", false);
	}
	@Test
	public void testSingleLineHeaderEmpty() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/single-line-header-empty-input.obfl",
		        "resource-files/dp2/single-line-header-empty-expected.pef", false);
	}
	@Test
	public void testMultiLineHeaderEmpty() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/multi-line-header-empty-input.obfl",
		        "resource-files/dp2/multi-line-header-empty-expected.pef", false);
	}
	@Test
	public void testSingleLineHeader() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/single-line-header-input.obfl",
		        "resource-files/dp2/single-line-header-expected.pef", false);
	}
	@Test
	public void testMultiLineHeaderPartlyEmpty() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/multi-line-header-partly-empty-input.obfl",
		        "resource-files/dp2/multi-line-header-partly-empty-expected.pef", false);
	}
	@Test
	public void testHeaderVaryHeightLeftRightPages() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/header-vary-height-left-right-pages-input.obfl",
		        "resource-files/dp2/header-vary-height-left-right-pages-expected.pef", false);
	}
	@Test
	public void testEmptyBlock() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/empty-block-input.obfl",
		        "resource-files/dp2/empty-block-expected.pef", false);
	}
	@Test
	public void testEmptyBlockBorder() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/empty-block-border-input.obfl",
		        "resource-files/dp2/empty-block-border-expected.pef", false);
	}
	@Test
	public void testSingleLineFooterEmpty() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/single-line-footer-empty-input.obfl",
		        "resource-files/dp2/single-line-footer-empty-expected.pef", false);
	}
	@Test
	public void testMultiLineFooterEmpty() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/multi-line-footer-empty-input.obfl",
		        "resource-files/dp2/multi-line-footer-empty-expected.pef", false);
	}
	@Test
	public void testSingleLineFooter() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/single-line-footer-input.obfl",
		        "resource-files/dp2/single-line-footer-expected.pef", false);
	}
	@Test
	public void testMultiLineFooterPartlyEmpty() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/multi-line-footer-partly-empty-input.obfl",
		        "resource-files/dp2/multi-line-footer-partly-empty-expected.pef", false);
	}
	@Test
	public void testMultiLineFooter() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/multi-line-footer-input.obfl",
		        "resource-files/dp2/multi-line-footer-expected.pef", false);
	}
	@Test
	public void testPreContent() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/pre-content-input.obfl",
		        "resource-files/dp2/pre-content-expected.pef", false);
	}
	@Test
	public void testSheetsInVolumeMax() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/sheets-in-volume-max-input.obfl",
		        "resource-files/dp2/sheets-in-volume-max-expected.pef", false);
	}
	@Ignore // implementation does not support different target volume size
	@Test
	public void testVolumeTemplateVariousSheetsInVolumeMax() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/dp2/volume-template-various-sheets-in-volume-max-input.obfl",
		        "resource-files/dp2/volume-template-various-sheets-in-volume-max-expected.pef", false);
	}
}
