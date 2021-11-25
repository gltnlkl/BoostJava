package com.baa.boost033.ClientServer.ExampleH_2;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.util.Base64;
import java.util.Base64.Decoder;

// client dan gelen degeri aldik
// once server i calistirmaliyiz

public class ServerExampleH {
	
	public static void main(String[] args) {
		
		int port = 7777;
		
		// client dan gelen string ve "onu kullanmak icin int e donusturmek
		
		String clientValue;
		
		System.out.println("Server Hazir");
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(port).accept().getInputStream())) {
			
			clientValue = dataInputStream.readUTF();
			
			System.out.println("sifre cozumu\n");
			decoderMethod(clientValue);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public static String decoderMethod(String value) {
		Decoder decoder = Base64.getDecoder();
		String sifreCoz = new String(decoder.decode(value));
		System.out.println("sifre cozumu: " + sifreCoz);
		return sifreCoz;
	}
	
}
