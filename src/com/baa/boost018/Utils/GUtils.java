package com.baa.boost018.Utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GUtils {
	
	// server
	private static void server(int port) {
		
		try {
			
			String receiveMassege;
			String sendMassege;
			
			ServerSocket serverSocket = new ServerSocket(port);
			
			System.out.println("Server is ready");
			Socket socket = serverSocket.accept();
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			InputStream inputStream = socket.getInputStream();
			BufferedReader receiveRead = new BufferedReader(new InputStreamReader(inputStream));
			
			while (true) {
				if ((receiveMassege = receiveRead.readLine()) != null) {
					System.out.println("CLIENT: " + receiveMassege);
				}
				
				sendMassege = bufferedReader.readLine();
				printWriter.println(sendMassege);
				printWriter.flush();
				
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	// client
	private static void client(int port) {
		
		try {
			String receiveMassege; // mesaj almak icin
			String sendMassege; // mesaj gondermek icin
			
			// port acilimini yapiyoruz
			
			Socket socket = new Socket("localhost", port);
			
			// client veri gonderecek
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			// serverdan gelen veriyi okuma
			
			InputStream inputStream = socket.getInputStream();
			BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
			
			System.out.println("Client: Lutfen mesaj yazınız");
			
			while (true) {
				
				sendMassege = bufferedReader.readLine();
				printWriter.println(sendMassege);
				printWriter.flush(); // bunu yaparak mesaji tazeleyerek bosaltiyoruz
				
				if ((receiveMassege = bufferedReader2.readLine()) != null) {
					System.out.println("SERVER: " + receiveMassege);
					
				}
				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// encode:sifreleyici
	public static String encoderMethod() {
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen yazi giriniz");
		String value = input.nextLine();
		Encoder encoder = Base64.getEncoder();
		String toPassword = encoder.encodeToString(value.getBytes());
		System.out.println("Sifrelenen veri: " + toPassword);
		return toPassword;
	}
	
	// decode: Sifre cozumu
	public static String decoderMethod(String value) {
		Decoder decoder = Base64.getDecoder();
		String sifreCoz = new String(decoder.decode(value));
		System.out.println("Sifre cozumu: " + sifreCoz);
		return sifreCoz;
	}
	
	// yeni dosya(file) olusturma
	public static Map<String, Object> newFile() {
		
		Map<String, Object> myMap = new HashMap<>();
		String path = "";
		try {
			path = GUtils.readString(
					"Lutfen dosya olusturmak istediğiniz yolu (D:\\bilgeAdamDeneme\\folder\\homework.txt) seklinde belirtiniz");
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
	
	// yeni klasor(repository) olusturma
	public static String newFolder() {
		String path = "";
		
		path = GUtils.readString(
				"Lutfen klasor olusturmak istediginiz yolu (D:\\bilgeAdamDeneme\\folder) seklinde belirtiniz");
		
		File myFolder = new File(path);
		
		boolean bool = myFolder.mkdir();
		if (bool) {
			System.out.println("Klasor olusturuldu: " + myFolder.getName());
		} else {
			System.out.println("Klasor olusturulamadi.");
		}
		return path;
	}
	
	// dosyaya yazma islemi
	private static void fileWrite(String path) {
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
			
			bufferedWriter.write(GUtils.readString("Lutfen yazilmasini istediginiz bilgileri giriniz."));
			bufferedWriter.flush();
			System.out.println("Yazma islemi basarili");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// dosya okuma islemi
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
	
	// dosya silme islemi
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
	
	// baslik ekleme
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
		System.out.println("\n                Lutfen yapmak istediginiz islemi seciniz:");
		return selectDigitSecim();
	}
	
	// baslik ve menu icin cizgiler olusturma
	public static void printLine(int msgLong) {
		int lineLong = (msgLong % 2 == 0) ? msgLong + 10 : msgLong + 11;
		StringBuilder line = new StringBuilder();
		line.append("\t\t");
		for (int i = 0; i < lineLong; i++) {
			line.append("-");
		}
		System.out.printf("%s\n", line);
	}
	
	// baslik ve menu icin print methodu
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
				System.out.println("Lutfen belirtilen degerlerden secim yapiniz.\nTekrar Deneyiniz.");
				input.nextLine();
				
			}
			
		} while (true);
	}
	
	// kullanicidan int degeri alma
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
	
	// kullanicidan String degeri alma
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
	
	// kullanicidan double degeri alma
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
	
	// isleme devam etme loop
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
	
	public static void main(String[] args) {
		
	}
}
