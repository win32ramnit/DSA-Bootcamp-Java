package com.manish.array;

import java.util.Arrays;
import java.util.Iterator;

public class PlusOne {

	public static void main(String[] args) {
		int testCase1[] = { 1, 2, 3 };
		int testCase2[] = { 4, 3, 2, 1 };
		int testCase3[] = { 0 };
		int testCase4[] = { 9 };
		int testCase5[] = { 9, 9 };
		int testCase6[] = { 8, 9, 9 };

		System.out.println(Arrays.toString(plusOne(testCase1)));
		System.out.println(Arrays.toString(plusOne(testCase2)));
		System.out.println(Arrays.toString(plusOne(testCase3)));
		System.out.println(Arrays.toString(plusOne(testCase4)));
		System.out.println(Arrays.toString(plusOne(testCase5)));
		System.out.println(Arrays.toString(plusOne(testCase6)));

	}

	public static int[] plusOne(int[] digits) {
		
		int len = digits.length;
		if (0 == len) {
			return new int[] {1};
		}
		
		for (int i = len - 1; i >= 0; i--) {
			if (digits[i] != 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		
		digits = new int[len+1];
		digits[0] = 1;
		
		return digits;
				

	}
}
