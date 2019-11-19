package com.ibm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class OnlineMedia {

	public OnlineMedia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException {
		Properties prop = new Properties();
		FileInputStream fis = 
	      	new FileInputStream("media.properties");
	    	try {
	    		prop.load(fis);
	   	 } catch(IOException e) {
		}
		// Create a new object for getting property data
		DataFromProperties data = new DataFromProperties();
		
		// Create a new Order object
		Order anOrder = new Order();
		
		// add a number of dvds to the order
		int dvdsToBeAdded = 3;
		for (int dvdNumber=1; dvdNumber <= dvdsToBeAdded; dvdNumber++){
			// get the dvd data from the properties file
			DigitalVideoDisc dvd = data.addADvd(prop, dvdNumber);
			// add the dvd to the order
			anOrder.addMedia(dvd);
		}	
		// add a book to the order
		   Book book = new Book();
		   book.setTitle("Java Programming");
		   book.setCategory("Java");
		   book.setCost(69.99f);
		   book.addAuthor("Joe Wiggleworth");
		   book.addAuthor("Paula McMillan");
		   System.out.println("Book title = " + book.getTitle());
		   anOrder.addMedia(book);

		   int cdNumber = 1;
		   int tracksToBeAdded = 3;
		   CompactDisc cd = data.addACd(prop, cdNumber);
		   Library<Track> mt = new Library<Track>();
		   Track track = mt.getMediaType();
		   for (int i=1; i <= tracksToBeAdded; i++) {
			   //Track
			   track = data.addATrack(prop, i);
			   //cd.addTrack(track);
			   mt.addMedia(track);
		   }
		   cd.setTracks(mt.getVariable());
		   anOrder.addMedia(cd);
		   System.out.print("The total length of the CD is ");
		   System.out.println(cd.getLength());
		   
		System.out.print("Total Cost of the Order is: ");
		System.out.println(anOrder.totalCost());
	}
}
