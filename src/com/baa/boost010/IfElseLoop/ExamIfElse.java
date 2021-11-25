package com.baa.boost010.IfElseLoop;

import java.util.Scanner;

public class ExamIfElse {

	/*
	 * Vize ve final notlari girisi istenecek
	 * vize %40 + final %60
	 * ort<50 ==> Kaldiniz.
	 * 50<=ort<60 ==> DC
	 * 60<=ort<70 ==> CC
	 * 70<=ort<80 ==> BA
	 * 80<=ort<=100 ==> AA
	 */
	
public static void main(String[] args) {
		
		Scanner input= new Scanner ( System.in);
		
		boolean exit = true;
		
	do  {	System.out.println("Lütfen Vize notunuzu giriniz:");
		
		int note1= input.nextInt();
		
		
		System.out.println("Lütfen Final notunuzu giriniz:");
		
		int note2= input.nextInt();
		
		
		double average =0.0;
		
		average=(note1 + note2)/2;
		
		if (average<50) {
			System.out.println("Dersten kaldiniz.");
		} else if (average>=50 && average<=50) {
			System.out.println("Ders gecme notunuz: DC dir.");
		}else if (average>=60 && average<=70) {
			System.out.println("Ders gecme notunuz: CC dir.");
		}else if (average>=70 && average<=80) {
			System.out.println("Ders gecme notunuz: BA dir.");
		}else   {
			System.out.println("Ders gecme notunuz: AA dir.");
		}
		System.out.println("Tekrar islem yapmak icin 1 cikmak icin 0 tusuna basiniz.");
		int outpoot= input.nextInt();
		
		
		if (outpoot == 0)  {    /// neden char veya String kullanamiyorum ????
			// donguden cikmak icin boolean degeri yeniden tanimlaniyor.
			exit = false;
		System.out.println("Sistemden cikis saglaniyor.");
		}
		
	} while (exit);
	
	

}

	
	
	
}
