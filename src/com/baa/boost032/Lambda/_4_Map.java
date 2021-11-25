package com.baa.boost032.Lambda;

public class _4_Map {
	
	// ilk 5 sayi toplamini yapan recursive method
	public static int sum(int sayi) {
		if (sayi > 0) {
			return sayi + sum(sayi - 1);
		} else {
			return 0;
		}
		
	}
	
	public static int factoriel(int sayi) {
		
		int i;
		
		for (i = 1; i < sayi; i++) {
			
			i = i * (i + 1);
		}
		return i;
		
	}
	
	public static void main(String[] args) {
		// map:Stream icerisindeki verilerin her bir elemanina erişim saglamak ve
		// her bilesen icinde ayri ayri iclemler yapmaya yarar.
		
		// verilen sayilarin karesini alan method yapalim
		// 1-)psvm
		// 2-)metot
		// 3-)recursive
		
		// int sayi = sum(5);
		// System.out.println(sayi + " ");
		//
		// // stream()
		// List<Integer> isimler = new ArrayList<>();
		//
		// isimler.add(1);
		// isimler.add(2);
		// isimler.add(3);
		// isimler.add(4);
		// isimler.add(5);
		// isimler.stream().map((temp) -> temp * temp).forEach(System.out::println);
		
		System.out.println(factoriel(4));
		
	}
}
