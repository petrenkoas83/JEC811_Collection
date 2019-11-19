package com.ibm;

import java.util.Properties;

public class DataFromProperties {

	public DataFromProperties() {
		super();
		// TODO Auto-generated constructor stub
	}
    public DigitalVideoDisc addADvd(Properties properties, int dvdIndex) {
		// set up the keys to read from the properties file
		String titleKey = new StringBuffer().append("dvd").append(dvdIndex).append(".title").toString();
		System.out.print(titleKey + " = ");
		String categoryKey = new StringBuffer().append("dvd").append(dvdIndex).append(".category").toString();
		String costKey = new StringBuffer().append("dvd").append(dvdIndex).append(".cost").toString();
		String directorKey = new StringBuffer().append("dvd").append(dvdIndex).append(".director").toString();
		String lengthKey = new StringBuffer().append("dvd").append(dvdIndex).append(".length").toString();		
		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd = new DigitalVideoDisc();
		dvd.setTitle(properties.getProperty(titleKey));
		System.out.println(dvd.getTitle());
		dvd.setCategory(properties.getProperty(categoryKey));
		dvd.setCost(Float.parseFloat(properties.getProperty(costKey)));
		dvd.setDirector(properties.getProperty(directorKey));
		dvd.setLength(Integer.parseInt(properties.getProperty(lengthKey)));
		return dvd;
	}
    public CompactDisc addACd(Properties properties, int numberOfItems) {
		// set up the keys to read from the properties file
		String titleKey = new StringBuffer().append("cd").append(numberOfItems).append(".title").toString();
		System.out.print(titleKey + " = ");
		String categoryKey = new StringBuffer().append("cd").append(numberOfItems).append(".category").toString();
		String costKey = new StringBuffer().append("cd").append(numberOfItems).append(".cost").toString();
		String artistKey = new StringBuffer().append("cd").append(numberOfItems).append(".artist").toString();		
		// Create a new dvd object and set the fields
		CompactDisc cd = new CompactDisc();
		cd.setTitle(properties.getProperty(titleKey));
		System.out.println(cd.getTitle());
		cd.setCategory(properties.getProperty(categoryKey));
		cd.setCost(Float.parseFloat(properties.getProperty(costKey)));
		cd.setArtist(properties.getProperty(artistKey));
		System.out.print("Cost of CD = ");
		System.out.println(cd.getCost());
		return cd;
	}
    public Track addATrack(Properties properties, int trackNumber) {
    	String titleKey = new StringBuffer().append("t").append(trackNumber).append(".title").toString();
    	System.out.print(titleKey + " = ");
    	String lengthKey = new StringBuffer().append("t").append(trackNumber).append(".length").toString();
    	Track t = new Track();
    	t.setTitle(properties.getProperty(titleKey));
    	System.out.println(t.getTitle());
    	t.setLength(Integer.parseInt(properties.getProperty(lengthKey)));
    	return t;
    }
}
