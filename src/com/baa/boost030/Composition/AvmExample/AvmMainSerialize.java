package com.baa.boost030.Composition.AvmExample;

import java.time.LocalDate;
import java.util.HashMap;

public class AvmMainSerialize {
	
	public static HashMap<String, Object> Buyaka() {
		
		Dimension avmDim = new Dimension(400, 275);
		Avm avm = new Avm(LocalDate.now(), 1, "Buyaka", LocalDate.parse("2012-03-26"), "İstanbul - Tepeüstü", avmDim);
		System.out.println(avm);
		
		Location macLoc = new Location("1.kat", Zone.ZONE1, 13);
		Dimension macDim = new Dimension(10.4, 6);
		BeautyShop mac = new BeautyShop("MAC", "Kozmetik ürünleri", 100, LocalDate.now(), 76, macLoc, macDim);
		System.out.println(mac);
		
		Location cafeLoc = new Location("3.kat", Zone.ZONE2, 198);
		Dimension cafeDim = new Dimension(20, 10);
		Restaurant cafe = new Restaurant("The House Cafe", "Restorant", 5460, LocalDate.now(), 32, cafeLoc, cafeDim,
				"Dünya mutfağı");
		System.out.println(cafe);
		
		Location zaraLoc = new Location("2.kat", Zone.ZONE3, 34);
		Dimension zaraDim = new Dimension(100, 250);
		Toggery butik = new Toggery("ZARA", "Giysi ve Aksesuar", 34452.50, LocalDate.now(), 13, zaraLoc, zaraDim);
		System.out.println(butik);
		
		Location mediaLoc = new Location("-2.kat", Zone.ZONE1, 378);
		Dimension mediaDim = new Dimension(150, 210);
		ElectronicsShop media = new ElectronicsShop("Media Markt", "Teknoloji ürünleri", 20000, LocalDate.now(), 9,
				mediaLoc, mediaDim);
		System.out.println(media);
		
		HashMap<String, Object> avmList = new HashMap<>();
		
		avmList.put("Buyaka", avm);
		avmList.put("Mac", mac);
		avmList.put("The House Cafe", cafe);
		avmList.put("Zara", butik);
		avmList.put("Media Markt", media);
		
		return avmList;
		
	}
	
	public static void main(String[] args) {
		
		Buyaka();
		
	}
	
}
