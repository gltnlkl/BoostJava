package com.baa.boost020.Array;

import java.util.Scanner;

public class ArrayLesson {
	
	public static void main(String[] args) {
		
		int[] arrayExample = new int[7];
		
		// 7 elemanınlı adı arrayExample olan bır dızı tanımladık
		// eleman sayısı bu andan ıtıbaren degıstırılemez.
		
		// arrayExample.length() -> dızı eleman sayısını ıcerıyor
		// bunu sorar mısın neden uyarı verıyor ?
		
		// days dızını 7 eleman ıle olusturup her bır ogeye ılk deger atadık
		// YONTEM 1
		
		String[] days = new String[7];
		
		days[0] = "Pazartesi";
		days[1] = "Salı";
		days[2] = "Carsamaba";
		days[3] = "Persembe";
		days[4] = "Cuma";
		days[5] = "Cumartesı";
		days[6] = "Pazar";
		
		// day dızını 7 eleman ıle olusturup her bır ogeye ılk deger atadık
		// YONTEM 2
		
		String[] day = { "Pazartesi", "Salı", "Carsamaba", "Persembe", "Cuma", "Cumartesi", "Pazar" };
		
		// Array elemanlarını dısarıdanda gırebılırız;
		// YONTEM 3
		
		Scanner input = new Scanner(System.in);
		System.out.println("Takımda kac oyuncu vardır? ");
		int size = input.nextInt();
		input.nextLine();
		
		// sayısal verıden sonra bu nextLine kullanılmaldır. \n karakterını okuyor enter
		// ıle basılan.
		
		String[] teamPlayers = new String[size];
		
		// for dongusu dızıler ıle calısmak ıcın cok uygun
		
		for (int i = 0; i < teamPlayers.length; i++) { // dısarıdan tek tek dızı elemanlarını ıstedık
			System.out.println("Oyuncu adı: ");
			teamPlayers[i] = input.nextLine();
		}
		
		System.out.println();
		// int i = 1;
		// while (i <= size) {
		// System.out.println(i + ".Oyuncu : " + teamPlayers[i - 1]);
		// i++;
		
	}
	
}

// }
