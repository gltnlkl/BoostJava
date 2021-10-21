package com.baa.boost028.Serializable.Example;

public enum Gender {
	
	KADIN(1, "KADIN"), ERKEK(2, "ERKEK");
	
	private final int id;
	private final String gender;
	
	private Gender(int id, String gender) {
		this.id = id;
		this.gender = gender;
	}
	
}
