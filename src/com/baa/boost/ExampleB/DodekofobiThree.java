package com.baa.boost.ExampleB;

public class DodekofobiThree {
	
	// 1 ıle 20 arasında 12 harıc rastgele sayılar gelmesı . bu sefer rastgele oldu
	
	public static void main(String[] args) {
		System.out.println("Seçilen sayi: " + createRandomNumber());
		
	}
	
	private static int createRandomNumber() {
		
		int retVal = 0;
		do {
			retVal = (int) (Math.random() * 20) + 1; // double ---> int cast 1 ıle 20 arasında sayı gelecek
			
		} while (retVal == 12);
		
		return retVal;
		
	}
	
}
