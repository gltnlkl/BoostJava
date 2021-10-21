package com.baa.boost033.ClientServer.ExampleH_1;

import java.io.DataInputStream;
import java.net.ServerSocket;

// clıent dan gelen degerı aldık
// once server ı calıstırmalıyız

public class ServerExampleH {
	
	public static void main(String[] args) {
		
		int port = 7777;
		
		// clıent dan gelen strıng ve onu kullanmak ıcın ınt e donusturmek
		
		String clientValue;
		String upperCaseValue;
		String lowerCaseValue;
		int lengthOfValue;
		
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(port).accept().getInputStream())) {
			
			// clıent -->
			// DataOutputStream dataOutputStream = new DataOutputStream(new
			// Socket(ipAdress,port).getOutputStream())
			
			clientValue = dataInputStream.readUTF();
			
			upperCaseValue = (clientValue.toUpperCase());
			lowerCaseValue = (clientValue.toLowerCase());
			lengthOfValue = (clientValue.length());
			
			System.out.println("Upper Case İşlemi: " + upperCaseValue);
			System.out.println("Lower Case İşlemi: " + lowerCaseValue);
			System.out.println("Length İşlemi: " + lengthOfValue);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
}
