package com.baa.boost037.DesignPattern.AbstractFactory.Animal;

public class Duck implements Animal {
	
	@Override
	public String getType() {
		return "Ordek";
		
	}
	
	@Override
	public void makeSound() {
		System.out.println("vak vak");
		
	}
	
}
