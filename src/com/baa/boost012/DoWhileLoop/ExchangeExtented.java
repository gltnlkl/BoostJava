package com.baa.boost012.DoWhileLoop;

import java.util.Scanner;

public class ExchangeExtented {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.print("L�tfen g�ncel dolar kurunu virg�ll� say� olarak giriniz: ");
		double exchangeRate = klavye.nextDouble();

		do  {
			System.out.print("L�tfen bozdurmak istedi�iniz miktar� tam say� olarak giriniz: ");
			int amount = klavye.nextInt();
			System.out.print("L�tfen dolar bozdurmak i�in 1, TL bozdurmak i�in 0 giriniz: ");
			int direction = klavye.nextInt();
			
			switch (direction) {
			case 1: 
				System.out.printf("\n%d TL'nin kar��l��� %.1f $'d�r.", amount, amount * exchangeRate);
				break;
			case 2:
				System.out.printf("\n%d TL'nin kar��l��� %.1f $'d�r.", amount, amount / exchangeRate);
				break;
			default:
				System.out.println("Yanl�� y�n TL Bozdurma se�ildi");
				System.out.printf("\n%d TL'nin kar��l��� %.1f $'d�r.", amount, amount / exchangeRate);
			}
			
			System.out.print("\n\nYeni i�lem yapmak istiyor musunuz (evet i�in E): ");
			String yesOrNo = klavye.next();
			
			if (!yesOrNo.equalsIgnoreCase("E")) {
				break;
			}

		} while(true);
		
		klavye.close();
		System.out.println("\nBye bye");
	}

}
