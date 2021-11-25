package com.baa.boost028.Serializable.Example;

import java.time.LocalDate;

public class Male extends Person implements IPersonCommon {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ozellikler
	
	private String workHard;
	private String power;
	
	// parametresiz constructer
	public Male() {
		// TODO Auto-generated constructor stub
	}
	
	// parametreli constructer
	public Male(long personId, String personName, String personSurname, String personGender, LocalDate retiredDate,
			LocalDate nowDate, String workHard, String power) {
		super(personId, personName, personSurname, personGender, retiredDate, nowDate);
		this.workHard = workHard;
		this.power = power;
	}
	
	// to string
	@Override
	public String toString() {
		return "Male [workHard=" + workHard + ", power=" + power + ", getPersonId()=" + getPersonId()
				+ ", getPersonName()=" + getPersonName() + ", getPersonSurname()=" + getPersonSurname()
				+ ", getPersonGender()=" + getPersonGender() + ", getRetiredDate()=" + getRetiredDate()
				+ ", getNowDate()=" + getNowDate() + ", getLogsDate()=" + getLogsDate() + "]";
	}
	
	// getter and setter
	public String getWorkHard() {
		return workHard;
	}
	
	public void setWorkHard(String workHard) {
		this.workHard = workHard;
	}
	
	public String getPower() {
		return power;
	}
	
	public void setPower(String power) {
		this.power = power;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
