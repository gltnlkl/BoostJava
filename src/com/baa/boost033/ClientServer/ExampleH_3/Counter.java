package com.baa.boost033.ClientServer.ExampleH_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Counter {
	
	public static void main(String[] args) throws IOException {
		
		String path = "";
		
		path = "D:\\bilgeAdamDeneme\\folder\\homework.txt";
		File myFile = new File(path);
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		
		String totalRows = "";
		String row = "";
		
		row = bufferedReader.readLine();
		int rowTemp = Integer.valueOf(row);
		int rowExisting = rowTemp + 1;
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));
		
		bufferedWriter.write(rowExisting);
		bufferedWriter.flush();
		
	}
}