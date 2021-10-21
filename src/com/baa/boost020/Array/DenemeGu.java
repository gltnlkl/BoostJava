package com.baa.boost020.Array;

import java.util.Scanner;

public class DenemeGu {
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
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		
		input.close();
		
	}
	
	public static void main(String[] args) {
		
		String[] deneme = new String[3];
		deneme[0] = "Bırıncı eleman";
		deneme[1] = "Ikıncı eleman";
		deneme[2] = "Ucuncu eleman";
		
		for (int i = 0; i < deneme.length; i++) {
			System.out.println(deneme[i]);
			
		}
	}
	
}
