package com.manish.array;

import java.util.Arrays;

public class ArrayPartitionI {

	public static void main(String[] args) {
		int[] nums = { 1, 4, 3, 2 };
		System.out.println(arrayPairSum(nums));
		
		int[] nums2 = { 6,2,6,5,1,2 };
		System.out.println(arrayPairSum(nums2));

	}

	public static int arrayPairSum(int[] nums) {

		int len = nums.length;
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < len; i += 2) {
			sum += nums[i];
		}

		return sum;
	}

}
