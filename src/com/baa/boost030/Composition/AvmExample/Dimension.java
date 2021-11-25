package com.baa.boost030.Composition.AvmExample;

public class Dimension {
	
	public double length;
	public double width;
	
	public Dimension() {
	}
	
	public Dimension(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "Dimension [length=" + length + ", width=" + width + "]";
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
}
