package com.baa.boost032.Lambda;

import java.util.Arrays;

// Stream bir akış yapısıdır -- stream akış demektir.
// kodlarımızı daha az yazmak ve ugrasmamak ıcın kullanılır.
// IO: InputStream() OutputStream() ile Stream() farklı seylerdır
// karıstırılmamalıdır.
// sutun fabrıkada sıselenmesı gıbı gecen surec ve processlerı dusunebılırsın

public class StreamLesson {
	
	public static void iterativeArray() {
		
		String[] dizi = { "Eskısehır", "Sıvas" };
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i] + " ");
			
		}
	}
	
	public static void streamArray() {
		
		String[] dizi = { "Eskısehır", "Sıvas" };
		
		Arrays.asList(dizi).stream().forEach(System.out::println);
		; // diziyi liste cevırdık ( stream ve : method refernces yapısıdır.
		
	}
	
	public static void main(String[] args) {
		System.out.println();
		iterativeArray();
		System.out.println("a");
		streamArray();
	}
	
}
