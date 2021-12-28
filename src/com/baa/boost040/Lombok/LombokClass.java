package com.baa.boost040.Lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// getter setter
// @Data

// Parametresiz constructor
@NoArgsConstructor

// Parametreli constructor
@AllArgsConstructor

// Builder
@Builder

@ToString

public class LombokClass {
	
	private int id;
	@Getter
	@Setter
	private String adi;
	
	private String soyadi;
	private String numarasi;
	private String memleket;
	private String sehir;
	private String tarih;
	private String merhaba;
	
}
