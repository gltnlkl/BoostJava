package com.baa.boost029.IO;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;

public class DataReaderExample {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\gulte\\OneDrive-Bilgeadam Akademi\\Desktop\\deneme.ddd");
		
		try {
			
			FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);
			
			while (true) {
				
				System.out.println("-->" + dis.readDouble());
				System.out.println("-->" + dis.readInt());
			}
			
		} catch (EOFException ex) {
			
		}
		
	}
	
}
