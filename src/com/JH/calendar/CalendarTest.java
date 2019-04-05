package com.JH.calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		//추상클래스 new 생성 xxx
		// 현재 시간을 담음
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		int min = cal.get(Calendar.MINUTE);
		System.out.println(min);
		int mon = cal.get(Calendar.MONTH);
		System.out.println(mon+1);
		
		cal.set(Calendar.YEAR, 2100);
		System.out.println(cal.get(Calendar.YEAR));
		//1월로
		cal.set(Calendar.MONTH, 0);
		System.out.println(cal.get(Calendar.MONTH));
		
		cal.set(Calendar.HOUR_OF_DAY, 22);
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
		System.out.println(cal.get(Calendar.HOUR));
		cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		cal = Calendar.getInstance();
		cal.set(1994, 12, 23);
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("==================");
		
		cal.add(Calendar.DATE, 28);
		System.out.println(cal.get(Calendar.MONTH));
//		cal.roll(Calendar.DATE, 3);
		
		System.out.println(cal.get(Calendar.DATE));
		
		
		
		
		
	}

}
