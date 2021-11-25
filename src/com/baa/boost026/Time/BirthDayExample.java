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
			System.out.println("Bugun ," + today.format(fullFormat) + "\n");
			System.out.println("Lutfen dogum gununuzu (yyyy-mm-dd) formatinda giriniz:");
			String aDate = input.next();
			LocalDate birthDay = LocalDate.parse(aDate);
			if (birthDay.isAfter(today)) {
				System.err.println("Daha dogmadiniz");
				continue;
			}
			System.out.println("--- Bilgiler----");
			System.out.println(birthDay.format(fullFormat) + " Harika bir gundu. "); // formatlanmis tarih
			System.out.println("Bir " + birthDay.getDayOfWeek() + " gunu dogdunuz. "); // dogdugu gun
			
			long days = birthDay.until(LocalDate.now(), ChronoUnit.DAYS); // bu ChronoUnit i tekrar sorar misin?
			long weeks = birthDay.until(LocalDate.now(), ChronoUnit.WEEKS);
			long months = birthDay.until(LocalDate.now(), ChronoUnit.MONTHS);
			long years = birthDay.until(LocalDate.now(), ChronoUnit.YEARS);
			long decades = birthDay.until(LocalDate.now(), ChronoUnit.DECADES);
			long mileniums = birthDay.until(LocalDate.now(), ChronoUnit.MILLENNIA);
			
			System.out.println("Bugune dek " + days + " gun " + weeks + " hafta " + months + " ay " + years + " yil "
					+ decades + " onyil " + mileniums + " yuzyil gecmistir ");
			
			LocalDate nextBDate = birthDay.plusYears(years + 1);
			
			System.out.println("Bir sonraki dogum gununuz " + nextBDate.format(fullFormat));
			System.out.println(
					"Dogum gununuzu kutlamaya daha " + LocalDate.now().until(nextBDate, ChronoUnit.DAYS) + " gun var.");
			LocalDate halfBDate = birthDay.plusMonths(6);
			System.out.println("Yarim yaslarininizi " + halfBDate.format(shortFormat) + " tarihinde kutluyorsunuz");
			
			System.out.println("Yeniden islem yapmak icin lutfen E tusuna basiniz.");
			String exitInf = input.next();
			
			if (exitInf.equalsIgnoreCase("E")) {
				
				exit = false;
			} else
				System.out.println("Sistemden cikis saglaniyor.");
			
		} while (!exit);
		input.close();
	}
}
