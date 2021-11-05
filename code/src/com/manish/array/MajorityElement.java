package com.manish.array;

public class MajorityElement {

	public static void main(String[] args) {
		int nums[] = { 3, 2, 3 };
		System.out.println(majorityElement(nums));
		
		int nums2[] = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums2));
		
		int nums3[] = { 6,5,5 };
		System.out.println(majorityElement(nums3));

	}

	// Boyer-Moore Majority Voting Algorithm
	public static int majorityElement(int[] nums) {
		int len = nums.length;
		int candidate = 0, count = 0;
		for (int i = 0; i < len; i++) {
			if (count == 0) {
				candidate = nums[i];
			} 
			
			if (candidate == nums[i]) {
				count++;
			} else {
				count--;
			}
			
		}

		return candidate;
	}

}
