package com.baa.boost033.ClientServer.Homework;

import java.io.BufferedReader;
import java.io.FileReader;

public class Client {
	
	private static void readFile() {
		
		String path = "C:\\Users\\gulte\\OneDrive - Bilgeadam Akademi\\Desktop\\homework21-10\\citys.txt";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			
			String totalRows = "";
			String row = "";
			
			while ((row = bufferedReader.readLine()) != null) {
				totalRows = totalRows + row + "\n";
			}
			
			// System.out.println(totalRows);
			
			String points = "\"";
			
			String[] city = totalRows.split(points);
			
			String points2 = ",";
			
			String[] cityArray = totalRows.split(points);
			
			for (String str : cityArray) {
				
				System.out.println(str);
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		readFile();
	}
	
}
