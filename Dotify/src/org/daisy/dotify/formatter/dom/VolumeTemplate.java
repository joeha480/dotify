package org.daisy.dotify.formatter.dom;

public interface VolumeTemplate {

	/**
	 * Test if this Template applies to this combination of volume and volume count.
	 * @param volume the volume to test
	 * @return returns true if the Template should be applied to the volume
	 */
	public boolean appliesTo(int volume, int volumeCount);
	
	public Iterable<VolumeSequenceEvent> getPreVolumeContent();
	
	public Iterable<VolumeSequenceEvent> getPostVolumeContent();
	
	public String getVolumeNumberVariableName();
	public String getVolumeCountVariableName();
}