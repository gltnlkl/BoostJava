package com.baa.boost029.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterReaderLesson {
	
	public static void fileWriterMethod() {
		
		// linux: \
		// windows: /
		
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		
		String path = "D:\\bilgeAdamDeneme\\deneme.txt"; // --dosyanın yerını gosterıyoruz
		
		try {
			
			fileWriter = new FileWriter(path, true); // true yazdıgımızda mevcut dosyayı koruyup ustune yazarız her
														// seferınde
			
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("Gülten Ulukal");
			bufferedWriter.write("Hello");
			bufferedWriter.flush();
			// bufferedWriter.close();
			
			System.out.println("Dosyalar yazıldı.");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public static void fileWriterTryWithResources() {
		
		String path = "D:\\bilgeAdamDeneme\\deneme.txt";
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
			bufferedWriter.write("yeni satır");
			bufferedWriter.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void fileReaderNotTryWithResources() { // okuma ıslemı
		String path = "D:\\bilgeAdamDeneme\\deneme.txt";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			
			String toplamSatirlar = "";
			String satir = "";
			
			while ((satir = bufferedReader.readLine()) != null) { // () !=null ıcı bos degılse
				toplamSatirlar = toplamSatirlar + satir + "\n";
			}
			
			System.out.println(toplamSatirlar);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		// fileWriterMethod();
		fileReaderNotTryWithResources();
		
	}
}