package com.baa.boost015.Boxing;

import java.util.Scanner;

public class BoxingExample {

	// null ==>
	// sıfır oluşturulmuş bir şey var ama içinde değeri sıfır


		
			public static void main(String[] args) {
			// boxing ==> primitive Wrapper benzetiyoruz
			// unboxing ==> Wrapper bir yapıyı primitive benzetiyoruz
			
			// kullanıcıdan almış olduğumuz byte türündeki primitive sayıyı Boxing yapan
			// algoritma ?
			Scanner input = new Scanner(System.in);
			System.out.println("Lütfen bir sayı giriniz -128<=x<=127");
			
			// boxing = primitive olan bir türü wrapper classa benzetir.
			byte primitiveNumber = input.nextByte();
			Byte wrapperNumber = primitiveNumber;
			System.out.println("Wrapper: " + wrapperNumber);
			
			// unboxing = wrapper classı primitive çevirir.
			Byte wrapperNum = new Byte((byte) 44);
			long primitiveNum = wrapperNum; // unboxing
		}
		
	}
