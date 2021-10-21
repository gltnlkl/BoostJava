package com.baa.boost004.Math;

import java.util.Scanner;

public class HypotenuseMath {

	// Hipotenus: a^2+b^2
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Lutfen dik ucgenin bir kenar uzunlugu giriniz:");
			int edge1 = input.nextInt();
			
			System.out.print("Lutfen dik ucgenin bir kenar uzunlugu giriniz:");
			int edge2 = input.nextInt();
			
			double result = Math.sqrt((Math.pow(edge1, 2)) + (Math.pow(edge2, 2)));
			
			System.out.println(result);
			
			input.close();
		}
		
	}
