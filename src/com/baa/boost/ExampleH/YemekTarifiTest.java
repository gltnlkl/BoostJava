package com.baa.boost.ExampleH;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class YemekTarifiTest {
	
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
}
