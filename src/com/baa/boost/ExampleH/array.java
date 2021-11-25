package com.baa.boost.ExampleH;

public class array {
	
	import java.util.Scanner;// dizinin elemanısını kullanıcı girecek
	// 1 ile kullanıcının vermiş olduğu sayı aralığında sayıları random olarak
	// gelsin
	// rastgele gelen sayıları dizilere atayacak.
	// 4 5 6 98 5// Eklenen bütün sayıları göstersin
	// toplamlarını ?
	// ortalaması ?
	// bu sayılardan kaç tane çift var ?
	// kaç tane tek sayı ?
	// dizinin ilk elemanı nedir ?
	// dizinin son elemanı nedir ?// rastgele sayılardan hangileri asaldır ?
	// rastgele sayılardan en küçüğünün faktöriyel// ana Method static olsun ancak
	// diğer metotlar static olmasın ?public class Dizi_Ornek_001_ortalama {
	// dizinin eleman sayısı
	public int numberOfElement() {
	Scanner klavye = new Scanner(System.in);
	System.out.println("Lütfen dizinin eleman sayısı");
	int number = klavye.nextInt();
	return number;
	}
	
	// rastgele için üst sayı giriniz
	public int topNumber() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen rastgele sayı için üst indisi giriniz.");
		int number = klavye.nextInt();
		return number;
	}
	
	// random sayılar
	public int[] randomArray() {
		// tek boyutlu dizi eleman sayısı
		int[] dizi = new int[numberOfElement()];
		// rastgele sayılar
		Random randomNumber = new Random();
		int topIndis = topNumber();
		int number;
		for (int i = 0; i < dizi.length; i++) {
			number = randomNumber.nextInt(topIndis) + 1;
			dizi[i] = number;
		}
		return dizi;
	}
	
	public static void main(String[] args) {
		Dizi_Ornek_001_ortalama deneme = new Dizi_Ornek_001_ortalama();
		int[] dizi = deneme.randomArray();
	}
}
