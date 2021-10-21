package com.baa.boost.CodingMarathon.SchoolApplication.abstracClass;

import com.baa.boost.CodingMarathon.SchoolApplication.commonClass.Name;
import com.baa.boost.CodingMarathon.SchoolApplication.commonClass.PhoneNumber;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.Gender;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.Occupation;

public abstract class Person {
	
	protected Name name;
	protected Gender gender;
	protected int age;
	protected Occupation occupation;
	protected int startingDate;
	protected int leavingDate;
	private PhoneNumber phoneNumber;
	
	public Person() {
		this.name = null;
		this.gender = null;
		this.age = 0;
		this.occupation = null;
		this.startingDate = 0;
		this.leavingDate = 0;
		this.phoneNumber = null;
	}
	
	protected Person(Name name, Gender gender, int age, Occupation occupation, int startingDate, int leavingDate,
			PhoneNumber phoneNumber) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.occupation = occupation;
		this.startingDate = startingDate;
		this.leavingDate = leavingDate;
		this.phoneNumber = phoneNumber;
	}
	
	public Name getName() {
		return name;
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Occupation getOccupation() {
		return occupation;
	}
	
	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}
	
	public int getStartingDate() {
		return startingDate;
	}
	
	public void setStartingDate(int startingDate) {
		this.startingDate = startingDate;
	}
	
	public int getLeavingDate() {
		return leavingDate;
	}
	
	public void setLeavingDate(int leavingDate) {
		this.leavingDate = leavingDate;
	}
	
	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", occupation=" + occupation
				+ ", startingDate=" + startingDate + ", leavingDate=" + leavingDate + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	
}
