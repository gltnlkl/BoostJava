package com.baa.boost037.DesignPattern.Factory;

public class FactoryTest {
	
	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		
		factory.getShape("kare").draw();
		
		factory.getShape("dikdortgen").draw();
		
		factory.getShape("daire").draw();
		
	}
	
}
