package com.baa.boost029.IO;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataWriterExample {
	
	public static void main(String[] args) {
		
		double[] values = { 1.12, 23.45, 643.0, 9834.35 };
		int[] ints = { 1, 23, 643, 9234 };
		// once fıle yarat
		File file = new File("C:\\Users\\gulte\\OneDrive - Bilgeadam Akademi\\Desktop\\deneme.ddd");
		
		// 2 text mı byte mı byte ıse stream yarat
		try {
			
			FileOutputStream fos = new FileOutputStream(file); // akısı tanımladım byte kaydet dedım
			BufferedOutputStream bos = new BufferedOutputStream(fos); // akısın yontemını bıldırıyoruz - reme gonderıp
																		// okumak ıstıyorum dedım
			DataOutputStream dos = new DataOutputStream(bos);// double yazmak ıstedıgımı soyledım ne yazmak ıstedıgımı
																// anladı
			
			for (int i = 0; i < values.length; i++) {
				dos.writeDouble(values[i]); // .double methodları cıkardı bana
				dos.write(ints[i]); // ınt kaydettı
			}
			dos.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
}
