package com.baa.boost027.ExceptionHandle;

import java.io.IOException;

public class _ThrowsTutorials {
	public static void deneme() throws IOException, ArithmeticException, NullPointerException, Exception {
		
		int sayi = 0 / 3;
		System.out.println(sayi);
		System.out.println("Program devam ediyor 2222");
		
	}
	
	public static void main(String[] args) {
		
		try {
			deneme();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
