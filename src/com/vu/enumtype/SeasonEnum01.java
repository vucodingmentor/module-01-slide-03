package com.vu.enumtype;

public class SeasonEnum01 {

	enum Season {
		SPRING, SUMMER, AUTUMN, WINTER;
	}
	
	public static void main(String[] args) {
		Season currentSeason = Season.SPRING;
		System.out.println("Current season is: " + currentSeason);
	}
}
