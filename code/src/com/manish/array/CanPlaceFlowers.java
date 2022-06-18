package com.manish.array;

public class CanPlaceFlowers {

	public static void main(String[] args) {

		int flowerbed[] = { 1, 0, 0, 0, 1 }, n = 1;
		System.out.println(canPlaceFlowers(flowerbed, n));
		
		flowerbed = new int[] { 1, 0, 0, 0, 1 };
		n = 2;
		System.out.println(canPlaceFlowers(flowerbed, n));
		
		flowerbed = new int[] { 0 };
		n = 1;
		System.out.println(canPlaceFlowers(flowerbed, n));
	
		flowerbed = new int[] { 1 };
		n = 1;
		System.out.println(canPlaceFlowers(flowerbed, n));
		
		
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0;
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0 && 
				(i == 0 || flowerbed[i - 1] == 0) && 
				(i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
				count++;
				flowerbed[i] = 1;
			}
		}
		return count >= n;
	}
}
