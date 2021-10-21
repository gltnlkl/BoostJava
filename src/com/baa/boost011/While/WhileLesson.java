package com.baa.boost011.While;

import java.util.Scanner;

public class WhileLesson {
		// kullanıcından girilen bir sayının tek mi çift mi olduğunu bulan  
		// algoritma ? dögü ile sormaya devam et
	
	public static void main(String[] args) {
		
		while (true) {   // true nun olumlu oldugunu nereden biliyor?? neden false yazdıgımda olmuyor? 
				
			Scanner input= new Scanner ( System.in);
		
	
		System.out.println("Lütfen bir sayı giriniz: \nÇıkış yapmak için -1 tuşuna basınız.");
		int number= input.nextInt();
		
		if (number == -1) {
			System.out.println("Sistemden cikis saglaniyor.");
			
			System.exit(0); } // while döngüsünü kapatır. !!!!
		
		else {
			
		if ( number %2 == 0) 
			
		System.out.println(number + " Çift sayıdır.");
		
		else 
			
		System.out.println(number + " Tek sayıdır.");
		input.close();
			}
		}
	}

}
