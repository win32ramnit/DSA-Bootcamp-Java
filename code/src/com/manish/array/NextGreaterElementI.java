package com.manish.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {

	public static void main(String[] args) {
		int nums1[] = { 4, 1, 2 }, nums2[] = { 1, 3, 4, 2 };
		System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));

	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Stack<Integer> stack = new Stack<Integer>();

		for (int num : nums2) {
			while (!stack.isEmpty() && stack.peek() < num)
				map.put(stack.pop(), num);
			stack.push(num);
		}

		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = map.getOrDefault(nums1[i], -1);
		}

		return nums1;
	}
}
