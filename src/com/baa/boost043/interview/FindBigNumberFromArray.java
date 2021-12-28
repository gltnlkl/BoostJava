package com.baa.boost043.interview;

public class FindBigNumberFromArray {

	private int findMax(int nums[]) {

		int i, maxNum = nums[0];
		for (i = 1; i < nums.length; i++) {
			if (nums[i] > maxNum) {
				maxNum = nums[i];
			}
		}
		return maxNum;
	}

	public static void main(String[] args) {

		FindBigNumberFromArray main = new FindBigNumberFromArray();

		int[] arr = new int[5];

		arr[0] = 44;
		arr[1] = 11;
		arr[2] = 12;
		arr[3] = 16;
		arr[4] = 98;

		int x = main.findMax(arr);
		System.out.println(x);

	}

}
