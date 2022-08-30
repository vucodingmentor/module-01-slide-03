package com.vu.randomnumber;

import java.util.Random;
import java.util.Scanner;

public class IntRandExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter range number: ");
		int randomRange = scanner.nextInt();//input: 201
		
		Random randObj = new Random();
		//[-100..100]: a=-100, b-a+1=201=>b=100
		int randomNumber = -100 + randObj.nextInt(randomRange);
		System.out.print("Random number in range " + randomRange + " is: " + randomNumber);
		
		scanner.close();
	}
}
