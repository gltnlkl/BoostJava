package com.baa.boost026.Time.Examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateExampleH {
	
	public static int getToday() {
		
		LocalDate today = LocalDate.now();
		
		DateTimeFormatter basicFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		System.out.println(today.format(basicFormat));
		
		int month = today.getDayOfMonth();
		
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
				
				default:
					System.out.println("Yanlış bilgi girişi.");
					break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
