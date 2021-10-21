package com.baa.boost006.String;

import java.util.Scanner;

public class StringExample {
	// kullanıcının girmiş olduğu bir kelimenin;
	// eleman sayısını ?
	// bütün karakterleri küçük yapsın
	// bütün karakterleri büyük yapsın
	// başı a ile başlıyorsa evet a ile başlıyor
	// sonu a ile bitiyorsa evet a ile bitiyor
	// 0 -10 arasındaki bize göstersin sonuna ...
	// kelimenin sonuna "Bilge Adam" eklensin
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("lütfen bir kelime giriniz");
			String word = input.nextLine();
			
			
			System.out.println("Eleman sayısı: " + word.trim().length());
			System.out.println("Büyük : " + word.toUpperCase());
			System.out.println("Küçük : " + word.toLowerCase());
			
			if (word.startsWith("a")) {
				System.out.println("evet a ile başlıyor");
			} else {
				System.out.println("hayır!!!  a ile başlıyor");
			}
			
			// ternary: () ? : ;
			
			String ends = (word.endsWith("a")) ? "evet a ile bitiyor" : "hayır a ile bitiyor";
			System.out.println(ends);
			
			if (word.length() > 10) {
				System.out.println(word.substring(0, 10).concat(" ..."));
			}
			
			System.out.println(word.concat("Bilge Adam"));
			input.close();
		}
	}

