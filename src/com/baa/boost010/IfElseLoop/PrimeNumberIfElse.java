package com.baa.boost010.IfElseLoop;

import java.util.Scanner;

public class PrimeNumberIfElse {
	
	/*
	 * Klavyeden girilen sayının asal olup olmadıgını bulan algorıtma
	 * Asal olup olmadıgını:
	 * Sayı sadece kendısıne ve 1 e boulunuoyrsa asal sayıdır.
	 * valıdatıon
	 * sıfır dan kcuuk gıremezsın
	 * 2=en kucuk asal ve tek cıft sayıdır.
	 */
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		int sayi;
		boolean karar = false;
		
		while (true) {
			
			System.out.println("lütfen bir sayı giriniz:");
			sayi = klavye.nextInt();
			if (sayi <= 1) {
				System.out.println("Sıfır veya bir veya sıfırdan kucuk sayı gıremezsınız.");
				
			} else if (sayi == 2) {
				System.out.println("2sayisi ek kucuk asal ve cıft sayıdır.");
			} else {
				
				for (int i = 2; i < sayi; i++) {
					
					if (sayi % i == 0) {
						
						karar = true;
					}
				}
				if (karar) {
					System.out.println("Asal sayı değildir.");
					
				} else {
					System.out.println("Asal sayidir.");
				}
			}
			
		}
		
	}
	
}
