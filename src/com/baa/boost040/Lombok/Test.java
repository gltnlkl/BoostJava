package com.baa.boost040.Lombok;

public class Test {
	
	public static void main(String[] args) {
		
		LombokClass lombok = new LombokClass();
		
		lombok.setAdi("G�lten");
		
		String name = lombok.getAdi();
		
		System.out.println(name);
		
	}
	
}
