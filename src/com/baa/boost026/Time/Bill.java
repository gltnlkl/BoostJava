package com.baa.boost026.Time;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Bill {
	
	public static void main(String[] args) {
		
		// LocalDate today = LocalDate.now(); // su an tarıhı ?
		
		LocalDate shopDay = LocalDate.of(2021, Month.DECEMBER, 17); // alışveriş tarıhı ( tarıhı bu ımıs gıbı
																	// davranıyor)
		
		LocalDate invDate = LocalDate.of(shopDay.getYear(), shopDay.getMonth(), 15); // yıl ve ay sabıt kalsın
		
		if (shopDay.getDayOfMonth() > 15) { // verılen tarıhın ayı alındı ve 15 ıle karsılastırıldı
			invDate = invDate.plusMonths(1); // ve ayın ustune 1 ay eklendı (ıslem yapıldı)
			
		}
		
		System.out.println("Fatura tarihi: " + invDate);
		
		long daysToInvoice = shopDay.until(invDate, ChronoUnit.DAYS); // kalan gun sayısını cıkardık
		System.out.println("Faturalamaya" + daysToInvoice + "gün kaldı");
		
	}
	
}