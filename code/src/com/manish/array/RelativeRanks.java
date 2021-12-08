package com.manish.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {

	public static void main(String[] args) {

		int score[] = { 5, 4, 3, 2, 1 };
		String result[] = findRelativeRanks(score);
		System.out.println(Arrays.toString(result));
		int[] score2 = {10,3,8,9,4};
		result = findRelativeRanks(score2);
		System.out.println(Arrays.toString(result));

	}

	public static String[] findRelativeRanks(int[] score) {

		int len = score.length;
		String[] result = new String[len];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int[] ranks = score.clone();
		Arrays.sort(ranks);
		//System.out.println(Arrays.toString(rank));
		
		for (int i = 0; i < len; i++) {
			map.put(ranks[i], len-i);		
		}
		//System.out.println(Arrays.asList(map));
		
		for (int i = 0; i < len; i++) {
			int rank = map.get(score[i]);
			if (rank == 1) {
				result[i] = "Gold Medal";
			} else if(rank == 2) {
				result[i] = "Silver Medal";
			} else if(rank == 3){
				result[i] = "Bronze Medal";
			} else {
				result[i] = rank+"";
			}
		}
		return result;

	}

}
