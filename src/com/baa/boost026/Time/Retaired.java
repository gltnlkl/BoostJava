package com.baa.boost026.Time;

// 2.Örnek
// Genel
// Çalışma Hayatım EDevlet
// Kullanıcıdan Adı soyad doğum tarihi cinsiyet B - E ( Gün/ay/Yıl girsin)
// Bunun içinden yılı alsın
// Erkeklerde 65 yaş
// bayanlarda 60 yaş

// Emekliliğine kalan süresiniz?

// methodları
// Class Emeklilik : ID, Adı Soyadı ,Doğum tarihi
// try catch
// static
// enum B - E

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Retaired {
	
	public int id;
	public static String name;
	public static String surName;
	public LocalDate dateOfBirth;
	public static Gender gender;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Lutfen dogum gununuzu (yyyy-mm-dd) formatinda giriniz:");
			String aDate = input.next();
			LocalDate dateOfBirth = LocalDate.parse(aDate);
			
			long age = dateOfBirth.until(LocalDate.now(), ChronoUnit.YEARS);
			
			name = ConsoleHelper.readString("Lutfen adinizi giriniz.");
			surName = ConsoleHelper.readString("Lutfen soyadinizi giriniz.");
			gender = Gender.stringToGender(ConsoleHelper.readString("Lutfen erkek icin (e) kadin icin (k) giriniz."));
			
			if (gender == Gender.ERKEK) {
				
				System.out.println(
						"Sayin " + name + " " + surName + " emekliliginize kalan s�reniz " + (65 - age) + " yil.");
			} else {
				
				System.out.println(
						"Sayın " + name + " " + surName + " emekliliğinize kalan süreniz " + (60 - age) + " yıl.");
			}
			
			input.close();
		} catch (Exception e) {
			
		}
		
	}
}
