package com.vu.enumtype;

enum Season {
	SPRING, SUMMER, AUTUMN, WINTER;
}

public class SeasonEnum02 {
	public static void main(String[] args) {
		Season currentSeason = Season.SPRING;
		System.out.println("Current season = " + currentSeason);
	}
}
