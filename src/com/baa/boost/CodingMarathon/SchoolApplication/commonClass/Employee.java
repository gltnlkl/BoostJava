package com.baa.boost.CodingMarathon.SchoolApplication.commonClass;

import com.baa.boost.CodingMarathon.SchoolApplication.abstracClass.Person;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.Gender;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.MarriageStatus;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.Occupation;

public class Employee extends Person {
	
	private String regNo;
	private double startingSalary;
	protected MarriageStatus marriageStatus;
	
	protected Employee() {
		// TODO Auto-generated constructor stub
	}
	
	protected Employee(Name name, Gender gender, int age, Occupation occupation, int startingDate, int leavingDate,
			PhoneNumber phoneNumber, String regNo, double startingSalary, MarriageStatus marriageStatus) {
		super(name, gender, age, occupation, startingDate, leavingDate, phoneNumber);
		this.regNo = regNo;
		this.startingSalary = startingSalary;
		this.marriageStatus = marriageStatus;
	}
	
	@Override
	public String toString() {
		return "Employee [regNo=" + regNo + ", startingSalary=" + startingSalary + ", marriageStatus=" + marriageStatus
				+ ", name=" + name + ", gender=" + gender + ", age=" + age + ", occupation=" + occupation
				+ ", startingDate=" + startingDate + ", leavingDate=" + leavingDate + ", getPhoneNumber()="
				+ getPhoneNumber() + "]";
	}
	
	public MarriageStatus getMarriageStatus() {
		return marriageStatus;
	}
	
	public void setMarriageStatus(MarriageStatus marriageStatus) {
		this.marriageStatus = marriageStatus;
	}
	
	public String getRegNo() {
		return regNo;
	}
	
	public double getStartingSalary() {
		return startingSalary;
	}
	
}
