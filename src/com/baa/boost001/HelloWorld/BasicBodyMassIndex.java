package com.baa.boost001.HelloWorld;

public class BasicBodyMassIndex {

	public static void main(String[] args) {
		/*
		 * int VKE , kilo , boy ;
		 * kilo=58;
		 * boy=174;
		 * VKE=kilo/boy^2;
		 * System.out.println(boy);
		 * System.out.println("Kilo:"+kilo);
		 * System.out.println("Boy:"+boy);
		 * System.out.println("Vücut-Kitle Endeksi:"+VKE);
		 */
	
		double bbmi=0.0d;
		double weight=58.0d;
		double height=1.74d;
	
		bbmi= weight/Math.pow(height, 2);
		
		System.out.println("Boyunuz: "+ height);
		System.out.println("Kilonuz: "+ weight);
		System.out.println("Vücut kütle endeksiniz: "+ bbmi);
	
	}

}
