package com.vu.randomnumber;

import java.util.Random;
import java.util.Scanner;

public class RandNumRangeAB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("Enter a: ");
//		int a = scanner.nextInt();
//		System.out.print("Enter b: ");
//		int b = scanner.nextInt();
		
		//Test:
		int a = -100, b = 100;
		
		Random randObj = new Random();
		int randIntNum = a + randObj.nextInt(b - a + 1);
		
		System.out.print("Random integer number (a..b) is: " + randIntNum);

		double randDoubleNum = a + randObj.nextDouble() * (b - a);
		
		System.out.print("\nRandom double number (a..b) is: " + randDoubleNum);
		
		scanner.close();
	}

}
