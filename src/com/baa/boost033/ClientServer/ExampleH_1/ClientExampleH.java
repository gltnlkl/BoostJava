package com.baa.boost033.ClientServer.ExampleH_1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

// client şifre üretsin: gltnk = xlkemsf gıbı
public class ClientExampleH {
	
	public static void main(String[] args) {
		Scanner klavye = null;
		String number;
		
		String ipAdress = "localHost";
		int port = 7777;
		
		System.out.println("Server Hazır");
		try (DataOutputStream dataOutputStream = new DataOutputStream(new Socket(ipAdress, port).getOutputStream())) {
			
			klavye = new Scanner(System.in);
			System.out.println("Lütfen İsim soyisim giriniz");
			number = klavye.nextLine();
			
			// number = JOptionPane.showInputDialog("Lütfen bir sayı giriniz."); // scanner
			// a alternatif kullanılabılır
			
			dataOutputStream.writeUTF(number); // server a number ı gonderıyorum
		} catch (IOException io) {
			System.out.println("Hata meydana geldi.");
			io.printStackTrace();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
