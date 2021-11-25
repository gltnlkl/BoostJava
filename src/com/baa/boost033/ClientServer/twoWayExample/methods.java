package com.baa.boost033.ClientServer.twoWayExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Serializable;

public class methods implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static void fileWrite(String write) {
		
		String path = "C:\\Users\\gulte\\OneDrive - Bilgeadam Akademi\\Desktop\\homework21-10\\example.txt";
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
			
			bufferedWriter.write(write + "\n");
			bufferedWriter.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
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
}
