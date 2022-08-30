package com.vu.utility;

import java.util.Arrays;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {
		Integer arr[] = {5, 3, 9, 7};
		
		Arrays.sort(arr);
		for (Integer item : arr) {
			System.out.println(item);
		}
		
		System.out.println();
		
		Collections.reverse(Arrays.asList(arr));
		for (Integer item : arr) {
			System.out.println(item);
		}
	}
}
