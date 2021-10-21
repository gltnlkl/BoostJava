package com.baa.boost027.ExceptionHandle;

public class ExampleH1 {
	
	public static void main(String[] args) {
		
	}
	
	private static void methodA() {
		
	}
	
	private static void methodB() {
		
		int a = 5;
		
		try {
			
			a = a / 0;
			
		} catch (Throwable t) {
			
			System.out.println("Sıfıra bölme");
			
		}
		System.out.println("Method B");
	}
}
