package com.baa.boost030.Composition.AvmExample;

import java.time.LocalDate;

import com.baa.boost030.Composition.Dimension;
import com.baa.boost030.Composition.AvmExample.Avm.Area;

public class ElectronicsShop extends Common implements Area {
	
	private Location location;
	private Dimension dimension;
	
	@Override
	public double area(double length, double width) {
		double area = length * width;
		return area;
	}
	
	public ElectronicsShop() {
		this.location = null;
		this.dimension = null;
		
	}
	
	public ElectronicsShop(String storeName, String storeProductType, double price, LocalDate logDate, int commonId,
			Location location, Dimension dimension) {
		super(storeName, storeProductType, price, logDate, commonId);
		this.location = location;
		this.dimension = dimension;
	}
	
	@Override
	public String toString() {
		return "ElectronicsShop [location=" + location + ", dimension=" + dimension + ", getStoreName()="
				+ getStoreName() + ", getStoreProductType()=" + getStoreProductType() + ", getPrice()=" + getPrice()
				+ ", getLogDate()=" + getLogDate() + ", getcommonId()=" + getCommonId()
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
	
}
