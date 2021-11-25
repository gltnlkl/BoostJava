package com.baa.boost.ExampleB.b101321RealEstate;

import java.io.Serializable;
import java.util.HashMap;

public class RealEstateAgency implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private Address adress;
	private HashMap<String, Realty> realties; // key=name -- value=Realty
	// �al��anlar
	
	public RealEstateAgency(String name, Address adress) { // emlak dan��manl��� �irketi
		this.name = name;
		this.adress = adress;
		this.realties = new HashMap<>();
	}
	
	public void addRealty(Realty realty) {
		this.realties.put(realty.getName(), realty);
	}
	
	public Realty getRealty(String name) {
		return this.realties.get(name);
	}
	
	@Override
	public String toString() {
		return "RealEstateAgency [name=" + this.name + ", adress=" + this.adress + ", realties=" + this.realties + "]";
	}
	
}
