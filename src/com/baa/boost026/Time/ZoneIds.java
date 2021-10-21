package com.baa.boost026.Time;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class ZoneIds {
	
	public static void main(String[] args) {
		
		for (String zoneId : ZoneId.getAvailableZoneIds()) {
			System.err.println(zoneId);
			
			ZoneId zone = ZoneId.of("Turkey");
			
			LocalDateTime anotherDateTime = LocalDateTime.of(2021, Month.DECEMBER, 19, 6, 45);
			System.out.println(dT.until(anotherDateTime, ChronoUnit.HALF_DAYS));
		}
		
	}
}
