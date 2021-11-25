package com.baa.boost033.ClientServer;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class Decoder_Encoder {
	
	// encode:sifreleyici
	public static String encoderMethod() {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lutfen yazi giriniz");
		String value = klavye.nextLine();
		Encoder encoder = Base64.getEncoder();
		String toPassword = encoder.encodeToString(value.getBytes());
		System.out.println("sifrelenmis veri: " + toPassword);
		klavye.close();
		return toPassword;
	}
	
	// decode: sifre cozucu
	public static String decoderMethod(String value) {
		Decoder decoder = Base64.getDecoder();
		String sifreCoz = new String(decoder.decode(value));
		System.out.println("sifre cozumu: " + sifreCoz);
		return sifreCoz;
	}
	
	public static void main(String[] args) {
		
		// monad
		decoderMethod(encoderMethod());
	}
}
