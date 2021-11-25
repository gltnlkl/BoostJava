package com.baa.boost010.IfElseLoop;

import java.util.Scanner;

public class BMICalculator {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double weigth, height;
		String inp;
		do {
			
			System.out.println("\t\t=============================");
			System.out.println("\t\tWelcome to the BMI Calculator");
			System.out.println("\t\t=============================\n\n");
			
			System.out.print("\t\tL�tfen boyunuzu metre cinsinden giriniz       : ");
			height = scan.nextDouble();
			System.out.print("\t\tL�tfen a��rl���n�z� kilogram cinsinden giriniz: ");
			weigth = scan.nextDouble();
			System.out.println();
			
			double bmi = weigth / Math.pow(height, 2); // (height * height );
			System.out.printf("==> Hesaplanan v�cud k�tle endeksiniz %.2f 'dir\n\n", bmi);
			
			if (bmi < 18.5) {
				System.out.println("18, 5 kg/m.' nin alt�nda olanlar: Zay�f.");
			} else if (bmi >= 18.5 && bmi < 24.9) {
				System.out.println("18.5 � 24, 9 kg/m. aras�nda olanlar: Normal kilolu.");
			} else if (bmi >= 25 && bmi < 29.9) {
				System.out.println("25 � 29, 9 kg/m. aras�nda olanlar: Fazla kilolu.");
			} else if (bmi >= 30 && bmi < 39) {
				System.out.println("30 � 39, 9 kg/m. aras�nda olanlar: Obez.");
			} else {
				System.out.println("40 kg/m.'nin �zerinde olanlar: �leri derecede obez (morbid obez), olarak g�r�l�r.");
			}
			
			System.out.print("\t\tBir hesaplama daha yapmak istiyor musunuz? (��kmak i�in [H/h]ay�r       : ");
			inp = scan.next();
		} while (!inp.equalsIgnoreCase("h"));
		scan.close();
		
	}
	
}
