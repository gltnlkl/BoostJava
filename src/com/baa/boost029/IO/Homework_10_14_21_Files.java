package com.baa.boost029.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.baa.boost026.Time.ConsoleHelper;

// 2.SORU
// 2.adim c:surucusunu altinda kullanici tarafindan "dizin" adindan File ile
// java tarafindan dizin olusturalim

// 3.adim c:\\dizin altina kullanici tarafindan "bilgeadam.txt" dosya
// olusturalim bilgeadam.txt dosyasi olusturalim

// Secenekli bir sekilde
// 0-Cikis
// 1-dosyaCreate
// 2-dizinCreate
// 3-Add(Yazma)
// 4-Read(Okuma)
// 5-Delete(Silmek)
// 6-Dosya ozellikleri
// 6.1 Dosya mi
// bu dizin mi ? dosya mi?
// yazilabilrinir mi ? okunabilinir mi calisabilinir mi?

// URL URI arastirmak odevi

public class Homework_10_14_21_Files {
	
	public static void action(Map<String, Object> myMap) throws IOException {
		
		String path = (String) myMap.get("path");
		
		File file = (File) myMap.get("file");
		
		boolean isloop = true;
		
		do {
			
			switch (choose()) {
				case "0":
					System.out.println("Sistemden cikiliyor.");
					isloop = false;
					break;
				case "1":
					newFolder();
					break;
				case "2":
					newFile();
					break;
				case "3":
					fileWrite(path);
					break;
				case "4":
					readFile(path);
					break;
				case "5":
					deleteFile(file, path);
					break;
				case "6":
					System.out.println("Dosya ismi: \n" + file.getName() + "Dosya konumu: \n" + file.getAbsolutePath()
							+ "Dosya boyutu: \n" + file.length() + "Dosya listesi: \n" + file.list());
					break;
				
			}
			
		} while (isloop);
	}
	
	private static void deleteFile(File file, String path) {
		try {
			
			if (file.exists()) {
				file.delete();
				System.out.println("Dosya Silindi");
			} else {
				System.out.println("Dosya Silinmedi");
				
				System.out.println("path:" + file.toPath());
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void readFile(String path) {
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			
			String toplamSatirlar = "";
			String satir = "";
			
			while ((satir = bufferedReader.readLine()) != null) { // () !=null ici bos degilse
				toplamSatirlar = toplamSatirlar + satir + "\n";
			}
			
			System.out.println(toplamSatirlar);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	private static void fileWrite(String path) {
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
			
			bufferedWriter.write(ConsoleHelper.readString("Lutfen yazilmasini istediginiz bilgileri giriniz."));
			bufferedWriter.flush();
			System.out.println("Yazma islemi basarili");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static String choose() {
		
		String selection = ConsoleHelper.readString(
				"Lutfen yapmak isteginiz islemi seciniz:\n0-Cikis\n1-Yeni klasor Olusturma\n2-Yeni dosya olusturma\n3-Olusturulan dosyaya veri yazma\n4-Olusturulan dosyayi okuma\n5-Olusturulan dosyayi silme\n6-Dosya ozellikleri\n6.1-Dosya mi?\n6.2-Dizin mi?\n6.3-Yazilabilrinir mi?\n6.4-Okunabilinir mi?\n6.5-Calisabilinir mi?");
		;
		return selection;
	}
	
	public static String newFolder() throws IOException { // NEDEN THROWS YAPMAYA ZORLUYOR ???
		String path = "";
		
		path = ConsoleHelper.readString(
				"Lutfen dosya olusturmak istediginiz yolu (D:\\bilgeAdamDeneme\\folder) seklinde belirtiniz");
		
		File myFolder = new File(path);
		
		boolean bool = myFolder.mkdir();
		if (bool) {
			System.out.println("Klasor olusturuldu: " + myFolder.getName());
		} else {
			System.out.println("Klasor olusturulamadi.");
		}
		return path;
	}
	
	public static Map<String, Object> newFile() { // yeni dosya olusturma
		
		Map<String, Object> myMap = new HashMap<>();
		String path = "";
		try {
			path = ConsoleHelper.readString(
					"Lutfen dosya olusturmak istediginiz yolu (D:\\bilgeAdamDeneme\\folder\\homework.txt) seklinde belirtiniz");
			File myFile = new File(path);
			
			if (myFile.createNewFile()) {
				System.out.println("Dosya olusturuldu: " + myFile.getName());
				
			} else {
				System.out.println("Dosya olusturulamadi,zaten mevcut.");
			}
			
			myMap.put("path", path);
			myMap.put("file", myFile);
			
		} catch (IOException e) {
			System.out.println("Hata mevcut.");
			e.printStackTrace();
		}
		
		return myMap;
	}
	
	public static void main(String[] args) throws IOException {
		
		newFolder();
		action(newFile());
		
	}
}
