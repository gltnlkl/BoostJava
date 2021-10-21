package com.baa.boost027.ExceptionHandle;

public class _5FinallyTutorials {
	public static void main(String[] args) {
		
		// try with resource !!!! zamanında tekrar çalısacagız
		
		try {
			int a = 3 / 0;
			
			System.out.println("kapatılacak : db.close();");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			// kesin kapatılacak bileşenleri buraya alırız.
			System.out.println("Kapatılacak ");
		}
	}
}
