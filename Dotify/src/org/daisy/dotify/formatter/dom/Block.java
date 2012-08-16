package org.daisy.dotify.formatter.dom;

import org.daisy.dotify.formatter.dom.FormattingTypes.BreakBefore;
import org.daisy.dotify.formatter.dom.FormattingTypes.Keep;
/**
 * Provides a block of rows and the properties
 * associated with it.
 * @author Joel Håkansson
 */
public interface Block {

	/**
	 * Gets the number of empty rows that should precede the 
	 * rows in this block.
	 * @return returns the number of empty rows preceding the rows in this block
	 */
	public int getSpaceBefore();
	public int getSpaceAfter();
	public int getKeepWithNext();
	public String getIdentifier();
	public Keep getKeepType();
	public BreakBefore getBreakBeforeType();
	public RowDataManager getRowDataManager();
	public String getBlockIdentifier();
	
}