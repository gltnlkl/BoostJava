package com.baa.boost003.Cast;


public class CastLesson {
public static void main(String[] args) {
		
		System.out.println((4 + 4) + " Merhabalar");
		System.out.println("Java " + " servlet");
		System.out.println(4 + " servlet");
		
		// cast:
		// String "4" 4
		
		// fL
		float f1 = 14.5f;
		long l1 = 55151515L;
		// byte short int long
		
		// küçükten büyüğe
		byte b1 = 127;
		short s1 = b1;
		
		// Büyükten küçüğe
		byte b2 = (byte) l1;
		
		// 1.ADIM
		// String bir yapıyı tam sayıya çevirme  
	
		// valueOf ==>
		// parseInt ==>
		
		String num1 = "4";
		int newnum = Integer.valueOf(num1);
		int newnum1 = Integer.parseInt(num1);
		
		int num2 = 6;
		System.out.println(num1 + num2);
		System.out.println(newnum + num2);
		System.out.println(newnum1 + num2);
		
		// 2.ADIM
		// tamsayıyı String çevirmek.
		
		int num5 = 44;
		String num6 = String.valueOf(num5);
		String num8 = Integer.toString(num5);
		
		int num7 = 16;
		System.out.println(num5 + num7);
		System.out.println(num6 + num7);
		
		
	}
}

