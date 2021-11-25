package com.baa.boost020.Array;

public class MultipleArrayLesson {
	public static void main(String[] args) {
		
		// multı array
		// 2 = satır 3= sutun
		
		short[][] matrix = new short[2][3];
		
		matrix[0][0] = 0;
		matrix[0][1] = 1;
		matrix[0][2] = 2;
		
		matrix[1][0] = 3;
		matrix[1][1] = 4;
		matrix[1][2] = 5;
		
		for (int i = 0; i < matrix.length; i++) { // bırıncı dongu satırdır.
			
			for (int j = 0; j < matrix[i].length; j++) { // ıkıncı dongu sutundur.
				
				System.out.print(matrix[i][j] + "");
				
			}
			System.out.println();
		}
		
	}
}
