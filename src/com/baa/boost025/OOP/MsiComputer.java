package com.baa.boost025.OOP;

// kalıtım
// cok defa class yazmayı onler
public class MsiComputer extends Computer {
	
	private String msiSensor;
	
	// ozellıkler genel class seması
	// parametresız constructer
	// parametrelı constructer
	// toString
	// method
	// getter and setter
	
	// --> paramteresız constructer
	public MsiComputer() {
		super();
		
	}
	
	// --> parametreli constructer ---local degıskenı ve ust sınıf degıskenlerını
	// bırlestırdım
	public MsiComputer(String computerName, String serialNumber, String computerMainCard, String msiSensor) {
		super(computerName, serialNumber, computerMainCard);
		this.msiSensor = msiSensor;
	}
	
	// ---> toString
	@Override
	public String toString() {
		return "MsiComputer [msiSensor=" + msiSensor + ", getMsiSensor()=" + getMsiSensor() + ", toString()="
				+ super.toString() + ", getComputerName()=" + getComputerName() + ", getSerialNumber()="
				+ getSerialNumber() + ", getComputerMainCard()=" + getComputerMainCard() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	// ---> getter ve setter
	public String getMsiSensor() {
		return msiSensor;
	}
	
	public void setMsiSensor(String msiSensor) {
		this.msiSensor = msiSensor;
	}
	
	@Override
	public void deneme() {
		
		super.deneme();
		System.out.println("Msi Computer");
		
	}
	
}
