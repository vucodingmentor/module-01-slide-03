package com.vu.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Current date is: " + sdf.format(date));
		
		sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.print("\nCurrent date is: " + sdf.format(date));
		
		sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss aaa");
		System.out.print("\nCurrent date is: " + sdf.format(date));
	}
}
