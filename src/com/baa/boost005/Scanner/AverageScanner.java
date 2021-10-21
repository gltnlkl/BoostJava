package com.baa.boost005.Scanner;

import java.util.Scanner;
//Kullanci 5 sayi girsin ve sonuc olarak bu sayilarin ortalamasi alinsin.
public class AverageScanner {

	
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			int sayi1=0;
			int sayi2=0;
			int sayi3=0;
			int sayi4=0;
			int sayi5=0;
			int total=0;
			int median=0;
			
			
			System.out.println("Lutfen 1.sayiyi giriniz:");
			
			sayi1 = input.nextInt();
			
			System.out.println("Lutfen 2.sayiyi giriniz:");
			
			sayi2 = input.nextInt();
			
			System.out.println("Lutfen 3.sayiyi giriniz:");
			
			sayi3 = input.nextInt();
			
			System.out.println("Lutfen 4.sayiyi giriniz:");
			
			sayi4 = input.nextInt();
			
			System.out.println("Lutfen 5.sayiyi giriniz:");
			
			sayi5 = input.nextInt();
			
			total = (sayi1 + sayi2 + sayi3 + sayi4 + sayi5);
			
			median = total / 5;
			
			System.err.println("Girilen 5 adet sayinin aritmatik ortalamasi: " + median);
			
			input.close();
			
		}
	}
