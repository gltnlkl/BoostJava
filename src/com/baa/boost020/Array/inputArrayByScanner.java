package com.baa.boost020.Array;

import java.util.Scanner;

public class inputArrayByScanner {
	public static void array() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dızıde kac eleman vardır? ");
		int num = input.nextInt();
		input.nextLine();
		
		String[] dizi = new String[num];
		
		for (int i = 0; i < dizi.length; i++) {
			
			System.out.println("Dızı verısı gırınız.");
			dizi[i] = input.next();
			
		}
		
		System.out.println(dizi[0]);
	}
	
}
