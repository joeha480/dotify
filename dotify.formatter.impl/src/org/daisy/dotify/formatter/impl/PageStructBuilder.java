package org.daisy.dotify.formatter.impl;

import java.util.HashMap;
import java.util.List;

class PageStructBuilder extends PageStruct {
	private final static char ZERO_WIDTH_SPACE = '\u200b';
	
	private final FormatterContext context;
	//private final StringFilter filters;
	HashMap<String, PageImpl> pageReferences;
	
	public PageStructBuilder(FormatterContext context) {
		//this.filters = filters;
		this.pageReferences = new HashMap<String, PageImpl>();
		this.context = context;
	}
	
	/*public StringFilter getFilter() {
		return filters;
	}*/

	private static final long serialVersionUID = 2591429059130956153L;

	public PageImpl getPage(String refid) {
		return pageReferences.get(refid);
	}
	
	PageSequenceBuilder newSequence(LayoutMaster master, int pagesOffset,  List<RowImpl> before, List<RowImpl> after) {
		PageSequenceBuilder ret = new PageSequenceBuilder(master, pagesOffset, this.pageReferences, before, after, context);
		this.push(ret);
		return ret;
	}
	
	PageSequenceBuilder newSequence(LayoutMaster master, List<RowImpl> before, List<RowImpl> after) {
		if (this.size()==0) {
			return newSequence(master, 0, before, after);
		} else {
			int next = currentSequence().currentPage().getPageIndex()+1;
			if (currentSequence().getLayoutMaster().duplex() && (next % 2)==1) {
				next++;
			}
			return newSequence(master, next, before, after);
		}
	}
	
	private PageSequenceBuilder currentSequence() {
		return (PageSequenceBuilder)this.peek();
	}
	
	PageImpl getPage(int i) {
		for (PageSequence ps : this) {
			if (i < ps.getPageCount()) {
				return ps.getPage(i);
			} else {
				i -= ps.getPageCount();
			}
		}
		throw new IndexOutOfBoundsException(i + " is out of bounds." );
	}
	
	/**
	 * Builds a string with possible breakpoints for the contents of this page struct.
	 * Each sheet is represented by a lower case 's' and breakpoints are represented
	 * by zero width space (0x200b).
	 * @return returns a string with allowed breakpoints
	 */
	String buildBreakpointString() {
		StringBuilder res = new StringBuilder();
		boolean volBreakAllowed = true;
		for (PageSequence seq : this) {
			StringBuilder sb = new StringBuilder();
			LayoutMaster lm = seq.getLayoutMaster();
			int pageIndex=0;
			for (PageImpl p : seq.getPages()) {
				if (!lm.duplex() || pageIndex%2==0) {
					volBreakAllowed = true;
					sb.append("s");
				}
				volBreakAllowed &= p.allowsVolumeBreak();
				trimEnd(sb, p);
				if (!lm.duplex() || pageIndex%2==1) {
					if (volBreakAllowed) {
						sb.append(ZERO_WIDTH_SPACE);
					}
				}
				pageIndex++;
			}
			res.append(sb);
			res.append(ZERO_WIDTH_SPACE);
		}
		return res.toString();
	}
	
	private void trimEnd(StringBuilder sb, PageImpl p) {
		int i = 0;
		int x = sb.length()-1;
		while (i<p.keepPreviousSheets() && x>0) {
			if (sb.charAt(x)=='s') {
				x--;
				i++;
			}
			if (sb.charAt(x)==ZERO_WIDTH_SPACE) {
				sb.deleteCharAt(x);
				x--;
			}
		}
	}
	
	/**
	 * Makes a new sub structure starting from the pageIndex with the specified
	 * number of sheets
	 * @param pageIndex the starting page index
	 * @param contentSheets the number of sheets
	 * @return
	 */
	PageStruct substruct(int pageIndex, int contentSheets) {
		PageStruct body = new PageStruct();
		PageSequence originalSeq = null;
		int sheets = 0;
		int pagesInSeq = 0;
		PageImpl p;
		int offs = 0;
		int i;
		process:for (PageSequence ps : this) {
			while (pageIndex-offs < ps.getPageCount()) {
				p = ps.getPage(pageIndex-offs);
				if (pageIndex<countPages()) {

					//new sheet needed for this page?
					if (originalSeq != ps || !ps.getLayoutMaster().duplex() || pagesInSeq % 2 == 0) {
						i = 1;
					} else {
						i = 0;
					}
					if (sheets + i<=contentSheets) {
						if (body.empty() || originalSeq != ps) {
							originalSeq = ps;
							body.add(new PageSequence(originalSeq.getLayoutMaster())); //, originalSeq.getPageNumberOffset(), originalSeq.getFormatterFactory()));
							pagesInSeq = 0;
						}
						((PageSequence)body.peek()).addPage(p);
						pagesInSeq++;
						if (!ps.getLayoutMaster().duplex() || pagesInSeq % 2 == 1) {
							sheets++;
						}
						pageIndex++;
					} else {
						//we have what we need
						break process;
					}
				} else {
					//no more content
					break process;
				}
			}
			offs += ps.getPageCount();
		}
		return body;
	}

}