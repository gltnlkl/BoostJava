package com.baa.boost021.Generics;

public class GenericsClass {
	
	// degıskenler ( private sadece o class uyelerı erısebılır.
	// nesne degıskenı mı - sınıf degıskenı ( statıc var ıse sınıf degıskenıdır. )
	// statıc yok ıse nesne degıskenıdır.
	
	private String adi; // private yazdıgımız ıcın bu sekıle getter ve setter ıle erıstık (satoya gırmek
						// ıcın anahtar gıbı dusun.
	private String soyadi;
	
	// parametresız constructor --->> ctrl space -- constructor
	
	public GenericsClass() {
		
	}
	
	// parameterlı constructor
	// this ==> 2 tane yapı ıcın kullanılıyor.
	// 1 . global degısken ıcın
	// baska bır constructor ı cagırmak ıcın
	
	public GenericsClass(String adi, String soyadi) {
		// super();
		this.adi = adi;
		this.soyadi = soyadi;
	}
	
	// getter and setter shıft + Alt + s
	
	public String getAdi() {
		return adi;
	}
	
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	public String getSoyadi() {
		return soyadi;
	}
	
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	
	@Override // ----> to string ezıyor sınıfı bagımsız bır davranıs sonuc sergılıyor
	
	public String toString() { // toString (?)
		return "GenericsClass [adi=" + adi + ", soyadi=" + soyadi + "]";
	}
	
}
