package com.baa.boost.ExampleH;

import java.util.Scanner;

public class HomeworkArrayTwo {
	/*
	 * kullanıcıdan satır ve sutunlar gırılecek
	 * kullanıcıdan sımge alınacak ve sımgeyı ekrana gosterecek
	 * 2 2
	 */
	
	public static void main(String[] args) {
		
		HomeworkArrayTwo method = new HomeworkArrayTwo();
		
		Scanner input = new Scanner(System.in);
		
		String[][] multipleArray = new String[method.row()][method.col()];
		
		for (int i = 0; i < multipleArray.length; i++) {
			
			for (int j = 0; j < multipleArray[i].length; j++) {
				
				System.out.println("Lütfen " + (i + 1) + ". satırın " + (j + 1) + ". sütün sembolu giriniz?");
				
				multipleArray[i][j] = input.nextLine();
				
			}
			
		} // mevcut array ı consol a basmanın baska bır kısa yolu yok mu ?
		
		for (int i = 0; i < multipleArray.length; i++) {
			
			for (int j = 0; j < multipleArray[i].length; j++) {
				
				System.out.print(multipleArray[i][j] + " ");
				
			}
			System.out.println();
			
		}
	}
	
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
	
}