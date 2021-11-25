package com.baa.boost024.Abstract;

public class PersonName {
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	public PersonName(String firstName, String middleName, String lastName) {
		super(); // hersey object sınıfına extends edılmıs durumda bu otomatık cıkıyor ıstersen
					// sıl arka planda bu hep var.
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	@Override
	public String toString() {
		return "firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName;
	}
	
}
