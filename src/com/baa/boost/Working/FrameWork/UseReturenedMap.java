package com.baa.boost.Working.FrameWork;

import java.util.HashMap;

public class UseReturenedMap {
	
	public static HashMap<String, String> returnedMap() {
		
		HashMap<String, String> myMap = new HashMap<String, String>();
		
		myMap.put("Anne", "Gülten");
		myMap.put("Oğul", "Deniz");
		myMap.put("Baba", "Özgür");
		myMap.put("Anane", "Şükran");
		myMap.put("Teyze", "Başak");
		
		return myMap;
	}
	
	public static void useReturnedMap(HashMap<String, String> myMap) {
		
		String anne = (String) myMap.get("Anne");
		String ogul = (String) myMap.get("Oğul");
		
		System.out.println("Anne: " + anne);
		System.out.println("Oğul: " + ogul);
		
	}
	
	public static void main(String[] args) {
		
		useReturnedMap(returnedMap());
	}
}
