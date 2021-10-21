package com.baa.boost030.Composition.AvmExample;

import java.time.LocalDate;

public class Common {
	
	private String storeName;
	private String storeProductType;
	private double price;
	private LocalDate logDate;
	private int commonId;
	
	public Common() {
		// TODO Auto-generated constructor stub
	}
	
	public Common(String storeName, String storeProductType, double price, LocalDate logDate, int commonId) {
		super();
		this.storeName = storeName;
		this.storeProductType = storeProductType;
		this.price = price;
		this.logDate = logDate;
		this.commonId = commonId;
	}
	
	public Common(LocalDate logDate, int commonId) {
		super();
		this.logDate = logDate;
		this.commonId = commonId;
		
	}
	
	@Override
	public String toString() {
		return "Shop [storeName=" + storeName + ", storeProductType=" + storeProductType + ", price=" + price + "]";
	}
	
	public String getStoreName() {
		return storeName;
	}
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public String getStoreProductType() {
		return storeProductType;
	}
	
	public void setStoreProductType(String storeProductType) {
		this.storeProductType = storeProductType;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public LocalDate getLogDate() {
		return logDate;
	}
	
	public void setLogDate(LocalDate logDate) {
		this.logDate = logDate;
	}
	
	public int getCommonId() {
		return commonId;
	}
	
	public void setCommonId(int commonId) {
		this.commonId = commonId;
	}
	
}
