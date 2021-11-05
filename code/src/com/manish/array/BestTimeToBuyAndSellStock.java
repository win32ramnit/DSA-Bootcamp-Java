package com.manish.array;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {

		int prices[] = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));
		
		int prices2[] = { 7, 6, 4, 3, 1 };
		System.out.println(maxProfit(prices2));
		
		int prices3[] = { };
		System.out.println(maxProfit(prices3));
		
		int prices4[] = { 6, 7 };
		System.out.println(maxProfit(prices4));

	}

	public static int maxProfit(int[] prices) {
		
		int len = prices.length;
	
		if (len == 1) {
			return 0;
		}
		int minmumPriceOfStock = Integer.MAX_VALUE;
		int maximumProfit = 0;

		for (int i = 0; i < len; i++) {
			if (minmumPriceOfStock > prices[i]) {
				minmumPriceOfStock = prices[i];
			} else {
				maximumProfit = Math.max(maximumProfit, prices[i] - minmumPriceOfStock);
			}
			
		}

		return maximumProfit;
	}

}
