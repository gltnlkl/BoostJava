package com.baa.boost025.OOP;

// kalıtım
// cok defa class yazmayı onler
public class InheritenceComputer {
	
	public static void main(String[] args) {
		MsiComputer msiComputer = new MsiComputer();
		msiComputer.setComputerName("Msi");
		msiComputer.setComputerMainCard("Msi main card");
		
		System.out.println(msiComputer);
		System.out.println();
		msiComputer.deneme();
		
		MonsterComputer monsterComputer = new MonsterComputer();
		monsterComputer.setComputerName("Monster");
		monsterComputer.setComputerMainCard("Monster main card");
		
		System.out.println(monsterComputer);
		System.out.println();
		monsterComputer.deneme(); // super yapmadım
		
		AsusComputer asusComputer = new AsusComputer();
		asusComputer.setComputerName("Asus");
		asusComputer.setComputerMainCard("Asus main card");
		
		System.out.println(asusComputer);
		asusComputer.deneme();
	}
	
}
