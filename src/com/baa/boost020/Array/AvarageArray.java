package com.baa.boost020.Array;

import java.util.Random;
import java.util.Scanner;

// dızının elemanını kullanıcı gırecek
// 1 ıle kullanıcının vermıs oldugu sayı aralıgında sayıları random olarak
// gelsın

// sayıların toplamı
// sayıların ortalaması
// bu sayıların kac tanesı cıft
// bu sayıların kac tanesı tek

// ana method statıc olsun ama dıger methodlar statıc olmasın

// tek sayıları bır array e atsın
// cıft sayıları bır array e atsın

// rastgele sayılardan hangileri asaldır ?
// rastgele sayılardan en küçüğünün faktöriyel ?

public class AvarageArray {
	
	public int number() { // kullanıcıdan eleman ssayısı aldık number();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dızının eleman sayısı kactır?");
		
		int number = input.nextInt();
		input.nextLine();
		
		return number;
	}
	
	public int maxNumber() { // rastgele ıcın kullanıcıdan max. degerı aldık maxNumber();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dızının max elemanının degerı nedır?");
		
		int maxNumber = input.nextInt();
		input.nextLine();
		
		return maxNumber;
		
	}
	
	public int[] list() {
		// tek boyutlu dızı eleman sayısı
		
		int[] dizi = new int[number()];
		
		// rastgele sayılar
		
		Random randomNumber = new Random();
		
		int topIndis = maxNumber();
		int number;
		
		for (int i = 0; i < dizi.length; i++) {
			number = randomNumber.nextInt(topIndis) + 1;
			dizi[i] = number;
		}
		return dizi;
	}
	
	public void allElementArray() { // array elemanlarını gormek ıcın
		
		int toplam = 0;
		int tekSayılar = 0;
		int ciftSayılar = 0;
		double ortalama = 0.0;
		
		// iterative = indis sayısı bize lazımsa
		
		int[] dizi = list();
		
		for (int i = 0; i < dizi.length; i++) {
			
			System.out.print(dizi[i] + " ");
			
			toplam = toplam + dizi[i];
			
			if (dizi[i] % 2 == 0) {
				
				ciftSayılar++;
				
				int[] ciftDizi = new int[ciftSayılar];
				
				for (int j = 0; j < ciftDizi.length; j++) {
					
					System.out.print(ciftDizi[j] + " ");
				}
				
			} else {
				
				tekSayılar++;
				
				int[] tekDizi = new int[tekSayılar];
				
				for (int k = 0; k < tekDizi.length; k++) {
					
					System.out.print(tekDizi[k] + " ");
					
				}
				
			}
			
			System.out.println("toplamları: " + toplam);
			System.out.println("ortalaması: " + (ortalama = toplam / (dizi.length)));
			System.out.println("tek sayılar: " + tekSayılar);
			System.out.println("cift sayılar: " + ciftSayılar);
			System.out.println("Dizinin ilk elemanı: " + dizi[0]);
			System.out.println("Dizinin son elemanı: " + dizi[dizi.length - 1]);
		}
	}
	
	// maın class ına dıger clası cagırarak sonlandırıyoruz.
	
	public static void main(String[] args) {
		
		AvarageArray method = new AvarageArray();
		method.allElementArray();
		
	}
	
}
