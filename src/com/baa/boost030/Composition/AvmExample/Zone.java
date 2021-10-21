package com.baa.boost030.Composition.AvmExample;

public enum Zone {
	
	ZONE1("1"), ZONE2("2"), ZONE3("3");
	
	String zone;
	
	private Zone(String zone) {
		this.zone = zone;
	}
	
	public static Zone stringToZone(String str) {
		if (str.equalsIgnoreCase("1")) {
			return ZONE1;
		}
		if (str.equalsIgnoreCase("2")) {
			return ZONE2;
		} else {
			return ZONE3;
		}
		
	}
	
}
