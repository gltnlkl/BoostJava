package com.baa.boost.ExampleH;

import java.util.Random;
import java.util.Scanner;

public class HomeworkArrayOne {
	/*
	 * kullanıcı tarafından satır ve sutun gırılecek satır ve sutun degerlerı esıt
	 * olmak zorunda ( uyarı versın)
	 * random olarak tek basamaklı sayı gırılsın
	 * 12345
	 * ortsındakı sayı dıoganal kısıma
	 * sayılardan buyuk olan uste gelecek
	 * sayılardan kucuk olan alta gelecek
	 * 3555
	 * 2355
	 * 2235
	 * 1115
	 */
	
	public int row() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lutfen satır sayısı gırınız? ");
		int rowNum = input.nextInt();
		input.nextLine();
		
		return rowNum;
	}
	
	public int col() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lutfen sutun sayısı gırınız? ");
		int colNum = input.nextInt();
		input.nextLine();
		
		return colNum;
	}
	
	public void list() {
		
		int[][] dizi = new int[row()][col()];
		
		// rastgele sayılar
		
		Random randomNumber = new Random();
		
		int number;
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				
				number = randomNumber.nextInt(9) + 1; // random 1 ıle 9 arasında rakamlar.
				
				dizi[i][j] = number;
			}
		}
		for (int i = 0; i < dizi.length; i++) {
			
			for (int j = 0; j < dizi[i].length; j++) {
				
				System.out.print(dizi[i][j] + " ");
				
			}
			System.out.println(); // satırı ınıyor
			
		}
	}
	
	public static void main(String[] args) {
		HomeworkArrayOne method = new HomeworkArrayOne();
		
		method.list();
		
	}
}
