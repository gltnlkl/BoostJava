package com.baa.boost031.Localization.ReLearn;

public class Globalization {
	
	public static void main(String[] args) {
		
		GlobalStrings globalization = new GlobalStrings("en", "US2");
		
		System.out.println(globalization.getString("Globalization.HELLO")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.HOW_ARE_YOU")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.THANK_YOU")); //$NON-NLS-1$
		
	}
	
}
