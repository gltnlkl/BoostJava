package com.baa.boost033.ClientServer.ClientPeerToPeer.Example;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketExampleServer {
	
	public static void main(String[] args) {
		String clientValue;
		int scannerNumber;
		
		ServerSocket serverSocket;
		Socket clientSocket;
		DataInputStream dataInputStream;
		
		try {
			serverSocket = new ServerSocket(7777);
			clientSocket = serverSocket.accept();
			dataInputStream = new DataInputStream(clientSocket.getInputStream());
			clientValue = dataInputStream.readUTF();
			scannerNumber = Integer.valueOf(clientValue);
			System.out.println(scannerNumber + " sayısının karekökü: " + Math.sqrt(scannerNumber));
			
			// close
			serverSocket.close();
			clientSocket.close();
			dataInputStream.close();
		} catch (IOException ex) {
			System.err.println(ex);
		}
		
	}
	
}