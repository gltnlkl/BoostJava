package com.baa.boost006.String;

import java.util.Scanner;

public class PasswordStringMain {
	
	// klavyeden giris yapilan sifre ve e mail i kontrol edecek
	// sifre ve mail dogru ise admin sayfasina yonlendirecek
	// sifre ve mail yanlis ise 5 defa deneme hakki taniyip hepsinde yanlis ise
	// musteri hizmetlerini arayiniz cikacak
	
	// equels equalsIgnoreCase trim()
	// kullanicin sifresini yildiz olarak ekle ( replace )
	
	// dongu kullanilacak
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String dbEmail = FinalPasswordString.MAIL; // static veri cagirdik
		String dbpassword = FinalPasswordString.PASSWORD; // static veri cagirdik
		
		String password = ""; // null yememek icin tanimla ""
		String mail = ""; // null yememek icin tanimla ""
		
		String maskString = "";
		
		int num1 = 0;
		int num2 = 0;
		String process = "";
		String word = "";
		int idx = 0;
		// String reverse = "";
		
		boolean exitCalc = false;
		
		int attempt = 4;
		
		while (attempt > -1) {
			System.out.println("Lutfen mail adresinizi giriniz:");
			mail = input.nextLine().trim();
			
			System.out.println("Lutfen sifrenizi giriniz:");
			password = input.nextLine().trim();
			
			for (int i = 0; i < password.length(); i++) { // girilen karakter kadar yildiz koyduk
				
				maskString = maskString + "*"; //
			}
			System.out.println(maskString); //
			
			if ((mail.equals(dbEmail)) && (password.equals(dbpassword))) {
				
				System.out.println("Girilen bilgiler dogru, hesap makinasini kullanabilirsiniz.");
				
				do {
					
					System.out.println("Lutfen islem yapmak istediginiz kelimeyi giriniz:");
					word = input.nextLine();
					System.out.println("Lutfen islem yapmak istediginiz 1. sayiyi giriniz:");
					num1 = input.nextInt();
					System.out.println("Lutfen islem yapmak istediginiz 2. sayiyi giriniz:");
					num2 = input.nextInt();
					
					boolean correctInput = false;
					while (!correctInput) {
						
						System.out.println(
								
								"Lutfen yapmak istediginiz islem için giris yapiniz:\n\"1\" Toplama islemi için.\n\"2\" Cikarma islemi.\n\"3\" Carpma islemi için.\n\"4\" Bolme islemi için.\n\"5\" Sayilarin ussunu almak icin.\n\"6\" Girilen kelimenin tersten yazilmasi icin.\n\"7\" Girilen kelimenin icindeki \"A\" harf adedi icin.\n\"8\" Girilen kelimede \"i\" harfini\"i\" harfine donusturmek icin.\n\"0\" Sistemden cikmak icin.");
						process = input.nextLine();
						
						switch (process) {
							
							case "1":
								
								System.out.println("Islem sonucu " + (num1 + num2) + " dir.");
								correctInput = true;
								break;
							
							case "2":
								
								System.out.println("Islem sonucu " + (num1 - num2) + " dir.");
								correctInput = true;
								break;
							
							case "3":
								
								System.out.println("Islem sonucu " + (num1 * num2) + " dir.");
								correctInput = true;
								break;
							
							case "4":
								
								System.out.println("Islem sonucu " + (num1 / num2) + " dir.");
								correctInput = true;
								break;
							case "5":
								
								System.out.println("Islem sonucu " + Math.pow(num1, num2) + " dir.");
								correctInput = true;
								break;
							case "6":
								
								/*
								 * int length = kelime.length();
								 * for (int i = length - 1; i >= 0; i--)
								 * reverse = reverse + kelime.charAt(i);
								 * System.out.println("Stringin tersi: " + reverse);
								 */
								
								StringBuffer a = new StringBuffer(word);
								System.out.println(a.reverse());
								
								correctInput = true;
								break;
							
							case "7": // ??
								idx = word.indexOf("a");
								// char[] chars = kelime.toCharArray();
								System.out.println(idx);
								// for(int i=0;i<=kelime.length();i++)
								// if (i[]==a)
								
								correctInput = true;
								break;
							case "8":
								
								System.out.println(word.replace("i", "i"));
								correctInput = true;
								break;
							
							case "0":
								
								correctInput = true;
								exitCalc = true;
								break;
							
							default:
								
								System.out.println("Lutfen gecerli bir secim yapiniz."); // surekli basa donuyor
						}
					}
				} while (!exitCalc);
			} else {
				System.out.println("Girilen bilgiler dogru degildir.");
				System.out.println("Kalan hakkiniz:" + (attempt - 1));
				//
				if (attempt == 1) {
					System.out.println("4 kere yanlis girdiniz. Hesap bloke olmustur.");
					
					System.exit(0); // break;
				}
				
				attempt--; // sifre yanlis ise her denemede attempt 1 azalacak.
				
			}
			
		}
	}
}
