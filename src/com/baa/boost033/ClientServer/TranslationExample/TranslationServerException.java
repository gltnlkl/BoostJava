package com.baa.boost033.ClientServer.TranslationExample;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TranslationServerException {
	
	public static void main(String[] args) {
		
		int port = 4711;
		
		try (ServerSocket server = new ServerSocket(port)) { // Try with resources parametre
			// olarak yazinca kapatmana gerek kalmiyor.
			Socket socket = server.accept(); // dinlerken bir istek gelince alip kabul ediyor.
			// Birebir bir client ile iliski kuruyor
			
			System.out.println("Client connetion established");
			
		} catch (IOException ex) {
			System.out.println("Birseyler cok kotu gitti" + ex.getMessage()); // get massege --> her exceptionin
			// sebebini anlatan metini cakiriyor.
			// print stack trace tum hata satirlarini gosterir.
			// ex.printStackTrace();
			// Exception exx = new Exception("Buyuk bir problemin var.");
			// System.out.println("Canim bittin sen \n" + exx.getMessage());
			// exx.printStackTrace();
		}
	}
	
}
