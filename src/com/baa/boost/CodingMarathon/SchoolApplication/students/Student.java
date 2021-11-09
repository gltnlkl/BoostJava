package com.baa.boost.CodingMarathon.SchoolApplication.students;

import com.baa.boost.CodingMarathon.SchoolApplication.abstracClass.Person;
import com.baa.boost.CodingMarathon.SchoolApplication.commonClass.Name;
import com.baa.boost.CodingMarathon.SchoolApplication.commonClass.PhoneNumber;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.ClassName;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.Gender;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.Occupation;
import com.baa.boost.CodingMarathon.SchoolApplication.interfaceClass.Attainable;

public class Student extends Person implements Attainable {
	
	private String classNum;
	private PhoneNumber phoneNumber;
	private boolean isAttendTheClass;
	private ClassName className;
	
	@Override
	public boolean isAttendTheClass() {
		
		return isAttendTheClass;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(Name name, Gender gender, int age, Occupation occupation, int startingDate, int leavingDate,
			PhoneNumber phoneNumber, String classNum, boolean isAttendTheClass, ClassName className) {
		super(name, gender, age, occupation, startingDate, leavingDate, phoneNumber);
		this.classNum = classNum;
		this.setClassName(className);
		this.isAttendTheClass = isAttendTheClass;
	}
	
	@Override
	public String toString() {
		return "Student [classNum=" + classNum + ", phoneNumber=" + phoneNumber + ", name=" + name + ", gender="
				+ gender + ", age=" + age + ", occupation=" + occupation + ", startingDate=" + startingDate
				+ ", leavingDate=" + leavingDate + ", Öğrencinin derse katılım durumu=" + isAttendTheClass() + "]";
	}
	
	public String getClassNum() {
		return classNum;
	}
	
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setAttendTheClass(boolean isAttendTheClass) {
		this.isAttendTheClass = isAttendTheClass;
	}

	public ClassName getClassName() {
		return className;
	}

	public void setClassName(ClassName className) {
		this.className = className;
	}
	
}
