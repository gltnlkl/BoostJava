package com.baa.boost031.Localization;

public class Globalization {
	public static void main(String[] args) {
		
		// hardcoded textlerı olan bır ornek
		
		// System.out.println("Merhaba");
		// System.out.println("Nasılsın?");
		// System.out.println("--------");
		// System.out.println("İyiyim teşekkürler");
		// System.out.println("--------");
		// System.out.println("Görüşmek üzere");
		//
		
		GlobalsString globalization;
		
		if (args.length == 1) {
			
			globalization = new GlobalsString(args[0]);
			
		} else if (args.length == 2) {
			
			globalization = new GlobalsString(args[0], args[1]);
			
		} else {
			
			globalization = new GlobalsString();
			
		}
		
		// GlobalsString globalization = new GlobalsString("tr", "TR");
		//
		// System.out.println(globalization.getString("Globalization.HELLO"));
		// //$NON-NLS-1$
		// System.out.println(globalization.getString("Globalization.HOW_ARE_YOU"));
		// //$NON-NLS-1$
		// System.out.println(globalization.getString("Globalization.SPLITTER"));
		// //$NON-NLS-1$
		// System.out.println(globalization.getString("Globalization.3")); //$NON-NLS-1$
		// System.out.println(globalization.getString("Globalization.4")); //$NON-NLS-1$
		// System.out.println(globalization.getString("Globalization.5")); //$NON-NLS-1$
		
		System.out.println(globalization.getString("Globalization.HELLO")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.HOW_ARE_YOU")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.SPLITTER")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.3")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.4")); //$NON-NLS-1$
		System.out.println(globalization.getString("Globalization.5")); //$NON-NLS-1$
		// double price = 100.0;
		
		// String msg = globalization.getString("Globalization.MESSAGE"); //$NON-NLS-1$
		// ;
		// // TO DO tamamla string.replace --->
		// msg = msg.replaceFirst("$1$", "" + price);
		// msg = msg.replace($4$, globalization.getString("Glo))
		// System.out.println(msg);
		
	}
}
