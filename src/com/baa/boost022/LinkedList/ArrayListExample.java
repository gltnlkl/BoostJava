package com.baa.boost022.LinkedList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add(1.4);
		arrayList.add("Bilge");
		arrayList.add(true);
		
		MyObject myObject = new MyObject(); // MY OBJECT DEN GELEN BILGILER
		myObject.name = "Gülten";
		myObject.type = "İnsan";
		myObject.power = 34;
		arrayList.add(myObject);
		
		MyObject myObject2 = new MyObject();
		myObject2.name = "Güneş";
		myObject2.type = "Köpek";
		myObject2.power = 32;
		arrayList.add(myObject2);
		
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
			
			// MyObject obj = (MyObject) object;
			// System.out.println(obj.name);
		}
	}
}
