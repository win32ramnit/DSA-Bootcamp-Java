package com.manish.array;

public class TeemoAttacking {

	public static void main(String[] args) {
		int timeSeries[] = {1,4}, duration = 2;
		System.out.println(findPoisonedDuration(timeSeries, duration));
		
		int timeSeries2[] = {1,2};
			duration = 2;
		System.out.println(findPoisonedDuration(timeSeries2, duration));

				
	}

	public static int findPoisonedDuration(int[] timeSeries, int duration) {
		
		int len = timeSeries.length;
		int totalAttack = 0, start = timeSeries[0], end = timeSeries[0] + duration;

		for (int i = 1; i < len; i++) {
			if (timeSeries[i] > end) {
				totalAttack += end - start;
				start = timeSeries[i];
			}
			end = timeSeries[i] + duration;
		}
		totalAttack += end - start;
		
		return totalAttack;
	}
}
