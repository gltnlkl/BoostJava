package com.baa.boost033.ClientServer.TranslationExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TranslationServer {
	
	public static void main(String[] args) {
		int port = 4711;
		
		try (ServerSocket server = new ServerSocket(port)) {
			System.out.println("Server waiting...");
			Socket socket = server.accept();
			System.out.println("Client connection established");
			processRequest(socket);
		} catch (IOException ex) {
			System.out.println("Birşeyler çok kötü gitti: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	private static void processRequest(Socket socket) throws IOException {
		while (true) {
			String str = getDataFromClient(socket);
			String processed = processData(str);
			sendDataToClient(socket, processed);
		}
	}
	
	private static void sendDataToClient(Socket socket, String processed) throws IOException {
		OutputStream output = socket.getOutputStream();
		PrintWriter writer = new PrintWriter(output);
		writer.println(LocalDateTime.now() + " --> " + processed);
		
	}
	
	private static String processData(String str) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static String getDataFromClient(Socket socket) throws IOException {
		InputStream input = socket.getInputStream();
		InputStreamReader reader = new InputStreamReader(input);
		BufferedReader br = new BufferedReader(reader);
		return br.readLine();
	}
	
}
