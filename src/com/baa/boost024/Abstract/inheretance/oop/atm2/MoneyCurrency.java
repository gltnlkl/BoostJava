package com.baa.boost024.Abstract.inheretance.oop.atm2;

// Enum: sabit bileşenlerdir
// constructor private olmalı
// set ile ilgili metotum olmasın
public enum MoneyCurrency {
	TR(1, "tr"), EN(2, "en"), GE(3, "ge");
	
	private final int number;
	private final String curr;
	
	// constructor private oldu
	private MoneyCurrency(int number, String curr) {
		this.number = number;
		this.curr = curr;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getCurr() {
		return curr;
	}
	
}
