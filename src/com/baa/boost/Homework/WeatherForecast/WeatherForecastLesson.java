package com.baa.boost.Homework.WeatherForecast;

import java.sql.Timestamp;
import java.util.Date;

import BAUtils.BAUtils;

public class WeatherForecastLesson {
	
	public static String country() {
		
		String country = BAUtils.readString("Lütfen ülke adı giriniz. (TR, US, ES...) ");
		
		return country;
		
	}
	
	public static String city() {
		
		String city = BAUtils.readString("Lütfen şehir adı giriniz. (Istanbul, Bursa, Eskişehir...) ");
		
		return city;
		
	}
	
	public static String district() {
		
		String district = BAUtils.readString("Lütfen ilçe adı giriniz. (Kadıköy, Tepebaşı, Maltepe...) ");
		
		return district;
		
	}
	
	public static void main(String[] args) {
		
		String country = country();
		String city = city();
		String district = district();
		String latlonInput = BAUtils.getDirectData(district, city, country);
		String lat = "";
		String lon = "";
		timeStamp();
		
		//
		// System.out.println(BAUtils.dateAsString(Long.parseLong("1632646800")));
		// System.out.println(BAUtils.timeAsString(Long.parseLong("1632646800")));
		
		String points = "[{!,?:\\_'@}]+";
		
		String[] latlon = latlonInput.split(points);
		
		for (int i = 0; i < latlon.length; i++) {
			
			if (latlon[i].equals("\"lat\"")) {
				
				lat = latlon[i + 1];
			}
			
			if (latlon[i].equals("\"lon\"")) {
				
				lon = latlon[i + 1];
			}
		}
		
		System.out.println(district + " ilçesi " + city + " ili " + country + " ülkesi için enlem değeri :" + lat);
		System.out.println(district + " ilçesi " + city + " ili " + country + " ülkesi için boylam:" + lon);
		
		String dailyWeatherInput = BAUtils.getWeatherData(Double.parseDouble(lat), Double.parseDouble(lon));
		String temp = "";
		String desc = "";
		
		// System.out.println(dailyWeatherInput);
		String[] dailyWeather = dailyWeatherInput.split(points);
		
		for (int i = 0; i < dailyWeather.length; i++) {
			
			if (dailyWeather[i].equals("\"description\"")) {
				
				desc = dailyWeather[i + 1];
			}
			if (dailyWeather[i].equals("\"temp\"")) {
				
				temp = dailyWeather[i + 1];
			}
			
		}
		System.out
				.println("HAVA " + desc.substring(1, desc.length() - 1).substring(0, desc.length() - 2).toUpperCase());
		System.out.println("Sıcaklık: " + temp + "°C");
		
		// System.out.println("5 Saatlik Hava Raporu : " +
		// BAUtils.getForecastData(district, city, country)); ( 5 saatlık rapor ıcın
		// calısma -
		
		/*
		 * String fiveHoursWeatherInput = BAUtils.getForecastData(district, city,
		 * country);
		 * String hour = "";
		 * int num = 0;
		 * String[] fiveHoursWeather = fiveHoursWeatherInput.split(points);
		 * for (int i = 0; i < dailyWeather.length; i++) {
		 * if (fiveHoursWeather[i].equals("\"temp\"")) {
		 * num=num+1;
		 * hour = dailyWeather[i + 1];
		 * }
		 * }
		 */
	}
	
	private static void timeStamp() {
		
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		System.out.println(ts);
	}
}
