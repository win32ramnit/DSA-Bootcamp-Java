package com.manish.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IntersectionOfTwoArraysII {

	public static void main(String[] args) {
		int nums11[] = { 1, 2, 2, 1 }, nums12[] = { 2, 2 };
		System.out.println(Arrays.toString(intersect(nums11, nums12)));

		int nums21[] = { 4, 9, 5 }, nums22[] = { 9, 4, 9, 8, 4 };
		System.out.println(Arrays.toString(intersect(nums21, nums22)));

		int nums31[] = { 1, 2 }, nums32[] = { 1, 1 };
		System.out.println(Arrays.toString(intersect(nums31, nums32)));

	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		int len1 = nums1.length;
		int len2 = nums2.length;
		
		if (len1 == 0 || len2 == 0) {
			return new int[0];
		}

		List<Integer> result = new ArrayList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int p = 0, q = 0;
		
		while (true) {
			if (p == len1 || q == len2) {
				break;
			}
			
			if (nums1[p] < nums2[q]) {
				p++;
			} else if(nums1[p] > nums2[q]) {
				q++;
			} else {
				result.add(nums1[p]);
				p++;
				q++;
			}
		}

		int res[] = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			res[i] = result.get(i);
		}
		
		return res;
	}

}
