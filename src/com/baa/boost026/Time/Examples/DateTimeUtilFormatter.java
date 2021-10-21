package com.baa.boost026.Time.Examples;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTimeUtilFormatter {
	
	public static void getFinfMonth() {
		
	}
	
	public static void main(String[] args) {
		
		Locale locale = new Locale("tr", "TR");
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMMM dd", locale);
		
		Date date = new Date();
		
		System.out.println(date);
		
		String str = dateFormat.format(date);
		
		System.out.println(str);
		
		System.out.println(date);
	}
	
}
