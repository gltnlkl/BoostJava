package com.baa.boost015.Boxing;

public class BoxingParseInt {
	
	public static void main(String[] args) {
		
		// Integer y = x;
		
		int numArguments = args.length;
		
		System.out.println(numArguments);
		int sum = 0;
		
		int x;
		
		for (int i = 0; i < numArguments; i++)
		
		{
			
			System.out.println(args[i]);
			
			x = Integer.parseInt(args[i]); // parseInt = elemanları ınt e donusturur.
			
			sum += Integer.parseInt(args[i]); // sum += array elemanlarını topladı
			
		}
		System.out.println(sum);
		
		Double dd = null;
		
		System.out.println(dd);
		
		;
		
	}
}