package com.baa.boost017.Methods;

// KULLANCIININ GIRDIGI SAYIYA KADAR GOSTEREN

import java.util.Scanner;

public class NumbersMethods {
	
	public static void result(int sayi) {
		for (int i = 0; i <= sayi; i++)
			System.out.println(i + "");
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz.");
		int number = input.nextInt();
		result(number);
		input.close();
		;
	}
	
}