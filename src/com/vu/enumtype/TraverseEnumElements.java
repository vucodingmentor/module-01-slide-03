package com.vu.enumtype;

public class TraverseEnumElements {
	
	public enum Season {
		SPRING, SUMMER, AUTUMN, WINTER;
	}

	public static void main(String[] args) {
		System.out.println("We have 4 seasons per year. There are: ");
		for (Season season: Season.values()) {
			System.out.println(season);
		}
	}

}
