package hackerRank;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PointsAndLines {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		Set<Integer> setX = new HashSet<Integer>();
		Set<Integer> setY = new HashSet<Integer>();
		
		for (int i = 0; i < n; i++) {
			setX.add(in.nextInt());
			setY.add(in.nextInt());
		}
		if (setX.size() == 1) {
			System.out.println("YES");
		} else if (setY.size() == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		in.close();
		
		for (Map.Entry<keyType, valType> entry : map.entrySet()) {
			keyType key = entry.getKey();
			valType val = entry.getValue();
			
		}
		
		Collections.sort(null);
	}
	
}
