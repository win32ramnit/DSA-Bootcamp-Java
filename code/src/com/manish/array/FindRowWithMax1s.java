package com.manish.array;

public class FindRowWithMax1s {

	public static void main(String[] args) {
		int mat[][] = { { 0, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 0, 0 } };
		System.out.println("Index of row with maximum 1s is " + rowWithMax1s(mat));

		int mat2[][] = { { 0, 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1, 1 }, { 0, 0, 0, 1, 1, 1 }, { 0, 0, 1, 1, 1, 1 } };
		System.out.println("Index of row with maximum 1s is " + rowWithMax1s(mat2));

	}

	private static int rowWithMax1s(int[][] mat) {
		// time complexity is O(m+n)
		int maxRowIndex = 0;
		int row = mat.length;
		int col = mat[0].length;

		for (int i = 0; i < row; i++) {
			for (int j = col - 1; j >= 0 && mat[i][j] == 1; j--) {
				maxRowIndex = i;
			}
		}
		if (maxRowIndex == 0 && mat[0][col - 1] == 0) {
			return -1;
		}
		return maxRowIndex;
	}

}
