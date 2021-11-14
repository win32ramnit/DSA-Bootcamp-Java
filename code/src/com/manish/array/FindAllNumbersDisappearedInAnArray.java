package com.manish.array;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

	public static void main(String[] args) {

		int testCase1[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDisappearedNumbers(testCase1).toString());

		int testCase2[] = { 1, 1 };
		System.out.println(findDisappearedNumbers(testCase2).toString());
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] > 0) {
				nums[index] *= -1;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				result.add(i + 1);
			}
		}

		return result;
	}

}
