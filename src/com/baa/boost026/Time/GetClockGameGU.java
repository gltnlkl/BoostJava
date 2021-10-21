package com.baa.boost026.Time;

import java.time.LocalTime;
import java.util.Scanner;

public class GetClockGameGU {
	
	public static void game() {
		
		int timeNow = 0;
		String guessTimeS = "";
		int guessTimeN = 0;
		boolean inputCheck = true;
		
		do {
			LocalTime time = LocalTime.now();
			System.out.println(time.getHour());
			timeNow = time.getHour();
			Scanner input = new Scanner(System.in);
			System.out.println("Lütfen tahmin için 1 ile 12 arası bir rakam giriniz.");
			System.out.println();
			guessTimeS = input.nextLine();
			
			if (!guessTimeS.chars().allMatch(Character::isDigit)) {
				System.out.println("Yanlış bilgi girdiniz.");
				System.out.println();
				inputCheck = false;
			}
			
			if (Integer.parseInt(guessTimeS) <= 0) {
				System.out.println("Yanlış bilgi girdiniz.");
				System.out.println();
				inputCheck = false;
			} else {
				inputCheck = false;
			}
		} while (!inputCheck);
	}
	
	public static void main(String[] args) {
		game();
		
	}
}
