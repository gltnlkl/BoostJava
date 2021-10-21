package com.baa.boost026.Time;

import java.time.LocalDate;
import java.time.Month;

public class BirthDay {
	
	public static void main(String[] args) {
		
		LocalDate birthDay = LocalDate.of(1988, Month.SEPTEMBER, 25);
		
		System.out.println("Doğum günü ayın kaçındadır ? \n" + birthDay.getDayOfMonth());
		
		System.out.println("Doğduğu gün nedir ? \n" + birthDay.getDayOfWeek());
		
		System.out.println("Doğum tarihi nedir? \n" + birthDay);
		
	}
	
}