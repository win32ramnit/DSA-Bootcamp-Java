package com.manish.array;

public class ReshapeTheMatrix {

	public static void main(String[] args) {

		int mat[][] = { { 1, 2 }, { 3, 4 } }, r = 1, c = 4;
		int res[][] = matrixReshape(mat, r, c);
		
		int mat2[][] = { { 1, 2 }, { 3, 4 } };
		r = 2; 
		c = 4;
		res = matrixReshape(mat2, r, c);
		
		
	}

	public static int[][] matrixReshape(int[][] mat, int r, int c) {

		int row = mat.length, col = mat[0].length;
		if (row * col != r * c) {
			return mat;
		}
		
		int res[][] = new int[r][c];
		for (int i = 0; i < r * c; i++) {
			res[i/c][i%c] = mat[i/col][i%col];
		}
		
		return res;
	}

}
