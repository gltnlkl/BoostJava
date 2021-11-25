package com.baa.boost033.ClientServer.ClientPeerToPeer.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientTutorials {
	
	public static void main(String[] args) {
		
		clientSqrt();
	}
	
	private static void clientSqrt() {
		// try catch disinda tanimliyoruz ki asagida degiskeni gorebilelim
		
		Socket socket = null; // socket programlama icin
		PrintWriter out = null; // ekrana bizim iznimizle birseyler vermek icin
		BufferedReader in = null; // tamponlama yapmak icin
		String value;
		
		try {
			socket = new Socket("localhost", 7777);
			
		} catch (Exception e) {
			System.out.println("port hatasi oldu");
		}
		
		System.out.println("baglanti tamamdir");
		try {
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("lutfen server a gonderilecek sayi giriniz");
			
			data = new BufferedReader(new InputStreamReader(System.in));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
