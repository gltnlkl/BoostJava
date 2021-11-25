package com.baa.boost006.String;

public class StringLesson {

	public static void main(String[] args) {
		
		String word = "  Java Teknolojileri "; // string methodları
		System.out.println(word);
		System.out.println("Boşluk dahil simge sayısı: " + word.length());
		System.out.println("Karakterlerı buyuk gosterır: " + word.toUpperCase());
		System.out.println("karakterleri kucuk gosterır:" + word.toLowerCase());
		System.out.println(word.replace("i", "ı"));
		System.out.println(word.replace(word, "Merhaba"));
		System.out.println(word.replace("Java", "Data"));
		System.out.println(word.replace(word, "Gülten Ulukal"));
		System.out.println(word.concat("sonradan ekledim")); // sonradan ekledıgım textı ekler
		System.out.println(word.substring(3)); // den sonra gelen kısmı yazar
		System.out.println(word.substring(0, 6).concat("...devamı")); // arasındakı karakterlerı yazar
		System.out.println(word.length());
		System.out.println(word.trim().length()); // basında veya sonunda bosluk var ıse onu keser
		System.out.println(word.startsWith("  Ja")); // ıle mı baslıyor (true - false)
		System.out.println(word.endsWith(" ")); // ıle mı bıtıyor (true -false)
		System.out.println(word.isEmpty()); // içi bos mu
		
		if (!word.isEmpty()) {
			System.out.println("dolu");
		} else
			System.out.println("boş"); // bos dolu ıcın farklı bır deneme
			
		String sentence = "Java".toLowerCase();
		
		System.out.println(word.indexOf("a"));
		System.out.println(word.indexOf(sentence)); // ?? kontrol et
		System.out.println(word.charAt(3)); // . karakterı gosterır
		System.out.println(word.equals(" Java Teknolojileri ")); // ıcerıgın esıtlıgını sorguluyor
		System.out.println(word.contains("  Java ")); // ıcerıkte bır parcasını ıcerıp ıcermedıgını sorguluyor.
		
	}
	
}

