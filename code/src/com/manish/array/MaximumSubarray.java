package com.manish.array;

public class MaximumSubarray {

	public static void main(String[] args) {

		int testCase1[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int testCase2[] = { 1 };
		int testCase3[] = { 5, 4, -1, 7, 8 };
		
		System.out.println(maxSubArray(testCase1));
		System.out.println(maxSubArray(testCase2));
		System.out.println(maxSubArray(testCase3));

	}

	public static int maxSubArray(int[] nums) {

		int answer = Integer.MIN_VALUE, sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (sum > answer) {
				answer = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		} // end of loop
		return answer;
	}
}
