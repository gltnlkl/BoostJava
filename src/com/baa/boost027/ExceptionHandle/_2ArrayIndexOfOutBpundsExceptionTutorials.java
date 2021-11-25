package com.baa.boost027.ExceptionHandle;

public class _2ArrayIndexOfOutBpundsExceptionTutorials {
	
	public static void main(String[] args) {
		
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
			
		} catch (ArrayIndexOutOfBoundsException aib) {
			
			aib.printStackTrace(); // ıstısna durumunun acıklaması
			
		} catch (Exception e) {
			
			e.printStackTrace(); // ıstısna durumunun acıklaması
		}
		System.out.println("Program devam ediyor");
		
	}
	
}
