package com.baa.boost006.String;

import java.util.Scanner;

public class ReverseWritingString {
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Birşeyler girin:");
		String metin = input.nextLine();
		
		String cevrilen = cevir(metin);
		System.out.println("Çevrilen Yazı: " + cevrilen);
		input.close();
	}
	
		public static String cevir(String metin) {
		if (metin.isEmpty())
			return metin;
		
		return cevir(metin.substring(1)) + metin.charAt(0);
		
	}
}
