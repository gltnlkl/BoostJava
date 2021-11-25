package com.baa.boost021.Generics;

public class GenericsClass {
	
	// degiskenler ( private sadece o class uyeleri erisebilir.
	// nesne degiskeni mi - sinif degiskeni ( static var ise sinif degiskenidir. )
	// static yok ise nesne degiskenidir.
	
	private String adi; // private yazdigimiz icin bu sekile getter ve setter ile eristik (satoya girmek
						// icin anahtar gibi dusun.
	private String soyadi;
	
	// parametresiz constructor --->> ctrl space -- constructor
	
	public GenericsClass() {
		
	}
	
	// parameterli constructor
	// this ==> 2 tane yapi icin kullaniliyor.
	// 1 . global degisken icin
	// baska bir constructor i cagirmak icin
	
	public GenericsClass(String adi, String soyadi) {
		// super();
		this.adi = adi;
		this.soyadi = soyadi;
	}
	
	// getter and setter shift + Alt + s
	
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
	
	@Override // ----> to string eziyor sinifi bagimsiz bir davranis sonuc sergiliyor
	
	public String toString() { // toString (?)
		return "GenericsClass [adi=" + adi + ", soyadi=" + soyadi + "]";
	}
	
}
