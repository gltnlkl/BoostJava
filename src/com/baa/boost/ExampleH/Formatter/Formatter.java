package com.baa.boost.ExampleH.Formatter;

public class Formatter {
	
	public static void main(String[] args) {
		
		String kelime = "Java SE";
		int onlukSayi = 55;
		double virgüllüSayı = 66.44;
		
		// syntax -- cc c++
		// System.out.printf("%s %d %f", kelime, onlukSayi, virgüllüSayı); // s string d
		// decimal f float
		System.out.printf("%10s %30d %f", kelime, onlukSayi, virgüllüSayı);
	}
}
