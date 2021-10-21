package com.baa.boost004.Math;

import java.util.Scanner;

public class TempretureMath {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lutfen ruzgar hizi giriniz:");
		double v = input.nextDouble();
		
		System.out.println("Lutfen sicaklik giriniz:");
		double t = input.nextDouble();
		
		double f;
		
		f = (9 / 5 * t) + 32; // ilk girilen sicaklik celcius fakat donusturme islemi F cikan sonuc ise
								// Celcius
		
		double wct = 33 + (0.478 + 0.237 * Math.sqrt(v) - (0.0124 * v)) * (f - 33);
		
		double result;
		
		result = (wct - 32) * 5 / 9;
		input.close();
		System.out.println("Hissedilen sicaklik degeri= " + result);
		
	}
	


}
