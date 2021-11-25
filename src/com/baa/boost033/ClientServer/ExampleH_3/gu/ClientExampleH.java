package com.baa.boost033.ClientServer.ExampleH_3.gu;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ClientExampleH {
	
	public static void main(String[] args) {
		
		String ipAdress;
		ipAdress = JOptionPane.showInputDialog("Lütfen ip adresi giriniz.");
		
		int port = ServerExampleH.getPort();
		
		try (DataOutputStream dataOutputStream = new DataOutputStream(new Socket(ipAdress, port).getOutputStream())) {
			
			// dataOutputStream.writeUTF(clientValue);
			
		} catch (IOException io) {
			System.out.println("Hata meydana geldi.");
			io.printStackTrace();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
