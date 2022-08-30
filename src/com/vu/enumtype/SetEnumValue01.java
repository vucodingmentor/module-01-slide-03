package com.vu.enumtype;

public class SetEnumValue01 {
	
	public enum Season {
		SPRING(3), SUMMER(4), AUTUMN(5), WINTER(6);
		
		private int value;
		
		private Season(int value) {
			this.value = value;
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Each season start at month: ");
		for (Season season: Season.values()) {
			System.out.println(season + ": " + season.value);
		}
	}

}
