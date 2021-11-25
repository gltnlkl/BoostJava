package com.baa.boost020.Array;

import java.util.Random;
import java.util.Scanner;

// dizinin elemanini kullanici girecek
// 1 ile kullanicinin vermis oldugu sayi araliginda sayilari random olarak
// gelsin

// sayilarin toplami
// sayilarin ortalamasi
// bu sayilarin kac tanesi cift
// bu sayilarin kac tanesi tek

// ana method static olsun ama diger methodlar static olmasin

// tek sayilari bir array e atsin
// cift sayilari bir array e atsin

// rastgele sayilardan hangileri asaldir ?
// rastgele sayilardan en kucugunun faktoriyel ?

public class AvarageArray {
	
	public int number() { // kullanicidan eleman ssayisi aldik number();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dizinin eleman sayisi kactir?");
		
		int number = input.nextInt();
		input.nextLine();
		
		return number;
	}
	
	public int maxNumber() { // rastgele icin kullanicidan max. degeri aldik maxNumber();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dizinin max elemaninin degeri nedir?");
		
		int maxNumber = input.nextInt();
		input.nextLine();
		
		return maxNumber;
		
	}
	
	public int[] list() {
		// tek boyutlu dizi eleman sayisi
		
		int[] dizi = new int[number()];
		
		// rastgele sayilar
		
		Random randomNumber = new Random();
		
		int topIndis = maxNumber();
		int number;
		
		for (int i = 0; i < dizi.length; i++) {
			number = randomNumber.nextInt(topIndis) + 1;
			dizi[i] = number;
		}
		return dizi;
	}
	
	public void allElementArray() { // array elemanlarini gormek icin
		
		int toplam = 0;
		int tekSayilar = 0;
		int ciftSayilar = 0;
		double ortalama = 0.0;
		
		// iterative = indis sayisi bize lazimsa
		
		int[] dizi = list();
		
		for (int i = 0; i < dizi.length; i++) {
			
			System.out.print(dizi[i] + " ");
			
			toplam = toplam + dizi[i];
			
			if (dizi[i] % 2 == 0) {
				
				ciftSayilar++;
				
				int[] ciftDizi = new int[ciftSayilar];
				
				for (int j = 0; j < ciftDizi.length; j++) {
					
					System.out.print(ciftDizi[j] + " ");
				}
				
			} else {
				
				tekSayilar++;
				
				int[] tekDizi = new int[tekSayilar];
				
				for (int k = 0; k < tekDizi.length; k++) {
					
					System.out.print(tekDizi[k] + " ");
					
				}
				
			}
			
			System.out.println("toplamlari: " + toplam);
			System.out.println("ortalamasi: " + (ortalama = toplam / (dizi.length)));
			System.out.println("tek sayilar: " + tekSayilar);
			System.out.println("cift sayilar: " + ciftSayilar);
			System.out.println("Dizinin ilk elemani: " + dizi[0]);
			System.out.println("Dizinin son elemani: " + dizi[dizi.length - 1]);
		}
	}
	
	// main class ina diger clasi cagirarak sonlandiriyoruz.
	
	public static void main(String[] args) {
		
		AvarageArray method = new AvarageArray();
		method.allElementArray();
		
	}
	
}
