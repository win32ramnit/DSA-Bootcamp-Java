package com.manish.array;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

	public static void main(String[] args) {

		// TestCase 1
		int candyType[] = { 1, 1, 2, 2, 3, 3 };
		System.out.println(distributeCandies(candyType));
		
		// TestCase 2
		int[] candyType2 = { 1, 1, 2, 3 };
		System.out.println(distributeCandies(candyType2));

		// TestCase 3
		int[] candyType3 = { 6, 6, 6, 6 };
		System.out.println(distributeCandies(candyType3));

	}

	public static int distributeCandies(int[] candyType) {

		int len = candyType.length;
		Set<Integer> diffTypeOfCandy = new HashSet<Integer>();
		for (int candy : candyType) {
			diffTypeOfCandy.add(candy);
		}
		
		if (diffTypeOfCandy.size() >= len/2) {
			return len/2;
		} else {
			return diffTypeOfCandy.size();
		}	
	}

}
