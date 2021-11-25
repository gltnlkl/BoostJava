package com.baa.boost.ExampleH.ByPassValue;

public class ByPassValue {
	
	// parametre = metodlardakı olusturugumuz degıskenlerdır.
	// arguman = metodları cagırırken verdıgımız degıskenlerdır.
	
	// by pass value
	
	public static void byPassValue(int temp) {
		temp = 44;
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		byPassValue(55); // console 44 !!!
		
	}
	
}
