package com.manish.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int nums1[] = { 1, 2, 2, 1 }, nums2[] = { 2, 2 };
		System.out.println(Arrays.toString(intersection(nums1, nums2)));

		int nums3[] = { 4, 9, 5 }, nums4[] = { 9, 4, 9, 8, 4 };
		System.out.println(Arrays.toString(intersection(nums3, nums4)));
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		int len1 = nums1.length;
		int len2 = nums2.length;
		List<Integer> result;
		if (len1 < len2) {
			result = new ArrayList<Integer>(len1);
		} else {
			result = new ArrayList<Integer>(len2);
		}

		Set<Integer> hashSet1 = new HashSet<Integer>();
		Set<Integer> hashSet2 = new HashSet<Integer>();
		for (int num1 : nums1) {
			hashSet1.add(num1);
		}
		for (int num2 : nums2) {
			hashSet2.add(num2);
		}

		if (hashSet1.size() < hashSet2.size()) {
			for (int n1 : hashSet1) {
				if (hashSet2.contains(n1)) {
					result.add(n1);
				}
			}
		} else {
			for (int n2 : hashSet2) {
				if (hashSet1.contains(n2)) {
					result.add(n2);
				}
			}
		}
		int res[] = result.stream().mapToInt(i -> i).toArray();
		return res;
	}

}
