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
	// client veri almak ve veri gondermek islemi yapiyor.
	public static void main(String[] args) {
		
		try {
			
			String receiveMassege; // mesaj almak icin
			String sendMassege; // mesaj gondermek
			
			// port acilimi yapiyoruz
			Socket socket = new Socket("localhost", StaticPort.PORT);
			
			// client veri gonderecek
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			// serverdan gelen veriyi okuma
			InputStream inputStream = socket.getInputStream();
			BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
			
			System.out.println("Client: Lutfen mesaj yaziniz");
			
			while (true) {
				
				sendMassege = bufferedReader.readLine();
				printWriter.println(sendMassege);
				printWriter.flush(); // bunu yaparak mesaji tazeleyerek bosaltiyoruz
				
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
