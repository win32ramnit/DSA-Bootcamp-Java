package com.manish.array;


public class RangeAdditionII {

	public static void main(String[] args) {
		int m = 3, n = 3, ops[][] = { { 2, 2 }, { 3, 3 } };
		System.out.println(maxCount(m, n, ops));

		m = 3;
		n = 3;
		int ops2[][] = { { 2, 2 }, { 3, 3 }, { 3, 3 }, { 3, 3 }, { 2, 2 }, { 3, 3 }, { 3, 3 }, { 3, 3 }, { 2, 2 },
				{ 3, 3 }, { 3, 3 }, { 3, 3 } };
		System.out.println(maxCount(m, n, ops2));

		m = 3;
		n = 3;
		int ops3[][] = {};
		System.out.println(maxCount(m, n, ops3));
	}

	public static int maxCount(int m, int n, int[][] ops) {
		if (ops == null || ops.length == 0) {
			return m * n;
		}
		
		int row = Integer.MAX_VALUE, col = Integer.MAX_VALUE;
		for (int[] op : ops) {
			row = Math.min(row, op[0]);
			col = Math.min(col, op[1]);
		}
		
		return row * col;
	}

}
