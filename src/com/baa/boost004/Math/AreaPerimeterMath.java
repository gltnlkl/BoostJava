package com.baa.boost004.Math;

import java.util.Scanner;

public class AreaPerimeterMath {
	
	public static void main(String[] args) {
		
		// daire alanı = pi*r^2
		// daire çevre = 2pi*r
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lutfen yaricap giriniz:");
		int radius = input.nextInt();
		
		double areaCircle = (Math.PI * Math.pow(radius, 2));
		double perimeterCircle = (2 * Math.PI * radius);
		
		System.out.println("Yari capi girilen dairenin alani:" + areaCircle);
		System.out.println("Yari capi girilen dairenin cevresi:" + perimeterCircle);
		input.close();
	}
	
}
