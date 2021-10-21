package com.baa.boost.ExampleH.Recursive;

public class Recursive {
	
	// recursive= kendı kendıne cagıran metod
	
	public static int factoriyel(int sayi) {
		
		if (sayi == 1) {
			return 1;
		} else
			return (sayi * factoriyel(sayi - 1));
	}
	
	// ilk 5 tane sayının toplamını yapan iterative method
	
	public static void iterativeSum(int sayi) {
		int toplam = 0;
		for (int i = 0; i < sayi; i++) {
			toplam += i;
		}
	}
	
	public static int recursiveSum(int sayi) {
		
		if (sayi > 0) {
			return sayi + recursiveSum(sayi - 1);
			
		} else {
			return 0;
			
		}
		
	}
	
	public static void main(String[] args) {
		int result = factoriyel(6);
		System.out.println(result);
		
		iterativeSum(5);
		int result2 = recursiveSum(5);
		System.out.println("toplam" + result2);
		
	}
	
}
