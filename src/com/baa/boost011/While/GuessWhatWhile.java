package com.baa.boost011.While;

import java.util.Scanner;

public class GuessWhatWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("Lutfen bir karakter giriniz:");

			String string = input.nextLine();

			char karakter = string.charAt(0); // lutfen detayli acıiklayiniz ???

			if (Character.isDigit(karakter)) {
				System.out.println("Bu bir sayidir");
			} else if (Character.isLetter(karakter)) {
				System.out.println("Bu bir harftir");
			} else {
				System.out.println("Ozel simgedir.");
			}
		}
	}
}
