package com.baa.boost.Working.FrameWork;

import java.util.HashMap;
import java.util.Map;

public class TekrarMaps {
	
	public static void deneme() {
		
		Map<String, Object> mapList = new HashMap<String, Object>();
		
	}
	
	public static void main(String[] args) {
		
		// HHLT
		// K=KEY YANI UNIQE BENZERSIZ OLMASI GEREKIYOR ( SIRA NUMARASI)
		// V=VALUE DEGER
		
		// Map<K, V> maplist = new HashMap<K,V>();
		
		Map<String, Object> mapList = new HashMap<String, Object>();
		
		mapList.put("1", "malatya");
		mapList.put("2", "istanbul");
		mapList.put("3", "ankara");
		mapList.put("4", "artvin");
		mapList.put("4", "adana");
		
		// System.out.println(mapList.get("1"));
		
		// key
		for (String temp : mapList.keySet()) {
			System.out.print(temp + " ");
		}
		System.out.println();
		
		// value
		for (Object temp : mapList.values()) {
			System.out.print(temp + " ");
		}
		System.out.println();
		
		// neden set olmadı =?????
		
		// Set=benzersiz elemanlar (aynı elemanları almaz)
		
		// Set set = mapList.keySet();
		// Iterator iterator = set.iterator();
		// while (iterator.hasNext()) {
		// System.out.print(iterator.next() + " " + mapList.get(iterator.next()) + " ");
		//
		// }
		
		// M.E.g.l.es (melez)
		for (Map.Entry<String, Object> temp : mapList.entrySet()) {
			System.out.print(temp + " ");
		}
		System.out.println();
		
		// map döngüsü
		mapList.entrySet().forEach(System.out::println);
	}
}
