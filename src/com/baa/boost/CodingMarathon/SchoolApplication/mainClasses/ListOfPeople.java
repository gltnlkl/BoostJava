package com.baa.boost.CodingMarathon.SchoolApplication.mainClasses;

import java.util.ArrayList;
import java.util.List;

import com.baa.boost.CodingMarathon.SchoolApplication.commonClass.Name;
import com.baa.boost.CodingMarathon.SchoolApplication.commonClass.PhoneNumber;
import com.baa.boost.CodingMarathon.SchoolApplication.employers.Officer;
import com.baa.boost.CodingMarathon.SchoolApplication.employers.Servant;
import com.baa.boost.CodingMarathon.SchoolApplication.employers.Teacher;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.ClassName;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.Gender;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.MarriageStatus;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.Occupation;
import com.baa.boost.CodingMarathon.SchoolApplication.students.Student;

public class ListOfPeople {
	
	public static List<Teacher> teacher() {
		
		List<Teacher> teacherList = new ArrayList<Teacher>();
		
		boolean attendTeacher1 = true;
		Name teacherName1 = new Name("Rabia", "Şengül", "Irmak");
		PhoneNumber teacherPhaneNumber1 = new PhoneNumber("02123101870", "02349872345", "05673452321");
		Teacher teacher1 = new Teacher(teacherName1, Gender.WOMAN, 35, Occupation.TEACHER, 2011, 0, teacherPhaneNumber1,
				"T-001", 5600.0, MarriageStatus.MARRIED, attendTeacher1, ClassName.CLASS_A);
		
		boolean attendTeacher2 = false;
		Name teacherName2 = new Name("Hüseyin", "Solmaz", "Hasan");
		PhoneNumber teacherPhaneNumber2 = new PhoneNumber("0212311870", "02342272345", "05173452321");
		Teacher teacher2 = new Teacher(teacherName2, Gender.MAN, 45, Occupation.TEACHER, 2019, 2021,
				teacherPhaneNumber2, "T-002", 7000.0, MarriageStatus.SINGLE, attendTeacher2, ClassName.CLASS_B);
		
		boolean attendTeacher3 = true;
		Name teacherName3 = new Name("Deniz", "Toprak");
		PhoneNumber teacherPhaneNumber3 = new PhoneNumber("02123341870", "02343423345", "05623452321");
		Teacher teacher3 = new Teacher(teacherName3, Gender.WOMAN, 33, Occupation.TEACHER, 2011, 0, teacherPhaneNumber3,
				"T-003", 9000.0, MarriageStatus.SINGLE, attendTeacher3, ClassName.CLASS_C);
		
		teacherList.add(teacher1);
		teacherList.add(teacher2);
		teacherList.add(teacher3);
		
		return teacherList;
		
	}
	
	public static List<Officer> Officer() {
		
		List<Officer> officerList = new ArrayList<Officer>();
		
		Name officerName1 = new Name("Hakkı", "Sönmez");
		PhoneNumber officerPhoneNumber1 = new PhoneNumber("02123341870", "02343423345", "05623452321");
		Officer officer1 = new Officer(officerName1, Gender.MAN, 23, Occupation.OFFICER, 2005, 2019,
				officerPhoneNumber1, "O-004", 4500, MarriageStatus.SINGLE);
		
		Name officerName2 = new Name("Esma", "Kırım");
		PhoneNumber officerPhoneNumber2 = new PhoneNumber("02123341870", "02343423345", "05623452321");
		Officer officer2 = new Officer(officerName2, Gender.WOMAN, 23, Occupation.OFFICER, 2010, 0, officerPhoneNumber2,
				"O-005", 6000, MarriageStatus.MARRIED);
		
		officerList.add(officer1);
		officerList.add(officer2);
		
		return officerList;
		
	}
	
