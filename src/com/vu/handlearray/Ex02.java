package com.vu.handlearray;

public class Ex02 {

	public static void main(String[] args) {
		// Sort ascending/descending using algorithm
		int[] a = {2,1,3,5,4,6,7,10,9,8};
		
		System.out.println("Original array is: ");
		for (Integer item : a) {
			System.out.print(item + " ");
		}
		
		//Sort ascending
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = i + 1 ; j < a.length ; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("\n\nAfter sorting ascending, array is: ");
		for (Integer item : a) {
			System.out.print(item + " ");
		}
		
		//Sort descending
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = i + 1 ; j < a.length ; j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("\n\nAfter sorting descending, array is: ");
		for (Integer item : a) {
			System.out.print(item + " ");
		}
	}

}
