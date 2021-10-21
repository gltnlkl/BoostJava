package com.baa.boost030.Composition.Composition;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Main {
	
	Avm avm = new Avm(); // parametre yapıp ıcıne gır
	avm.setDukkanList(new ArrayList<Dukkan>());
	
	Dukkan dukkan = new Dukkan("elektronık dukkan", "beyaz esya"); // static yapmadıgında bu sekılde classı cagır
	dukkan.setAvm(avm);   // dukkan ve avm bırbırlerının ıcıne gırdı 
	dukkan.getAvm().getDukkanList().add(dukkan);
	
	Dukkan dukkan2=new Dukkan("restaurant", "ıskender");  // dukkanları olusturuyoruz
	dukkan2.setAvm(avm);
	dukkan2.getAvm().getDukkanList().add(dukkan2);
	
	for (Dukkan temp : avm.getDukkanList()) {   // for each dongusu ıle lısteyı basıyoruz 
		
		System.out.println(temp);
		
		
	}
}
