package com.baa.boost030.Composition.AvmExample;

public class Location {
	
	private String level;
	private Zone zone;
	private int number;
	
	public Location() {
		this.level = "";
		this.zone = null;
		this.number = 0;
	}
	
	public Location(String level, Zone zone, int number) {
		super();
		this.level = level;
		this.zone = zone;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Location [level=" + level + ", zone=" + zone + ", number=" + number + "]";
	}
	
	public String getLevel() {
		return level;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
	
	public Zone getZone() {
		return zone;
	}
	
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
}