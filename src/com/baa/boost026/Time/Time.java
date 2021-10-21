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
		System.out.println(MonthDay.now()); // ay ve gün
		System.out.println(YearMonth.now()); // yıl ve ay
		System.out.println(Instant.now()); // anlık
		
		LocalDateTime dT = LocalDateTime.parse("2021-10-11T09:47"); // kendı belırttıgımız tarıh ve saatı yazar
		System.out.println(dT);
		
		LocalDate d = LocalDate.parse("2021-10-11"); // kendı belırttıgımız tarıhı yazar
		System.out.println(d);
		
		LocalDate d1 = LocalDate.of(2021, 10, 11); // arguman seklınde bılgı gırerek tarıh yazabılırız.
		
		System.out.println(d1);
		
		LocalDate d2 = LocalDate.of(2021, 10, 11);
		System.out.println(d2);
		
	}
	
}
