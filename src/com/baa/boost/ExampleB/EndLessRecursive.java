package com.baa.boost.ExampleB;

public class EndLessRecursive {
	
	public static void main(String[] args) {
		sayHelloWorld();
		
	}
	
	private static void sayHelloWorld() {
		System.out.println("Hello World");
		sayHelloWorld();
	}
	
}