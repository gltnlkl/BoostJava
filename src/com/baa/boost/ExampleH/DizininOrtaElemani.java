package com.baa.boost.ExampleH;

import java.util.Scanner;

public class DizininOrtaElemani {
	
	public static void main(String[] args) {
		
		// kullanıcı tarafından gırılen tek sayıya kadar kı sayıların dızıye atanması ve
		// ortanca sayısını bulmak?
		
		// 1 2 3 4 5
		// dızının orta elemanını buldum ve onu konsola yazdırdım.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lutfen eleman sayısı gırınız? ");
		int num = input.nextInt();
		input.nextLine();
		
		String[] array = new String[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("Lütfen " + (i + 1) + ". sayıyı giriniz?");
			array[i] = input.nextLine();
		}
		double orta = 0;
		orta = Math.ceil(num / 2.0); // yukarı yuvarlar ceil
		System.out.println("Dızının orta elemanı numarası : " + orta);
		input.nextLine();
		System.out.println("Dizinin orta elemanının değeri: " + array[(int) orta]);
		input.nextLine();
	}
	
}
