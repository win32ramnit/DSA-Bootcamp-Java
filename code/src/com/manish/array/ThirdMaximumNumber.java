package com.manish.array;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		int testCase1[] = { 3, 2, 1 };
		System.out.println(thirdMaxApproach2(testCase1));

		int testCase2[] = { 1, 2 };
		System.out.println(thirdMaxApproach2(testCase2));

		int testCase3[] = { 2, 2, 3, 1 };
		System.out.println(thirdMaxApproach2(testCase3));

		int testCase4[] = { 1, 2, -2147483648 };
		System.out.println(thirdMaxApproach2(testCase4));

	}

	public static int thirdMax(int[] nums) {

		long firsMax = Long.MIN_VALUE;
		long secondMax = Long.MIN_VALUE;
		long thirdMax = Long.MIN_VALUE;
		int len = nums.length;

		if (len == 1) {
			return nums[0];
		}

		for (int i = 0; i < len; i++) {
			if (Long.valueOf(nums[i]) > firsMax) {
				secondMax = firsMax;
				firsMax = nums[i];
			} else if (secondMax < Long.valueOf(nums[i]) && firsMax != Long.valueOf(nums[i])) {
				secondMax = nums[i];
			}
		} // end of for loop

		for (int i = 0; i < len; i++) {
			if (Long.valueOf(nums[i]) > secondMax && Long.valueOf(nums[i]) < firsMax) {
				thirdMax = secondMax;
				secondMax = nums[i];
			} else if (thirdMax < Long.valueOf(nums[i])
					&& (secondMax != (nums[i]) && firsMax != Long.valueOf(nums[i]))) {
				thirdMax = nums[i];
			}

		}

		if (thirdMax == Long.MIN_VALUE) {
			return (int) firsMax;
		}

		return (int) thirdMax;

	}

	public static int thirdMaxApproach2(int[] nums) {
		int firstMax, secondMax, thirdMax, count;
		firstMax = secondMax = thirdMax = Integer.MIN_VALUE;
		count = 0; // how many top elements have been found

		for (int num : nums) {
			if (num == firstMax || num == secondMax) {
				continue;
			}

			if (num > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = num;
				count++;
			} else if (num > secondMax) {
				thirdMax = secondMax;
				secondMax = num;
				count++;
			} else if(num >= thirdMax) {
				thirdMax = num;
				count++;
			}
		} // end of for loop
		if (count >= 3) {
			return thirdMax;
		} else {
			return firstMax;
		}
	}
}
