package com.manish.array;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {

	public static void main(String[] args) {
		int nums[] = { 1, 3, 2, 2, 5, 2, 3, 7 };
		System.out.println(findLHS(nums));
	}

	public static int findLHS(int[] nums) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		int result = 0;
		
		for (int key : map.keySet()) {
			if (map.containsKey(key + 1)) {
				result = Math.max(result, map.get(key + 1) + map.get(key));
			}
		}
		
		return result;
	}

}
