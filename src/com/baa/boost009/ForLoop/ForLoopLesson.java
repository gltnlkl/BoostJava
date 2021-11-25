package com.baa.boost009.ForLoop;

//Kullanci 5 sayi girsin ve sonuc olarak bu sayilarin ortalamasi alinsin.

import java.util.Scanner;

public class ForLoopLesson {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int number, total = 0, median = 0;
			
			for (int i = 0; i < 5; i++) {
				
				System.out.println((i + 1) + ". sayiyi giriniz.");
				number = input.nextInt();
				total = total + number;
			}
			median = (total) / 5;
			System.out.println("Girilen 5 adet sayinin aritmatik ortalamasi: " + median);
			input.close();
			
		}
	}