	public static List<Servant> servant() {
		
		List<Servant> servantList = new ArrayList<Servant>();
		
		Name servantName1 = new Name("Rıfkı", "Yorulmaz");
		PhoneNumber servantPhoneNumber1 = new PhoneNumber("02233341870", "02343423345", "056232352321");
		Servant servant1 = new Servant(servantName1, Gender.NO_INFO, 51, Occupation.SERVANT, 2001, 2010,
				servantPhoneNumber1, "S-006", 8900, MarriageStatus.SINGLE);
		
		Name servantName2 = new Name("Alper", "Şaşmaz");
		PhoneNumber servantPhoneNumber2 = new PhoneNumber("02233341870", "02343423345", "056232352321");
		Servant servant2 = new Servant(servantName2, Gender.MAN, 21, Occupation.SERVANT, 2021, 0, servantPhoneNumber2,
				"S-006", 12000, MarriageStatus.SINGLE);
		
		Name servantName3 = new Name("Raziye", "Akıllı", "Hatice");
		PhoneNumber servantPhoneNumber3 = new PhoneNumber("02233341870", "02343423345", "056232352321");
		Servant servant3 = new Servant(servantName3, Gender.WOMAN, 63, Occupation.SERVANT, 1998, 2010,
				servantPhoneNumber3, "S-008", 5000, MarriageStatus.SINGLE);
		
		servantList.add(servant1);
		servantList.add(servant2);
		servantList.add(servant3);
		
		return servantList;
	}
	
	public static List<Student> student() {
		
		List<Student> studentList = new ArrayList<Student>();
		
		boolean attendStudent1 = true;
		Name studentName1 = new Name("Gülten", "Ulukal");
		PhoneNumber studentPhoneNumber1 = new PhoneNumber("02233341870", "02343423345");
		Student student1 = new Student(studentName1, Gender.WOMAN, 34, Occupation.STUDENT, 2021, 0000,
				studentPhoneNumber1, "2021-001", attendStudent1, ClassName.CLASS_A);
		
		boolean attendStudent2 = true;
		Name studentName2 = new Name("Deniz", "Yonkuç");
		PhoneNumber studentPhoneNumber2 = new PhoneNumber("02233341870", "02343423345");
		Student student2 = new Student(studentName2, Gender.MAN, 1, Occupation.STUDENT, 2021, 0000, studentPhoneNumber2,
				"2021-002", attendStudent2, ClassName.CLASS_B);
		
		boolean attendStudent3 = true;
		Name studentName3 = new Name("Gülten", "Ulukal");
		PhoneNumber studentPhoneNumber3 = new PhoneNumber("02233341870", "02343423345");
		Student student3 = new Student(studentName3, Gender.WOMAN, 34, Occupation.STUDENT, 2006, 2010,
				studentPhoneNumber3, "2006-003", attendStudent3, ClassName.CLASS_C);
		
		boolean attendStudent4 = true;
		Name studentName4 = new Name("Esma", "Tabak");
		PhoneNumber studentPhoneNumber4 = new PhoneNumber("02233341870", "02343423345");
		Student student4 = new Student(studentName4, Gender.WOMAN, 23, Occupation.STUDENT, 2005, 2008,
				studentPhoneNumber4, "2005-004", attendStudent4, ClassName.CLASS_A);
		
		boolean attendStudent5 = true;
		Name studentName5 = new Name("Seda", "Nur", "Müge");
		PhoneNumber studentPhoneNumber5 = new PhoneNumber("02233341870", "02343423345");
		Student student5 = new Student(studentName5, Gender.WOMAN, 17, Occupation.STUDENT, 2016, 0000,
				studentPhoneNumber5, "2016-005", attendStudent5, ClassName.CLASS_B);
		
		boolean attendStudent6 = true;
		Name studentName6 = new Name("Hasan", "Hüseyin", "Ali");
		PhoneNumber studentPhoneNumber6 = new PhoneNumber("02233341870", "02343423345");
		Student student6 = new Student(studentName6, Gender.MAN, 16, Occupation.STUDENT, 2019, 0000,
				studentPhoneNumber6, "2019-010", attendStudent6, ClassName.CLASS_A);
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(student6);
		
		return studentList;
	}
}
