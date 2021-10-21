package com.baa.boost012.DoWhileLoop;

import java.util.Scanner;

// ıc ıce dongulerden farklı sıralar ıle boolean sorgusu ıle cıkılıyor. 

public class DoWhileLesson {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double number1 = 0.0;
		double number2 = 0.0;
		int cal;
		
		boolean exitCalc = false;
		
		do {
			
			System.out.println("Lütfen 1. sayiyi giriniz:");
			
			number1 = input.nextDouble();
			
			System.out.println("Lütfen 2. sayiyiyi giriniz:");
			number2 = input.nextDouble();
			
			boolean correctInput = false;
			
			while (!correctInput) {
				System.out.println(
						"Toplama islemi için Lütfen (1) tusuna basiniz. \nCikarma islemi için Lütfen (2) tusuna basiniz.\nCarpma islemi için Lütfen  (3) tusuna basiniz.\nBolme islemi için (4) tusuna basiniz.  ");
				cal = input.nextInt();
				
				switch (cal) {
					
					case 1:
						
						System.out.println("Islem sonucu " + (number1 + number2) + " dir.");
						correctInput = true;
						break;
					
					case 2:
						
						System.out.println("Islem sonucu " + (number1 - number2) + " dir.");
						correctInput = true;
						break;
					
					case 3:
						
						System.out.println("Islem sonucu " + (number1 * number2) + " dir.");
						correctInput = true;
						break;
					
					case 4:
						
						System.out.println("Islem sonucu " + (number1 / number2) + " dir.");
						correctInput = true;
						break;
					case 5:
						correctInput = true;
						exitCalc = true;
						break;
					
					default:
						
						System.out.println("Lütfen gecerli bir secim yapiniz."); 
																					
				}
			}
			
		} while (!exitCalc);   // exitCalc boolean ı false oldugu surece do dongusunu devam ettır.
		
		
		input.close();
		
	}
}
