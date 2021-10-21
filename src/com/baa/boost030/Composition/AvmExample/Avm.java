package com.baa.boost030.Composition.AvmExample;

import java.time.LocalDate;

import com.baa.boost030.Composition.AvmExample.Avm.Area;

public class Avm extends Common implements Area {
	
	private String avmName;
	private LocalDate foundYear;
	private String city;
	private Dimension dimension;
	
	@Override
	public double area(double length, double width) {
		double area = length * width;
		return area;
	}
	
	public Avm() {
		
		this.avmName = "";
		this.foundYear = LocalDate.now();
		this.city = "";
		this.dimension = null;
		
	}
	
	public Avm(LocalDate logDate, int commonId, String avmName, LocalDate foundYear, String city, Dimension dimension) {
		super(logDate, commonId);
		this.avmName = avmName;
		this.foundYear = foundYear;
		this.city = city;
		this.dimension = dimension;
	}
	
	@Override
	public String toString() {
		return "Avm [avmName=" + avmName + ", foundYear=" + foundYear + ", city=" + city + ", dimension=" + dimension
				+ ", getStoreName()=" + getStoreName() + ", getStoreProductType()=" + getStoreProductType()
				+ ", getPrice()=" + getPrice() + ", getLogDate()=" + getLogDate() + ", getcommonId()=" + getCommonId()
				+ area(dimension.length, dimension.width) + "]";
	}
	
	public String getAvmName() {
		return avmName;
	}
	
	public void setAvmName(String avmName) {
		this.avmName = avmName;
	}
	
	public LocalDate getFoundYear() {
		return foundYear;
	}
	
	public void setFoundYear(LocalDate foundYear) {
		this.foundYear = foundYear;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public Dimension getDimension() {
		return dimension;
	}
	
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
}