package com.baa.boost.Homework.WeatherForecast;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import BAUtils.BAUtils;

public class WeatherForecast {
	
	public static int count = 0; // TEK SEFER VERI GIRISI ICIN UYGULANDI!
	
	public static Map<String, Object> locationInput() {
		
		Map<String, Object> location = new HashMap<String, Object>();
		
		String country = "";
		String city = "";
		String district = "";
		
		if (count == 0) {
			
			country = BAUtils.readString("Lütfen ülke kodu giriniz. (TR, US, ES...) ");
			city = BAUtils.readString("Lütfen şehir adı giriniz. (Istanbul, Bursa, Eskisehir...) ");
			district = BAUtils.readString("Lütfen ilçe adı giriniz. (Kadıkoy, Tepebası, Maltepe...) ");
			count++;
		}
		
		location.put("country", country);
		location.put("city", city);
		location.put("district", district);
		
		return location;
		
	}
	
	public static void polution(Map<String, Object> list) {
		
		Map<String, Object> mapList = list;
		
		String polutionInfo = BAUtils.getPolutionData(Double.valueOf((String) mapList.get("lat")),
				Double.valueOf((String) mapList.get("lon")));
		
		System.out.println("Güncel atmosfer gaz emisyon değerleri:");
		System.out.println(polutionInfo.replace('"', ' ').substring(80, 171));
		
	}
	
	public static void longWeather(Map<String, Object> list) {
		
		Map<String, Object> mapList = list;
		
		String longWeatherInfo = BAUtils.getForecastData((String) mapList.get("district"), (String) mapList.get("city"),
				(String) mapList.get("country"));
		
		// System.out.println(longWeatherInfo);
		
		String points = "[{!,?:\\'@}]";
		String temp = "";
		
		List<String> temps = new ArrayList<String>();
		
		String[] fifteenHourWeather = longWeatherInfo.split(points);
		
		System.out.println("Gelecek 15 saatlik hava tahmini (3'er saatlik aralar ile belirtilmiştir. ");
		
		for (int i = 0; i < fifteenHourWeather.length; i++) {
			
			if (fifteenHourWeather[i].equals("\"temp\"")) {
				temp = fifteenHourWeather[i + 1];
				temps.add(temp);
			}
		}
		for (String temp1 : temps) {
			
			System.out.println(temp1 + "°C");
		}
	}
	
	public static Map<String, Object> latlon(Map<String, Object> list) {
		
		Map<String, Object> mapList = list;
		
		String latlonInput = BAUtils.getDirectData((String) mapList.get("district"), (String) mapList.get("city"),
				(String) mapList.get("country"));
		String lat = "";
		String lon = "";
		
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
		if (count == 0) {
			System.out.println((String) mapList.get("district") + " ilçesi " + (String) mapList.get("city") + " ili "
					+ (String) mapList.get("country") + " ülkesi için enlem değeri : " + lat);
			System.out.println((String) mapList.get("district") + " ilçesi " + (String) mapList.get("city") + " ili "
					+ (String) mapList.get("country") + " ülkesi için boylam değeri : " + lon);
			count++;
		}
		Map<String, Object> latLon = new HashMap<String, Object>();
		
		latLon.put("lat", lat);
		latLon.put("lon", lon);
		
		return latLon;
	}
	
	public static void weather(Map<String, Object> list) {
		
		Map<String, Object> mapList = list;
		
		String dailyWeatherInput = BAUtils.getWeatherData(Double.valueOf((String) mapList.get("lat")),
				Double.valueOf((String) mapList.get("lon")));
		
		String temp = "";
		String desc = "";
		String points = "[{!,?:\\_'@}]+";
		
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
		
	}
	
	private static void time() {
		
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		System.out.println("Güncel tarih ve saat: " + ts);
	}
	
	public static void main(String[] args) {
		
		weather(latlon(locationInput()));
		time();
		longWeather(locationInput());
		polution(latlon(locationInput()));
	}
}
