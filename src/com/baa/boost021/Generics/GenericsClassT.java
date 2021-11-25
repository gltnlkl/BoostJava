package com.baa.boost021.Generics;

// private ==> sadece o classtakiler erişebilir.
// Generics Class
public class GenericsClassT<T> {
	
	// Nesne değişkeni (Global değişkenlerdir)
	private T adi;
	private String soyadi;
	
	// parametresiz constructor
	// Ctrl+space
	public GenericsClassT() {
		
	}
	
	// parametreli constructor
	// Shift+Alt+S
	
	// this ==> 2 tane yapı için kullanıyoruz.
	// Global değişkenlere erişmek
	// başka constructorları çağırmak için kullanıyoruz.
	public GenericsClassT(T adi, String soyadi) {
		// super();
		this.adi = adi;
		this.soyadi = soyadi;
	}
	
	// getter and setter
	// Shift+Alt+S
	
	@Override
	public String toString() {
		return "GenericsClass [adi=" + adi + ", soyadi=" + soyadi + "]";
	}
	
	public T getAdi() {
		return adi;
	}
	
	public void setAdi(T adi) {
		this.adi = adi;
	}
	
	public String getSoyadi() {
		return soyadi;
	}
	
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	
}
