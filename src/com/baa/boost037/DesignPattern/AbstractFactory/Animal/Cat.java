package com.baa.boost037.DesignPattern.AbstractFactory.Animal;

public class Cat implements Animal {
	
	@Override
	public String getType() {
		return "Kedi";
	}
	
	@Override
	public void makeSound() {
		System.out.println("miyav miyav");
		
	}
	
}
