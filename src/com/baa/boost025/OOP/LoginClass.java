package com.baa.boost025.OOP;

import java.util.Scanner;

// login sayfası olsun.
// kullanıcıdan alığımız bilgiler ışığında yapalım.
// adi
// soyadi
// email
// telefon numarasını 2 şekilde yapalım.,
// method ile yapalım ==> loginMethod
// class ile yapalım ==> loginClass

public class LoginClass {
	
	// parametresız constructer --- class ın methodu oldu ctrl space
	// constructerlar publıc olup class ıle aynı ısımde olmalıdır.
	
	public LoginClass() { // <----- sınıf constracter ı
		// kullancıı gırıs yapmadıgında bu donusler olacak.
		this.name = "Lütfen adınızı gırınız .";
		this.surName = "Lütfen soyadınızı gırınız .";
		this.mail = "Lütfen maıl gırınız .";
		this.phoneNumber = 34534756;
		
	}
	
	// parametrelı constructer;
	
	public LoginClass(String name, String surname, String mail, int phonenumber) {
		
		this.name = name;
		this.surName = surname;
		this.mail = mail;
		this.phoneNumber = phonenumber;
		
	}
	
	public LoginClass(String name, String surname) {
		
		this.name = name;
		this.surName = surname;
		
	}
	
	public LoginClass(String name, int phoneNumber) {
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		
	}
	
	private String name;
	private String surName;
	private String mail;
	private int phoneNumber;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurName() {
		return surName;
	}
	
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void classMethod() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("İsim giriniz.");
		String nameInput = input.next();
		
		System.out.println("Soy Isim giriniz.");
		String surNameInput = input.next();
		
		System.out.println("Mail giriniz.");
		String mailInput = input.next();
		
		System.out.println("Mail giriniz.");
		int phoneInput = input.nextInt();
		
		LoginClass loginPage = new LoginClass();
		
		loginPage.setName(nameInput);
		
		System.out.println("Isim : " + loginPage.getName());
		
		loginPage.setSurName(surNameInput);
		
		System.out.println("Soy Isim : " + loginPage.getSurName());
		
		loginPage.setMail(mailInput);
		
		System.out.println("Mail adresi : " + loginPage.getMail());
		
		loginPage.setPhoneNumber(phoneInput);
		
		System.out.println("Telefon Numarası : " + loginPage.getPhoneNumber());
		
		input.close();
	}
	
	// to string yapısı ıstedıgım gıbı kolayca class2 yazarak basabılıyoruz.
	
	@Override
	public String toString() {
		return "name=" + name + ", surName=" + surName + ", mail=" + mail + ", phoneNumber=" + phoneNumber;
	}
	
	// to String
	
}
