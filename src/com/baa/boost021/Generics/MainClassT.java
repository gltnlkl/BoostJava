package com.baa.boost021.Generics;

public class MainClassT {
	
	public static void main(String[] args) {
		
		// instance = new ile veri olusturmak
		
		// GenericsClass genericsClass = new GenericsClass();
		
		// genericsClass.setAdi("Gülten");
		// genericsClass.setSoyadi("Ulukal");
		
		GenericsClassT genericsClassT = new GenericsClassT<Object>("1", "Mızrak"); // ---> ustekı ıle aynı ıslemı
																					// yapıyor
		
		// genericsClass.setAdi("Gülten");
		// genericsClass.setSoyadi("Ulukal");"
		
		System.out.println(genericsClassT); // ---> tek seferde bılgı donuyor toplu olarak.
		
		// System.out.println(genericsClass.getAdi());
		// System.out.println(genericsClass.getSoyadi());
		
	}
	
}
