package com.baa.boost017.Methods;

//
// ödev-1 kullanıcı tarafından girilen iki sayının hesap Makine bulan algoritma
// -
// ödev-2 kullanıcı tarafından girilen iki sayının üslü sayı bulan algoritma -
// ödev-3 kullanıcı tarafından girilen bir sayının karekök bulan algoritma -
// ödev-4 kullanıcı tarafından girilen 2 sayıyının büyüğü bulan örnek -
// ödev-5 kullanıcı tarafından girilen 2 sayıyının küçüğü bulan örnek -
// ödev-6 kullanıcı tarafından girilen sayıyını tek mi çift mi -
// ödev-7 kullanıcı tarafından kelimeyi tersten yazıdan algoritma ? -
// ödev-8 kullanıcı tarafından kelimeyi içerisindeki a harf sayısını bulan alg ?
// ödev-9 kullanıcı tarafından kelimeyi içerisindeki a harfleri e çeviren alg ?
// ödev-10 kullanıcı tarafından girilen bir sayının faktöriyeli bulan örnek
// ödev-11 kullanıcı tarafından girilen bir sayının asal olup olmadığını bulan
// ödev-12 kullanıcı tarafından girilen bir sayının yatay atış örneği bulan
// ödev-12 kullanıcı tarafından girilen bir sayının basamak sayıları bulan alg?
// ödev-13 1-10 arasındaki fibonacci sayıları bulan örnek algoritma
// ödev-14 kullanıcı tarafından girilen bir sayının armstrong olup olmadığını
// bulan örnek algoritma
//
import java.util.Scanner;

public class CalculaterGMethods {
	
	private static Scanner input = new Scanner(System.in); // scanner ı en dısa cıkardıgımda basına statıc ekledı ???
	
	public int num1() {
		int num1 = 0;
		
		System.out.println("Lutfen 1. sayiyi giriniz: ");
		num1 = input.nextInt();
		return num1;
	}
	
	public int num2() {
		int num1 = 0;
		
		System.out.println("Lutfen 2. sayiyi giriniz: ");
		num1 = input.nextInt();
		return num1;
	}
	
	public String loop() {
		
		System.out.println("Isleme devam etmek ıcın (E) tusuna cıkmak ıcın (H) tusuna basınız.");
		String loop = input.next();
		
		return loop;
		
	}
	
	public void input() {
		
		int num1 = num1(); // buraya method getırme sırası consol cıktısında onem arz edıyor!
		int num2 = num2();
		System.out.println("Lutfen islem icin secim yapiniz:/n1.Toplama/n2./Cikarma/n3.Carpma/4.Bolme/5.Mod  ");
		int input1 = input.nextInt();
		
		switch (input1) {
			case 1: {
				System.out.println("Toplama islem sonucu:" + (num1 + num2));
				break;
			}
			case 2: {
				System.out.println("Cıkarma islem sonucu:" + (num1 - num2));
				break;
			}
			case 3: {
				System.out.println("Carpma islem sonucu:" + (num1 * num2));
				break;
			}
			case 4: {
				System.out.println("Bölme islem sonucu:" + (num1 / num2));
				break;
			}
			case 5: {
				System.out.println("Mod islem sonucu:" + (num1 % num2));
				break;
			}
			default:
				System.out.println("Lütfen geçerlı bır deger gırınız.");
		}
	}
	
	public void exponentialNum() {
		
		int num1 = num1(); // aynı class ıcındekı baska bır methodu metod ıcıne cagırdım.
		int num2 = num2(); // aynı class ıcındekı baska bır methodu metod ıcıne cagırdım.
		
		System.out.println("Islem sonucu:" + (Math.pow(num1, num2)));
	}
	
	public void rootNum() {
		int num1 = num1();
		
		System.out.println("Islem sonucu:" + (Math.sqrt(num1)));
	}
	
	public void bigNum() { // dongulu versıyon
		do {
			
			int num1 = num1();
			int num2 = num2();
			
			if (num1 > num2) {
				System.out.println(num1 + " Büyük sayidir.");
			} else
				System.out.println(num2 + " Büyük sayidir.");
			
			String loop = loop();
			
			if (!loop.equalsIgnoreCase("E")) {
				break;
				
			}
			
		} while (true);
		
		System.out.println("\nBye Bye");
		
	}
	
	public void smallNum() { // dongulu versıyon // buyuk methodu ıle nasıl bırlestırebılırım ???
		do {
			
			int num1 = num1();
			int num2 = num2();
			
			if (num1 > num2) { // sadece bu degerı degıstırıp kucuk versıyonu yaratılabılır mı:?
				System.out.println(num2 + " Küçük sayidir.");
			} else
				System.out.println(num2 + " Küçük sayidir.");
			
			String loop = loop();
			
			if (!loop.equalsIgnoreCase("E")) {
				break;
				
			}
			
		} while (true);
		input.close();
		System.out.println("\nBye Bye");
		
	}
	
	public void singleDouble() {
		
		do {
			int num1 = num1();
			
			if (num1 % 2 == 0) {
				System.out.println("Çift sayıdır.");
				
			} else
				System.out.println("Tek sayıdır.");
			
			String loop = loop();
			
			if (!loop.equalsIgnoreCase("E")) {
				break;
				
			}
			
		} while (true);
		
		System.out.println("\nBye Bye");
		
	}
	
}