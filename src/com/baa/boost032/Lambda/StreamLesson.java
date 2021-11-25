package com.baa.boost032.Lambda;

import java.util.Arrays;

// Stream bir akis yapisidir -- stream akis demektir.
// kodlarimizi daha az yazmak ve ugrasmamak icin kullanilir
// IO: InputStream() OutputStream() ile Stream() farkli seylerdir
// karistirilmamalidir.
// sutun fabrikada siselenmesi gibi gecen surec ve processleri dusunebilirsin

public class StreamLesson {
	
	public static void iterativeArray() {
		
		String[] dizi = { "Eskisehir", "Sivas" };
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i] + " ");
			
		}
	}
	
	public static void streamArray() {
		
		String[] dizi = { "Eskisehir", "Sivas" };
		
		Arrays.asList(dizi).stream().forEach(System.out::println);
		; // diziyi liste cevirdik ( stream ve : method refernces yapisidir.
		
	}
	
	public static void main(String[] args) {
		System.out.println();
		iterativeArray();
		System.out.println("a");
		streamArray();
	}
	
}
