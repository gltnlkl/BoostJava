package com.baa.boost026.Time;

import java.util.Scanner;

public class ConsoleHelper {
	
	public static int readInt(String msg) {
		Scanner input = new Scanner(System.in);
		
		do {
			
			try {
				System.out.println(msg);
				int inputInt = input.nextInt();
				return inputInt;
				
			} catch (Exception e) {
				System.out.println("Tekrar deneyiniz.");
				input.nextLine();
				
			}
			
		} while (true);
		
	}
	
	public static String readString(String msg) {
		Scanner input = new Scanner(System.in);
		
		do {
			
			try {
				System.out.println(msg);
				String inputStr = input.nextLine();
				return inputStr;
				
			} catch (Exception e) {
				System.out.println("Tekrar deneyiniz.");
				input.nextLine();
				
			}
			
		} while (true);
	}
	
	public static double readDouble(String msg) {
		Scanner input = new Scanner(System.in);
		
		do {
			
			try {
				System.out.println(msg);
				double inputDouble = input.nextDouble();
				return inputDouble;
				
			} catch (Exception e) {
				System.out.println("Tekrar deneyiniz.");
				input.nextLine();
				
			}
			
		} while (true);
	}
	
	public static boolean isContinue(String msg, String exitKey) {
		
		String key = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println(msg);
		
		do {
			try {
				key = input.next();
				if (key.equalsIgnoreCase(exitKey)) {
					return false;
				} else {
					return true;
				}
			} catch (Exception e) {
				
			}
			
		} while (true);
		
	}
	
	public static void main(String[] args) {
		
		readInt("Sayı gır");
		readString("String gir");
		
	}
}
