package com.baa.boost.Homework.WeatherForecast;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import BAUtils.BAUtils;

public class HmLssn {
	// il ilçe ulke kodunu alsın
	public static Map<String, Object> getCountyReading() {
		Scanner klavye = new Scanner(System.in);
		String ilce, il, ulke;
		Map<String, Object> mapList = new HashMap<String, Object>();
		
		System.out.println("Lütfen ilceyi giriniz ");
		ilce = klavye.nextLine(); // .toLowerCase();
		
		System.out.println("Lütfen ili giriniz ");
		il = klavye.nextLine(); // .toLowerCase();
		
		System.out.println("Lütfen ülke kodunu giriniz ");
		ulke = klavye.nextLine(); // .toLowerCase();
		
		mapList.put("ilce", ilce);
		mapList.put("il", il);
		mapList.put("ulke", ulke);
		
		// return (Map<String, Object>) mapList;
		return mapList;
	}
	
	public static void getLatitudeLongitude(Map<String, Object> list) {
		// enlem,boylam
		String latit, longi;
		String value = BAUtils.getDirectData((String) list.get("ilce"), (String) list.get("il"),
				(String) list.get("ulke"));
		System.out.println(value);
		latit = getAllLatitude(value, "lat");
		System.out.println("Enlem : " + latit);
		
		longi = getAllLatitude(value, "lon");
		System.out.println("Boylam : " + longi);
		
	}
	
	// enlem lat lon
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
	
	public static void main(String[] args) {
		getLatitudeLongitude(getCountyReading());
		// String kelime = BAUtils.getDirectData("Edremit", "Balikesir", "TR");
		// System.out.println(kelime);
		// Edremit
		// Balikesir
		// TR
		
	}
	
}