package com.baa.boost027.ExceptionHandle;

public class _1TryCatchExceptionTtutorials {
	
	public static void sendEmail(Exception k) {
		
		System.out.println("Yanlış bilgi girildi. " + k);
		System.out.println();
		
		// try with resources
		// object
		// throwable
		// exception -error
	}
	
	public static void main(String[] args) {
		
		// try catch throw throws finally
		
		try { // hata alabılecegımız seyı buraya yazıyoruz.
			
			int num = 3 / 0;
			
			System.out.println(num);
			
		} catch (ArithmeticException ai) { // spesifik olanı en basa yazarak alta gelerek devam edıyoruz.
			
			sendEmail(ai);
			
			// e.printStackTrace(); -- bu hata teksı bunu gostermek ıstemıyoruz
			
		} catch (Exception e) { // Exception kelımesı ıle tum olası ıstısnaları tarıflemıs oluyoruz.
			
			sendEmail(e);
			
			// e.printStackTrace(); -- bu hata teksı bunu gostermek ıstemıyoruz
		}
		
		System.out.println("Program devam ediyor...");
	}
}
