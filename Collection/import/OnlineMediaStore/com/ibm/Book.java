package com.ibm;

public class Book extends Media {
	private java.util.ArrayList<String> authors = new                  
		java.util.ArrayList<String>();
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void addAuthor(String authorName) {
		// ensure that the author is not already in
		// the ArrayList before adding
		if (!(authors.contains(authorName))) {
			authors.add(authorName);
		}
	}

	public void removeAuthor(String authorName) {
		// ensure that the author is present in the
		// ArrayList before removing
		if ((authors.contains(authorName))) {
			authors.remove(authorName);
		}
	}
}
