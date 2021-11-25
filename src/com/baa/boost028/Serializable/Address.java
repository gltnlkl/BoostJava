package com.baa.boost028.Serializable;

import java.io.Serializable;

public class Address implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String street;
	private String city;
	private String country;
	private int number;
	
	public Address(String street, String city, String country, int number) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
		this.number = number;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getNumber() {
		return number;
	}
	
	@Override
	public String toString() {
		return "Adress [street=" + street + ", city=" + city + ", country=" + country + ", number=" + number + "]";
	}
	
}
