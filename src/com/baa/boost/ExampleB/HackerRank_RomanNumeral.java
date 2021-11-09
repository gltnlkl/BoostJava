package com.baa.boost.ExampleB;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRank_RomanNumeral {
	
	
	
	public static String StringChallenge(String str) {
		if (str == null || str.isEmpty() || !str.matches("^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"))
			return "-1";
		
		final Matcher matcher = Pattern.compile("M|CM|D|CD|C|XC|L|XL|X|IX|V|IV|I").matcher(str);
		final int[] decimalValues = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		final String[] romanNumerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int result = 0;
		
		while (matcher.find())
			for (int i = 0; i < romanNumerals.length; i++)
				if (romanNumerals[i].equals(matcher.group(0)))
					result += decimalValues[i];
				
		return String.valueOf(result);
	}
	
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a roman numeral");
		System.out.println(StringChallenge(s.nextLine()));
	}
}
