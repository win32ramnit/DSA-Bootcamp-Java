package com.manish.array;

public class MissingNumber {

	public static void main(String[] args) {

		int nums[] = { 3, 0, 1 };
		System.out.println(missingNumber(nums));

		int nums2[] = { 0, 1 };
		System.out.println(missingNumber(nums2));

		int nums3[] = { 9,6,4,2,3,5,7,0,1 };
		System.out.println(missingNumber(nums3));

		int nums4[] = { 0 };
		System.out.println(missingNumber(nums4));

	}

	public static int missingNumber(int[] nums) {
		int len = nums.length;
		int sum = 0;
		int arraySum = 0;
		if (len % 2 == 0) {
			sum = (len / 2) * len + 1;
		} else {
			sum = len * (len + 1) / 2;
		}

		for (int i = 0; i < len; i++) {
			arraySum += nums[i];

		}

		int missingNum = sum - arraySum;

		return missingNum;

	}
}
