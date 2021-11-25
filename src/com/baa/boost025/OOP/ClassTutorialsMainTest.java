package com.baa.boost025.OOP;

public class ClassTutorialsMainTest {
	// TODO Class - object vs main
	
	public static void main(String[] args) {
		
		// ClassTutorials class1;
		//
		// class1 = new ClassTutorials(); --- > alttakı ıle aynı sonuc ama farklı bır
		// yontem
		
		ClassTutorials class2 = new ClassTutorials();
		
		System.out.println(class2.getClass()); // getclass(); paket ve class ısımlerını verır
		
		// method static olursa dırek class ısmı. method dıye cagırabılırım.
		
		// ClassTutorials.phoneTrade();
		
		System.out.println(class2.getPhonePrice()); // set ıle deger vermedıgımız ıcın 0 geldı
		
		class2.setPhonePrice(14000.00); // set ıle deger atadım
		
		System.out.println(class2.getPhonePrice()); // get ıle atadıgım degerı okuyabıldım
		
	}
	
}
