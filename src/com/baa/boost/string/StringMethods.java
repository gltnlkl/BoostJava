package com.baa.boost.string;

public class StringMethods {
	
	public static void main(String[] args) {
		// charAt
		System.out.println(" char at()\n");
		
		String name = "javatpoint";
		System.out.println("4th character in String is: " + name.charAt(4)); // returns the char value at the 4th index
		System.out.println("Character at last index is: " + name.charAt(name.length() - 1));
		// The last Character is present at the string length-1 index
		
		// compare
		System.out.println("\n compare to()\n");
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "meklo";
		String s4 = "hemlo";
		String s5 = "flag";
		String s6 = "";
		System.out.println(s1.compareTo(s2));// 0 because both are equal
		System.out.println(s1.compareTo(s3));// -5 because "h" is 5 times lower than "m"
		System.out.println(s1.compareTo(s4));// -1 because "l" is 1 times lower than "m"
		System.out.println(s1.compareTo(s5));// 2 because "h" is 2 times greater than "f"
		System.out.println(s1.compareTo(s6));
		
		// concat
		System.out.println("\n concat()\n");
		String str1 = "Hello";
		String str2 = "Javatpoint";
		String str3 = "Reader";
		// Concatenating one string
		
		System.out.println(str1 + " " + str2 + " " + str3);
		String str4 = str1.concat(str2);
		System.out.println(str4);
		// Concatenating multiple strings
		String str5 = str1.concat(str2).concat(str3);
		System.out.println(str5);
		
		// Concatenating Space among strings
		String str6 = str1.concat(" ").concat(str2).concat(" ").concat(str3);
		System.out.println(str6);
		// Concatenating Special Chars
		String str7 = str1.concat("!!!");
		System.out.println(str7);
		String str8 = str1.concat("@").concat(str2);
		System.out.println(str8);
		System.out.println("Gülten ".concat(str8));
		
		// contains boolean
		System.out.println("\n contains()\n");
		
		String name1 = "what do you know about me";
		System.out.println(name1.contains("do you know"));
		System.out.println(name1.contains("about"));
		System.out.println(name1.contains("hello"));
		
		// endsWith()
		
		System.out.println("\n endsWith() \n");
		
		String s20 = "java by javatpoint";
		System.out.println(s20.endsWith("t"));
		System.out.println(s20.endsWith("point"));
		System.out.println(s20.endsWith("pork"));
		
		// equals()
		
		System.out.println("\n equals() \n");
		
		String s12 = "javatpoint";
		String s21 = "javatpoint";
		String s13 = "JAVATPOINT";
		
		System.out.println(s12.equals(s21));// true because content and case is same
		System.out.println(s12.equals(s13));// false because case is not same
		
		// equalsIgnoreCase()
		
		System.out.println(" \n equalsIgnoreCase()\n");
		
		String a1 = "javatpoint";
		String a2 = "javatpoint";
		String a3 = "JAVATPOINT";
		String a4 = "python";
		System.out.println(a1.equalsIgnoreCase(a2));// true because content and case both are same
		System.out.println(a1.equalsIgnoreCase(a3));// true because case is ignored
		System.out.println(a1.equalsIgnoreCase(a4));// false because content is not same
		
		// string format
		
		System.out.println("\n string format() \n");
		
		String str12 = String.format("%d", 101);
		String str22 = String.format("|%10d|", 101); // Specifying length of integer
		String str32 = String.format("|%-10d|", 101); // Left-justifying within the specified width
		String str42 = String.format("|% d|", 101);
		String str52 = String.format("|%010d|", 121101); // Filling with zeroes
		System.out.println(str12);
		System.out.println(str22);
		System.out.println(str32);
		System.out.println(str42);
		System.out.println(str52);
		
		System.out.printf("%03d", 2);
		
		String name2 = "sonoo";
		String sf1 = String.format("name is %s", name2);
		String sf2 = String.format("value is %f", 32.33434);
		String sf3 = String.format("value is %32.12f", 32.33434);// returns 12 char fractional part
		// filling with 0
		
		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3);
		
		String str11 = String.format("%d", 101); // Integer value
		String str212 = String.format("%s", "Amar Singh"); // String value
		String str13 = String.format("%f", 101.00); // Float value
		String str14 = String.format("%x", 101); // Hexadecimal value
		String str15 = String.format("%c", 'c'); // Char value
		System.out.println(str11);
		System.out.println(str212);
		System.out.println(str13);
		System.out.println(str14);
		System.out.println(str15);
	}
}
