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
		// try catch dısında tanımlıyoruz kı asagıda degıskenı gorebılelım
		
		Socket socket = null; // socket programlama ıcın
		PrintWriter out = null; // ekrana bızım ıznımızle bırseyler vermek ıcın
		BufferedReader in = null; // tamponlama yapmak ıcın
		String value;
		
		try {
			socket = new Socket("localhost", 7777);
			
		} catch (Exception e) {
			System.out.println("port hatası oldu");
		}
		
		System.out.println("baglantı tamamdır");
		try {
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("lütfen server a gönderilecek sayı giriniz");
			
			data = new BufferedReader(new InputStreamReader(System.in));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
