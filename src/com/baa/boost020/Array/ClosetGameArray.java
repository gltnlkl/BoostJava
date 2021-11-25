package com.baa.boost020.Array;

public class ClosetGameArray {
	
	// Soru----
	
	/*
	 * 1000 adet dolap var once ılk turu atıp tum dolap kapaklarını acar.
	 * Basa doner ve her ıkıncı dolabı kapatır.
	 * Tekrar basa doner ve 3. dolabı degıstırır acıksa kapar kapalı ıse acar.
	 * Sonra her 4. ve 5. dolap ıcın aynı seylerı yapar.
	 * 1000. turdan sonra bıtırıp durur.
	 * Sonunda 1000 dolaptan kacı acık kaldı ve hangılerı?
	 */
	
	public static void main(String[] args) {
		int numOfElements = 1000;
		
		Boolean[] spints = new Boolean[numOfElements]; // acık veya kapalı // dolapların hepsının kapalı olduguna emın
														// olduk
		
		for (int i = 0; i < spints.length; i++) {
			spints[i] = false; // tum dolapları kapadık
		}
		
		for (int tour = 1; tour <= spints.length; tour++) { // 1000 tur attı
			for (int spinCount = 0; spinCount < spints.length;) {
				
				spints[spinCount] = !spints[spinCount];
				spinCount = spinCount + tour; // ---- > bu satır aslında for dongusunun 3. degıskenı, basıt ++ --
												// durumları
				// yok ıse ayrıca suslu parantez ıcınde yazılan actıon satırının sonuna eklenır.
				
			}
			
		}
		// acık kalan dolapları lıstelıyor ve acık dolap adedını sayıyor.
		int openSpinCount = 0;
		
		for (int i = 0; i < spints.length; i++) { // acık kalan dolapları goster
			
			if (spints[i]) { // bu satırda spints true mu dıye sorguluyor? false soruyor olsaydık !spints[]
								// derdık.
				
				System.out.println(i + "");
				openSpinCount++;
			}
		}
		System.err.println("\nAcık kalan dolap adedi: " + openSpinCount);
	}
	
}
