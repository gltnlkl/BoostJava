package com.baa.boost.Working.BeforeExam.LibraryProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class LibraryProject {
	
	public static Map<String, Object> fileAlternative() {
		
		Map<String, Object> myMap = new HashMap<>();
		
		Path pathB = Paths.get("books.csv");
		String pathBook = (pathB.toAbsolutePath()).toString();
		
		File fileBook = new File(pathBook);
		
		Path pathP = Paths.get("publications.csv");
		String pathPublications = (pathP.toAbsolutePath()).toString();
		
		File filePublications = new File(pathPublications);
		
		myMap.put("fileBook", fileBook);
		myMap.put("filePublications", filePublications);
		myMap.put("pathBook", pathBook);
		myMap.put("pathPublications", pathPublications);
		
		return myMap;
	}
	
	public static Map<String, Object> file() {
		
		Map<String, Object> myMap = new HashMap<>();
		
		String pathBook = "C:\\Users\\gulte\\OneDrive - Bilgeadam Akademi\\Desktop\\JavaBoostFiles\\books.csv";
		File fileBook = new File(pathBook);
		
		String pathPublications = "C:\\Users\\gulte\\OneDrive - Bilgeadam Akademi\\Desktop\\JavaBoostFiles\\publications.csv";
		File filePublications = new File(pathPublications);
		
		myMap.put("fileBook", fileBook);
		myMap.put("filePublications", filePublications);
		myMap.put("pathBook", pathBook);
		myMap.put("pathPublications", pathPublications);
		
		return myMap;
	}
	
	private static void readFile(String path) {
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			
			String toplamSatirlar = "";
			String satir = "";
			
			while ((satir = bufferedReader.readLine()) != null) { /// bu kısımda satır satır okuyup tek tek bır array
																	/// yapmak uygun olabılır
				toplamSatirlar = toplamSatirlar + satir + "\n";
			}
			
			System.out.println(toplamSatirlar);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static Book lineToBook(String satir) {
		
		String points = ";";
		
		String[] bookList = satir.split(points);
		
		Book myBook = new Book();
		
	}
	
	public static void deneme(String str) {
		
		String number = "";
		String points = ";";
		
		String[] myFileBook = str.split(points);
		
		for (int i = 0; i < myFileBook.length; i++) {
			
			if (myFileBook[i].equals(";")) {
				
				number = myFileBook[i + 1];
			}
			
		}
		
		System.out.println(number);
		
	}
	
	public static void action(Map<String, Object> myMap) {
		
		String myFileBook = (String) myMap.get("fileBook");
		String myFilePublications = (String) myMap.get("filePublications");
		String myPathBook = (String) myMap.get("myFileBook");
		String myPathPublications = (String) myMap.get("myFilePublications");
		
		String number = "";
		String points = ";";
		
		String[] books = myFileBook.split(points);
		
		for (int i = 0; i < books.length; i++) {
			
			if (books[i].equals(";")) {
				
				number = books[i + 1];
			}
			
		}
		
		readFile(myPathBook);
		
		System.out.println(number);
		
	}
	
	public static void main(String[] args) {
		
		action(file());
		
	}
}
