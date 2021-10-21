package com.baa.boost010.IfElseLoop;
import java.util.Scanner;

public class IfElseLesson {
	
	public class Eg_014_Radar {
		
		// 80<=hiz<=85 hizli gidiyorsunuz lutfen yavaslayiniz cezaniz 200 tl eger erken
		// oderseniz %15 indirim alacaksiniz.
		// 85<hiz<=100 cok hizli gidiyorsunuz lutfen yavaslayiniz cezaniz 300 tl eger
		// erken oderseniz %15 indirim alacaksiniz.
		// 100<hiz cok hizli gidiyorsunuz lutfen yavaslayiniz cezaniz 1000 tl ve
		// ehliyetinize el konacaktir.
		
		public static void main(String[] args) { //// girilen deger karakter ise -lutfen tekrar giriniz nasil cikaririm???
			
			Scanner input = new Scanner(System.in);
			
			// boolean isTrue = true;
			// while (isTrue);
			
			// isTrue ile true arasinda ne fark var ?????
			
			while (true) {
				
				System.out.println("Lutfen hiz giriniz:");
				int speed = input.nextInt();
				Double money = 0.0;
				
				if ((speed < 80) && (speed > 0)) {
					
					System.out.println("Hiziniz normaldir. " + speed + " Guvenli segirler.");
					
				} else if
				
				((speed >= 80) && (speed <= 85)) {
					
					System.out.println("Hizli gidiyorsunuz " + speed + " lutfen yavaslayiniz.");
					money = 200.0;
					Double discount = money - (money * (15.0 / 100.0));
					System.out.println("Cezaniz 200TL. Erken ödeme %15 indiriminden faydalanabilirsiniz, indirimli fiyat "
							+ discount + "TL");
					
				} else if ((85 < speed) && (speed <= 100)) {
					System.out.println("Cok hizli gidiyorsunuz" + speed + " Lutfen yavaslayiniz.");
					money = 300.0;
					Double discount = money - (money * (15.0 / 100.0));
					System.out.println("Cezaniz 300TL. Erken odeme %15 indiriminden faydalanabilirsiniz, indirimli fiyat "
							+ discount + "TL");
					
				} else if (speed > 100) {
					System.out.println("Cok hizli gidiyorsunuz" + speed + " Lutfen yavaslayiniz.");
					money = 1000.0;
					
					System.out.println("Cezaniz " + money + "TL. Ehliyetinize el konacaktir.");
					
				}
			}
		}
	}

}
