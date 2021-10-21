package com.baa.boost009.ForLoop;

import java.util.Scanner;

public class FactorialForTwo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String result = "";
		
		do {
			System.out.println("Lutfen bir tam sayi giriniz:");
			
			int number = input.nextInt();
			
			int fact = 1;
			
			if ((number > 23) || (number < 0)) {
				
				System.out.println("Lütfen 0 ile 24 arasinda bir değer giriniz.");
				continue;
				// contıonue yapısını nasıl kullanırım fact 1 sureklı console a basılıyor(?)
				
			}
			
			else if (number == 0) {
				
			} else {
				for (int i = 1; i <= number; i++) {
					fact *= i; // fact = fact*i ( bunu kabul etmiyor (?)
				}
			}
			
			System.out.println(fact);
			System.out
					.println("Bir hesaplama daha yapmak istiyor musunuz? (Sonlandirmak için (H) Devam etmek icin (E)");
			
			result = input.next();
			
		} while (!result.equalsIgnoreCase("h"));
		
		input.close();
		
	}
	
}
