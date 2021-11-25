package com.baa.boost030.Composition.AvmExample;

import java.time.LocalDate;

import com.baa.boost030.Composition.Dimension;
import com.baa.boost030.Composition.AvmExample.Avm.Area;

public class Restaurant extends Common implements Area {
	private Location location;
	private Dimension dimension;
	private String typeOfKitchen;
	
	@Override
	public double area(double length, double width) {
		double area = length * width;
		return area;
	}
	
	public Restaurant() {
		this.location = null;
		this.dimension = null;
		this.typeOfKitchen = null;
	}
	
	public Restaurant(String storeName, String storeProductType, double price, LocalDate logDate, int commonId,
			Location location, Dimension dimension, String typeOfKitchen) {
		super(storeName, storeProductType, price, logDate, commonId);
		this.location = location;
		this.dimension = dimension;
		this.typeOfKitchen = typeOfKitchen;
	}
	
	@Override
	public String toString() {
		return "Restaurant [location=" + location + ", dimension=" + dimension + ", typeOfKitchen=" + typeOfKitchen
				+ ", getStoreName()=" + getStoreName() + ", getStoreProductType()=" + getStoreProductType()
				+ ", getPrice()=" + getPrice() + ", getLogDate()=" + getLogDate() + ", getcommonId()=" + getCommonId()
				+ area(dimension.length, dimension.width) + "]";
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Dimension getDimension() {
		return dimension;
	}
	
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	public String getTypeOfKitchen() {
		return typeOfKitchen;
	}
	
	public void setTypeOfKitchen(String typeOfKitchen) {
		this.typeOfKitchen = typeOfKitchen;
	}
	
}
