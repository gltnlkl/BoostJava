package com.baa.boost033.ClientServer.twoWay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTwoWay {
	
	public static void main(String[] args) {
		
		try {
			
			String receiveMassege;
			String sendMassege;
			
			ServerSocket serverSocket = new ServerSocket(StaticPort.PORT);
			
			System.out.println("Server is ready");
			Socket socket = serverSocket.accept();
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(outputStream, true);
			
			InputStream inputStream = socket.getInputStream();
			BufferedReader receiveRead = new BufferedReader(new InputStreamReader(inputStream));
			
			while (true) {
				if ((receiveMassege = receiveRead.readLine()) != null) {
					System.out.println("CLIENT: " + receiveMassege);
				}
				
				sendMassege = bufferedReader.readLine();
				printWriter.println(sendMassege);
				printWriter.flush();
				
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
