package com.baa.boost022.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import com.baa.boost018.Utils.BAUtils.BAUtils;

public class LinkedVsArrayList {
	
	public static void main(String[] args) {
		LinkedList<Long> linkedList = new LinkedList<>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		Random rnd = new Random();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			arrayList.add(rnd.nextInt());
		}
		long stop = System.currentTimeMillis();
		System.out.println("Inserting 1.000.000 element to ArrayList took: " + (stop - start));
		start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			linkedList.add(i, (long) 10000);
		}
		stop = System.currentTimeMillis();
		
		System.out.println("Inserting 1.000.000 element to LinkedList took: " + (stop - start));
		
		int input = BAUtils.readInt("Bir sayi"); // scanner cagir veri girisini sagla
		
		arrayList.add(input);
		
		System.out.println(arrayList.get(1000000));
		System.out.println(linkedList.size());
	}
}
