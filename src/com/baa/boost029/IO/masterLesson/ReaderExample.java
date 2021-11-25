package com.baa.boost029.IO.masterLesson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderExample {
	
	public static void main(String[] args) {
		File file = new File("C:\\Users\\babur.somer\\mektup.txt");
		if (file.exists()) {
			System.out.println("mektup belgesi zaten var");
		} else {
			System.out.println("mektup belgesi hen�z yok");
		}
		
		try {
			FileReader reader = new FileReader(file);
			BufferedReader bR = new BufferedReader(reader);
			while (true) {
				String line = bR.readLine();
				if (line == null) {
					break;
				}
				System.out.println("--> " + line);
			}
			bR.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
}
