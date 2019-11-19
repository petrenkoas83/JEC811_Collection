package com.ibm;

public class Track {
	private String title;
	private int length;
	public Track( ) {
		// Constructor
	}
	public int getLength( ) {
		return length;
	}
	public void setLength (int length) {
		this.length = length;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
