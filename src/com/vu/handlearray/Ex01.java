package com.vu.handlearray;

public class Ex01 {

	public static void main(String[] args) {
		// Tính tổng các số chẵn của mảng từ 1->10 sử dụng vòng lặp for-each
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
		double sum = 0;
		
		for(int x : a) {
			if(x % 2 == 0) {
				sum += x;
			}
		}
		
		System.out.printf("Sum Array: %.1f", sum);
	}

}
