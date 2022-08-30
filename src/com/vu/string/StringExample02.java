package com.vu.string;

public class StringExample02 {

	public static void main(String[] args) {
		StringBuilder sb01 = new StringBuilder();
		sb01.append("VU");
		sb01.append(" School");
		System.out.println("sb01 is: " + sb01);
		System.out.println("\nsb01 is: " + sb01.capacity());
		System.out.println("\nsb01 is: " + sb01.length());
		
		StringBuilder sb02 = new StringBuilder(2);
		sb02.append("VU School");
		System.out.println("\nsb02 is: " + sb02);
		System.out.println("\nsb02 is: " + sb02.capacity());
		System.out.println("\nsb02 is: " + sb02.length());
		
		StringBuilder sb03 = new StringBuilder("VU School");
		System.out.println("\nsb03 is: " + sb03);
		System.out.println("\nsb03 is: " + sb03.capacity());
		System.out.println("\nsb03 is: " + sb03.length());
	}

}
