package com.ibm;

public class NVPair<T> implements Comparable<T> {
	private String name;
	private T value;
	
	public NVPair(String name, T value) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public int compareTo(T value) {
		return name.compareTo(value.toString());
	}
	
}
