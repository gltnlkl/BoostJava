package com.baa.boost030.Composition;

public class Statik {

	public void statik() {
		
		System.out.println("Statik olmayan");
		
	}
	public static void nonStatik() {
		
		System.out.println("Statik olmayan");
		
	}
	
	public static void main(String[] args) {
		
//		Statik statik= new Statik();   // methodu baska bır yerde kullanmak ıcın new ıle methodtan object uretmelıyız.
//		
//		statik.statik();
//		statik.nonStatik();
		
	Statik.nonStatik();    // statik methodu sadece method adı nokta seklınde cagırabılırız.
		
		
	}
	
}
