package com.baa.boost013.Ternary;

import java.util.Scanner;

public class TernaryLesson {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz");
		String word = input.nextLine();
		
		String ends = (word.endsWith("a")) ? "evet a ile bitiyor" : "hayir a ile bitmiyor";
		System.out.println(ends);
		
		input.close();
	}
	
}
