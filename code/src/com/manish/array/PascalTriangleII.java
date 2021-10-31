package com.manish.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {

	public static void main(String[] args) {

		// test case 1
		int rowIndex  = 3;
		System.out.println((getRow(rowIndex)));

		// test case 2
		rowIndex  = 0;
		System.out.println((getRow(rowIndex)));
		
		// test case 3
		rowIndex = 1;
		System.out.println((getRow(rowIndex)));

	}

	public static List<Integer> getRow(int rowIndex) {
		List<List<Integer>> pascalTriangle = new ArrayList<List<Integer>>();
		List<Integer> row = new ArrayList<Integer>();
		List<Integer> prevRow, currRow = null;

		if (rowIndex == 0) {
			row.add(1);
			pascalTriangle.add(row);
			return pascalTriangle.get(0);
		}
		row.add(1);
		pascalTriangle.add(row);
		
		for (int i = 1; i <= rowIndex; i++) {
			prevRow = pascalTriangle.get(i-1);
			currRow = new ArrayList<Integer>();
			currRow.add(1);
			for (int j = 1; j < i; j++) {
				currRow.add(prevRow.get(j-1) + prevRow.get(j));
			}
			currRow.add(1);
			pascalTriangle.add(currRow);
		}

		return pascalTriangle.get(rowIndex);
	}

}
