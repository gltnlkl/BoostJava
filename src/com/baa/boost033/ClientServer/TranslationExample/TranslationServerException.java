package com.baa.boost033.ClientServer.TranslationExample;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TranslationServerException {
	
	public static void main(String[] args) {
		
		int port = 4711;
		
		try (ServerSocket server = new ServerSocket(port)) { // Try with resources parametre
			// olarak yazınca kapatmana gerek kalmıyor.
			Socket socket = server.accept(); // dınlerken bır ıstek gelınce alıp kabul edıyor.
			// Bırebır bır clıent ıle ılıskı kuruyor
			
			System.out.println("Client connetion established");
			
		} catch (IOException ex) {
			System.out.println("Birşeyler çok kötü gitti" + ex.getMessage()); // get massege --> her exceptionın
			// sebebını anlatan metını cakırıyor.
			// prınt stack trace tum hata satırlarını gosterır.
			// ex.printStackTrace();
			// Exception exx = new Exception("Buyuk bır problemın var.");
			// System.out.println("Canım bıttın sen \n" + exx.getMessage());
			// exx.printStackTrace();
		}
	}
	
}
