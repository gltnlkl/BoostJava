package com.baa.boost001.HelloWorld;

public class BasicCalculater {

	public static void main(String[] args) {
		/*
		 * 2 tane degisken ve
		 * x=6; y=2
		 * toplama=8
		 * carpma=12
		 * cikarma=x-y=4
		 * bolme=3
		 * mod%=0
		 */
		
		
		int x=6;
		int y=2;
		int plus= x+y;
		int minus= x-y;
		int impact= x*y;
		int division= x/y;
		int mod= x%y;
		
		System.out.println("x=6 , y=2 için x+y="+ plus);
		System.out.println("x=6 , y=2 için x-y="+ minus);
		System.out.println("x=6 , y=2 için x*y="+ impact);
		System.out.println("x=6 , y=2 için x/y="+ division);
		System.out.println("x=6 , y=2 için x%y="+ mod);
		
	}

}
