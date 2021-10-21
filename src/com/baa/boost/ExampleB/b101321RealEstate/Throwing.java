package com.baa.boost.ExampleB.b101321RealEstate;

public class Throwing {
	
	public static void main(String[] args) throws Exception {
		
		methodA();
		System.out.println("main");
		
	}
	
	private static void methodA() throws Exception {
		methodB();
		System.out.println("metodA");
	}
	
	private static void methodB() throws Exception {
		int a = 5;
		try {
			a = a / 1;
		} catch (Throwable t) {
			System.err.println("S�f�ra b�lme");
			throw new Exception("S�f�ra b�lme");
		} finally {
			System.out.println("finally metodB");
		}
		System.out.println("metodB");
		methodC();
	}
	
	private static void methodC() {
		int a = 5;
		for (int i = 0; i < 5; i++) {
			try {
				a = a / i;
				System.out.println("b�lme i�lemi");
			} catch (Throwable t) {
				System.err.println("S�f�ra b�lme");
				break;
			} finally {
				System.out.println("finally metodC");
				
			}
		}
		System.out.println("metodC");
	}
	
}
