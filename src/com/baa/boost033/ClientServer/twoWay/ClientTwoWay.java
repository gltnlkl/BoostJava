package com.baa.boost033.ClientServer.twoWay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTwoWay {
	// client veri almak ve veri gondermek ıslemı yapıyor.
	public static void main(String[] args) {
		
		try {
			String receiveMassege; // mesaj almak ıcın
			String sendMassege; // mesaj gondermek
			
			// port acılımı yapıyoruz
			Socket socket = new Socket("localhost", StaticPort.PORT);
			
			// client veri gönderecek
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			// serverdan gelen veriyi okuma
			InputStream inputStream = socket.getInputStream();
			BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
			
			System.out.println("Client: Lütfen mesaj yazınız");
			
			while (true) {
				
				sendMassege = bufferedReader.readLine();
				printWriter.println(sendMassege);
				printWriter.flush(); // bunu yaparak mesajı tazeleyerek bosaltıyoruz
				
				if ((receiveMassege = bufferedReader2.readLine()) != null) {
					System.out.println("SERVER: " + receiveMassege);
					
				}
				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
