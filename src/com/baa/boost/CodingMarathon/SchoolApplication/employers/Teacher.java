package com.baa.boost.CodingMarathon.SchoolApplication.employers;

import com.baa.boost.CodingMarathon.SchoolApplication.commonClass.Employee;
import com.baa.boost.CodingMarathon.SchoolApplication.commonClass.Name;
import com.baa.boost.CodingMarathon.SchoolApplication.commonClass.PhoneNumber;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.ClassName;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.Gender;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.MarriageStatus;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.Occupation;
import com.baa.boost.CodingMarathon.SchoolApplication.interfaceClass.Attainable;

public class Teacher extends Employee implements Attainable {
	
	private ClassName className;
	
	public static boolean isAttendTheClass;
	
	public Teacher() {
		isAttendTheClass = true;
		
	}
	
	@Override
	public boolean isAttendTheClass() {
		
		return isAttendTheClass;
	}
	
	public Teacher(Name name, Gender gender, int age, Occupation occupation, int startingDate, int leavingDate,
			PhoneNumber phoneNumber, String regNo, double startingSalary, MarriageStatus marriageStatus,
			boolean isAttendTheClass, ClassName className) {
		super(name, gender, age, occupation, startingDate, leavingDate, phoneNumber, regNo, startingSalary,
				marriageStatus);
		Teacher.isAttendTheClass = isAttendTheClass;
		this.className = className;
	}
	
	@Override
	public String toString() {
		return "Teacher [isAttendTheClass=" + isAttendTheClass + ", marriageStatus=" + marriageStatus + ", name=" + name
				+ ", gender=" + gender + ", age=" + age + ", occupation=" + occupation + ", startingDate="
				+ startingDate + ", leavingDate=" + leavingDate + ", getRegNo()=" + getRegNo()
				+ ", getStartingSalary()=" + getStartingSalary() + ", getPhoneNumber()=" + getPhoneNumber() + "]";
	}
	
}
