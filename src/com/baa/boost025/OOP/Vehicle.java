package com.baa.boost025.OOP;

public class Vehicle {
	
	// TODO 04102021 TAMAMLA1
	
	protected String name;
	protected String brand;
	private double mass;
	private String color;
	private double velocity;
	protected double maxSpeed;
	private double currSpeed;
	
	// getter
	
	public Vehicle(String name, String brand, double maxSpeed) {
		
		this.name = name;
		this.brand = brand;
		this.maxSpeed = maxSpeed;
		
		// arguman olarak verılmeyen degerlerı muhakak constructerda ılk deger ata.
		
		this.mass = 0.0d;
		this.color = "";
		
	}
	
	public Vehicle(String name, String brand, double maxSpeed, double mass, String color) {
		
		this.name = name;
		this.brand = brand;
		this.maxSpeed = maxSpeed;
		this.mass = mass;
		this.color = color;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setMass(double mass) {
		this.mass = mass;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}
	
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void setCurrSpeed(double currSpeed) {
		this.currSpeed = currSpeed;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getMass() {
		return mass;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getVelocity() {
		return velocity;
	}
	
	public double getmaxSpeed() {
		return maxSpeed;
	}
	
	public double getcurrSpeed() {
		return currSpeed;
	}
	
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", brand=" + brand + ", mass=" + mass + ", color=" + color + ", velocity="
				+ velocity + ", maxSpeed=" + maxSpeed + ", currSpeed=" + currSpeed + "]";
	}
	
}
