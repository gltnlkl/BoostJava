package com.baa.boost033.ClientServer.Utils;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ClientH {
	
	public static void main(String[] args) {
		// Scanner klavye = null;
		String number;
		
		String ipAdress = "localHost";
		int port = 7777;
		
		try (DataOutputStream dataOutputStream = new DataOutputStream(new Socket(ipAdress, port).getOutputStream())) {
			
			// klavye = new Scanner(System.in);
			// System.out.println("Lütfen bir sayı giriniz");
			// number = klavye.nextLine();
			
			number = JOptionPane.showInputDialog("Lütfen bir sayı giriniz."); // scanner
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
