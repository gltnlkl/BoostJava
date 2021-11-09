package com.baa.boost033.ClientServer.DataOutInput;

import java.io.DataInputStream;
import java.net.ServerSocket;

// clıent dan gelen degerı aldık
// once server ı calıstırmalıyız

public class ServerH {
	
	public static void main(String[] args) {
		
		int port = 7777;
		
		// clıent dan gelen strıng ve onu kullanmak ıcın ınt e donusturmek
		
		String clientValue;
		int stringToInteger;
		System.out.println("Connected!");
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(port).accept().getInputStream())) {
			
			// clıent -->
			// DataOutputStream dataOutputStream = new DataOutputStream(new
			// Socket(ipAdress,port).getOutputStream())
			
			clientValue = dataInputStream.readUTF();
			stringToInteger = Integer.valueOf(clientValue); // Strıng ten ınt e cast ıslemı yaptık
			System.out.println(stringToInteger + " sayısının karekökü: " + Math.sqrt(stringToInteger));
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
}
