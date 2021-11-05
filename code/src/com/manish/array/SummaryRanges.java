package com.manish.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 You are given a sorted unique integer array nums.
 
 Return the smallest sorted list of ranges that cover all the 
 numbers in the array exactly. That is, each element of nums 
 is covered by exactly one of the ranges, and there is no 
 integer x such that x is in one of the ranges but not in nums.
 
 Each range [a,b] in the list should be output as:
    "a->b" if a != b
    "a" if a == b

 */

public class SummaryRanges {

	public static void main(String[] args) {
		int nums[] = { 0, 1, 2, 4, 5, 7 };
		System.out.println(summaryRanges(nums));

		int nums2[] = { 0, 2, 3, 4, 6, 8, 9 };
		System.out.println(summaryRanges(nums2));

		int nums3[] = {};
		System.out.println(summaryRanges(nums3));

		int nums4[] = { -1 };
		System.out.println(summaryRanges(nums4));

		int nums5[] = { 0 };
		System.out.println(summaryRanges(nums5));

	}

	public static List<String> summaryRanges(int[] nums) {
		List<String> result = new ArrayList<>();
		int len = nums.length;
		if (len == 0) {
			return result;
		}
		if (len == 1) {
			result.add(nums[0] + "");
			return result;
		}

		int low = 0, high = 0;

		for (int i = 1; i < len; i++) {
			if (nums[i - 1] + 1 == nums[i]) {
				high = i;
			} else {
				if (high > low) {
					result.add(nums[low] + "->" + nums[high]);
					low = i;
					high = i;
				} else {
					result.add(nums[low] + "");
					low = i;
					high = i;
				}
			}
		} // end of loop

		// adding last element
		if (high == len - 1) {
			if (high > low) {
				result.add(nums[low] + "->" + nums[high]);
			} else {
				result.add(nums[high] + "");
			}

		}

		return result;

	}

}
