package com.baa.boost027.ExceptionHandle;

public class _5ThrowsTutorials {
	
	public static void main(String[] args) {
		
		System.out.println("Hata meydana gelsin");
		// bazen projelerımızde bılerek ıstına olustururuz kı ıstısna durumunda kalsın
		
		throw new ArrayIndexOutOfBoundsException("Burada istisna meydana geldi");
		
		// System.out.println("Program devam ediyor");
		
	}
}
