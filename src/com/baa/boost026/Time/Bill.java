package com.baa.boost026.Time;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Bill {
	
	public static void main(String[] args) {
		
		// LocalDate today = LocalDate.now(); // su an tarihi ?
		
		LocalDate shopDay = LocalDate.of(2021, Month.DECEMBER, 17); // alisveris tarihi ( tarihi bu imis gibi
																	// davraniyor)
		
		LocalDate invDate = LocalDate.of(shopDay.getYear(), shopDay.getMonth(), 15); // yil ve ay sabit kalsin
		
		if (shopDay.getDayOfMonth() > 15) { // verilen tarihin ayi alindi ve 15 ile karsilastirildi
			invDate = invDate.plusMonths(1); // ve ayin ustune 1 ay eklendi (islem yapildi)
			
		}
		
		System.out.println("Fatura tarihi: " + invDate);
		
		long daysToInvoice = shopDay.until(invDate, ChronoUnit.DAYS); // kalan gun sayisini cikardik
		System.out.println("Faturalamaya" + daysToInvoice + "gun kaldi");
		
	}
	
}