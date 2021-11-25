package com.baa.boost.ExampleB;

public class DodekofobiTwo {
	
	// 1 ıle 20 arasında 12 harıc rastgele sayılar gelmesı . bu durumda 1 gelme
	// olasılıgı dıgerlerınden yuksek
	
	public static void main(String[] args) {
		System.out.println("Seçilen sayi: " + createRandomNumber());
		
	}
	
	private static int createRandomNumber() {
		
		int retVal = 0;
		retVal = (int) (Math.random() * 20) + 1; // double ---> int cast 1 ıle 20 arasında sayı gelecek
		
		if (retVal != 12)
			
			return retVal;
		else
			return 0;
		
	}
	
}
