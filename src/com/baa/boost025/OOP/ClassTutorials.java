package com.baa.boost025.OOP;

// class : class+ class+ class bırlesımlerı ıle paketler olusturulur.
// object nedir ? ozellıklerı olan hersey
// - konumu ozellıklerı boyutu
// objext --- class --- package --- project
// classlar basharfı buyuk ve PascalCase ıle adlandırılır.

// global scope
// local scope
// nesne degıskenı
// class degıskenı
// fınal

public class ClassTutorials {
	
	// TODO Class - object vs main
	
	// access modifier
	// public -her taraftan erısım saglanıyor
	// private -sadece kendı classında calsıır baska classlarda kullanmak ıcın
	// getter
	// ve setter kullanılır
	
	// default -
	// protected -
	
	// telefon ??
	
	public static String phoneTrade; // static oldugu durumlarda class degıskenı olmadıgında ıse nesne degıskenı
	private double phonePrice; // nesne degıskenı
	private String phoneColor;
	private boolean isProduction;
	private int yearOfProduction;
	
	// getter and setter; getter setter publıc olmak zorunda
	// getter verılerı getırmek
	
	public double getPhonePrice() {
		return phonePrice;
	}
	
	// setter ıse yazmak anlamına gelır // return yok void olacak
	
	public void setPhonePrice(double phonePrice) {
		this.phonePrice = phonePrice; // thıs ıle yazdıgımız yukarıdakı degıskendır ıkıncısı ıse parametre ıle
										// gırddıgımız degıskendır
	}
	// shift + alt + s
	
	public String getPhoneColor() {
		return phoneColor;
	}
	
	public void setPhoneColor(String phoneColor) {
		this.phoneColor = phoneColor;
	}
	
	public boolean isProduction() {
		return isProduction;
	}
	
	public void setProduction(boolean isProduction) {
		this.isProduction = isProduction;
	}
	
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	
	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
	
}
