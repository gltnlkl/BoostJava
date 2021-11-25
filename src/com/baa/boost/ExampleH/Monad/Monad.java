package com.baa.boost.ExampleH.Monad;

public class Monad {
	
	public static int sayi(int temp) {
		
		return temp;
	}
	
	public static double uslu(int temp) {
		
		return Math.pow(temp, 2);
	}
	
	public static void main(String[] args) {
		
		System.err.println(4 * 4);
		
		System.out.println(uslu(sayi(5))); // metod ıcınde metod kullanılmasına Monad denir.
		
	}
}
