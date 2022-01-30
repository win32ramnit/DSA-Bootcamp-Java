package com.manish.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumOfTwoLists {

	public static void main(String[] args) {

		String[] list1 = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		String[] list2 = { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" };
		System.out.println(Arrays.toString(findRestaurant(list1, list2)));

		list1 = new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		list2 = new String[] { "KFC", "Shogun", "Burger King" };
		System.out.println(Arrays.toString(findRestaurant(list1, list2)));

		list1 = new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		list2 = new String[] { "KFC", "Burger King", "Tapioca Express", "Shogun" };
		System.out.println(Arrays.toString(findRestaurant(list1, list2)));
	}

	public static String[] findRestaurant(String[] list1, String[] list2) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		int minSum = Integer.MAX_VALUE;
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < list1.length; i++) {
			map.put(list1[i], i);
		}
		for (int i = 0; i < list2.length; i++) {
			if (map.containsKey(list2[i])) {
				int min = map.get(list2[i]) + i;
				if (min < minSum) {
					result = new ArrayList<String>();
					result.add(list2[i]);
					minSum = min;
				} else if (min == minSum)
					result.add(list2[i]);
			}
		}

		return result.toArray(new String[result.size()]);
	}
}
