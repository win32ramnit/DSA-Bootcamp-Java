package com.manish.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 1 };
		System.out.println(containsDuplicate(nums));
		
		int nums2[] = { 1,2,3,4 };
		System.out.println(containsDuplicate(nums2));
		
		int nums3[] = { 1,1,1,3,3,4,3,2,4,2 };
		System.out.println(containsDuplicate(nums3));
	}

	public static boolean containsDuplicate(int[] nums) {

		int result = 0;
		Set<Integer> hashSet = new HashSet<Integer>();
		for (int num : nums) {
			if (hashSet.contains(num)) {
				return true;
			} else {
				hashSet.add(num);
			}
		}

		return false;
	}
}
