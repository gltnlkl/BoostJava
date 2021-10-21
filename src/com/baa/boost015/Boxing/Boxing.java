package com.baa.boost015.Boxing;

public class Boxing {
	

	public static void main(String[] args) {
		
		int xX[] = new int[args.length];
		
		for (int i = 0; i < args.length; i++) {
			xX[i] = Integer.parseInt(args[i]);
		}
		
		main(xX);
	}

	public static void main(int[] args) {
		int numArguments = args.length;
		System.out.println(numArguments);

		int sum = 0;
		int x;
		System.out.println(sum);
		
//		Double d = new Double(5.5);
		Double dd = 5.5;
		System.out.println(dd.intValue());
	}
}
