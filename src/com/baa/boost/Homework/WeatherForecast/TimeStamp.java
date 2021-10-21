package com.baa.boost.Homework.WeatherForecast;

import java.sql.Timestamp;
import java.util.Date;

public class TimeStamp {
	
	public static void timeStamp() {
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		System.out.println(ts);
	}
}
