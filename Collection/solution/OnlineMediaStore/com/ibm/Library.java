package com.ibm;

import java.util.ArrayList;

public class Library<T> {
//	 Naming type parameter: T = a generic type	
	private T mediaType;
	private ArrayList<T> variable = new ArrayList<T>();
	public Library() {
		// TODO Auto-generated constructor stub
	}
	public T getMediaType() {
		return mediaType;
	}
	public void setMediaType(T mediaType) {
		this.mediaType = mediaType;
	}
	public ArrayList<T> getVariable() {
		return variable;
	}
	public void addMedia(T v) {
		// ensure that the element is not already in the
		// ArrayList before adding
		if (!(variable.contains(v))) {
			variable.add(v);
		}
	}
	public void removeMedia(T v) {
		// ensure that the element is present in the
		// ArrayList before removing
		if ((variable.contains(v))) {
			variable.remove(v);
		}
	}
}
