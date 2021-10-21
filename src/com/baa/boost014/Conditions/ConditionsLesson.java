package com.baa.boost014.Conditions;

import java.util.Scanner;

public class ConditionsLesson {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final String password;
		final String rePassword;
		
		System.out.println("Lütfen şifrenizi giriniz:");
		password = input.nextLine();
		
		System.out.println("Lütfen şifrenizi tekrar giriniz:");
		rePassword = input.nextLine();
		
		if (password.equals(rePassword)) {
			System.out.println("Şifreniz aynıdır");
		} else {
			System.out.println("Şifreler birbirine uymadı !!!!");
		}
		input.close();
		// ödev: valueOf ile parseInt arasındaki fark
		// primitive ile wrapper arasındaki fark
		// cast: boxing /unboxing
		
	}
	
}
