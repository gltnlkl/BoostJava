package com.baa.boost028.Serializable.Example;

import java.util.Scanner;

public class GultenUlukalException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public GultenUlukalException(String errorMeassage) {
		super(errorMeassage);
		
	}
	
	public static void main(String[] args) throws GultenUlukalException {
		
		System.out.println("Kendi istisna durumumu yaptim");
		Scanner klavye = new Scanner(System.in);
		System.out.println("lUTFEN POZITIF BIR SAYI GIRINIZ");
		
		int sayi = klavye.nextInt();
		if (sayi < 0) {
			throw new GultenUlukalException("Numara iste)");
			
		}
		System.out.println("Girdiginiz sayi " + sayi);
		throw new GultenUlukalException("Numara istisnasi");
		
	}
}
