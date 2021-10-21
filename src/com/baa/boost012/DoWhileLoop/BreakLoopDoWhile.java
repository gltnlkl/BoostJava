package com.baa.boost012.DoWhileLoop;

import java.util.Scanner;

public class BreakLoopDoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lutfen guncel dolar kurunu virgullu sayi olarak giriniz:");
		double exchangeRate = input.nextDouble();
		
		do {
			
			System.out.println("Lutfen bozdurmak istediginz miktar� tam sayi olarak giriniz:");
			int amount = input.nextInt();
			
			System.out.println("Lutfen dolar bozdurmak icin 1, TL bozdurmak icin 0 giriniz:");
			int direction = input.nextInt();
			
			switch (direction) {
				case 1:
					System.out.printf("\n%d $'nin kc %.1f TL'dir.", amount, amount * exchangeRate);
					break;
				
				case 0:
					System.out.printf("\n%d TL'nin v %.1f $'dir.", amount, amount / exchangeRate);
					break;
				
				default:
					System.out.println("Yanlis yon TL-> $ bozdurma secildi.");
					
			}
			
			System.out.println("\n Yeni islem yapmak istiyor musunuz? (Evet icin E) : ");
			String yesOrNo = input.next();
			
			if (!yesOrNo.equalsIgnoreCase("E")) {
				break;
				
			}
		}
		
		while (true);
		input.close();
		System.out.println("\nBye Bye");
		
	}
}


