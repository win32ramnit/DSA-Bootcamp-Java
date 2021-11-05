package com.manish.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SingleNumber {

	public static void main(String[] args) {
		int nums[] = { 2, 2, 1 };
		System.out.println(singleNumber2(nums));
		
		int nums2[] = { 4, 1, 2, 1, 2 };
		System.out.println(singleNumber2(nums2));

		int nums3[] = { 1 };
		System.out.println(singleNumber2(nums3));

	}

	// Approach 1 (XOR)
	public static int singleNumber(int[] nums) {
		int result = 0;
		for (int num : nums) {
			result = result ^ num;
		}
		
		return result;
	}
	
	// Approach 2 (HashSet)
	public static int singleNumber2(int[] nums) {
		Set<Integer> singleEmenent = new HashSet<Integer>();
		int result = Integer.MIN_VALUE;
		if (nums.length == 1) {
			return nums[0];
		}
		
		for (int num : nums) {
			if (singleEmenent.contains(num)) {
				singleEmenent.remove(num);
			} else {
				singleEmenent.add(num);
			}
		}
		
		for (int num : singleEmenent) {
			result = num;
		}
		return result;
	}
}
