package com.baa.boost008.SplitTokenizer;

import java.util.StringTokenizer;

public class SplitTokenazier {
	
	public static void main(String[] args) {
		
		// Stringe.split ile string i parcalamak,
		
		String sentence = "Java öğrenmek, bir harika.";
		// sentence.split(" "); // split parçalamak
		String[] dizi = sentence.split(","); // bırraktıgımız "" ıfade ıle parcalar.
		for (int i = 0; i < dizi.length; i++) {
			
			System.out.println(dizi[i]);
			
		} // for each dongusu, gelecekte gorecegız.
		
		for (String temp : dizi) {
			System.out.println(temp);
			
		}
		
		// StringTokenizer ile string i parçalamak;
		
		StringTokenizer tokenizer = new StringTokenizer(sentence, "& ~ "); // gırılen kelımelerı cumleden bagımsız
																			// olarka alt alta sıralayabılıyoruz.
		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
			
		}
		
	}
}
