package com.manish.array;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {

		int nums[] = { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
		
		int nums2[] = { 0 };
		moveZeroes(nums2);

	}

	public static void moveZeroes(int[] nums) {

		int len = nums.length;
		int zeroIndex = 0;
		for (int i = 0; i < len; i++) {
			if (nums[i] == 0) {
				zeroIndex++;
			} else {
				nums[i - zeroIndex] = nums[i];
				if (zeroIndex != 0) {
					nums[i] = 0;
				}

			}

		}

		System.out.println(Arrays.toString(nums));
	}
}
