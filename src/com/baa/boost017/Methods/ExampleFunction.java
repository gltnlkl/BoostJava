package com.baa.boost017.Methods;

import java.util.Scanner;

// kullanıcının girmiş olduğu a,b,c ve x için Fonksiyon hesaplaması yapan method

public class ExampleFunction {
	
	public void function(double a, double b, double c, double x) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen a sayısını giriniz");
		a = input.nextInt();
		System.out.println("Lütfen b sayısını giriniz");
		b = input.nextInt();
		System.out.println("Lütfen c sayısını giriniz");
		c = input.nextInt();
		System.out.println("Lütfen x sayısını giriniz");
		x = input.nextInt();
		
		function(a, b, c, x);
		
		double fx = 0.0;
		fx = (a * Math.pow(x, 2)) + (b * x) + c;
		
		System.out.println("İşlem sonucu:" + fx + "dir.");
		
	}
	
	public static void main(String[] args) {
		
	}
	
}
