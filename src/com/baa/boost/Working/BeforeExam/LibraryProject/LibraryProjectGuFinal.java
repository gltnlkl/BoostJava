package com.baa.boost.Working.BeforeExam.LibraryProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryProjectGuFinal {
	
	private static List<Book> listBook;
	private static String pathBook = "C:\\Users\\gulte\\OneDrive - Bilgeadam Akademi\\Desktop\\JavaBoostFiles\\books.csv";
	
	private static void readFileBook() {
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathBook))) {
			
			String row = "";
			int count = 0;
			
			while ((row = bufferedReader.readLine()) != null) {
				count++;
				if (count > 1) {
					
					listBook.add(lineToBook(row));
					
				}
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static Book lineToBook(String row) {
		
		List<String> listKelime = new ArrayList<>();
		
		char[] ListLetter = row.toCharArray();
		
		StringBuilder kelime = new StringBuilder();
		// gulten;ali;deniz;;kelime
		for (int i = 0; i < ListLetter.length; i++) {
			char c = ListLetter[i];
			
			if (c != ';') {
				
				kelime.append(c);
				
			} else {
				
				listKelime.add(kelime.toString());
				
				kelime = new StringBuilder("");
			}
			
		}
		
		listKelime.add(kelime.toString());
		
		Book myBook = new Book(listKelime.get(0), listKelime.get(1), listKelime.get(2), listKelime.get(3),
				listKelime.get(4), listKelime.get(5), listKelime.get(6), listKelime.get(7));
		return myBook;
	}
	
	public static void main(String[] args) {
		
		listBook = new ArrayList<Book>();
		
		readFileBook();
		
		// Book edtBook = listBook.get(23);
		//
		// edtBook.setOrgBookTitle("Nutuk");
		//
		// listBook.set(23, edtBook);
		//
		List<Book> mapList2 = listBook.stream().filter(book -> book.getOrgBookTitle().startsWith("Nutuk"))
				.collect(Collectors.toList());
		
		List<Book> mapList2 = listBook.stream().collect(Collectors.toList());
		
		mapList2.forEach(System.out::println);
		
		// fileWrite(pathBook);
		
	}
	
	private static void fileWrite(String path) {
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, false))) { // orjınal dosyayı
			// bosaltıp yenıden
			// yazıyor.
			
			bufferedWriter.write(
					"book_id;isbn;authors;original_publication_year;original_title;title;language_code;average_rating");
			// ılk
			// satır
			for (Book book : listBook) {
				bufferedWriter.write(book.getBookId() + ";" + book.getIsbn() + ";" + book.getAuthor() + ";"
						+ book.getPublishYear() + ";" + book.getPublishYear() + ";" + book.getOrgBookTitle() + ";"
						+ book.getLanguageCode() + ";" + book.getAverageRating() + "\n");
			}
			
			bufferedWriter.flush();
			System.out.println("Yazma işlemi başarılı");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
