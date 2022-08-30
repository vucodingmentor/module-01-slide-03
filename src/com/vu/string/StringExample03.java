package com.vu.string;

public class StringExample03 {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("VU");
		s1.append(" School");
		System.out.println("s1 ver 01: " + s1);
		
		s1.insert(2, " Students");
		System.out.println("s1 ver 02: " + s1);
		
		s1.delete(6, 10);
		System.out.println("s1 ver 03: " + s1);
		
		s1.reverse();
		System.out.println("s1 ver 04: " + s1);
	}
}
