package com.baa.boost.ExampleB;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
	
	// random array olustur boyutunu dısarıdan al
	// yarısı random gırsın, yarısı elle gırsın
	// 1 -100 arasında olsun
	// tek sayıların mın ve max. unu al
	// cıft sayıların ortalamasını al
	// bu halı ıle cıft ve tek sayıların oldugu kodları console a basmadım
	
	public int num() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen dizi eleman sayısı gırınız? ");
		int num = input.nextInt();
		input.nextLine();
		
		return num;
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		RandomArray method = new RandomArray();
		
		int[] array = new int[method.num()];
		
		Random randomNumber = new Random(); // random class ı
		int number = 0;
		
		for (int i = 0; i < (array.length / 2); i++) { // array ın yarısını elle gırdık.
			System.out.println("Lütfen " + (i + 1) + ". elemanı giriniz?");
			
			array[i] = input.nextInt();
		}
		for (int i = (array.length / 2); i < array.length; i++) { // array ın kalan yarısını random olarak atadık.
			number = randomNumber.nextInt(100); // random 0 ıle 100 arasında rakamlar.
			
			array[i] = number;
			
		}
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " "); // olusan array ı console a basıyorum
			
		}
		System.out.println();
		
		// ----- bu kısma kadar ana lısteyı olusturdum ------
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int numOfEvens = 0; // cıft sayıların adedı
		int sumEvens = 0; // cıft sayıların toplamaı
		
		for (int i = 0; i < array.length; i++) {
			
			if ((array[i] % 2) == 0) {
				sumEvens += array[i]; // sayıları topla (toplam= toplam+ array[i]) bunun aynısı demek
				numOfEvens++;
			}
			
			else {
				
			}
			if (min > array[i]) {
				
				min = array[i]; // lıstedekı en kucuk sayı
			}
			if (max < array[i]) {
				
				max = array[i]; // lıstedekı en buyuk sayı
				
			}
			
		}
		
		System.out.println("Listedeki tek en kucuk sayı        : " + min);
		System.out.println("Listedeki tek en buyuk sayı        : " + max);
		System.out.println("Listedeki cıft sayıların ortalaması: " + (sumEvens / numOfEvens));
	}
}
