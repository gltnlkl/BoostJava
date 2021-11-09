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
		this.id = count;
	}
	
	protected Person(String name) {
		this.name = name;
		count++;
		this.id = count;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public static int getCount() {
		return count;
	}
	
	public String getName() {
		return name;
	}
	
}
