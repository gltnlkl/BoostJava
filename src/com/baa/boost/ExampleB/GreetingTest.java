
package com.baa.boost.ExampleB;

public class GreetingTest {
	
	public static void main(String[] args) {
		Greeting x = new Greeting();
		x.msg = "Hello";
		System.out.println(x);
		Greeting y = x;
		System.out.println(y);
		Greeting z = x;
		System.out.println(z);
		
		z = new Greeting();
		System.out.println(z);
		
		if (x == y)
			System.out.println("x y ye e�ittir.");
		else
			System.err./* err farkl� renkl� c�kt� */println("x y ye e�it de�ildir.");
		
		if (x == z)
			System.out.println("x z ye e�ittir.");
		else
			System.err.println("x z ye e�it de�ildir.");
		
		z.msg = "Hello";
		
		if (x == z)
			System.out.println("x z ye e�ittir.");
		else
			System.err.println("x z ye e�it de�ildir.");
		
		if (x.equals(z))
			System.out.println("x z ye e�ittir.");
		else
			System.err.println("x z ye e�it de�ildir.");
	}
	
}
