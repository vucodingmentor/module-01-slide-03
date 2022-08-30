package com.vu.string;

public class StringExample01 {

	public static void main(String[] args) {
		String s1 = new String();
		String s2 = new String("VU");
		String s3 = "FastTrack";
		String s4 = "VU";
		
		System.out.print("s1: " + s1);
		System.out.print("\ns2: " + s2);
		System.out.print("\ns3: " + s3);
		
		System.out.print("\ns1 length: " + s1.length());
		System.out.print("\ns2 length: " + s2.length());
		System.out.print("\ns3 length: " + s3.length());
		
		if (s2 == s4) {
			System.out.println("\ns2 == s4");
		} else {
			System.out.println("\ns2 != s4"); //compare type and value
		}
		
		if (s2.equals(s4)) {
			System.out.println("\ns2.equals(s4) is true"); //compare value
		} else {
			System.out.println("\ns2.equals(s4) is false");
		}
	}

}
