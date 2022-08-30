package com.vu.regularexpression;

import java.util.Scanner;

public class RegularExpressionEx01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your phone number: ");
		String phoneInput = scanner.nextLine();
		
		String phonePattern = "0[0-9]{9,10}";
		
		if (phoneInput.matches(phonePattern)) {
			System.out.println("This is a valid phone number!");
		} else {
			System.out.println("This is an invalid phone number!");
		}
	}

}
