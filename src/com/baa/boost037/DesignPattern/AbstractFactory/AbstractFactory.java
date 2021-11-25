package com.baa.boost037.DesignPattern.AbstractFactory;

public interface AbstractFactory<T> {
	
	// bu t ile generic bir tip tanimlamis oluyorum
	
	T create(String type);
}
