package com.vu.function;

public class FuncEx01 {

	public static void main(String[] args) {
		System.out.print("Max of A, B is: " + findMax(5, 4));
	}
	
	public static int findMax(int numA, int numB) {
		if (numA > numB)
			return numA;
		return numB;
	}
}
