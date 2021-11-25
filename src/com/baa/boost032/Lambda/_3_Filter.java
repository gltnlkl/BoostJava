package com.baa.boost032.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// java 10 da gelen var degıskenı nedır arastır:

// Stream() akısın basladıgı yer
// Sorted() sıralama yapıyor
// Collect() muhurluyor
// for each() ekrana lıstelerı gostermek
// filter() verilerden istediklerimizi almak ıcın kullanırız
// .filter( ()->{})
// () parametre
// -> tasıma ıslemı
// {} method blogu
// filter da lambda expressıon yapısı kullanılıyor
public class _3_Filter {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("malatya");
		list.add("istanbul");
		list.add("ankara");
		list.add("elaz��");
		
		// filter Lambda kullanmak
		// listede malatya olanlar� g�ster
		List<String> list2 = list.stream().filter((temp) -> "malatya".equals(temp)).collect(Collectors.toList());
		list2.forEach(System.out::println);
		
		// listede malatya olmayanlar� g�ster
		List<String> nonMalatya = list.stream().filter(temp -> !"malatya".equals(temp)).collect(Collectors.toList());
		System.out.println(nonMalatya);
		list.forEach(System.out::println);
		
		// Classta Ahmet ile ba�layan ilk 3 kayd� getirelim
		List<FilterStudent> filterMap = new ArrayList<FilterStudent>();
		filterMap.add(new FilterStudent("Ahmet", "mavi"));
		filterMap.add(new FilterStudent("Ahmet", "sari"));
		filterMap.add(new FilterStudent("Ahmet", "truncu"));
		filterMap.add(new FilterStudent("Ahmet", "eflatun"));
		filterMap.add(new FilterStudent("Ahmet5", "sari"));
		filterMap.add(new FilterStudent("Mehmet", "yesil"));
		filterMap.add(new FilterStudent("Mustafa", "turuncu"));
		
		List<String> mapList = filterMap.stream().map(FilterStudent::getAdi).filter(adi -> adi.startsWith("Ahmet"))
				.limit(3).collect(Collectors.toList());
		mapList.forEach(System.out::println);
		
	}
}
