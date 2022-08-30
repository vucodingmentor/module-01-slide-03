package com.vu.declarearray;

public class DeclareArrayEx01 {

	public static void main(String[] args) {
		double[] arr01 = new double[] {1,2,3};
		double[] arr02 = {4,5,6};
		
		for (int i=0; i < arr01.length; i++) {
			System.out.print(arr01[i] + "\t");
		}
		
		System.out.println();
		
		for (int i=0; i < arr02.length; i++) {
			System.out.print(arr02[i] + "\t");
		}
		
		System.out.println();
		
		for (double arrItem : arr01) {
			System.out.print(arrItem + "\t");
		}
	}

}
