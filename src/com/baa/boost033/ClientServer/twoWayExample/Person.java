package com.baa.boost033.ClientServer.twoWayExample;

import java.io.Serializable;

public class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static int count;
	
	String name;
	int id;
	
	public Person() {
		
		count++;
	}
	
	protected Person(String name, int id) {
		this.name = name;
		count++;
		this.id = count;
	}
}
