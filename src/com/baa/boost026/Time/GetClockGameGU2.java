package com.baa.boost026.Time;

import java.time.LocalTime;
import java.util.Scanner;

public class GetClockGameGU2 {
	
	public static void input() {
		
		int timeNow = 0;
		int guessTime = 0;
		int count = 10;
		int prediction = 0;
		int howManyCounterGame = 0;
		
		boolean inputCheck = true;
		Scanner input = new Scanner(System.in);
		
		do {
			LocalTime time = LocalTime.now();
			System.out.println(time.getHour());
			timeNow = time.getHour();
			
			System.out.println("Lütfen tahmin için 1 ile 23 arası bir rakam giriniz.");
			System.out.println();
			guessTime = input.nextInt();
			howManyCounterGame++;
			
			if (guessTime <= 0) {
				System.out.println("Yanlış bilgi girdiniz.");
				inputCheck = false;
			} else if (!Character.isDigit((char) guessTime)) {
				System.out.println("Yanlış bilgi girdiniz.");
				inputCheck = false;
			}
			
		} while (!inputCheck);
		
		while (count > 0) {
			
			System.out.println("Hakkınız: " + count);
			System.out.println("Tahmin Sayınız: " + prediction);
			System.out.println("Lütfen sayı giriniz\n");
			
			int different = timeNow - guessTime;
			if (different == 0) {
				System.out.println("Tebrikler sayıyı bildiniz. " + prediction + ".tahminde buldunuz "
						+ howManyCounterGame + " kere oynadınız.");
				
				// Tekrar oynamak ister misiniz ? E H kullanıcı küçük harf yada büyük harf
				// girsin farketmez
				// eğer E= tekrar oynasın H=basarsa Çıkış yapılsın
				// Toplam kaç kere oyun oynadı
				// boolean last = false;
				// while (!last)
				System.out.println("Tekrar oynamak için (e) çıkmak için (h) tuşuna basınız.");
				String resultInput = input.next();
				
				if (resultInput.equalsIgnoreCase("E")) {
					inputCheck = false;
					// last = true;
				} else if (resultInput.equalsIgnoreCase("H")) {
					System.out.println("Sistemden çıkış sağlanıyor.");
					// last = true;
					break;
				} else {
					System.out.println("Yanlış değer girildi.");
					// last = false;
				}
				
			} else if (different == -2) {
				System.out.println("Büyük sayı girdiniz aradaki fark çok az");
				count--;
				prediction++;
			} else if (different == 2) {
				System.out.println("Küçük sayı girdiniz aradaki fark çok az");
				count--;
				prediction++;
			} else if (different > 2) {
				System.out.println("Küçük sayı girdiniz aradaki fark çok fazla");
				count--;
				prediction++;
			} else if (different > -2) {
				System.out.println("Büyük sayı girdiniz aradaki fark çok fazla");
				count--;
				prediction++;
			} else {
				System.out.println("Yanlış girildi");
			}
		}
		
	}
	
	public static void main(String[] args) {
		input();
		
	}
}
