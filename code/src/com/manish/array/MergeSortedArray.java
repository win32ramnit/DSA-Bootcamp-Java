package com.manish.array;

import java.util.Arrays;
import java.util.Iterator;

public class MergeSortedArray {

	public static void main(String[] args) {

		// Test case 1
		int nums11[] = { 1, 2, 3, 0, 0, 0 }, m = 3, nums12[] = { 2, 5, 6 }, n = 3;
		merge2(nums11, m, nums12, n);

		// Test case 2
		int nums21[] = { 1 }, m2 = 1, nums22[] = {}, n2 = 0;
		merge2(nums21, m2, nums22, n2);

		// Test case 3
		int nums31[] = { 0 }, m3 = 0, nums32[] = { 1 }, n3 = 1;
		merge2(nums31, m3, nums32, n3);

		// Test case 4
		int nums41[] = { 4, 5, 6, 0, 0, 0 }, m4 = 3, nums42[] = { 1, 2, 3 }, n4 = 3;
		merge2(nums41, m4, nums42, n4);
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if (nums1[0] <= nums2[0]) {
			for (int i = n - 1, j = m + n - 1; i >= 0; i--, j--) {
				nums1[j] = nums2[i];
			}

		} else if (nums1[0] > nums2[0]) {
			int len = nums2.length - 1;
			for (int j = m + n - 1; len >= 0; j--, len--) {
				nums1[j] = nums2[len];
			}
		}

		for (int i = 0; i < m + n - 1; i++) {
			if (nums1[i] > nums1[i + 1]) {
				int temp = nums1[i];
				nums1[i] = nums1[i + 1];
				nums1[i + 1] = temp;
			}
		}

		System.out.println(Arrays.toString(nums1));
	}

	public static void merge2(int[] nums1, int m, int[] nums2, int n) {
		for (int i = m-- + n-- - 1; i > -1 && n > -1; i--) {
			if (m < 0) {
				nums1[i] = nums2[n--];
			} else if (nums1[m] >= nums2[n]) {
				nums1[i] = nums1[m--];
			} else {
				nums1[i] = nums2[n--];
			}
		}

		System.out.println(Arrays.toString(nums1));
	}
}
