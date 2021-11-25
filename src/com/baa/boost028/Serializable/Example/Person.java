package com.baa.boost028.Serializable.Example;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// özellıkler
	
	private long personId;
	private String personName;
	private String personSurname;
	private String personGender;
	private LocalDate retiredDate;
	private LocalDate nowDate;
	private String logsDate; // loglama tarıhı
	
	// parametresız constructer
	public Person() {
		this.personId = 0; // ılk degerlerı atadık
	}
	
	// parametrelı constructer
	public Person(long personId, String personName, String personSurname, String personGender, LocalDate retiredDate,
			LocalDate nowDate) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personSurname = personSurname;
		this.personGender = personGender;
		this.retiredDate = retiredDate;
		this.nowDate = nowDate;
	}
	// meethod bileşeni
	
	// toString
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personSurname=" + personSurname
				+ ", personGender=" + personGender + ", retiredDate=" + retiredDate + ", nowDate=" + nowDate
				+ ", logsDate=" + logsDate + "]";
	}
	// getter and setter
	
	public long getPersonId() {
		return personId;
	}
	
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	
	public String getPersonName() {
		return personName;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public String getPersonSurname() {
		return personSurname;
	}
	
	public void setPersonSurname(String personSurname) {
		this.personSurname = personSurname;
	}
	
	public String getPersonGender() {
		return personGender;
	}
	
	public void setPersonGender(String personGender) {
		this.personGender = personGender;
	}
	
	public LocalDate getRetiredDate() {
		return retiredDate;
	}
	
	public void setRetiredDate(LocalDate retiredDate) {
		this.retiredDate = retiredDate;
	}
	
	public LocalDate getNowDate() {
		return nowDate;
	}
	
	public void setNowDate(LocalDate nowDate) {
		this.nowDate = nowDate;
	}
	
	public String getLogsDate() {
		return logsDate;
	}
	
	public void setLogsDate(String logsDate) {
		this.logsDate = logsDate;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
