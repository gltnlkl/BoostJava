package com.baa.boost027.ExceptionHandle;

public class _3AIExceptionRevize {
	public static void deneme() {
		
		int[] dizi = new int[5];
		
		for (int i = 0; i < dizi.length; i++) {
			
			dizi[i] = i;
			
		}
		
		// forEach
		
		for (int temp : dizi) {
			System.out.println(dizi[temp]);
			
		}
		System.out.println("");
		
		try {
			
			System.out.println(dizi[5]);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			
			// e.printStackTrace(); // ıstersek bunuda kullanabılırız
			
			System.out.println(e.getMessage()); // bu ıle bır mesaj alıyoruz sadece
			
		}
		System.out.println("Program devam ediyor");
		
	}
	
	public static void main(String[] args) {
		deneme();
		
	}
}
