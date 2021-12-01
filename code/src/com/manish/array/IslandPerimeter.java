package com.manish.array;

public class IslandPerimeter {

	public static void main(String[] args) {

		int grid[][] = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		System.out.println(islandPerimeter(grid));

		int grid2[][] = { { 1 } };
		System.out.println(islandPerimeter(grid2));

		int grid3[][] = { { 1, 0 } };
		System.out.println(islandPerimeter(grid3));

	}

	public static int islandPerimeter(int[][] grid) {
		int land = 0, neighbors = 0;
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if (grid[row][col] == 1) {
					land++;
					// count down neighbors of land
					if (row < grid.length - 1 && grid[row + 1][col] == 1) {
						neighbors++;
					}
					// count right neighbors of land
					if (col < grid[row].length - 1 && grid[row][col + 1] == 1) {
						neighbors++;
					}
				}
			} // inner loop
		} // outer loop

		return (land * 4) - (neighbors * 2);
	}

}
