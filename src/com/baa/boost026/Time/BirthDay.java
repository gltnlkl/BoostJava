package com.baa.boost026.Time;

import java.time.LocalDate;
import java.time.Month;

public class BirthDay {
	
	public static void main(String[] args) {
		
		LocalDate birthDay = LocalDate.of(1988, Month.SEPTEMBER, 25);
		
		System.out.println("Dogum gunu ayin kacindadir ? \n" + birthDay.getDayOfMonth());
		
		System.out.println("Dogdugu gun nedir ? \n" + birthDay.getDayOfWeek());
		
		System.out.println("Dogum tarihi nedir? \n" + birthDay);
		
	}
	
}