package com.baa.boost028.Serializable;

import java.io.Serializable;
import java.time.LocalDate;

public class Land extends Realty implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Land(String name, Address adr, Dimension dim, LocalDate listingDate) {
		super(name, adr, dim, listingDate);
		
	}
	
	public Land(String name, Address adr, Dimension dim, LocalDate listingDate, double price) {
		super(name, adr, dim, listingDate);
		this.setPrice(price);
		
	}
	
}
