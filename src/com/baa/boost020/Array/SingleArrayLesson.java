package com.baa.boost020.Array;

import java.util.Arrays;

public class SingleArrayLesson {
	
	public static void main(String[] args) {
		
		int[] dizi = new int[7];
		
		dizi[0] = 99;
		dizi[1] = 25;
		dizi[2] = 14;
		dizi[3] = 8;
		dizi[4] = 68;
		dizi[5] = 52;
		dizi[6] = 93;
		
		Arrays.sort(dizi); // dizi icini sira ile basar // ozel bir ifade
		
		for (int i = 0; i < dizi.length; i++) {
			
			System.out.println(dizi[i]);
			
		}
		
	}
	
}
