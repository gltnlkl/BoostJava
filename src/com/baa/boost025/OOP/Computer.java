package com.baa.boost025.OOP;

// tum PC lerın ortak ozellıklerı

public class Computer {
	
	// ozellıkler
	
	private String computerName = "";
	private String serialNumber = "";
	private String computerMainCard = "";
	
	// parametresiz constructor
	
	public Computer() {
		
	}
	// parameterelı constructor // ctrl + shift + s Generate constructor using field
	
	public Computer(String computerName, String serialNumber, String computerMainCard) {
		super();
		this.computerName = computerName;
		this.serialNumber = serialNumber;
		this.computerMainCard = computerMainCard;
	}
	// toString
	
	@Override
	public String toString() {
		return "Computer [computerName=" + computerName + ", serialNumber=" + serialNumber + ", computerMainCard="
				+ computerMainCard + "]";
	}
	
	// method
	public void deneme() {
		System.out.println(this.serialNumber.concat("XLS")); // SERIAL NUMBER IN SONUNA XLS EKLEDIK BU METOD ILE
	}
	// getter and setter
	
	public String getComputerName() {
		return computerName;
	}
	
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getComputerMainCard() {
		return computerMainCard;
	}
	
	public void setComputerMainCard(String computerMainCard) {
		this.computerMainCard = computerMainCard;
	}
	
}
