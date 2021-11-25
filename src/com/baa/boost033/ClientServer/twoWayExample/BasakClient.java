package com.baa.boost033.ClientServer.twoWayExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class BasakClient {
	
	public static void main(String[] args) {
		
		try {
			
			String receiveMassege; // mesaj almak icin
			String sendMassege; // mesaj gondermek
			
			// port acmak icin yapiyoruz
			Socket socket = new Socket("localhost", StaticPort.PORT);
			
			// client veri gonderecek
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			// serverdan gelen veriyi okuma
			InputStream inputStream = socket.getInputStream();
			BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
			
			System.out.println("Lütfen mesaj yazınız. Client Başak");
			
			while (true) {
				
				Person personClient = new Person("Başak");
				
				sendMassege = bufferedReader.readLine();
				printWriter.println(sendMassege);
				printWriter.flush(); // bunu yaparak mesajı tazeleyerek bosaltıyoruz
				
				if ((receiveMassege = bufferedReader2.readLine()) != null) {
					
					String msg = personClient.getId() + " " + personClient.getName() + " " + Time.FTIME;
					System.out.println("Gülten: " + msg);
					System.out.println(receiveMassege);
					String writeFile = msg + " Massege: " + sendMassege;
					methods.fileWrite(writeFile);
				}
				
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
