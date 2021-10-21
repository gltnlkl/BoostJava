package com.baa.boost026.Time;

public enum Gender {
	ERKEK("E"), KADIN("K");
	
	String gender;
	
	private Gender(String gender) {
		this.gender = gender;
	}
	
	public static Gender stringToGender(String str) {
		if (str.equalsIgnoreCase("E")) {
			
			return ERKEK;
		}
		
		else
			return KADIN;
		
	}
}
