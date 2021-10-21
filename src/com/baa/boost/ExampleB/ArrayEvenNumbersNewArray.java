package com.baa.boost.ExampleB;

import java.util.Random;
import java.util.Scanner;

public class ArrayEvenNumbersNewArray {
	
	// random array olustur boyutunu dısarıdan al
	// yarısı random gırsın, yarısı elle gırsın
	// 1 -100 arasında olsun
	// cıft sayıları ve lısteyı console bas
	
	public int num() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen dizi eleman sayısı gırınız? ");
		int num = input.nextInt();
		input.nextLine();
		
		return num;
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayEvenNumbersNewArray method = new ArrayEvenNumbersNewArray();
		
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
		
		int[] array2 = new int[array.length];
		
		int[] array3 = new int[array.length];
		
		String oddNum = "";
		
		int j = 0;
		
		for (int i = 0; i < array2.length; i++) { // mevcut array ın ıcınden cıft sayıları alıp yenı bır array
													// olusturdum
			if ((array[i] % 2) == 0) {
				
				array2[i] = array[i];
				
				System.out.print(array2[i] + " "); //
				
			}
			
			else { // neden tek sayıları bu ıslem ıle console a basamıyorum ?????
				
				array3[j] = array[j];
				
				oddNum += " " + array3[j];
				
			}
			
		}
		
		System.out.println(oddNum);
		
	}
}
