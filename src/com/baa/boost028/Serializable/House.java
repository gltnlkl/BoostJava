package com.baa.boost028.Serializable;

import java.io.Serializable;
import java.time.LocalDate;

public class House extends Realty implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numOfRooms;
	private int levelNumber;
	
	public House(String name, Address adr, Dimension dim, LocalDate listingDate) {
		super(name, adr, dim, listingDate);
		
	}
	
	public int getNumOfRooms() {
		return numOfRooms;
	}
	
	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}
	
	public int getLevelNumber() {
		return levelNumber;
	}
	
	public void setLevelNumber(int levelNumber) {
		this.levelNumber = levelNumber;
	}
	
	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		super.setPrice(price);
	}
	
}
