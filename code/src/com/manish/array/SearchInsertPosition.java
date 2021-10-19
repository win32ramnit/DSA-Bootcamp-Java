package com.manish.array;

public class SearchInsertPosition {
	public static void main(String[] args) {

		int testCase1[] = { 1, 3, 5, 6 }, target1 = 5;
		int testCase2[] = { 1, 3, 5, 6 }, target2 = 2;
		int testCase3[] = { 1, 3, 5, 6 }, target3 = 7;
		int testCase4[] = { 1, 3, 5, 6 }, target4 = 0;
		int testCase5[] = { 1 }, target5 = 0;
		
		int k = searchInsert(testCase1, target1);
		System.out.println(k);
		k = searchInsert(testCase2, target2);
		System.out.println(k);
		k = searchInsert(testCase3, target3);
		System.out.println(k);
		k = searchInsert(testCase4, target4);
		System.out.println(k);
		k = searchInsert(testCase5, target5);
		System.out.println(k);

	}

	public static int searchInsert(int[] nums, int target) {
		
		int arrayLength = nums.length;
		int i;
		for(i = 0; i < arrayLength; i++) {
			if (target <= nums[i]) {
				return i;
			}
		}

		return i;
	}
}
