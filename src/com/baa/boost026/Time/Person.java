package com.baa.boost026.Time;

import java.io.Serializable;
import java.time.LocalDate;

// 2.Örnek
// Genel
// Çalışma Hayatım EDevlet
// Kullanıcıdan Adı soyad doğum tarihi cinsiyet B - E ( Gün/ay/Yıl girsin)
// Bunun içinden yılı alsın
// Erkeklerde 65 yaş
// bayanlarda 60 yaş

// Emekliliğine kalan süresiniz?

// methodları
// Class Emeklilik : ID, Adı Soyadı ,Doğum tarihi
// try catch
// static
// enum B - E
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3739057667323549412L;
	public long personId;
	public String name;
	public String surName;
	public LocalDate dateOfBirth;
	public Gender gender;
	
	// public List<Person> deneme() {
	//
	// Person person = new Person(1, name, surName, dateOfBirth);
	// List<Person> listem = new ArrayList<Person>();
	// listem.add(new Person(1, name, surName, dateOfBirth));
	// return listem;
	// }
	
	// parametresiz konstrukter
	
	public Person() {
		
	}
	
	// parametreli konstrukter
	public Person(long personId, String name, String surName, LocalDate dateOfBirth, Gender gender) {
		super();
		this.personId = personId;
		this.name = name;
		this.surName = surName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}
	
}
