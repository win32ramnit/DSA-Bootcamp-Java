package com.manish.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyboardRow {

	public static void main(String[] args) {

		String words[] = { "Hello", "Alaska", "Dad", "Peace" };
		System.out.println(Arrays.toString(findWords(words)));

		String[] words2 = { "omk" };
		System.out.println(Arrays.toString(findWords(words2)));

		String[] words3 = { "adsdf", "sfd" };
		System.out.println(Arrays.toString(findWords(words3)));
	}

	public static String[] findWords(String[] words) {

		Map<Character, Integer> rows = new HashMap<Character, Integer>();

		String temp = "qwertyuiopQWERTYUIOP";
		for (char i : temp.toCharArray())
			rows.put(i, 1);
		temp = "asdfghjklASDFGHJKL";
		for (char i : temp.toCharArray())
			rows.put(i, 2);
		temp = "zxcvbnmZXCVBNM";
		for (char i : temp.toCharArray())
			rows.put(i, 3);

		boolean same_row;

		List<String> result_list = new ArrayList<String>();

		for (String word : words) {
			same_row = true;
			
			for (int i = 1; i < word.length(); i++) {
				if (rows.get(word.charAt(i)) != rows.get(word.charAt(0))) {
					same_row = false;
					break;
				}
			} // end of inner loop

			if (same_row)
				result_list.add(word);
		} // end of outer loop

		String[] result = new String[result_list.size()];

		for (int i = 0; i < result.length; i++)
			result[i] = result_list.get(i);

		return result;

	}

}
