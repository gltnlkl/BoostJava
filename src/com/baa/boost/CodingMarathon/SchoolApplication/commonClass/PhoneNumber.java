package com.baa.boost.CodingMarathon.SchoolApplication.commonClass;

public class PhoneNumber {
	
	private String pnoneNum1;
	private String pnoneNum2;
	private String pnoneNum3;
	
	public PhoneNumber() {
		// TODO Auto-generated constructor stub
	}
	
	public PhoneNumber(String pnoneNum1, String pnoneNum2, String pnoneNum3) {
		super();
		this.pnoneNum1 = pnoneNum1;
		this.pnoneNum2 = pnoneNum2;
		this.pnoneNum3 = pnoneNum3;
	}
	
	public PhoneNumber(String pnoneNum1, String pnoneNum2) {
		super();
		this.pnoneNum1 = pnoneNum1;
		this.pnoneNum2 = pnoneNum2;
		this.pnoneNum3 = "";
		
	}
	
	@Override
	public String toString() {
		return "PhoneNumber [pnoneNum1=" + pnoneNum1 + ", pnoneNum2=" + pnoneNum2 + ", pnoneNum3=" + pnoneNum3 + "]";
	}
	
	public String getPnoneNum1() {
		return pnoneNum1;
	}
	
	public void setPnoneNum1(String pnoneNum1) {
		this.pnoneNum1 = pnoneNum1;
	}
	
	public String getPnoneNum2() {
		return pnoneNum2;
	}
	
	public void setPnoneNum2(String pnoneNum2) {
		this.pnoneNum2 = pnoneNum2;
	}
	
	public String getPnoneNum3() {
		return pnoneNum3;
	}
	
	public void setPnoneNum3(String pnoneNum3) {
		this.pnoneNum3 = pnoneNum3;
	}
	
}
