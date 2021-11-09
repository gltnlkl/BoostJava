package com.baa.boost029.IO;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataWriterExample {
	
	public static void main(String[] args) {
		
		double[] values = { 1.12, 23.45, 643.0, 9834.35 };
		int[] ints = { 1, 23, 643, 9234 };
		// once file yarat
		File file = new File("C:\\Users\\gulte\\OneDrive - Bilgeadam Akademi\\Desktop\\deneme.ddd");
		
		// 2 text mi byte mi byte ise stream yarat
		try {
			
			FileOutputStream fos = new FileOutputStream(file); // akisi tanimladim byte kaydet dedim
			BufferedOutputStream bos = new BufferedOutputStream(fos); // akisin yontemini bildiriyoruz - reme gonderip
																		// okumak istiyorum dedim
			DataOutputStream dos = new DataOutputStream(bos);// double yazmak istedigimi soyledim ne yazmak istedigimi
																// anladi
			
			for (int i = 0; i < values.length; i++) {
				dos.writeDouble(values[i]); // .double methodlari cikardi bana
				dos.write(ints[i]); // int kaydetti
			}
			dos.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
}
