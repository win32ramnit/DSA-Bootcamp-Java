package com.manish.array;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {

		int nums[] = { 1, 1, 0, 1, 1, 1 };
		System.out.println(findMaxConsecutiveOnes(nums));

		int nums2[] = { 1, 0, 1, 1, 0, 1 };
		System.out.println(findMaxConsecutiveOnes(nums2));
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		
		int len  = nums.length;
		int maxOnes = 0, currentOnes = 0;
		for (int i = 0; i < len; i++) {
			if (nums[i] == 1) {
				currentOnes++;
			} else {
				currentOnes = 0;
			}
			if (maxOnes < currentOnes) {
				maxOnes = currentOnes;
			}
			
		}

		return maxOnes;
	}
}
