package com.manish.AlgorithmI;


public class FirstBadVersion {
	static int bad;

	public static int getBad() {
		return bad; 
	}

	public static void main(String[] args) {

		bad = 4;
		System.out.println(firstBadVersion(5));
		
		bad = 1;
		System.out.println(firstBadVersion(1));

	}

	public static int firstBadVersion(int n) {
		if (n <= 0 || !isBadVersion(n)) {
			return -1;
		}

		if (isBadVersion(1)) {
			return 1;
		}

		int low = 1;
		int high = n;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (isBadVersion(mid)) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		
		return low;
	}

	private static boolean isBadVersion(int version) {
		return (version >= getBad());
	}
}
