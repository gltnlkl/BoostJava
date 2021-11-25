package com.baa.boost024.Abstract.inheretance.oop.atm2;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		String userEmail = "", userPassword = "", maskString = "";
		
		// static veri cagirdim Ctrl+Mouse left click
		String dbEmail = "root"; // SabitVeri.DB_EMAIL;
		String dbPassword = "root"; // SabitVeri.DB_PASSWORD;
		
		// hakkiniz:4
		int attempt = 4;
		
		while (attempt >= -1) {
			System.out.println("\nLutfen Kullanici email giriniz");
			userEmail = klavye.nextLine().trim();
			System.out.println("\nLutfen Kullanici sifrenizi giriniz");
			userPassword = klavye.nextLine().trim();
			
			for (int i = 0; i < userPassword.length(); i++) {
				maskString = maskString + "*";
			}
			System.out.println("Maskelenemis sifre:" + maskString);
			
			if ((userEmail.equals(dbEmail)) && (userPassword.equals(dbPassword))) {
				System.out.println("Admin sayfasina yonlendiriliyorsunuz");
			} else {
				System.out.println("Email veya sifre yanlis girdiniz");
				System.out.println("kalan hakkiniz: " + (attempt - 1));
				
				if (attempt == 1) {
					System.out.println(
							"4 kere yanlis hakkimiz kartiniz bloke oldu musteri hizmetlerini arayiniz 444 555 99622");
					// System.exit(0);
					break;
				}
				attempt--;
			}
		}
		
	}
	
}
