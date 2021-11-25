package com.baa.boost018.Utils.BAUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BAUtils {
	private static Scanner scan = new Scanner(System.in);
	
	public static void footer() {
		System.out.println("\n\n\tProgramı kullandıgınız icin tesekkurler");
		System.out.println("\t\tTekrar gorusmek uzere");
		closeResources();
	}
	
	public static void header(String title) {
		// ===========
		// ** title **
		// ===========
		int len = title.length();
		StringBuilder row = new StringBuilder("");
		
		for (int i = 0; i < (len + 6); i++) {
			row.append("=");
		}
		
		System.err.println("\n\n\t\t" + row);
		System.err.println("\t\t** " + title.toUpperCase() + " **");
		System.err.println("\t\t" + row + "\n");
	}
	
	public static String readString(String query) {
		showQuery(query);
		String retVal = scan.nextLine();
		return retVal;
	}
	
	private static void showQuery(String query) {
		System.out.print("\t" + query + ": ");
	}
	
	public static int readInt(String query) {
		int retVal = Integer.MIN_VALUE;
		showQuery(query);
		retVal = scan.nextInt();
		scan.nextLine();
		return retVal;
	}
	
	public static int[] readInt(String start, String query, int numElements) {
		showQuery(start + " " + numElements + " " + query + "\n");
		int[] retVal = new int[numElements];
		for (int i = 0; i < numElements; i++) {
			System.out.print((i + 1) + ". de�eri giriniz: ");
			retVal[i] = scan.nextInt();
		}
		scan.nextLine();
		return retVal;
	}
	
	public static double readDouble(String query) {
		double retVal = Double.NEGATIVE_INFINITY;
		showQuery(query);
		retVal = scan.nextDouble();
		scan.nextLine();
		return retVal;
	}
	
	public static void closeResources() {
		scan.close();
	}
	
	public static boolean wantToEnd(String question, String negativeAnswer) {
		boolean retVal = true;
		
		showQuery(question);
		String answer = scan.next();
		
		retVal = answer.equalsIgnoreCase(negativeAnswer);
		scan.nextLine();
		return !retVal;
	}
	
	/*
	 * public static boolean proceeding(String question, String positiveAnswer) {
	 * return readString(question).equalsIgnoreCase(positiveAnswer); }
	 */
	
	/**
	 * long seklinde belirtilmis bir zaman bilgisini dd.MM.yyyy seklinde geri doner
	 * 
	 * @param timestamp zaman bilgisi
	 * @return
	 */
	public static String dateAsString(long timestamp) {
		LocalDateTime dateTime = LocalDateTime.ofEpochSecond(timestamp, 0, ZoneOffset.UTC);
		return dateTime.format(DateTimeFormatter.ofPattern("dd.MMM.yyyy"));
	}
	
	/**
	 * long seklinde belirtilmis bir zaman bilgisini dd.MM.yyyy seklinde ger doner
	 * 
	 * @param timestamp zaman bilgisi
	 * @return
	 */
	public static String timeAsString(long timestamp) {
		LocalDateTime dateTime = LocalDateTime.ofEpochSecond(timestamp, 0, ZoneOffset.UTC);
		return dateTime.format(DateTimeFormatter.ofPattern("HH:mm"));
	}
	
	/**
	 * Enlem ve boylam verileri verilmis bir yer icin hava kirliligi bilgilerini
	 * geri doner
	 * 
	 * @param lat Enlem bilgisi
	 * @param lon Boylam bilgisi
	 * @return
	 */
	
	public static String getPolutionData(double lat, double lon) {
		String url = "http://api.openweathermap.org/data/2.5/air_pollution?lat=" + lat + "&lon=" + lon
				+ "&appid=246a2bf08c730aed2f8a547f8d85943a";
		String retVal = "";
		
		URL obj;
		try {
			obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				retVal += inputLine;
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}
	
	/**
	 * Enlem ve boylam verileri verilmis bir yer icin gunluk hava tahmini bilgisini
	 * geri doner
	 * 
	 * @param lat Enlem bilgisi
	 * @param lon Boylam bilgisi
	 * @return
	 */
	public static String getWeatherData(double lat, double lon) {
		String url = "http://api.openweathermap.org/data/2.5/weather?lat=" + lat + "&lon=" + lon
				+ "&units=metric&lang=tr&appid=246a2bf08c730aed2f8a547f8d85943a";
		String retVal = "";
		
		URL obj;
		try {
			obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				retVal += inputLine;
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}
	
	/**
	 * Verilen bilgiler dahilinde 3er saatlik aralıklala yapılmıs 5 adet hava
	 * tahminini geri doner
	 * 
	 * @param ilce Bir sehrin ilcesinin adı
	 * @param il   sehır adı
	 * @param ulke IOS ulke kısa kodları, Turkiye icin TR
	 * @return
	 */
	
	public static String getForecastData(String ilce, String il, String ulke) {
		String url = "https://api.openweathermap.org/data/2.5/forecast?&q=" + ilce + "," + il + "," + ulke
				+ "&units=metric&cnt=5&appid=246a2bf08c730aed2f8a547f8d85943a";
		String retVal = "";
		
		URL obj;
		try {
			obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				retVal += inputLine;
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}
	
	/**
	 * Verilen bilgiler dahilinde bir ilcenin enlem ve boylam bilgilerine ulasmak
	 * icin kullanılır
	 * 
	 * @param ilce Bir sehrin ilcesinin adı
	 * @param il   sehır adı
	 * @param ulke IOS ulke kisa kodları, Turkiye icin TR
	 * @return
	 */
	public static String getDirectData(String ilce, String il, String ulke) {
		String url = "http://api.openweathermap.org/geo/1.0/direct?q=" + ilce + "," + il + "," + ulke
				+ "&limit=1&appid=246a2bf08c730aed2f8a547f8d85943a";
		String retValue = "";
		
		URL obj;
		try {
			obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				retValue += inputLine;
			}
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retValue;
	}
}
