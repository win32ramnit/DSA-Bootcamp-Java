package com.manish.array;

public class RemoveElement {
	public static void main(String[] args) {

		int testCase1[] = { 3, 2, 2, 3 };
		int testCase2[] = { 0, 1, 2, 2, 3, 0, 4, 2 };

		int k = removeElement(testCase1, 3);
		System.out.println(k);
		k = removeElement(testCase2, 2);
		System.out.println(k);
	}

	public static int removeElement(int[] nums, int val) {
		int arrayLength = nums.length;
		if (arrayLength == 0 || (arrayLength == 1 && nums[0] == val)) {
			return 0;
		} else if (arrayLength == 1 && nums[0] != val) {
			return 1;
		}
		
		int j = 0;
		for (int i = 0; i < arrayLength; i++) {
			if (val != nums[i]) {
				nums[j++] = nums[i];
			}
		}

		return j;
	}
}
