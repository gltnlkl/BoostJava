package com.baa.boost017.Methods;

import java.util.Scanner;

// kullanici tarafindan girilen 2 sayiyi hesaplama yapsin
// 1.toplama
// 2.Carpma
// 3.Cikarma
// 4.bolme
// 5.kalan

// odev-1 kullanici tarafindan girilen iki sayinin hesap Makine bulan algoritma
// odev-2 kullanici tarafindan girilen iki sayinin uslu sayi bulan algoritma
// odev-3 kullanici tarafindan girilen bir sayinin karekok bulan algoritma
// odev-4 kullanici tarafindan girilen 2 sayiyinin buyugu bulan ornek
// odev-5 kullanici tarafindan girilen 2 sayiyinin kuCugu bulan ornek
// odev-6 kullanici tarafindan girilen sayiyini tek mi Cift mi
// odev-7 kullanici tarafindan kelimeyi tersten yazidan algoritma ?
// odev-8 kullanici tarafindan kelimeyi iCerisindeki a harf sayisini bulan alg
// ?
// odev-9 kullanici tarafindan kelimeyi iCerisindeki a harfleri e Ceviren alg ?
// odev-10 kullanici tarafindan girilen bir sayinin faktoriyeli bulan ornek
// odev-11 kullanici tarafindan girilen bir sayinin asal olup olmadigini bulan
// odev-12 kullanici tarafindan girilen bir sayinin yatay atis ornegi bulan
// odev-12 kullanici tarafindan girilen bir sayinin basamak sayilari bulan alg?
// odev-13 1-10 arasindaki fibonacci sayilari bulan ornek algoritma
// odev-14 kullanici tarafindan girilen bir sayinin armstrong olup olmadigini
// bulan ornek algoritma
public class CalculaterMethods {
	
	// hesap makinasi metodu
	
	// hesap makinasi metodu
	public void hesapMakinasi() {
		Scanner klavye = new Scanner(System.in);
		int sayi1, sayi2;
		System.out.println("lütfen 1.sayı giriniz");
		sayi1 = klavye.nextInt();
		System.out.println("lütfen 2.sayı giriniz");
		sayi2 = klavye.nextInt();
		
		System.out.println("toplama" + (sayi1 + sayi2));
		System.out.println("çıkarma " + (sayi1 - sayi2));
		System.out.println("çarpma " + (sayi1 * sayi2));
		System.out.println("bölme: " + (sayi1 / sayi2));
		System.out.println("kalan: " + (sayi1 % sayi2));
	}
	
	// üslü sayı
	public void usluSayi() {
		Scanner klavye = new Scanner(System.in);
		int sayi1, sayi2;
		System.out.println("lütfen alt  giriniz");
		sayi1 = klavye.nextInt();
		System.out.println("lütfen üst giriniz");
		sayi2 = klavye.nextInt();
		System.out.println(Math.pow(sayi1, sayi2));
	}
	
	// karekök
	public void karekokSayi() {
		Scanner klavye = new Scanner(System.in);
		double sayi1;
		System.out.println("lütfen bir sayı  giriniz");
		sayi1 = klavye.nextInt();
		System.out.println(Math.sqrt(sayi1));
	}
	
	// sayı 1
	public int sayi1() {
		int sayi1;
		Scanner klavye = new Scanner(System.in);
		System.out.println("lütfen 1.sayıyı  giriniz");
		sayi1 = klavye.nextInt();
		return sayi1;
	}
	
	// sayı 2
	public int sayi2() {
		int sayi1;
		Scanner klavye = new Scanner(System.in);
		System.out.println("lütfen 2. sayıyı  giriniz");
		sayi1 = klavye.nextInt();
		return sayi1;
	}
	
	// 2 sayı arasıdaki en büyüğü bulan
	public void buyuk() {
		int sayi1 = sayi1();
		int sayi2 = sayi2();
		
		if (sayi1 > sayi2) {
			System.out.println(sayi1 + " büyüktür");
		} else {
			System.out.println(sayi1 + " küçüktür");
		}
	}
	
	// 2 sayı arasıdaki en küçüğü bulan
	public void kucuk() {
		int sayi1 = sayi1();
		int sayi2 = sayi2();
		
		if (sayi1 < sayi2) {
			System.out.println(sayi1 + " küçüktür");
		} else {
			System.out.println(sayi1 + " büyüktür");
		}
	}
	
	// çift sayı tek sayı
	public void tekCift() {
		int sayi1 = sayi1();
		if (sayi1 % 2 == 0) {
			System.out.println("çift sayıdır");
		} else {
			System.out.println("Sayı tektir");
			
		}
	}
	
	// Kullanıcı tarafından girilen kelimenin içindeki a harflerini sayan algoritma
	// 1-) dış dünyada bir şeyler gönderecek miyim ?
	// 2-) dış dünyadan metoda birşeyler geliyor mu ?
	
	// abc
	public String scannerVocabulary() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = klavye.nextLine();
		return kelime;
	}
	
	public void vowelLetter(String cemil) {
		int count = 0;
		for (int i = 0; i < cemil.length(); i++) {
			if (cemil.charAt(i) == 'a') {
				count++;
			}
		}
		
		System.out.println("a sayısı: " + count);
	}
	// Java By pass value mi ? java by pass referances mi dir?
	// örneklerini vererek açıklayalım ?
	
	// Köklerini bulan aolgoritma f(x) diskriminant örneği ?
	
	// kullanıcının girmiş olduğu a,b,c ve x için Fonksiyon hesaplaması yapa
	// f(x)=ax^2+bx+c Math ?
	// f(x) diskriminant örneği ?
	
	public static void functionExam(int a, int b, int c, int x) {
		double result = a * Math.pow(x, 2) + b * x + c;
		System.out.println(result);
	}
	
	public static int sayi11() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("sayıyı giriniz");
		int value = klavye.nextInt();
		return value;
	}
	
	public static void sukru() {
		int a = sayi11();
		int b = sayi11();
		int c = sayi11();
		int x = sayi11();
		System.out.println(functionExam2(a, b, c, x));
	}
	
	public static double functionExam2(int a, int b, int c, int x) {
		double result = a * Math.pow(x, 2) + b * x + c;
		return result;
	}
	
	// 15 ekim
	public static void main(String[] args) {
		sukru();
	}
	
}
