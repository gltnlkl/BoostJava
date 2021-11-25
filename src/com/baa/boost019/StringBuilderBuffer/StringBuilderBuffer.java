package com.baa.boost019.StringBuilderBuffer;

public class StringBuilderBuffer {
	// +(artı operant Not: + kadar dongu olacak ıle StringBuilder arasındaki fark )
	public static void main(String[] args) {
		
		// StringBuilder builder = new StringBuilder();
		// builder.append("Hamit").append("Gülten").append(44);
		
		// String combine = builder.toString(); // tum gırdılerı Strıng e donusturdu
		
		// System.out.println(combine); // HamitGülten44
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hamit").append("Gülten").append(44);
		String combine = buffer.toString(); // tum gırdılerı Strıng e donusturdu
		
		System.out.println(combine); // HamitGülten44
		
	}
	
}
