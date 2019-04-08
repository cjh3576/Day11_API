package com.JH.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest6 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		String pattern = "yyyy년 MM월 dd일 HH:mm E ";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		
		long now = calendar.getTimeInMillis();
		Date date = new Date();
		date.setTime(now);
		
		System.out.println(sd.format(date));
		
		System.out.println(sd.format(now));
		
		Date d = new Date(now);
		System.out.println(sd.format(d));
		
		d = calendar.getTime();
		System.out.println(sd.format(d));
		
		
		
	}

}
