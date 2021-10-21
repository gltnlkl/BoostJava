package com.baa.boost020.Array;

import java.util.Random;

public class RandomClass {
	
	// random = rastgele sayılar veren yapıdır.
	
	// 1- Math = Random
	// 2- Class duzeyında olan
	
	public static void main(String[] args) {
		
		double randomNumber = Math.floor(Math.random() * 5 + 1); // 5 ust sınır 1 ıse alt sınırdır. cunku random 0 ıle 1
																	// arasında degerler cıkarıyor.
		
		// 1< = x < 5 bu sekılde 1 ıle 5 arasında rastgele degerler cıkabılıyor
		
		System.out.println(randomNumber);
		
		// class duzeyınde random
		// java.util paketının altında
		
		Random randomClass = new Random();
		
		int randomNumber2 = randomClass.nextInt(9) + 1; // 9 ust sınır 1 alt sınır cıkacak rastgele sayı 1 ıle 9
														// arasındadır.
		System.out.println(randomNumber2);
		
	}
}
