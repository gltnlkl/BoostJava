package com.baa.boost023.VectorStack;

import java.util.Vector;

public class VectorLesson {
	
	public static void main(String[] args) {
		
		Vector<Integer> vect = new Vector<>(); // dAaimond operator <> gırıste ıcını obje ıle doldur cıkısta gerek yok
												// ac
												// kapa yeterlı Lineer bır yapıdır.
		// lınkendLıst - arrayLıst - vector hepsı lsıte halındedır
		
		vect.add(1);
		
		vect.capacity();
		vect.contains(1);
		
		Vector<Double> vect1 = new Vector<>();
		
		vect1.add(1.0);
		vect1.add(2.23);
		vect1.add(5.23);
		vect1.add(1, 1.0); // 1. elemanı 1 double ını ekle
		
		for (int i = 0; i < vect1.size(); i++) {
			System.out.println(vect1.get(i));
			
		}
		
	}
	
}
