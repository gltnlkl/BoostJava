package com.baa.boost015.Boxing;

public class BoxingLesson {
	
	// boxing ==> primitive Wrapper benzetiyoruz
	// unboxing ==> Wrapper bir yapıyı primitive benzetiyoruz
	
	// null hiç olusturulmamıs demektır.
	// sıfır -- adresı var ama degersız anlamındadır.
	// boxing - unboxing
	
	// Data type primitive + wrapper class
	
	// primitive type : byte, short, int, long, boolean, char, float, double
	// wrapper class
	
	public static void main(String[] args) {
		// primitive type
		
		int sayi = 5;
		
		// wrapper class
		
		Integer sayi2 = Integer.valueOf(sayi);
		
		// valueOf - converts to Wrapper class --->Integer
		// parseInt - converts to primitive type --->int
		
		System.out.println(sayi2);
		
	}
	
}
