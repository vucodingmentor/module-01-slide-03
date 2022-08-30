package com.vu.decimalformat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageScoreExample {

	public static void main(String[] args) {
		// Input: Math, Physics, Chemistry Scores (User Input) -> Scanner
		// Storage: math (double), physic (double), chemistry (double) -> Variables
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter Math Score:");
		double math = scanner.nextDouble();
		System.out.print("Please enter Physic Score:");
		double physic = scanner.nextDouble();
		System.out.print("Please enter Chemistry Score:");
		double chemistry = scanner.nextDouble();
		
		// Processing: 
		   // Step 1: Calculate AverageScore -> Formula: (math+physic+chemistry)/3
		double averageScore = (math + physic + chemistry)/3;
		   // Step 2: Format Calculated Score -> DecimalFormat
		DecimalFormat dcf = new DecimalFormat("#.00");
		
		// Output: AverageScore (formatted) -> Sysout
		System.out.println("Average Score: " + dcf.format(averageScore));
		
		scanner.close();

	}

}
