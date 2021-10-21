package com.baa.boost.Homework.WeatherForecast;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import BAUtils.BAUtils;

public class WeatherForecastMap {
	
	// statik ve sabit veri
	// Global Sınıf değişkeni
	
	public static int count = 0;
	
	// il ilçe ulke kodunu alsın
	
	public static Map<String, Object> getLocationReading() { // dısarı map donen bır method kullanıcıdan location
																// bıgılerı alınıyor.
		
		Scanner input = new Scanner(System.in);
		
		String ilce = "", il = "", ulke = "";
		
		Map<String, Object> mapList = new HashMap<String, Object>(); // Adı maplist olan bır hashmap yarattık
		
		// System.out.println(count);
		
		if (count == 0) { // dısarıda adı count olan ve bunu 0 a esıtleyen bır static method olusturuldu.
							// Tekrar tekrar verı bızden ıstemesın dıye bır ıslem
			
			System.out.println("Lütfen ilceyi giriniz ");
			ilce = input.nextLine(); // .toLowerCase();
			System.out.println("Lütfen ili giriniz ");
			il = input.nextLine(); // .toLowerCase();
			System.out.println("Lütfen ülke kodunu giriniz ");
			ulke = input.nextLine(); // .toLowerCase();
			
			count++;
		}
		
		mapList.put("ilce", ilce);
		
		mapList.put("il", il);
		mapList.put("ulke", ulke);
		
		return mapList;
	}
	
	// tekrarsız döngü il,ilçe,ülke
	public static Map<String, Object> nonRepeatValue() {
		Map<String, Object> list = getLocationReading();
		return list;
	}
	
	// enlem boylam
	
	public static String[] getLatitudeLongitude(Map<String, Object> list) {
		// enlem,boylam
		
		String latit, longi;
		
		String value = BAUtils.getDirectData((String) list.get("ilce"), (String) list.get("il"),
				(String) list.get("ulke"));
		
		latit = getAllLatitude(value, "lat");
		
		longi = getAllLatitude(value, "lon");
		
		String[] array = { latit, longi };
		
		return array;
		
	}
	
	public static String getAllLatitude(String valueAll, String latLon) {
		
		int first, end;
		
		String find = "";
		
		if (valueAll.contains(latLon)) {
			first = valueAll.indexOf(latLon) + 5;
			end = first + 7;
			find = valueAll.substring(first, end);
		}
		return find;
	}
	
	// Günlük hava raporu
	public static void dailyWeatherReport(String[] dizi) {
		String report = BAUtils.getWeatherData(Double.valueOf(dizi[0]), Double.valueOf(dizi[1]));
		System.out.println("Günlük hava raporu: " + report);
	}
	
	// Hava kirlilik raporu
	public static void dailyWeatherPolution(String[] dizi) {
		String report = BAUtils.getPolutionData(Double.valueOf(dizi[0]), Double.valueOf(dizi[1]));
		System.out.println("Hava kirlilik raporu: " + report);
	}
	
	// 15 saatlik hava raporu
	public static void fifteenHoursWeather(Map<String, Object> list) {
		Map<String, Object> mapList = list;
		
		String report = BAUtils.getForecastData((String) mapList.get("ilce"), (String) mapList.get("il"),
				(String) mapList.get("ulke"));
		System.out.println("15 saatlik hava raporu: " + report);
	}
	
	public static void main(String[] args) {
		
		getLatitudeLongitude(getLocationReading());
		dailyWeatherReport(getLatitudeLongitude(nonRepeatValue()));
		dailyWeatherPolution(getLatitudeLongitude(nonRepeatValue()));
		fifteenHoursWeather(nonRepeatValue());
		
	}
	
}