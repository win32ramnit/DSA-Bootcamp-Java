package com.manish.AlgorithmI;

public class SearchInsertPosition {

	public static void main(String[] args) {

		int nums[] = { 1, 3, 5, 6 }, target = 5;
		System.out.println(searchInsert(nums, target));

		int nums2[] = { 1, 3, 5, 6 }, target2 = 2;
		System.out.println(searchInsert(nums2, target2));

		int nums3[] = { 1, 3, 5, 6 }, target3 = 7;
		System.out.println(searchInsert(nums3, target3));

		int nums4[] = { 1, 3, 5, 6 }, target4 = 0;
		System.out.println(searchInsert(nums4, target4));

		int nums5[] = { 1 }, target5 = 0;
		System.out.println(searchInsert(nums5, target5));
		
		int nums6[] = { 1 }, target6 = 1;
		System.out.println(searchInsert(nums6, target6));

	}

	public static int searchInsert(int[] nums, int target) {
		int len = nums.length;

		if (len == 0 || nums[0] >= target) {
			return 0;
		}
		if (target > nums[len - 1]) {
			return len;
		}

		int low = 0;
		int high = len - 1;

		while (low < high) {
			int mid = low + (high - low) / 2;
			if (target == nums[mid]) {
				return mid;
			}
			if (target > nums[mid] && target <= nums[mid+1]) {
				return mid+1;
			}
			if (target < nums[mid]) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}

		return 0;
	}

}
