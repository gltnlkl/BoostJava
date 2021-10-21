package com.baa.boost.ExampleH.LambdaExperision;

// Lombok

// Lambda Experision
// Lambda kodlar yazarken hızlı kod yazmak ıcın kullanılır.
// lambda tek basına bırsey ıfade etmez
// lambda interface
// ()->{System.out.println("Deneme");}
// list,dizilerde

public class LambdaExperision {
	
	// ne zaman bize lambda lazım olur o zaman kendı lambdamızı yazıyoruz.
	@FunctionalInterface // bunu yazınca sadece 1 tane gövdesiz method a izin verir baska eklenemez
	interface IZorunlu44 {
		// sadece 1 tane govdesız metod yazdık
		public void deneme1();
	}
	
	public static void deneme() {
		// anonymous method
		// ınterfacı bu sekılde cagırdık
		IZorunlu44 zorunlu44 = new IZorunlu44() {
			
			@Override
			public void deneme1() {
				// TODO Auto-generated method stub
				
			}
		};
		
		// lambda ile gösterimi
		
		IZorunlu44 zorunlu55 = () -> {
			System.out.println("Merhabalar ben lambdayım");
		};
		
	}
	
	public static void main(String[] args) {
		deneme();
	}
}
