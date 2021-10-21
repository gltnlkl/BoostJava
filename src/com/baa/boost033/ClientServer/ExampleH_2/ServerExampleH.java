package com.baa.boost033.ClientServer.ExampleH_2;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.util.Base64;
import java.util.Base64.Decoder;

// clıent dan gelen degerı aldık
// once server ı calıstırmalıyız

public class ServerExampleH {
	
	public static void main(String[] args) {
		
		int port = 7777;
		
		// clıent dan gelen strıng ve "onu kullanmak ıcın ınt e donusturmek
		
		String clientValue;
		
		// String upperCaseValue;
		// String lowerCaseValue;
		// int lengthOfValue;
		
		System.out.println("Server Hazır");
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(port).accept().getInputStream())) {
			
			// clıent -->
			// DataOutputStream dataOutputStream = new DataOutputStream(new
			// Socket(ipAdress,port).getOutputStream())
			
			clientValue = dataInputStream.readUTF();
			
			// upperCaseValue = (clientValue.toUpperCase());
			// lowerCaseValue = (clientValue.toLowerCase());
			// lengthOfValue = (clientValue.length());
			//
			// System.out.println("Upper Case İşlemi: " + upperCaseValue);
			// System.out.println("Lower Case İşlemi: " + lowerCaseValue);
			// System.out.println("Length İşlemi: " + lengthOfValue);
			
			System.out.println("şifre çözmümü\n");
			decoderMethod(clientValue);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public static String decoderMethod(String value) {
		Decoder decoder = Base64.getDecoder();
		String sifreCoz = new String(decoder.decode(value));
		System.out.println("Şifre çözümü: " + sifreCoz);
		return sifreCoz;
	}
	
}
