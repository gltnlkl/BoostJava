package com.baa.boost028.Serializable.Example;

import java.time.LocalDate;

public class Lady extends Person implements IPersonCommon {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// ozellikler
	private String persuade; // ikna kabiliyeti
	private String beuty;
	
	// parametresiz
	public Lady() {
		System.out.println("Bayanlar yaşar: " + Lady.class);
	}
	
	public Lady(long personId, String personName, String personSurname, String personGender, LocalDate retiredDate,
			LocalDate nowDate, String persuade, String beuty) {
		super(personId, personName, personSurname, personGender, retiredDate, nowDate);
		this.persuade = persuade;
		this.beuty = beuty;
	}
	
	// to string
	@Override
	public String toString() {
		return "Lady [persuade=" + persuade + ", beuty=" + beuty + ", getPersonId()=" + getPersonId()
				+ ", getPersonName()=" + getPersonName() + ", getPersonSurname()=" + getPersonSurname()
				+ ", getPersonGender()=" + getPersonGender() + ", getRetiredDate()=" + getRetiredDate()
				+ ", getNowDate()=" + getNowDate() + ", getLogsDate()=" + getLogsDate() + "]";
	}
	
	// method
	// getter and setter
	public String getPersuade() {
		return persuade;
	}
	
	public void setPersuade(String persuade) {
		this.persuade = persuade;
	}
	
	public String getBeuty() {
		return beuty;
	}
	
	public void setBeuty(String beuty) {
		this.beuty = beuty;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
