package com.manish.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {

		// test case 1
		int numRows = 5;
		System.out.println((generate(numRows)));

		// test case 2
		numRows = 1;

	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> pascalTriangle = new ArrayList<List<Integer>>();
		List<Integer> row = new ArrayList<Integer>();

		if (numRows == 0) {
			return pascalTriangle;
		}
		row.add(1);
		pascalTriangle.add(row);
		
		for (int i = 1; i < numRows; i++) {
			List<Integer> prevRow = pascalTriangle.get(i-1);
			List<Integer> currRow = new ArrayList<Integer>();
			currRow.add(1);
			for (int j = 1; j < i; j++) {
				currRow.add(prevRow.get(j-1) + prevRow.get(j));
			}
			currRow.add(1);
			pascalTriangle.add(currRow);
		}

		return pascalTriangle;
	}

}
