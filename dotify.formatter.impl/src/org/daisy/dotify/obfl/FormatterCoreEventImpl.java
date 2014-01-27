package org.daisy.dotify.obfl;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.daisy.dotify.api.formatter.BlockProperties;
import org.daisy.dotify.api.formatter.FormatterCore;
import org.daisy.dotify.api.formatter.Leader;
import org.daisy.dotify.api.formatter.Marker;
import org.daisy.dotify.api.formatter.NumeralStyle;
import org.daisy.dotify.api.formatter.TextProperties;

/**
 * Formatter to DOM bridge.
 * @author Joel Håkansson
 *
 */
public class FormatterCoreEventImpl implements FormatterCore {
	private List<BlockEvent> result;
	private List<BlockEventImpl> blockStack;
	private BlockEventImpl cb;

	public FormatterCoreEventImpl() {
		result = new ArrayList<BlockEvent>();
		blockStack = new ArrayList<BlockEventImpl>();
		cb = null;
	}

	public void startBlock(BlockProperties props) {
		startBlock(props, null);
	}

	public void startBlock(BlockProperties props, String blockId) {
		BlockEventImpl ret = new BlockEventImpl(props, blockId);
		if (cb==null) {
			result.add(ret);
		} else {
			cb.add(ret);
		}
		blockStack.add(ret);
		updateCurrentBlock();
	}

	public void endBlock() {
		blockStack.remove(blockStack.size()-1);
		updateCurrentBlock();
	}

	private void updateCurrentBlock() {
		if (blockStack.size()>0) {
			cb =  blockStack.get(blockStack.size()-1);
		} else {
			cb = null;
		}
	}

	public void startFloat(String id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented");
	}

	public void endFloat() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented");
	}

	public void insertMarker(Marker marker) {
		cb.add(new MarkerEventContents(marker.getName(), marker.getValue()));
	}

	public void insertAnchor(String ref) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not implemented");
	}

	public void insertLeader(Leader leader) {
		cb.add(new LeaderEventContents(leader));
	}

	public void insertReference(String identifier, NumeralStyle numeralStyle) {
		cb.add(new PageNumberReferenceEventContents(identifier, numeralStyle));
	}

	public void addChars(CharSequence chars, TextProperties props) {
		cb.add(new TextContents(chars.toString(), props));
		
	}

	public void newLine() {
		cb.add(new LineBreak());
	}
	
	void printContents(PrintWriter ps) {
		for (BlockEvent b : result) {
			ps.println(b.getContentType());
			printContents(ps, b, 1);
		}
	}
	
	private void printContents(PrintWriter ps, IterableEventContents ev, int i) {
		StringBuilder ind = new StringBuilder();
		for (int j=0; j<i; j++) ind.append(" ");
		String ind2 = ind.toString();
		for (EventContents bc : ev) {
			switch (bc.getContentType()) {
			case BLOCK:
				ps.println(ind2 + ev.getContentType());
				printContents(ps, (BlockContents)bc, i+2);
				break;
			case PCDATA:
				ps.println(ind2 + ((TextContents)bc).getText());
				break;
			default:
				ps.println(ind2+bc.getContentType());
			} 
			
		}
	}

}