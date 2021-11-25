package com.baa.boost005.Scanner;

import java.util.Scanner;

public class DaysOfTheWeekScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lutfen haftanin gününü 1 ile 7 arasinda bir sayi olarak giriniz:");
		int day = input.nextInt();
		if (day > 0) {
			switch (day) {
				case 1:
					System.out.println("Pazartesi");
					break;
				case 2:
					System.out.println("Sali");
					break;
				case 3:
					System.out.println("Carsamba");
					break;
				case 4:
					System.out.println("Persembe");
					break;
				case 5:
					System.out.println("Cuma");
					break;
				case 6:
					System.out.println("Cumartesi");
					break;
				case 7:
					System.out.println("Pazar");
					break;
				default:
					System.out.println("Lutfen belirtilen aralikta bir sayi giriniz.");
			}
		} else {
			System.out.println("Lutfen belirtilen aralikta bir sayi giriniz.");
		}
		
		input.close();
		
	}
	
}
