package com.baa.boost.Working.ClassTemplate;

public class ClassTemplate {
	// sınıf degıskenlerı
	String str;
	int i;
	double d;
	
	// parametresız constructer
	public ClassTemplate() {
		// TODO Auto-generated constructor stub
	}
	
	// parametrelı constructer
	public ClassTemplate(String str, int i, double d) {
		super();
		this.str = str;
		this.i = i;
		this.d = d;
	}
	
	// to strıng
	@Override
	public String toString() {
		return "ClassTamplate [str=" + str + ", i=" + i + ", d=" + d + "]";
	}
	
	// getter setter
	public String getStr() {
		return str;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public int getI() {
		return i;
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
	public double getD() {
		return d;
	}
	
	public void setD(double d) {
		this.d = d;
	}
	
}
