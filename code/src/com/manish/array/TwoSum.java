package com.manish.array;

import java.util.Arrays;

public class TwoSum {
	/*
	 * Given an array of integers nums and integer target, return indices of the two
	 * numbers such that they add up to target
	 */

	public static void main(String[] args) {

		int nums[] = { 3, 2, 3 };
		int res[] = twoSum(nums, 6);
		System.out.println(Arrays.toString(res));
	}

	public static int[] twoSum(int[] nums, int target) {
		int len = nums.length;
		int result[] = new int[2];
		for (int i = 0; i < len; i++) {
			int secondNum = target - nums[i];
			for (int j = i + 1; j < len; j++) {
				if (secondNum == nums[j]) {
					result[0] = i;
					result[1] = j;
					break;
				}
			}
		}
		return result;
	}
}
