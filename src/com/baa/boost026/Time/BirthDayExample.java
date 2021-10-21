package com.baa.boost026.Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthDayExample {
	
	public static void main(String[] args) {
		
		boolean exit = true;
		
		Scanner input = new Scanner(System.in);
		
		DateTimeFormatter fullFormat = DateTimeFormatter.ofPattern("MMMM dd, YYYY");
		DateTimeFormatter shortFormat = DateTimeFormatter.ofPattern("MMMM dd");
		DateTimeFormatter basicFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate today = LocalDate.now();
		
		System.out.println(today.format(fullFormat));
		System.out.println(today.format(shortFormat));
		System.out.println(today.format(basicFormat));
		
		do {
			System.out.println("Bugün ," + today.format(fullFormat) + "\n");
			System.out.println("Lütfen doğum gününüzü (yyyy-mm-dd) formatında giriniz:");
			String aDate = input.next();
			LocalDate birthDay = LocalDate.parse(aDate);
			if (birthDay.isAfter(today)) {
				System.err.println("Daha doğmadınız");
				continue;
			}
			System.out.println("--- Bilgiler----");
			System.out.println(birthDay.format(fullFormat) + " Harika bir gündü. "); // formatlanmıs tarih
			System.out.println("Bir " + birthDay.getDayOfWeek() + " günü doğdunuz. "); // dogdugu gun
			
			long days = birthDay.until(LocalDate.now(), ChronoUnit.DAYS); // bu ChronoUnit ı tekrar sorar mısın?
			long weeks = birthDay.until(LocalDate.now(), ChronoUnit.WEEKS);
			long months = birthDay.until(LocalDate.now(), ChronoUnit.MONTHS);
			long years = birthDay.until(LocalDate.now(), ChronoUnit.YEARS);
			long decades = birthDay.until(LocalDate.now(), ChronoUnit.DECADES);
			long mileniums = birthDay.until(LocalDate.now(), ChronoUnit.MILLENNIA);
			
			System.out.println("Bugüne dek " + days + " gün " + weeks + " hafta " + months + " ay " + years + " yıl "
					+ decades + " onyıl " + mileniums + " yüzyıl geçmiştir ");
			
			LocalDate nextBDate = birthDay.plusYears(years + 1);
			
			System.out.println("Bir sonraki doğum gününüz " + nextBDate.format(fullFormat));
			System.out.println(
					"Doğum gününüzü kutlamaya daha " + LocalDate.now().until(nextBDate, ChronoUnit.DAYS) + " gün var.");
			LocalDate halfBDate = birthDay.plusMonths(6);
			System.out.println("Yarım yaşlarınınızı " + halfBDate.format(shortFormat) + " tarihinde kutluyorsunuz");
			
			System.out.println("Yeniden işlem yapmak için lütfen E tuşuna basınız.");
			String exitInf = input.next();
			
			if (exitInf.equalsIgnoreCase("E")) {
				
				exit = false;
			} else
				System.out.println("Sistemden çıkış sağlanıyor.");
			
		} while (!exit);
		input.close();
	}
}
