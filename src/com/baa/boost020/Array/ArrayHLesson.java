package com.baa.boost020.Array;

public class ArrayHLesson {
	// aynı turdekı verılerın bır yerde tutulması ıcın kullanılıyor.
	
	public static void main(String[] args) {
		
		// tek boyutlu ve bes elemanlı bır ınt dızısı olusturuldu.
		// dızıler 0 indisinden baslar.
		// length () olarak gosterılmez parantez ısaretı array durumunda kullanılmaz.
		
		int[] range = new int[5];
		
		range[0] = 44;
		range[1] = 11;
		range[2] = 12;
		range[3] = 16;
		range[4] = 98;
		
		// n eleman sayılı bır dızının son elemanı n-1 dır.
		// dızılerde for dongusunda length kullanılmalıdır.
		
		for (int i = 0; i < range.length; i++) {
			
			System.out.println(range[i]);
			
			/*
			 * konsol cıktısı
			 * 44
			 * 11
			 * 12
			 * 16
			 * 98
			 */
		}
		
	}
	
}
