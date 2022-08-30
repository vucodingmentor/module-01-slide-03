package com.vu.decimalformat;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		DecimalFormat dcf = new DecimalFormat("##,###,###.##");
		double currency = 1000000;
		System.out.println("Original currency is: " + currency);
		System.out.println("After formating, currency is: " + dcf.format(currency));
	}

}
