package com.baa.boost022.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Intro2Generics {
	
	public static void main(String[] args) {
		
		LinkedList<String> strArray = new LinkedList<String>(); // <> jenerık kısmına gırdıgın tıp dısında tıp gırısı
																// saglayamazsın
		
		strArray.add("Gülten");
		strArray.add("1");
		strArray.add("" + 1); // string e cevırıp eklıyor sadece strıng ekleyebılırım
								// cunku basta oyle tanımladım
		
		for (String string : strArray) {
			System.out.println(string);
		}
		ArrayList<MyObject> arrayList = new ArrayList<MyObject>();
		MyObject obj1 = new MyObject();
		obj1.name = "Fiat";
		obj1.type = "Araba";
		obj1.power = 143;
		arrayList.add(obj1);
		
		// arrayList.add("almaz"); ---> mnObject te tanımlanmamıs verılerı alamaz
		
		MyObject obj2 = new MyObject();
		obj2.name = "Güvercin";
		obj2.type = "Kuş";
		obj2.power = 22;
		
		MyObject obj3 = new MyObject();
		obj3.name = "Vapur";
		obj3.type = "Denız Tasıtı";
		obj3.power = 259;
		
		arrayList.add(obj2);
		arrayList.add(obj3);
		
		for (MyObject myObject : arrayList) {
			
			System.out.println(myObject);
			
			MyObject obj4 = new MyObject();
			obj4.name = "Vapur";
			obj4.type = "Denız Tasıtı";
			obj4.power = 259;
			
			arrayList.add(obj3);
			
			arrayList.add(obj2);
			arrayList.add(obj3);
			
			for (MyObject myObject1 : arrayList) { // burada myObject1 nedır????
				
				System.out.println(myObject1);
				
			}
		}
	}
}
