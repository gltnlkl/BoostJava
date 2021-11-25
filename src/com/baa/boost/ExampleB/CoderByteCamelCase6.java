package com.baa.boost.ExampleB;

import java.util.Scanner;

public class CoderByteCamelCase6 {
	
	public static String StringChallenge(String str) {
		
		int n = str.length();
		
		for (int i = 0; i < n; i++) {
			
			char character = str.charAt(i);
			
			if (Character.isDigit(character) || Character.isLetter(character)) {
			} else {
				str = str.replace(String.valueOf(character), " ");
			}
		}
		
		int cnt = 0;
		
		str = str.toLowerCase();
		
		char ch[] = str.toCharArray();
		
		int res_ind = 0;
		
		for (int i = 0; i < n; i++) {
			
			if (ch[i] == ' ') {
				cnt++;
				
				ch[i + 1] = Character.toUpperCase(ch[i + 1]);
				
				continue;
			}
			
			else
				ch[res_ind++] = ch[i];
		}
		return String.valueOf(ch, 0, n - cnt);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a sentences to convert it camelCase.");
		
		System.out.println(StringChallenge(s.nextLine()));
	}
}