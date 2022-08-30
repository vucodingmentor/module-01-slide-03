package com.vu.valuetype;

public class ValueType {
	
	static int addOneTo(int num) {
		return num += 1;
	}

	public static void main(String[] args) {
		int x = 6;
		System.out.println(addOneTo(x));
	}

}
