package com.baa.boost028.Serializable.Example;

import java.util.Scanner;

public class GültenUlukalException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public GültenUlukalException(String errorMeassage) {
		super(errorMeassage);
		
	}
	
	public static void main(String[] args) throws GültenUlukalException {
		
		System.out.println("Kendi istisna durumumu yaptım");
		Scanner klavye = new Scanner(System.in);
		System.out.println("lÜTFEN POZİTİF BİR SAYI GİRİNİZ");
		
		int sayi = klavye.nextInt();
		if (sayi < 0) {
			throw new GültenUlukalException("Numara iste)");
			
		}
		System.out.println("Gırdıgınız sayı " + sayi);
		throw new GültenUlukalException("Number istisnası");
		
	}
}
