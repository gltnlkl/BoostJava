package com.baa.boost029.IO;

import java.io.FileNotFoundException;

public class TryCarchTryCatch {
	
	public static void main(String[] args) {
		
		try {
			while (true) {
				methodA();
				methodB();
				methodC();
				
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	
	private static void methodA() throws FileNotFoundException {
		System.out.println("Metod A");
		throw new FileNotFoundException("sacma sapan");
		
	}
	
	private static void methodB() {
		System.out.println("Metod B");
		
	}
	
	private static void methodC() {
		System.out.println("Metod C");
		
	}
}
