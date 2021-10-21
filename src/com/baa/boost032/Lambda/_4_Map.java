package com.baa.boost032.Lambda;

import java.util.ArrayList;
import java.util.List;

public class _4_Map {
	
	// ilk 5 say� toplam�n� yapan recursive method
	public static int sum(int sayi) {
		if (sayi > 0) {
			return sayi + sum(sayi - 1);
		} else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		// map:Stream i�erisindeki verilerin her bir eleman�na eri�im sa�lamak ve
		// her birle�en i�inde ayr� ayr� i�lemler yapmaya yarar.
		
		// verilen say�lar�n karesini alan metho yapal�m
		// 1-)psvm
		// 2-)metot
		// 3-)recursive
		int sayi = sum(5);
		System.out.println(sayi + " ");
		
		// stream()
		List<Integer> isimler = new ArrayList<>();
		isimler.add(1);
		isimler.add(2);
		isimler.add(3);
		isimler.add(4);
		isimler.add(5);
		isimler.stream().map((temp) -> temp * temp).forEach(System.out::println);
		
	}
}
