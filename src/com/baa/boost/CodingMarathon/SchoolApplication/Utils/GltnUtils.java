package com.baa.boost.CodingMarathon.SchoolApplication.Utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GltnUtils {
	
	// yeni dosya(file) olusturma
	public static Map<String, Object> newFile() {
		
		Map<String, Object> myMap = new HashMap<>();
		String path = "";
		try {
			path = GltnUtils.readString(
					"Lütfen dosya oluşturmak istediğiniz yolu (D:\\bilgeAdamDeneme\\folder\\homework.txt) şeklinde belirtiniz");
			File myFile = new File(path);
			if (myFile.createNewFile()) {
				System.out.println("Dosya oluşturuldu: " + myFile.getName());
				
			} else {
				System.out.println("Dosya olusturulamadı,zaten mevcut.");
			}
			
			myMap.put("path", path);
			myMap.put("file", myFile);
			
		} catch (IOException e) {
			System.out.println("Hata mevcut.");
			e.printStackTrace();
		}
		
		return myMap;
	}
	
	// yeni klasor(repository) olusturma
	public static String newFolder() {
		String path = "";
		
		path = GltnUtils.readString(
				"Lütfen klasör oluşturmak istediğiniz yolu (D:\\bilgeAdamDeneme\\folder) şeklinde belirtiniz");
		
		File myFolder = new File(path);
		
		boolean bool = myFolder.mkdir();
		if (bool) {
			System.out.println("Klasör oluşturuldu: " + myFolder.getName());
		} else {
			System.out.println("Klasör oluşturulamadı.");
		}
		return path;
	}
	
	// dosyaya yazma işlemi
	private static void fileWrite(String path) {
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
			
			bufferedWriter.write(GltnUtils.readString("Lütfen yazılmasını istediğiniz bilgileri giriniz."));
			bufferedWriter.flush();
			System.out.println("Yazma işlemi başarılı");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// dosya okuma işlemi
	private static void readFile(String path) {
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			
			String totalRows = "";
			String row = "";
			
			while ((row = bufferedReader.readLine()) != null) {
				totalRows = totalRows + row + "\n";
			}
			
			System.out.println(totalRows);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	// dosya sılme ıslemı
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
	
	// baslık ekleme
	public static void printTitle(String msg, int length) {
		
		printLine(length);
		int center = (Math.round((length + 10) / 2) - 10);
		int end = (length + 10) - (center + msg.length());
		print(String.format("%-" + center + "s%s%" + end + "s", "-----", msg, "-----"), 2, true);
		printLine(length);
	}
	
	// menu olusturma
	public static int showMenu(String title, Map<Integer, String> menu) {
		
		printTitle(title, 20);
		
		for (Map.Entry<Integer, String> entry : menu.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			print(String.format("%02d ----- %-30s ", key, val), 2, true);
			
		}
		printLine(20);
		System.out.println("\n                Lütfen yapmak istediğiniz işlemi seçiniz:");
		return selectDigitSecim();
	}
	
	// baslık ve menu için çizgiler olusturma
	public static void printLine(int msgLong) {
		int lineLong = (msgLong % 2 == 0) ? msgLong + 10 : msgLong + 11;
		StringBuilder line = new StringBuilder();
		line.append("\t\t");
		for (int i = 0; i < lineLong; i++) {
			line.append("-");
		}
		System.out.printf("%s\n", line);
	}
	
	// baslık ve menu ıcın prınt methodu
	public static void print(String msg, int tabCount, boolean ln) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < tabCount; i++) {
			b.append("\t");
		}
		b.append(msg);
		b.append(ln ? "\n" : "");
		System.out.print(b);
		
	}
	
	public static int selectDigitSecim() {
		Scanner input = new Scanner(System.in);
		
		do {
			
			try {
				
				int inputInt = input.nextInt();
				return inputInt;
				
			} catch (Exception e) {
				System.out.println("Lütfen belirtilen değerlerden seçim yapınız.\nTekrar Deneyiniz.");
				input.nextLine();
				
			}
			
		} while (true);
	}
	
	// kullanıcıdan ınt degerı alma
	public static int readInt(String msg) {
		Scanner input = new Scanner(System.in);
		
		do {
			
			try {
				System.out.println(msg);
				int inputInt = input.nextInt();
				return inputInt;
				
			} catch (Exception e) {
				System.out.println("Tekrar deneyiniz.");
				input.nextLine();
				
			}
			
		} while (true);
		
	}
	
	// kullanıcıdan strıng degerı alma
	public static String readString(String msg) {
		Scanner input = new Scanner(System.in);
		
		do {
			
			try {
				System.out.println(msg);
				String inputStr = input.nextLine();
				return inputStr;
				
			} catch (Exception e) {
				System.out.println("Tekrar deneyiniz.");
				input.nextLine();
				
			}
			
		} while (true);
	}
	
	// kullanıcıdan double degerı alma
	public static double readDouble(String msg) {
		Scanner input = new Scanner(System.in);
		
		do {
			
			try {
				System.out.println(msg);
				double inputDouble = input.nextDouble();
				return inputDouble;
				
			} catch (Exception e) {
				System.out.println("Tekrar deneyiniz.");
				input.nextLine();
				
			}
			
		} while (true);
	}
	
	// işleme devam etme loop
	public static boolean isContinue(String msg, String exitKey) {
		
		String key = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println(msg);
		
		do {
			try {
				key = input.next();
				if (key.equalsIgnoreCase(exitKey)) {
					return false;
				} else {
					return true;
				}
			} catch (Exception e) {
				
			}
			
		} while (true);
		
	}
	
	public static Map<String, String> changeTRCharecter(String msg) {
		final List<Character> trKey = Arrays.asList('ö', 'ç', 'ş', 'ı', 'ğ', 'ü', 'Ö', 'Ç', 'Ş', 'İ', 'Ğ', 'Ü');
		final List<Character> enKey = Arrays.asList('o', 'c', 's', 'i', 'g', 'u', 'O', 'C', 'S', 'I', 'G', 'U');
		StringBuilder newStr = new StringBuilder();
		int count = 0;
		char[] charArray = msg.toCharArray();
		for (int i = 0; i < msg.length(); i++) {
			if (trKey.contains(charArray[i])) {
				newStr.append(enKey.get(trKey.indexOf(charArray[i])));
				count++;
			} else {
				newStr.append(charArray[i]);
			}
		}
		Map<String, String> map = new HashMap<>();
		map.put("COUNT", String.valueOf(count));
		map.put("VALUE", newStr.toString());
		
		return map;
		
	}
	
	public static void main(String[] args) {
		
		// newFolder();
		// newFile();
		
		readFile(null);
		fileWrite(null);
		deleteFile(null, null);
	}
}
