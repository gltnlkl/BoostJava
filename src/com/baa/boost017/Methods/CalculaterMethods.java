package com.baa.boost017.Methods;

import java.util.Scanner;

// kullanıcı tarafından girilen 2 sayıyı hesaplama yapsın
// 1.toplama
// 2.çarpma
// 3.çıkarma
// 4.bölme
// 5.kalan

// ödev-1 kullanıcı tarafından girilen iki sayının hesap Makine bulan algoritma
// ödev-2 kullanıcı tarafından girilen iki sayının üslü sayı bulan algoritma
// ödev-3 kullanıcı tarafından girilen bir sayının karekök bulan algoritma
// ödev-4 kullanıcı tarafından girilen 2 sayıyının büyüğü bulan örnek
// ödev-5 kullanıcı tarafından girilen 2 sayıyının küçüğü bulan örnek
// ödev-6 kullanıcı tarafından girilen sayıyını tek mi çift mi
// ödev-7 kullanıcı tarafından kelimeyi tersten yazıdan algoritma ?
// ödev-8 kullanıcı tarafından kelimeyi içerisindeki a harf sayısını bulan alg ?
// ödev-9 kullanıcı tarafından kelimeyi içerisindeki a harfleri e çeviren alg ?
// ödev-10 kullanıcı tarafından girilen bir sayının faktöriyeli bulan örnek
// ödev-11 kullanıcı tarafından girilen bir sayının asal olup olmadığını bulan
// ödev-12 kullanıcı tarafından girilen bir sayının yatay atış örneği bulan
// ödev-12 kullanıcı tarafından girilen bir sayının basamak sayıları bulan alg?
// ödev-13 1-10 arasındaki fibonacci sayıları bulan örnek algoritma
// ödev-14 kullanıcı tarafından girilen bir sayının armstrong olup olmadığını
// bulan örnek algoritma
public class CalculaterMethods {
	
	// hesap makinasi metodu
	
	public void calculater() {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.println("lütfen 1.sayı giriniz");
		num1 = input.nextInt();
		System.out.println("lütfen 2.sayı giriniz");
		num2 = input.nextInt();
		
		System.out.println("toplama" + (num1 + num2));
		System.out.println("çıkarma " + (num1 - num2));
		System.out.println("çarpma " + (num1 * num2));
		System.out.println("bölme: " + (num1 / num2));
		System.out.println("kalan: " + (num1 % num2));
	}
	
	// üslü sayı
	
	public void exponantionalNum() {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.println("lütfen alt  giriniz");
		num1 = input.nextInt();
		System.out.println("lütfen üst giriniz");
		num2 = input.nextInt();
		System.out.println(Math.pow(num1, num2));
	}
	
	// karekök
	
	public void karekokSayi() {
		Scanner input = new Scanner(System.in);
		double num1;
		System.out.println("lütfen bir sayı  giriniz");
		num1 = input.nextInt();
		System.out.println(Math.sqrt(num1));
	}
	
	public int num1() {
		int num1;
		Scanner input = new Scanner(System.in);
		System.out.println("lütfen 1.sayıyı  giriniz");
		num1 = input.nextInt();
		return num1;
	}
	
	public int num2() {
		int num1;
		Scanner input = new Scanner(System.in);
		System.out.println("lütfen 2. sayıyı  giriniz");
		num1 = input.nextInt();
		return num1;
	}
	
	public void buyuk() {
		int num1 = num1();
		int num2 = num2();
		
		if (num1 > num2) {
			System.out.println(num1 + " büyüktür");
		} else {
			System.out.println(num1 + " küçüktür");
		}
		
	}
	
}
