package com.baa.boost010.IfElseLoop;

import java.util.Scanner;

public class PolygonArea {

	public static void main(String[] args) {
		System.out.println("\t\t=======================");
		System.out.println("\t\tPolygon Area Calculator");
		System.out.println("\t\t=======================\n\n");

		double length;
		int numOfSides;
		boolean correctInput = true;

		Scanner scan = new Scanner(System.in);
		System.out.print("\t\tL�tfen �okgenin kenar uzunlu�unu santimetre cinsinden giriniz : ");
		do {
			length = scan.nextDouble();
			if (length <= 0.0) {
				System.err.println("Kenar uzunlu�u 0 veya s�f�rdan k���k olamaz!");
			}
		} while (length <= 0.0);
		
		System.out.print("\t\tL�tfen �okgenin kenar adedini                                 : ");
		numOfSides = scan.nextInt();

		double area = (numOfSides * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / numOfSides));
		String typeOfPolygon = switch (numOfSides) {
		case 3: {
			yield "��genin ";
		}
		case 4: {
			yield "D�rtgenin ";
		}
		case 5: {
			yield "Be�genin ";
		}
		case 6: {
			yield "Alt�genin ";
		}
		case 7: {
			yield "Yedigenin ";
		}
		case 8: {
			yield "Sekizgenin ";
		}
		case 9: {
			yield "Dokuzgenin ";
		}
		case 10: {
			yield "Ongenin ";
		}
		default: {
			correctInput = false;
			yield numOfSides + "-gen'in ";
		}
		};
		if (correctInput)
			System.out.printf(typeOfPolygon + "alan� %.2f'dir", area);
		else
			System.out.println("Yanl�� kenar adedi veya kenar uzunlu�u girdiniz");
		scan.close();

	}
}
