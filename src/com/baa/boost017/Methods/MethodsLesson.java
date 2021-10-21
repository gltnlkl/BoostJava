package com.baa.boost017.Methods;

public class MethodsLesson {
	
	// 1- voidli parametresiz /// voıd ıle return aynı durumda olmaz!!!
	
	public static void voidliParametresiz() {
		System.out.println("Ben voidli ve parametresiz metodum.");
	}
	
	// 2- voidli parametreli
	
	public static void voidliParametreli(String adiSoyadı) {
		System.out.println(adiSoyadı);
		
	}
	
	// overloading -- usttekı method ıle esasen aynı sadece parametrelerı faklı
	// olması gerekır
	
	public static void voidliParametreli(String adiSoyadı, String diller) {
		System.out.println(adiSoyadı);
		
	}
	
	// 3-voidsiz parameteresiz
	
	public static String voidsizParametresiz() {
		
		return "Eskişehir";
	}
	
	// overloading
	
	// 4- voidsiz parametreli
	// int= dış dünyaya bır seyler gondermek ıcın
	// (int sayi1, int sayi2) - parametreler dıs dunyadan bır seyler almak ıcın
	// return geriye donderir
	
	public static int /* byte -short - int - Integer vs.... */ voidsizParametreli(int sayi1, int sayi2) {
		return sayi1 + sayi2; /* (int sayi1 ve int sayi2 burada parametredir.) */
	}
	
	public static void main(String[] args) {
		
		voidliParametresiz(); // 1- voidli parametresiz
		voidliParametreli("Gülten Ulukal"); // 2- voidli parametreli
		String adi = voidsizParametresiz(); // 3-voidsiz parameteresiz
		System.out.println(adi); // 3-
		int toplam = voidsizParametreli(4, 6); // (4-6) burada argumandır
		System.out.println(toplam); //
		
	}
}
