package com.baa.boost002.DataTypes;

public class DataTypesExample {
	public static void main(String[] args) {
		
		// tamsayÄ±lar: b<s<i<l
		// byte < short < int <long
		// virgÃ¼llÃ¼ sayÄ±: float,double yorum ekledım
		// boolean true,false
		// char
		
		// tamsayÄ±larda: defaultta int
		// virgÃ¼llÃ¼ sayÄ±larda: defaultta double
		
		// cast: fL
		
		// tam sayÄ±
		int degiskenAdi0 = 144444;
		System.out.println(degiskenAdi0);
		
		long degiskenAdi = 14444444444L;
		System.out.println(degiskenAdi);
		
		// virgullu sayÄ±lar
		float virgulluSayi = 14.44f;
		System.out.println(virgulluSayi);
		
		double virgulluSayi2 = 14.44;
		System.out.println(virgulluSayi2);
		
		// boolean
		boolean b1 = false;
		b1 = 4 > 1;
		b1 = -1 < 9;
		System.out.println(b1);
		// escape character ==> \
		
		// char
		char c1 = '\u4585'; // ä–…
		System.out.println(c1);
		
	}
	
}
