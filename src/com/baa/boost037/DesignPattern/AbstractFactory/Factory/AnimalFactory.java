package com.baa.boost037.DesignPattern.AbstractFactory.Factory;

import com.baa.boost037.DesignPattern.AbstractFactory.AbstractFactory;
import com.baa.boost037.DesignPattern.AbstractFactory.Animal.Animal;
import com.baa.boost037.DesignPattern.AbstractFactory.Animal.Cat;
import com.baa.boost037.DesignPattern.AbstractFactory.Animal.Dog;
import com.baa.boost037.DesignPattern.AbstractFactory.Animal.Duck;

public class AnimalFactory implements AbstractFactory<Animal> {
	
	@Override
	public Animal create(String type) {
		if (type.equalsIgnoreCase("kedi"))
			return new Cat();
		else if (type.equalsIgnoreCase("köpek"))
			return new Dog();
		else if (type.equalsIgnoreCase("ördek"))
			return new Duck();
		else
			return null;
	}
	
}
