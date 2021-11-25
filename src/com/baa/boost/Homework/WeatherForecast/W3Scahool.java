package com.baa.boost.Homework.WeatherForecast;

import java.util.Random;

public class W3Scahool {
	public static void main(String[] args) {
		
		int x = 5, y = 6, z = 50;
		System.out.println(x + y + z);
		
		// type casting
		
		double myDouble = 9.78d;
		int myInt = (int) myDouble;
		
		String name = "Gülten";
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.contains("Gülten"));
		
		String firstName = "John";
		String lastname = "Ulukal";
		
		System.err.println(firstName.concat("\r " + lastname));
		
		String txt = "Hello Everybody";
		System.out.println(txt.indexOf("e")); // kacıncı karakter ???
		
		int a = 5;
		int b = 10;
		
		System.out.println(Math.max(a, b));
		
		int k = 16;
		System.out.println(Math.sqrt(k));
		
		System.out.println(Math.random());
		
		Random createRandom = new Random(); // once Random objesı yaratılır
		
		int number = createRandom.nextInt(100) + 50; // 50 ıle 100 arasında random rakamlar uretıyor
		int number2 = createRandom.nextInt(100); // 0 ıle 100 arasında random rakamlar uretıyor
		System.out.println(number);
		
		int time = 20;
		
		String result = (time < 10) ? "Good day." : "Good evening.";
		
		System.out.println(result);
		
		int day = 4;
		switch (day) {
			
			case 1:
				System.out.println("Saturday");
				break;
			
			case 2:
				System.out.println("Sunday");
				break;
			
			default:
				System.out.println("Weekend");
		}
		
		int i = 1;
		while (i < 6) {
			System.out.println(i);
			i++;
		}
		
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j < 6);
		
		String[] cars = { "Volvo", "BMW", "Ford" };
		
		for (String m : cars) {
			System.out.println(m);
		}
		
		for (int n = 0; n < 10; n++) {
			if (n == 5) {
				break;
			}
			System.out.println(n);
		}
		
		for (int t = 0; t < 10; t++) {
			/*
			 * 0
			 * 1
			 * 2
			 * 3 4 yok pas gectı
			 * 5
			 * 6
			 * 7
			 * 8
			 * 9
			 */
			if (t == 4) {
				
				continue;
			}
			System.out.println(t);
		}
		
		String[] carss = { "Volvo", "BMW", "Ford" };
		
		for (String e : carss) {
			System.out.println(e);
		}
		myMethod();
		
		myNewMethod method = new myNewMethod();
		
		System.out.println(method.c);
	}
	
	static void myMethod() {
		System.out.println("I just got executed!");
	}
	
	public void myNewMethod() {
		int c = 1034;
		
		System.out.println(" Yenı statıc olmayan method denemesı");
		
	}
	
}
