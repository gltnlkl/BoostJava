package com.baa.boost010.IfElseLoop;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		System.out.println("\t\t====================");
		System.out.println("\t\tR�zgar Etkisi Hesab�");
		System.out.println("\t\t====================\n\n");

		double windSpeed;
		double temparature;
		Scanner scan = new Scanner(System.in);
		System.out.print("\t\tL�tfen r�zgar h�z�n� giriniz    : ");
		windSpeed = scan.nextDouble();
		
		System.out.print("\t\tL�tfen hava s�cakl���n� giriniz : ");
		temparature = scan.nextDouble();
		
		double windChill = 33 + (0.478 + 0.237 * Math.sqrt(windSpeed) - 0.0124 * windSpeed) * (temparature - 33);
		System.out.println(windChill);
		scan.close();
	}
}
