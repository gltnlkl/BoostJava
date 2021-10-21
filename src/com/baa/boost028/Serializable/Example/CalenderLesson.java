package com.baa.boost028.Serializable.Example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CalenderLesson {
	
	public static void main(String[] args) {
		
		// eocg time - çağ zamanı = 1970 1 ocak
		
		long epochTime = System.currentTimeMillis();
		
		System.out.println(epochTime);
		
		System.out.println();
		
		// Date= aylarda 0 dan baslar , dıger gun ve yıl oyle degıl
		
		Date date = new Date(epochTime);
		System.out.println("date " + date);
		
		Date date1 = new Date();
		System.out.println("date1 " + date);
		
		// 1900 tabanlıdır +1900 -1900
		// Deprate
		
		Date date2 = new Date((2021 - 1900), 10, 13);
		
		System.out.println(date2);
		
		// gregorian calender(miladi takvim)
		
		Locale locale = new Locale("tr", "TR");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy", locale);
		
		Date dateG = new Date();
		
		String str = simpleDateFormat.format(dateG);
		System.out.println(str);
		
	}
	
}