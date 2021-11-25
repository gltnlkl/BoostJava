package com.baa.boost032.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CastArrayToListStream {
	public static void main(String[] args) {
		
		String[] dizi = { "Eskısehır", "Sıvas" };
		
		List<String> list = arrayToList(dizi);
		for (int j = 0; j < dizi.length; j++) {
			
			System.out.println(list.get(j) + " ");
			
		}
	}
	
	private static List<String> arrayToList(String[] dizi) {
		
		List<String> list = new ArrayList<String>();
		
		return Arrays.asList(dizi);
	}
	
}
