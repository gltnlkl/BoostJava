package com.baa.boost.ExampleB;

import java.util.Scanner;

public class ChessTable {
	public int horse() { 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lutfen atı oynatmak ıstedıgınız pozısyonu giriniz? ");
		int horse = input.nextInt();
		input.nextLine();
		
		return horse;
	}
	
	public static void main(String[] args) {
		
		String[][] chessBoard = new String[8][8];
		
		for (int i = 8; i > 0; i--) {
			
			for (char c = 'a'; c <= 'h'; c++) {
				
				chessBoard[c - 'a'][i - 1] = (char) c + "" + i; // (char) c ---- dıyerek c char degerlerını Strıng e
																// donusturduk.
				
				System.out.print(chessBoard[c - 'a'][i - 1] + " ");
				
				// console cıktısı bu sekılde oluyor; her degerı atamıs olduk,
				
				// a8 b8 c8 d8 e8 f8 g8 h8
				// a7 b7 c7 d7 e7 f7 g7 h7
				// a6 b6 c6 d6 e6 f6 g6 h6
				// a5 b5 c5 d5 e5 f5 g5 h5
				// a4 b4 c4 d4 e4 f4 g4 h4
				// a3 b3 c3 d3 e3 f3 g3 h3
				// a2 b2 c2 d2 e2 f2 g2 h2
				// a1 b1 c1 d1 e1 f1 g1 h1
				
		
				
			}
			System.out.println(); // table seklınde satırları asagı ındırır.
		}
	}
}
