package com.baa.boost006.String;

import java.util.Scanner;

public class PasswordStringMain {
	// klavyeden giriş yapılan şifre ve e maıl ı kontrol edecek
	// sıfre ve maıl dogru ıse admın sayfasına yonlendırecek
	// sıfre ve maıl yanlıs ıse 5 defa deneme hakkı tanıyıp hepsınde yanlıs ıse
	// musterı hızmetlerını arayınız cıkacak
	
	// equels equalsIgnoreCase trim()
	// kullanıcın sıfresını yıldız olarak ekle ( replace )
	
	// dongu kullanılacak
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String dbEmail = FinalPasswordString.MAIL; // statıc verı cagırdık
		String dbpassword = FinalPasswordString.PASSWORD; // statıc verı cagırdık
		
		String password = ""; // null yememek ıcın tanımla ""
		String mail = ""; // null yememek ıcın tanımla ""
		
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
			System.out.println("Lütfen mail adresinizi giriniz:");
			mail = input.nextLine().trim();
			
			System.out.println("Lütfen şifrenizi giriniz:");
			password = input.nextLine().trim();
			
			for (int i = 0; i < password.length(); i++) { // gırılen karakter kadar yıldız koyduk
				
				maskString = maskString + "*"; //
			}
			System.out.println(maskString); //
			
			if ((mail.equals(dbEmail)) && (password.equals(dbpassword))) {
				
				System.out.println("Girilen bilgiler dogru, hesap makinasını kullanabilirsiniz.");
				
				do {
					
					System.out.println("Lütfen işlem yapmak istediğiniz kelimeyi giriniz:");
					word = input.nextLine();
					System.out.println("Lütfen işlem yapmak istediğiniz 1. sayiyi giriniz:");
					num1 = input.nextInt();
					System.out.println("Lütfen işlem yapmak istediğiniz 2. sayiyi giriniz:");
					num2 = input.nextInt();
					
					boolean correctInput = false;
					while (!correctInput) {
						
						System.out.println(
								
								"Lütfen yapmak istediğiniz işlem için giriş yapınız:\n\"1\" Toplama islemi için.\n\"2\" Cikarma islemi.\n\"3\" Carpma islemi için.\n\"4\" Bolme islemi için.\n\"5\" Sayıların ussunu almak icin.\n\"6\" Girilen kelimenin tersten yazılması icin.\n\"7\" Girilen kelimenin icindeki \"A\" harf adedi icin.\n\"8\" Girilen kelimede \"ı\" harfini\"i\" harfine donusturmek icin.\n\"0\" Sistemden cikmak icin.");
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
								
								System.out.println(word.replace("ı", "i"));
								correctInput = true;
								break;
							
							case "0":
								
								correctInput = true;
								exitCalc = true;
								break;
							
							default:
								
								System.out.println("Lütfen gecerli bir secim yapiniz."); // sureklı basa donuyor
						}
					}
				} while (!exitCalc);
			} else {
				System.out.println("Girilen bilgiler doğru değildir.");
				System.out.println("Kalan hakkınız:" + (attempt - 1));
				//
				if (attempt == 1) {
					System.out.println("4 kere yanlış girdiniz. Hesap bloke olmuştur.");
					
					System.exit(0); // break;
				}
				
				attempt--; // sıfre yanlıs ıse her denemede attempt 1 azalacak.
				
			}
			
		}
	}
}
