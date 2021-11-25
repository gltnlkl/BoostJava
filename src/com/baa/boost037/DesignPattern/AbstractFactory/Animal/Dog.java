package com.baa.boost037.DesignPattern.AbstractFactory.Animal;

public class Dog implements Animal {
	
	@Override
	public String getType() {
		return "Kopek";
		
	}
	
	@Override
	public void makeSound() {
		System.out.println("hav hav");
		
	}
	
}