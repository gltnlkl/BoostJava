package com.baa.boost017.Methods;

import java.util.Scanner;

// kullanıcı tarafından girilen sayının ortalaması alsın
// ortalama 10'dan büyükse Büyük desin değilse küçük desin.

public class AvaregeMethods {
	
	public static void returnAverage() {
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4;
		System.out.println((num1 + num2 + num3 + num4) / 4);
	}
	
	public static void returnAverage(int num1, int num2, int num3, int num4) {
		System.out.println((num1 + num2 + num3 + num4) / 4);
	}
	
	public static void returnAverage2() {
		Scanner input = new Scanner(System.in);
		int num1;
		double total = 0, avarege = 0.0;
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Lütfen " + (i + 1) + ". sayıyı giriniz");
			num1 = input.nextInt();
			total += num1;
			avarege = total / (i + 1);
		}
		System.out.println(avarege);
	}
	
	public static double returnAverage3() {
		Scanner input = new Scanner(System.in);
		int num1;
		double total = 0, average = 0.0;
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Lütfen " + (i + 1) + ". sayıyı giriniz");
			num1 = input.nextInt();
			total += num1;
			average = total / (i + 1);
		}
		return average;
	}
	
	public static void main(String[] args) {
		// returnAverage();
		// returnAverage(1, 2, 3, 4);
		// returnAverage2();
		
		double result = returnAverage3();
		
		if (Math.round(result) >= 10) {
			System.out.println("Sayınız 10 veya 10 büyüktür");
		} else {
			System.out.println("Sayınız 10 dan küçüktür");
		}
		
	}
}
