package com.manish.array;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		int nums2[] = {1,1,2,};
		
		int k = removeDuplicates(nums);
		System.out.println(k);

		k = removeDuplicates(nums2);
		System.out.println(k);

	}

	public static int removeDuplicates(int[] nums) {
		
		int arrLength = nums.length;
		if(arrLength == 0)
			return 0;
		int j = 0;
		for(int i = 1; i < arrLength; i++) {
			if(nums[j] != nums[i]) {
				nums[++j] = nums[i];
			}
		}
		
		return j+1;
	}
}
