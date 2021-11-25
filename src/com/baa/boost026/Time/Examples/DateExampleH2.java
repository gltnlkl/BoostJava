package com.baa.boost026.Time.Examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateExampleH2 {
	
	public static int getToday() {
		
		DateTimeFormatter basicFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen (yyyy-mm-dd) formatında tarih giriniz.");
		String dateInput = input.next();
		LocalDate date = LocalDate.parse(dateInput);
		
		System.out.println(date.format(basicFormat));
		
		int month = date.getMonthValue();
		// System.out.println(month);
		input.close();
		return month;
	}
	
	public static void main(String[] args) { // bunu yaparken cıkan standart throw u dene
		
		try {
			switch (getToday()) { // sadece output verısını nasıl kullanırım ???
				
				case 1:
					System.out.println("Ocak");
					break;
				case 2:
					System.out.println("Şubat");
					break;
				case 3:
					System.out.println("Mart");
					break;
				case 4:
					System.out.println("Nisan");
					break;
				case 5:
					System.out.println("Mayıs");
					break;
				case 6:
					System.out.println("Haziran");
					break;
				case 7:
					System.out.println("Temmuz");
					break;
				case 8:
					System.out.println("Ağustos");
					break;
				case 9:
					System.out.println("Eylül");
					break;
				case 10:
					System.out.println("Ekim");
					break;
				case 11:
					System.out.println("Kasım");
					break;
				case 12:
					System.out.println("Aralık");
					break;
					
				// default:
				// System.out.println("Yanlış bilgi girişi."); // aslında bu satıra hıc gerek
				// yok ???
				// break;
			}
		} catch (Exception e) {
			// e.printStackTrace();
			
			System.out.println("Yanlış giriş yapıldı " + e.getMessage()); // ben gunu 45 gırdıgımde veya - yerıne .
			// tanımladıgımda hata veriyor
			
		}
	}
}
