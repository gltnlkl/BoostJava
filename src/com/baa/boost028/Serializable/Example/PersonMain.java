package com.baa.boost028.Serializable.Example;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class PersonMain {
	
	// global degıskenler
	
	private static int count = 0;
	private static Scanner klavye = new Scanner(System.in);
	
	// method
	
	public static void personGeneral() {
		Person person = new Person(); // person sınıfını getırdım
		int BirthYear = 0, BirthMonth = 0, BirthDay = 0;
		
		try {
			System.out.println("Lütfen adınızı giriniz.");
			person.setPersonName(klavye.nextLine());
			System.out.println("Lütfen soy adınızı giriniz.");
			person.setPersonSurname(klavye.nextLine());
			System.out.println("Lütfen doğum yılınızı giriniz.");
			BirthYear = klavye.nextInt();
			System.out.println("Lütfen doğum aynızı giriniz.");
			BirthMonth = klavye.nextInt();
			System.out.println("Lütfen doğum gununuzu giriniz.");
			BirthDay = klavye.nextInt();
			klavye.nextLine(); // int den sonra klavye okumasını dogru yapması ıcın
			System.out.println("Lütfen cinsiyetinizi giriniz.");
			person.setPersonGender(klavye.nextLine());
			
			if (person.getPersonGender().equalsIgnoreCase(Gender.ERKEK.toString())) {
				Calendar calender = Calendar.getInstance();
				person.setRetiredDate(LocalDate.of(BirthYear+65, BirthMonth, BirthDay));
				person.setNowDate(LocalDate.of(calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)));
			
			Male male = new Male(1,person)
			
			
			
			} else if (person.getPersonGender().equalsIgnoreCase(Gender.KADIN.toString())) {
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
