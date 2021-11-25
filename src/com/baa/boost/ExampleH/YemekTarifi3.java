package com.baa.boost.ExampleH;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Aksam yemegıne ben bugun ne yapsam?

// Haftanın gunlerı --> pazartesı - salı - carsamba
// Ana yemekler -->kuru fasulye , pılav vs.
// Sıcak yemek -->mercımek corbası, domates corbası
// Icecekler -->su, ayran, soda
// Yemekten sonra ıcılecekler -->cay, kahve
// Tatlılar -->revanı, kıbrıs tatlısı

public class YemekTarifi3 {
	
	public static int random(int sayı) {
		
		Random random = new Random();
		
		int num = random.nextInt(sayı);
		
		return num;
		
	}
	
	public static String days() {
		
		String[] days = new String[7];
		days[0] = "Pazartesi";
		days[1] = "Salı";
		days[2] = "Çarşamba";
		days[3] = "Perşembe";
		days[4] = "Cuma";
		days[5] = "Cumartesi";
		days[6] = "Pazar";
		
		// Random random = new Random(); // random yarattım
		//
		// int num = random.nextInt(7); // 0 ıle 6 arasında random sec
		//
		// System.out.println(days[sayı]);
		
		// for (int i = 0; i < days.length; i++) {
		// System.out.println(days[i]);
		
		// int num = random(days.length); // 7 yazabılırdık
		// return days[num];
		
		return days[random(days.length)]; // yukarı satırların en ozetı random metodunu cagırdık ve return e dondurduk
	}
	
	public static String anaYemek() {
		// LAV - lınked lıst - array lıst - vektor
		
		List<String> anaYemekListesi = new ArrayList<>();
		
		anaYemekListesi.add("Kebap"); // string ekledık .add ıle
		anaYemekListesi.add("Kuru Fasulye");
		anaYemekListesi.add("Pilav");
		anaYemekListesi.add("Dolma");
		anaYemekListesi.add("Balık");
		anaYemekListesi.add("Mantı");
		
		// Random random = new Random();
		// int num = random.nextInt(anaYemekListesi.size());
		// // System.out.println(anaYemekListesi.get(num));
		
		// return anaYemekListesi.get(num); // cagırmak ıcın .get kullanıyoruz
		
		return anaYemekListesi.get(random(anaYemekListesi.size()));
		
	}
	
	public static void main(String[] args) {
		
		// 4 farklı yontem; &&&
		
		String day = days(); // days methodundan day ınt ını urettık ve onu syso a bastım
		System.out.println("Gun: " + day);
		// System.out.println(days());
		
		String anaYemek = anaYemek();
		System.out.println("Ana Yemekler: " + anaYemek);
		String hepsi = day + " " + anaYemek;
		
		System.out.println(hepsi);
		
		String hepsi2 = day.concat(" ").concat(anaYemek);
		System.out.println(hepsi2);
		
		StringBuilder builder = new StringBuilder();
		builder.append(day + " ").append(anaYemek);
		String cevir = builder.toString();
		System.out.println(cevir);
		
	}
}
