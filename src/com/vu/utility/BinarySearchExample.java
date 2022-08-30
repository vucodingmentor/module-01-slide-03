package com.vu.utility;

import java.util.Arrays;

public class BinarySearchExample {

	public static void main(String[] args) {
		Integer arr[] = {3, 5, 7, 9};
		
		int index = Arrays.binarySearch(arr, 9);
		System.out.println("Index of 9 is: " + index);
	}
}
