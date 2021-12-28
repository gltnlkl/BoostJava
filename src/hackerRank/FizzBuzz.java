package hackerRank;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		int n = 15; // give any number to test code
		
		for (int i = 1; i <= n; i++) {
			
			if (i >= 3 & i % 3 == 0 & (i % 5 != 0)) {
				
				System.out.println("Fizz");
				
			} else if (i >= 5 & i % 5 == 0) {
				
				System.out.println("Buzz");
				
			} else if (i >= 15 & i % 15 == 0) {
				
				System.out.println("FizzBuzz");
				
			} else {
				
				System.out.println(i);
				
			}
		}
		
	}
	
}
