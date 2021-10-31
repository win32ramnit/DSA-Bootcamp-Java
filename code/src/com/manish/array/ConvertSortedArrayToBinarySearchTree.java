package com.manish.array;

import java.util.Arrays;

public class ConvertSortedArrayToBinarySearchTree {

	public static void main(String[] args) {

		TreeNode root;
		int nums[] = { -10, -3, 0, 5, 9 };
		root = sortedArrayToBST(nums);

		printPreOrder(root);

		System.out.println("");
		
		int nums2[] = { 0, 1, 2, 3, 4, 5 };

		root = sortedArrayToBST(nums2);
		printPreOrder(root);
		

	}

	public static TreeNode sortedArrayToBST(int[] nums) {

		if (nums.length == 0)
			return null;
		int mid = nums.length / 2;
		TreeNode root = new TreeNode(nums[mid]);
		int[] lf = Arrays.copyOfRange(nums, 0, mid);
		root.left = sortedArrayToBST(lf);
		int[] rgt = Arrays.copyOfRange(nums, mid + 1, nums.length);
		root.right = sortedArrayToBST(rgt);
		return root;
	}


	public static void printPreOrder(TreeNode root) {
		if (root == null) {
			return;
		}

		System.out.print(root.val + " ");
		printPreOrder(root.left);
		printPreOrder(root.right);
	}

	public static void printInOrder(TreeNode root) {
		if (root == null) {
			return;
		}

		printInOrder(root.left);
		System.out.print(root.val + " ");
		printInOrder(root.right);
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
		this.left = this.right = null;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
