package com.baa.boost028.Serializable.Example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalenderLesson1 {
	
	public static void main(String[] args) {
		
		Calendar calender = Calendar.getInstance();
		System.out.println(calender);
		
		// Date i cevırecek getTıme();
		
		System.out.println(calender.getTime());
		System.out.println(calender.getTime().getTime());
		
		calender.set(Calendar.YEAR, 2010);
		calender.set(Calendar.MONTH, 1);
		
		System.out.println(calender.getTime());
		
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-YYYY", locale);
		
		Date date = new Date();
		
		String str = simpleDateFormat.format(date);
		System.out.println(str);
		System.out.println(Integer.parseInt(str));
		
	}
	
}
