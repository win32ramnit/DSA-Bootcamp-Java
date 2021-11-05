package com.manish.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {

	public static void main(String[] args) {

		int nums[] = {1,2,3,1}, k = 3;
		System.out.println(containsNearbyDuplicate(nums, k));
		
		int nums2[] = {1,0,1,1}, k2 = 1;
		System.out.println(containsNearbyDuplicate(nums2, k2));
		
		int nums3[] = {1,2,3,1,2,3}, k3 = 2;
		System.out.println(containsNearbyDuplicate(nums3, k3));
		
		

	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {

		int len = nums.length;
		Set<Integer> hashSet = new HashSet<Integer>();
		for (int i = 0; i < len; i++) {
			if (hashSet.contains(nums[i])) {
				return true;
			}
			
			hashSet.add(nums[i]);
			if (i >= k) {
				hashSet.remove(nums[i-k]);
			}
		}
		
		return false;
	}
}
