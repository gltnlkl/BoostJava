package com.baa.boost.ExampleH.JwtEncoderDecoder;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import gUtils.GltnUtils;

public class JwtEncoderDecoder {
	
	// kullanıcı strıng gırer
	// encode : sıfreleyıcı
	
	public static String encoderMethod() {
		
		// encode : sıfreleyıcı
		
		String value = GltnUtils.readString("Lütfen bir yazı giriniz.");
		
		Encoder encoder = Base64.getEncoder();
		String toPassword = encoder.encodeToString(value.getBytes());
		System.out.println("Şifrelenmiş veri: " + toPassword);
		
		return toPassword;
	}
	
	public static String decoderMethod(String value) {
		
		// decoder : sıfre cozucu
		
		Decoder decoder = Base64.getDecoder();
		String sifreCoz = new String(decoder.decode(value)); // string e cast işlemi yapıldı !!!
		
		System.out.println("Şifre çözümü " + sifreCoz);
		
		return sifreCoz;
	}
	
	public static void main(String[] args) {
		
		decoderMethod(encoderMethod());
		
	}
}
