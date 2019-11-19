package com.ibm;

import java.util.ArrayList;

public class CompactDisc extends Media {
	private String artist;
	private int length;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public ArrayList<Track> getTracks() {
		return tracks;
	}
	public void setTracks(ArrayList<Track> tracks) {
		this.tracks = tracks;
	}
	public int getLength() {
		int total = 0;
		for (Track track : tracks) {
		   total += track.getLength();
		}
		return total;
	}
}
