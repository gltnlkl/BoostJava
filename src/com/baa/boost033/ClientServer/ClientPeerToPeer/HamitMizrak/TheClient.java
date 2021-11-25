package com.baa.boost033.ClientServer.ClientPeerToPeer.HamitMizrak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

// Socket programlama
// port: 65536 tane port vardır pc de dısarı acılan kapı demek - portlar
// aracılıgı ıle ıletısım kuruluyor

// http
// https
// Ip: 172.165.96.55 --google ın ıp sı
// dıs -ıc IP

// port:1024 localhost ıle once kendı pc mızde kodluyourz sonra yaptıgımız
// projeyı onlıne da kullanılmasını saglayınca
// deployment olmus oluyor.
// we sıtemız 1024 den buyuk olur ve guvenlıge almamıs olursa patlayabılır.
// socket uygulması, web uygulamaları

// Dns: domaın name server (ıp nın akılda kalır versıyonu dıyebılırız)
// Client: ıstemcı
// Server: sunucu
// Listener:
public class TheClient {
	
	public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println("Usage <ip-address> <portNumber>");
			System.exit(-1);
		}
		
		String hostName = "";
		int port = 0;
		try {
			hostName = args[0];
			port = Integer.parseInt(args[1]);
		} catch (Exception e) {
			System.err.println("Usage <ip-address> <portNumber>");
			System.exit(-2);
		}
		
		Socket socket = null;
		try {
			socket = new Socket(hostName, port);
			InputStream input = socket.getInputStream();
			OutputStream output = socket.getOutputStream();
			InputStreamReader reader = new InputStreamReader(input);
			BufferedReader br = new BufferedReader(reader);
			PrintWriter writer = new PrintWriter(output, true);
			writer.println(16);
			System.out.println(br.readLine());
		} catch (IOException e) {
			System.err.println(e.getLocalizedMessage());
			System.exit(-3);
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					System.err.println(e.getLocalizedMessage());
					System.exit(-4);
				}
			}
		}
	}
	
}
