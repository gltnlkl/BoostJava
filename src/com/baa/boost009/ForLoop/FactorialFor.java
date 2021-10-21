package com.baa.boost009.ForLoop;

import java.util.Scanner;

public class FactorialFor {
	
		public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz:");
		int number = input.nextInt();
		
		// faktoriyel hesaplama
		
		int fact = 1;
		
		if (number == 0) {


		} else {
			for (int i = 1; i <= number; i++) {
				fact *= i; // fact = fact*i demek oluyor.
			}
		}
		input.close();
		System.out.println(fact);
	}
	
}

