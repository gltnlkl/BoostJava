package com.baa.boost033.ClientServer.twoWayExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

import com.baa.boost033.clientServer.ClientServer.twoWay.StaticPort;

public class GultenServer {
	
	public static void main(String[] args) {
		
		try {
			String msg = null;
			String receiveMassege;
			String sendMassege;
			
			Person personServer = new Person("Gülten", LocalDateTime.now());
			
			ServerSocket serverSocket = new ServerSocket(StaticPort.PORT);
			
			System.out.println("Chat Aplikasyonu Hazır! Server Gülten");
			Socket socket = serverSocket.accept();
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			InputStream inputStream = socket.getInputStream();
			BufferedReader receiveRead = new BufferedReader(new InputStreamReader(inputStream));
			
			while (true) {
				if ((receiveMassege = receiveRead.readLine()) != null) {
					
					msg = personServer.getName() + " " + " " + personServer.getTime();
					
					System.out.println("Başak: " + msg);
					System.out.println(receiveMassege);
					
				}
				
				sendMassege = bufferedReader.readLine();
				String writeFile = msg + " Massege: " + sendMassege;
				methods.fileWrite(writeFile);
				printWriter.println(sendMassege);
				printWriter.flush();
				
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
