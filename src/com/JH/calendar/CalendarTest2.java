package com.JH.calendar;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(1994, 13, 23);
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
	}

}
