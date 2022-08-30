package com.vu.declarearray;

public class AccessArrayEx02 {

	public static void main(String[] args) {
		int a[] = {3, 5, 7, 9};
		
		System.out.print("Original array is: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		a[2] = a[1] * 5;
		
		System.out.print("\nAfter changing array is: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
