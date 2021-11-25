package com.baa.boost025.OOP;

public class AirVehicle extends Vehicle {
	
	public AirVehicle(String name, String brand, double maxSpeed) {
		
		super(name, brand, maxSpeed);
		
	}
	
	public AirVehicle(String name, String brand, double maxSpeed, double mass, String color) {
		
		super(name, brand, maxSpeed, mass, color);
		
		this.name = name;
		this.brand = brand;
		this.maxSpeed = maxSpeed;
		
	}
}
