package com.baa.boost036.TryCatch;

// class representing custom exception
class InvalidAgeException extends Exception {
	
	public InvalidAgeException(String str) {
		
		super(str);
	}
}

public class OwnException {
	
	static void validate(int age) throws InvalidAgeException {
		if (age < 18) {
			
			throw new InvalidAgeException("age is not valid to vote");
		}
	}
	
	// main method
	public static void main(String args[]) {
		try {
			
			validate(13);
		} catch (InvalidAgeException ex) {
			
			System.out.println("Exception occured: " + ex);
		}
		
	}
}
