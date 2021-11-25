package com.baa.boost029.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.baa.boost026.Time.ConsoleHelper;

// 1.SORU
// public static final String PATH=""; GG*
// 1.adım static bir path yapalım değeri C:\\bilgeadam\\dosya.txt GG*
// 2.adım Kullanıcı tarafından Birşeyler yazıp oluşturduğumuz dosya içisine
// yazalım
// 3.adım dosya içerisindeki yazıları okuyalım.
// 4.adım dosya içerisindeki bütün a harflerini e yapalım

// 2.SORU
// 2.adım c:sürücüsünü altında kullanıcı tarafından "dizin" adından File ile
// java tarafından dizin oluşturalım

// 3.adım c:\\dizin altına kullanıcı tarafından "bilgeadam.txt" dosya
// oluşturalım bilgeadam.txt dosyası oluşturalım

// Seçenekli bir şekilde
// 0-Çıkış
// 1-dosyaCreate
// 2-dizinCreate
// 3-Add(Yazma)
// 4-Read(Okuma)
// 5-Delete(Silmek)
// 6-Dosya özellikleri
// 6.1 Dosya mı
// bu dizin mi ? dosya mı?
// yazılabilrinir mi ? okunabilinir mi çalışabilinir mi?

// URL URI araştırmak ödevi

public class PathExampleHomework141021 {
	
	public static final String PATH = "D:\\bilgeAdamDeneme\\example.txt ";
	
	public static void deneme() {
		try {
			String path = "C:\\bilgeadam\\dosya.txt";
			File file = new File(path);
			System.out.println("çalışabilir miyim : " + file.canExecute());
			System.out.println("çalışabilir miyim : " + file.canExecute());
			System.out.println("okuyabilir miyim : " + file.canRead());
			System.out.println("yazabir miyim : " + file.canWrite());
			System.out.println("////////////////////////////");
			System.out.println("dosya gizli mi? " + file.isHidden());
			System.out.println("dizin mi? " + file.isDirectory());
			System.out.println("dosya mi? " + file.isFile()); // dosya.txt
			
			if (file.createNewFile()) {
				System.out.println("Dosya yok ");
			} else {
				System.out.println("Dosya var");
			}
			
			// silmek
			if (file.exists()) {
				file.delete();
				System.out.println("Dosya Silindi");
			} else {
				System.out.println("Dosya Silinmedi");
			}
			
			System.out.println("path:" + file.toPath());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void writeFile(String value) {
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH, true))) { // (PATH, true)
			
			bufferedWriter.write(value);
			bufferedWriter.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static String reader() {
		
		String toplamSatirlar = "";
		String satir = "";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH))) {
			
			while ((satir = bufferedReader.readLine()) != null) {
				
				toplamSatirlar = toplamSatirlar + satir + "\n";
			}
			System.out.println(toplamSatirlar);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return toplamSatirlar;
		
	}
	
	public static String change(String value) {
		
		String revText = value.replaceAll("a", "e");
		String revTextCap = revText.replaceAll("A", "E");
		System.out.println(revTextCap);
		return revTextCap;
	}
	
	public static void main(String[] args) { // bunu sor nasıl yapacagım
		
		writeFile(ConsoleHelper.readString("Lütfen kaydetmek üzere text giriniz.")); // dosyaya verı yazdım dısarıdan
		
		writeFile(change(reader()));
		
	}
}
