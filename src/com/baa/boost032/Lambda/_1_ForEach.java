package com.baa.boost032.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _1_ForEach {
	
	public static void main(String[] args) {
		
		String[] dizi = { "Adana", "Nevsehir", "Istanbul", "Mus", "Malatya" };
		
		List<String> myList = Arrays.asList(dizi); // diziyi listeye çevir
		
		// List<String> myListNew = new ArrayList<String>();
		//
		// myListNew.add("Adana");
		// myListNew.add("Nevsehir");
		// myListNew.add("Istanbul");
		// myListNew.add("Mus");
		
		// myListNew.forEach(System.out::print);
		
		System.out.println();
		
		myList.stream().forEach(System.out::print);
		
		System.out.println("\n");
		
		myList.stream().sorted().forEach(System.out::print);
		
		System.out.println("\n");
		
		List<String> newList = new ArrayList<String>();
		
		newList = myList.stream().filter((temp) -> "Malatya".equals(temp)).collect(Collectors.toList());
		
		newList.forEach(System.out::println);
		
	}
}
