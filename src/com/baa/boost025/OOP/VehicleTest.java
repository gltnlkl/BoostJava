package com.baa.boost025.OOP;

public class VehicleTest {
	public static void main(String[] args) {
		// TODO 04102021 TAMAMLA1
		Vehicle vehicle = new Vehicle("Araba", "Volvo", 220.5, 120, "red");
		vehicle.setColor("purple");
		
		System.out.println(vehicle);
		
		Vehicle vehicle2 = new Vehicle("ucak", "aırbas", 34058);
		
		System.out.println(vehicle2);
	}
}
