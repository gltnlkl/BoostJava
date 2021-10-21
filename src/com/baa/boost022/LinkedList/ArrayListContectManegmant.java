package com.baa.boost022.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListContectManegmant {
	
	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList(75);
		
		Random rnd = new Random(); // random
		
		for (int i = 0; i < 100; i++) {
			arrayList.add(rnd.nextInt(150));
		}
		
		System.out.println(arrayList.get(63));
		arrayList.set(63, "uyıyıu");
		
		System.out.println(arrayList.get(63)); // 63. uncu elemanı degıstırdım.
		
		System.out.println(arrayList.get(64));
		System.out.println(arrayList.get(65));
		arrayList.remove(64);
		
		System.out.println(arrayList.get(64)); // 64. satırı sılınce 65 onun yerını alır
		System.out.println(arrayList.get(65));
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(arrayList.get(i));
		}
		
		// ALTTA 3 ADET CONSOLE GOSTERME SECENEGI VAR VE HEPSI ILE AYNI SONUC ELDE EDILIR. 
		// FOR DONGUSU - FOR EACH DONGUSU - ITERATE OVER AN ARRAY 
		System.out.println();
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		System.out.println();
		for (Object object : arrayList) {
			System.out.println(object); 
		}
		
		System.out.println();
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
	
	}
	
}
