package com.baa.boost.CodingMarathon.SchoolApplication.io;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.baa.boost026.Time.ConsoleHelper;

public class Bonus {
	
	public static Map<String, Object> newFile() { // yeni dosya olusturma
		
		Map<String, Object> myMap = new HashMap<>();
		String path = "";
		try {
			path = ConsoleHelper.readString(
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
}
