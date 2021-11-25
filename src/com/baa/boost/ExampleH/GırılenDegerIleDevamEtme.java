package com.baa.boost.ExampleH;

import java.util.Scanner;

public class GırılenDegerIleDevamEtme {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		// Random.
		// Devam etmek ıcın bır tusa basınız.
		
		System.out.println("Devam etmek için bir tusa basınız.");
		// klavye.next(); // ıkısı aynı sey
		klavye.hasNext(); // ıkısı aynı sey
		System.out.println("Devam ediyorum.");
		
	}
	
}
