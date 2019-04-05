package com.JH.calendar;

import java.util.Calendar;

public class CalendarTest3 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		Calendar ca2 = Calendar.getInstance();
		ca2.set(1994, 12, 23);
		long l = ca.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();
		long l3 = l - l2;
		
		
		System.out.println(l);
		System.out.println(l3/(1000*3600*24));
		
		
		
		
	}

}
