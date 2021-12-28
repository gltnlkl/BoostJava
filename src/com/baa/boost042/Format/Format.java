package com.baa.boost042.Format;

public class Format {
	
	public static void main(String[] args) {
		
		// % [flags] [width] [.precision][argsize] typechar
		
		System.out.printf("Sag tarafa yapisik uc haneli sayilar : %3d \n", 1);
		System.out.printf("Sag tarafa yapisik uc haneli sayilar : %3d \n", 11);
		System.out.printf("Sag tarafa yapisik uc haneli sayilar : %3d \n", 111);
		System.out.printf("Sag tarafa yapisik uc haneli sayilar : %03d \n", 1);
		
		System.out.printf("Sag tarafa yapisik uc haneli sayilar : %-3d \n", 1);
		System.out.printf("Sag tarafa yapisik uc haneli sayilar : %-3d \n", 11);
		System.out.printf("Sag tarafa yapisik uc haneli sayilar : %-3d \n", 111);
		
		System.out.printf("Sag tarafa yapisik uc haneli sayilar : %03d \n", 1);
		
		System.out.printf("%03f \n\n", ((float) 1000 / 3));
		
		System.out.printf("virgulden sonra 2 hane gostermek icin : %03.2f \n\n", ((float) 1000 / 3));
		System.out.printf("virgulden sonra 2 hane gostermek icin : %-3.2f \n\n", ((float) 1000 / 3));
		
		System.out.printf("coklu ornek %7.2f %s %-3d \n\n", (float) 10 / 3, "virgullu sayinin integer hali", 10 / 3);
		System.out.printf("coklu ornek %7.3f %s %-3d \n\n", (float) 10 / 3, "virgullu sayinin integer hali", 10 / 3);
		System.out.printf("coklu ornek %7.4f %s %-3d \n\n", (float) 10 / 3, "virgullu sayinin integer hali", 10 / 3);
		
	}
	
}
