package com.manish.array;

import java.util.Arrays;

public class TwoSum2ndInputArrayIsSorted {

	public static void main(String[] args) {
		int numbers[] = {2,7,11,15}, target = 9;
		System.out.println(Arrays.toString(twoSum(numbers, target)));
		
		int numbers2[] = {2,3,4}, target2 = 6;
		System.out.println(Arrays.toString(twoSum(numbers2, target2)));
		
		int numbers3[] = {-1,0}, target3 = -1;
		System.out.println(Arrays.toString(twoSum(numbers3, target3)));
	}

	public static int[] twoSum(int[] numbers, int target) {
		int result[] = new int[2];
		
		int index1 = 0, index2 = numbers.length-1;
		while (index1 < index2) {
			int sum = numbers[index1] + numbers[index2];
			if (sum == target) {
				result[0] = index1+1;
				result[1] = index2+1;
				
				return result;
			} else if (sum > target) {
				index2--;
			} else {
				index1++;
			}
		}
		
		return result;
	}

}
