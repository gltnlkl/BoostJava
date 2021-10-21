package com.baa.boost033.ClientServer.TranslationExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;

public class TClient {
	
	public static void main(String[] args) {
		
		HashMap<String, String> texts = new HashMap<>();
		
		ResourceBundle rB = ResourceBundle.getBundle("com.bilgeadam.boost033Socket.TranslationExample.TranslationText");
		
		Enumeration<String> keys = rB.getKeys();
		
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			texts.put(rB.getString(key), key);
			
			try (Socket socket = new Socket("localhost", 4711)) {
				
				OutputStream output = socket.getOutputStream();
				PrintWriter writer = new PrintWriter(output);
				
				InputStream input = socket.getInputStream();
				InputStreamReader reader = new InputStreamReader(input);
				BufferedReader br = new BufferedReader(reader);
				
				// While(keys.hasMoreElements(){
				// String key=keys.nextElement();
				// writer.println(rB.getString());
				// writer.print(texts.)
				//
				// }
				writer.println("Saat kaç?");
				System.out.println(br.readLine());
			} catch (UnknownHostException ex) {
				ex.printStackTrace();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			
		}
	}
}