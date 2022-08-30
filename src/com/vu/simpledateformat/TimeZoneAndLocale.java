package com.vu.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneAndLocale {
	
	private static final String DATE_FORMAT = "dd/MM/yyyy hh:mm:ss";

	public static void main(String[] args) throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
		
		Date now = new Date();
		String dateInString = now.getDate() + "/" + (now.getMonth() + 1) + "/" + (now.getYear() + 1900) 
							+ " " + now.getHours() + ":" + now.getMinutes() + ":" + now.getSeconds();
//        String dateInString = "27/08/2022 08:44:55 PM";
        Date date = formatter.parse(dateInString);
        TimeZone tz = TimeZone.getDefault();

        // From TimeZone Asia/Singapore
        System.out.println("TimeZone : " + tz.getID() + " - " + tz.getDisplayName());
        System.out.println("TimeZone : " + tz);
        System.out.println("Date (Singapore) : " + formatter.format(date));

        // To TimeZone America/New_York
        SimpleDateFormat sdfAmerica = new SimpleDateFormat(DATE_FORMAT);
        TimeZone tzInAmerica = TimeZone.getTimeZone("America/New_York");
        sdfAmerica.setTimeZone(tzInAmerica);

        String sDateInAmerica = sdfAmerica.format(date); // Convert to String first
        Date dateInAmerica = formatter.parse(sDateInAmerica); // Create a new Date object

        System.out.println("\nTimeZone : " + tzInAmerica.getID() + " - " + tzInAmerica.getDisplayName());
        System.out.println("TimeZone : " + tzInAmerica);
        System.out.println("Date (New York) (String) : " + sDateInAmerica);
        System.out.println("Date (New York) (Object) : " + formatter.format(dateInAmerica));	
	}

}
