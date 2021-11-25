package com.baa.boost003.Cast;

import java.util.Scanner;

public class CastExample {

	
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Lütfen bir sayı giriniz");
			
			String userNumber = input.nextLine();
			
			// int castNumber = Integer.valueOf(userNumber);
			
			int castNumber = Integer.parseInt(userNumber);
			
			// System.out.println(castNumber * 2);
			
			System.out.println(Math.sqrt(Math.pow(castNumber, 2)));
			
		}
		
}