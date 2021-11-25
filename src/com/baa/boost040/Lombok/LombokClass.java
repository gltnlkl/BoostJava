package com.baa.boost040.Lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// getter setter
@Data

// Parametresiz constructor
@NoArgsConstructor

// Parametreli constructor
@AllArgsConstructor

// Builder
@Builder

public class LombokClass {
	
	private int id;
	private String adi;
	private String soyadi;
	private String numarasi;
	private String memleket;
	private String sehir;
	private String tarih;
	private String merhaba;
	
}
