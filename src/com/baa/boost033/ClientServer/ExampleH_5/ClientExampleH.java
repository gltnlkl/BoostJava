package com.baa.boost033.ClientServer.ExampleH_5;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class ClientExampleH {
	// lıst verdıgım ıcın dataOputStream yerıne objectInputStream kullanıyoruz.
	public static void main(String[] args) {
		try {
			
			Socket socket = new Socket("localhost", 5555);
			System.out.println("Connected");
			// object gonderıyorum;
			OutputStream outputStream = socket.getOutputStream();
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			
			ArrayList<Student> objectsList = new ArrayList<>();
			objectsList.add(new Student(1, "Gülten1"));
			objectsList.add(new Student(1, "Gülten2"));
			objectsList.add(new Student(1, "Gülten3"));
			objectsList.add(new Student(1, "Gülten4"));
			objectsList.add(new Student(1, "Gülten5"));
			
			objectOutputStream.writeObject(objectsList);
			socket.close();
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
