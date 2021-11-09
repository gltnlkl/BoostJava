package com.baa.boost.Lambda;

import java.util.Arrays;
import java.util.List;

public class ArrayPrint {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		// method 1
		// Conventional way of printing arraylist
		for (int number : numbers) {
			System.out.print(number);
		}
		
		// method 2
		// Lambda Expression to print arraylist
		numbers.forEach((Integer value) -> System.out.print(value));
		
		// method 3
		// Lambda Expression to print arraylist
		numbers.forEach(value -> System.out.print(value));
		
		// method 4
		// Lambda Expression (method reference) to print arraylist
		numbers.forEach(System.out::print);
		
	}
}
