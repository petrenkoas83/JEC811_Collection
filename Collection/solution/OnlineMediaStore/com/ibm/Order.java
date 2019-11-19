package com.ibm;

import java.util.ArrayList;

public class Order {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>(3);
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void addMedia(Media mediaItem) {
		// ensure that the Media item is not already
		// in the ArrayList before adding
		if (!(itemsOrdered.contains(mediaItem))) {
			itemsOrdered.add(mediaItem);
		}
	}

	public void removeMedia(Media mediaItem) {
		// ensure that the Media item is present
		// in the ArrayList before removing
		if (itemsOrdered.contains(mediaItem)) {
			itemsOrdered.remove(mediaItem);
		}
	}
	public float totalCost() {
		// store the running total of the items in the
		// order
		float total = 0;
		for (Media media : itemsOrdered) {
		   total += media.getCost();
		}
		return total;
	}
}
