package com.baa.boost029.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Mektup {
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\gulte\\OneDrive - Bilgeadam Akademi\\Desktop\\io");
		if (file.exists()) {
			System.out.println("mektup belgesi var");
		} else {
			System.out.println("yok");
		}
		try {
			FileReader reader = new FileReader(file);
			BufferedReader bR = new BufferedReader(reader);
			
			while (true) {
				String line = bR.readLine();
				if (line == null) {
					break;
				}
				System.out.println("--->" + line);
			}
			bR.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
