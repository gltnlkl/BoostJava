package com.baa.boost005.Scanner;

import java.util.Scanner;

public class ScannerLesson {

	public static void main(String[] args) {
		
		Scanner input= new Scanner ( System.in);
		
		System.out.println("Lütfen Bir rakam giriniz:");
		
		int number= input.nextInt();
		System.out.println(number);
		
		input.close();
	}

}
