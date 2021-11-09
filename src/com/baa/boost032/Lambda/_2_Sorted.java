package com.baa.boost032.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2_Sorted {
	
	public static void main(String[] args) {
		// sorted kucukten buyuge sıralama
		// collect gunun sonunda verılerı paketle lıste olarak goster
		
		String[] dizi = { "Adana", "Nevþehir", "�?stanbul", "Muþ" };
		// Diziyi Liste çevirdik
		List<String> listem_0 = Arrays.asList(dizi);
		//////////////////////////////////////////////
		List<String> listem = Arrays.asList("Adana", "Nevþehir", "�?stanbul", "Muþ");
		/////////////////////////////////////////////
		List<String> listem2 = new ArrayList<String>();
		listem2.add("Adana");
		listem2.add("Nevþehir");
		listem2.add("�?stanbul");
		listem2.add("Muþ");
		listem2.stream().sorted().forEach(System.out::print);
		System.out.println("\n//////////");
		listem2.forEach(System.out::print);
		
	}
}
