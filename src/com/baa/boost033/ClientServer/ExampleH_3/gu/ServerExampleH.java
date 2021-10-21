package com.baa.boost033.ClientServer.ExampleH_3.gu;

import java.io.DataInputStream;
import java.net.ServerSocket;

import javax.swing.JOptionPane;

public class ServerExampleH {
	
	public static int getPort() {
		
		int port;
		String readPort;
		readPort = JOptionPane.showInputDialog("Lütfen port giriniz.");
		
		port = Integer.valueOf(readPort);
		
		return port;
		
	}
	
	public static void main(String[] args) {
		
		int port = getPort();
		
		// String clientValue;
		
		System.out.println("Server Hazır");
		try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(port).accept().getInputStream())) {
			
			// clientValue = dataInputStream.readUTF();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
}
