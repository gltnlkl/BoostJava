package com.baa.boost037.DesignPattern.Factory;

public class ShapeFactory {
	
	public Shape getShape(String name) {
		
		if (name.equalsIgnoreCase("daire"))
			
			return new Circle();
		
		else if (name.equalsIgnoreCase("kare"))
			
			return new Square();
		
		else if (name.equalsIgnoreCase("dikdortgen"))
			
			return new Rectangular();
		
		return null;
		
	}
	
}
