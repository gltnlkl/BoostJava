package com.baa.boost031.Localization.Lesson029;

public class Globalization {
	public static void main(String[] args) {
		
		GlobalsString globalization;
		
		if (args.length == 1) {
			
			globalization = new GlobalsString(args[0]);
			
		} else if (args.length == 2) {
			
			globalization = new GlobalsString(args[0], args[1]);
			
		} else {
			
			globalization = new GlobalsString();
			
		}
		
		System.out.println(globalization.getString("Globalization.HELLO")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.HOW_ARE_YOU")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.SPLITTER")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.3")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.4")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.5")); //$NON-NLS-1$
		
	}
}
