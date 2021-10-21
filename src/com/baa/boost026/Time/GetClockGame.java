package com.baa.boost026.Time;

import java.util.Date;
import java.util.Scanner;

public class GetClockGame {
	
	public static void getClockGame() {
		
		try {
			Date date = new Date();
			// bana saati veriyor.
			int hours = date.getHours();
			System.out.println(hours);
			Scanner klavye = new Scanner(System.in);
			// count: hak prediction:tahmin
			int count = 10, prediction = 0, howManyCounterGame = 0;
			while (count > 0) {
				System.out.println("Hakkınız: " + count);
				System.out.println("Tahmin Sayınız: " + prediction);
				System.out.println("Lütfen sayı giriniz\n");
				// Kullanıcı eğer sayı girmezse bunu söyliyelim sayı girmesini zorlayalım
				// negatif sayı girdiniz harf giremezsin
				// 01 23
				int hoursScanner = Math.abs(klavye.nextInt());
				// 17-15 =+2 17-19=-2
				int different = hours - hoursScanner;
				if (different == 0) {
					System.out.println("Tebrikler sayıyı bildiniz. " + prediction + ".tahminde buldunuz");
					// Tekrar oynamak ister misiniz ? E H kullanıcı küçük harf yada büyük harf
					// girsin farketmez
					// eğer E= tekrar oynasın H=basarsa Çıkış yapılsın
					// Toplam kaç kere oyun oynadı
					break;
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		getClockGame();
	}
}
