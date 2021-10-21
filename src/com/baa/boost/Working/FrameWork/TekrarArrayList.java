package com.baa.boost.Working.FrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TekrarArrayList {
	public static void main(String[] args) {
		
		List<String> iller = new ArrayList<String>();
		
		iller.add("Istanbul");
		iller.add("Ankara");
		iller.add("Adana");
		iller.add("Sivas");
		
		// iterative
		System.out.println("1 - Döngü iterative döngü");
		for (int i = 0; i < iller.size(); i++) {
			System.out.println(i + "." + iller.get(i) + " ");
			
			/*
			 * 0.Istanbul
			 * 1.Ankara
			 * 2.Adana
			 * 3.Sivas
			 */
			
		}
		System.out.println();
		
		System.out.println("\n2.Döngü Özel Döngü-----------------");
		
		// (özel döngü)
		int count = 0;
		for (String temp : iller) {
			System.out.print(count + "." + temp + " ");
			count++;
		}
		System.out.println("\ntoplam eleman sayısi: " + count);
		
		System.out.println();
		System.out.println("\n3.Iterator Döngü-----------");
		
		// (iterator döngü)
		
		Iterator<String> iterator = iller.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
	}
}
