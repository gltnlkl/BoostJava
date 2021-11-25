package com.baa.boost033.ClientServer.ExampleH_5;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerExampleH {
	
	public static void main(String[] args) {
		// lıst aldıgım ıcın dataInputStream yerıne objectInputStream
		// kullanıyoruz.
		// tum yorumlar boyle sacma gorunecek daha fazla yorum
		try {
			ServerSocket serverSocket = new ServerSocket(5555);
			
			System.out.println("Server is listening");
			
			Socket socket = serverSocket.accept();
			System.out.println("Connection: " + socket);
			
			InputStream inputStream = socket.getInputStream();
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			
			ArrayList<Student> list = (ArrayList<Student>) objectInputStream.readObject();
			
			list.forEach((temp) -> System.out.println(temp.getStudentName()));
			serverSocket.close();
			socket.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
