package com.baa.boost007.Character.is;

import java.util.Scanner;

public class CharacterIsLesson {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Lutfen bir karakter giriniz:");
			
			String string = input.nextLine();
			
			char character = string.charAt(0);
			
			if (Character.isDigit(character)) {
				System.out.println("Bu bir sayidir");
				
			} else if (Character.isLetter(character)) {
				System.out.println("Bu bir harftir");
				
			} else {
				System.out.println("Ozel simgedir.");
			}
		}
	}
}
