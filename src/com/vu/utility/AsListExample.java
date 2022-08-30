package com.vu.utility;

import java.util.Arrays;
import java.util.List;

public class AsListExample {

	public static void main(String[] args) {
		Integer arr[] = {3, 5, 7, 9};
		
		List<Integer> aList = Arrays.asList(arr);
		for (Integer item : aList) {
			System.out.println(item);
		}
	}
}
