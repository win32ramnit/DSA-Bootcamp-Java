package com.manish.AlgorithmI;

public class BinarySearch {

	public static void main(String[] args) {

		int nums[] = { -1, 0, 3, 5, 9, 12 }, target = 9;
		System.out.println(search(nums, target));

		int nums2[] = { -1, 0, 3, 5, 9, 12 }, target2 = 2;
		System.out.println(search(nums2, target2));

	}

	public static int search(int[] nums, int target) {

		int len = nums.length;
		int low = 0, high = len - 1;
		while (low <= high) {
			int mid = low + (high-low)/2;
			if (nums[mid] == target) {
				return mid;
			} else if(nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		return -1;
	}

}
