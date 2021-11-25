package com.baa.boost028.Serializable;

import java.io.Serializable;
import java.util.HashMap;

public class RealEstateAgency implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Address adress;
	private HashMap<String, Realty> realties;
	
	public RealEstateAgency(String name, Address agencyAddr) {
		super();
		this.name = name;
		this.realties = new HashMap<>(); // --- burada map ı yarattık
	}
	
	public void addRealty(Realty realty) {
		this.realties.put(realty.getName(), realty);
		
	}
	
	public Realty getRealty(String name) {
		return this.realties.get(name);
		
	}
	
}
