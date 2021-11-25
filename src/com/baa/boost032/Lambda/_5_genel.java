package com.baa.boost032.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _5_genel {
	
	public static void main(String[] args) {
		// her bir elemana 5 ekleyerek yenı bır lıste olusturuyoruz
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5).stream().map(Sum -> Sum + 5).collect(Collectors.toList());
		
		list.forEach(System.out::println);
		
	}
	
}
