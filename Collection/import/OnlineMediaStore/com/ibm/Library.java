package com.ibm;

import java.util.ArrayList;

public class Library<T> {
	private T mediaType;
	private ArrayList<T> variable = new ArrayList<T>();
	
	public T getMediaType() {
		return mediaType;
	}

	public void setMediaType(T mediaType) {
		this.mediaType = mediaType;
	}
	
	public ArrayList<T> getVariable() {
		return variable;
	}

	public Library() {
		// TODO Auto-generated constructor stub
	}

	public void addMedia(T v) {
		if (!(variable.contains(v))) {
			variable.add(v);
		}
	}
	public void removeMedia(T v) {
		if (variable.contains(v)) {
			variable.remove(v);
		}
	}
}
