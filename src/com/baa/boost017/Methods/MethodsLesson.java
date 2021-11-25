package com.baa.boost017.Methods;

public class MethodsLesson {
	
	// 1- voidli parametresiz /// void ile return ayni durumda olmaz!!!
	
	public static void voidliParametresiz() {
		System.out.println("Ben voidli ve parametresiz metodum.");
	}
	
	// 2- voidli parametreli
	
	public static void voidliParametreli(String adiSoyadi) {
		System.out.println(adiSoyadi);
		
	}
	
	// overloading -- ustteki method ile esasen ayni sadece parametreleri fakli
	// olmasi gerekir
	
	public static void voidliParametreli(String adiSoyadi, String diller) {
		System.out.println(adiSoyadi);
		
	}
	
	// 3-voidsiz parameteresiz
	
	public static String voidsizParametresiz() {
		
		return "Eskişehir";
	}
	
	// overloading
	
	// 4- voidsiz parametreli
	// int= diş dünyaya bir seyler gondermek icin
	// (int sayi1, int sayi2) - parametreler dis dunyadan bir seyler almak icin
	// return geriye donderir
	
	public static int /* byte -short - int - Integer vs.... */ voidsizParametreli(int sayi1, int sayi2) {
		return sayi1 + sayi2; /* (int sayi1 ve int sayi2 burada parametredir.) */
	}
	
	public static void main(String[] args) {
		
		voidliParametresiz(); // 1- voidli parametresiz
		voidliParametreli("Gülten Ulukal"); // 2- voidli parametreli
		String adi = voidsizParametresiz(); // 3-voidsiz parameteresiz
		System.out.println(adi); // 3-
		int toplam = voidsizParametreli(4, 6); // (4-6) burada argumandir
		System.out.println(toplam); //
		
	}
}
