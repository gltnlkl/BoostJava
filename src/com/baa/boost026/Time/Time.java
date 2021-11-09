package com.baa.boost026.Time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.YearMonth;
import java.time.ZonedDateTime;

public class Time {
	
	public static void main(String[] args) {
		
		System.out.println(LocalTime.now()); // yerel zaman
		System.out.println(LocalDateTime.now()); // yerel tarih ve zaman
		System.out.println(ZonedDateTime.now()); // saat dilimli tarih ve zaman
		System.out.println(OffsetTime.now()); // offsetli zaman
		System.out.println(OffsetDateTime.now()); // offsetli tarih ve zaman
		System.out.println(MonthDay.now()); // ay ve gun
		System.out.println(YearMonth.now()); // yil ve ay
		System.out.println(Instant.now()); // anlik
		
		LocalDateTime dT = LocalDateTime.parse("2021-10-11T09:47"); // kendi belirtigimiz tarih ve saati yazar
		System.out.println(dT);
		
		LocalDate d = LocalDate.parse("2021-10-11"); // kendi belirtigimiz tarihi yazar
		System.out.println(d);
		
		LocalDate d1 = LocalDate.of(2021, 10, 11); // arguman seklinde bolge gostererek tarih yazabiliriz.
		
		System.out.println(d1);
		
		LocalDate d2 = LocalDate.of(2021, 10, 11);
		System.out.println(d2);
		
	}
	
}
