package com.baa.boost028.Serializable;

import java.io.Serializable;

public class Dimension implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double length;
	private double width;
	
	public Dimension(double lenght, double width) {
		super();
		this.length = lenght;
		this.width = width;
	}
	
	public double getLenght() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return width * length;
	}
	
	@Override
	public String toString() {
		return "Diemnsion [lenght=" + length + ", width=" + width + "]";
	}
	
}
