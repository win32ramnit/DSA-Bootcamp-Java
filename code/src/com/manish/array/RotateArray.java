package com.manish.array;

import java.util.Arrays;

public class RotateArray {
	// Given an array, rotate the array to the right by k steps, where k is
	// non-negative.

	public static void main(String[] args) {
		int nums[] = {1, 2};
		rotate(nums, 0);
		System.out.println(Arrays.toString(nums));
		
		rotate(nums, 1);
		System.out.println(Arrays.toString(nums));
	}

	public static void rotate(int[] nums, int k) {

		int len = nums.length;
		if (len == 1)
			return;
		if (len == 2 && k == 1) {
			int t = nums[0];
			nums[0] = nums[1];
			nums[1] = t;
			return;
		}
		if (len == 2 && k == 0)
			return;

		int lastIndex = len - 1;

		reverse(nums, len - k, lastIndex);
		reverse(nums, 0, len - k - 1);
		reverse(nums, 0, lastIndex);

	}

	public static void reverse(int nums[], int low, int high) {
		for (int i = low, j = high; i < j; i++, j--) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}
	}
	

}
