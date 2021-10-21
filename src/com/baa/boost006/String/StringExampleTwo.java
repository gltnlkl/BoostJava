package com.baa.boost006.String;

import java.util.Scanner;

public class StringExampleTwo {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String input;
		String str = "";
		
		do {
			System.out.println("Lutfen bır metın gırınız: ");
			
			input = inp.nextLine();
			if (!input.endsWith("it")) {
				str += input;
				
			} else {
				break;
			}
			int idx = str.indexOf("ı");
			char[] chars = str.toCharArray();
			if (idx >= 0) {
				chars[idx] = 'i';
				
			}
		} while (!input.equalsIgnoreCase("exit"));
		inp.close();
		
	}
	
}