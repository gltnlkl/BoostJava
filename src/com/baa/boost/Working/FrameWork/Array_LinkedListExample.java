package com.baa.boost.Working.FrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Array_LinkedListExample {
	
	// Use an ArrayList for storing and accessing data, and LinkedList to manipulate
		// data.
	public static void sorted() {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		Collections.sort(cars); // Sort cars by first letter
		for (String i : cars) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		System.out.println(cars);
		
		// cars.get(0);
		// cars.set(0, "Opel");
		// cars.remove(0);
		// cars.clear();
		// cars.size();
		
		int i = 0;
		for (Iterator<String> iterator = cars.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			i++;
			System.out.println(i + "." + string);
		}
		
		for (int j = 0; j < cars.size(); j++) {
			
			System.out.println(j + "." + cars.get(j) + " ");
			
		}
	}
	
}
