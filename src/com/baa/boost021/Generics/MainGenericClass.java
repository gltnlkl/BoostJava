package com.baa.boost021.Generics;

public class MainGenericClass {
	
	public static void main(String[] args) {
		
		// instance = new ile veri olusturmak
		
		// GenericsClass genericsClass = new GenericsClass();
		
		// genericsClass.setAdi("Gülten");
		// genericsClass.setSoyadi("Ulukal");
		
		GenericsClass genericsClass = new GenericsClass("Hamit", "Mızrak"); // ---> ustekı ıle aynı ıslemı yapıyor
		
		// genericsClass.setAdi("Gülten");
		// genericsClass.setSoyadi("Ulukal");
		
		System.out.println(genericsClass); // ---> tek seferde bılgı donuyor toplu olarak.
		
		// System.out.println(genericsClass.getAdi());
		// System.out.println(genericsClass.getSoyadi());
		
	}
	
}
