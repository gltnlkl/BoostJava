package com.baa.boost033.ClientServer.ExampleH_2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class ClientExampleH {
	
	public static void main(String[] args) {
		// Scanner klavye = null;
		// String number;
		String sifre;
		
		String ipAdress = "localHost";
		int port = 7777;
		
		try (DataOutputStream dataOutputStream = new DataOutputStream(new Socket(ipAdress, port).getOutputStream())) {
			
			sifre = encoderMethod();
			
			// klavye = new Scanner(System.in);
			// System.out.println("Lütfen İsim soyisim giriniz");
			// number = klavye.nextLine();
			
			// number = JOptionPane.showInputDialog("Lütfen bir sayı giriniz."); // scanner
			// a alternatif kullanılabılır
			
			dataOutputStream.writeUTF(sifre); // server a number ı gonderıyorum
		} catch (IOException io) {
			System.out.println("Hata meydana geldi.");
			io.printStackTrace();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static String encoderMethod() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lütfen şifre giriniz");
		String value = klavye.nextLine();
		Encoder encoder = Base64.getEncoder();
		String toPassword = encoder.encodeToString(value.getBytes());
		System.out.println("Şifrelenmiş veri: " + toPassword);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		klavye.close();
		return toPassword;
	}
}
