package com.JH.calendar;

import java.util.Calendar;

public class CalendarTest5 {
	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		ca.set(2019, 3, 1);

		int max = ca.getActualMaximum(Calendar.DATE);
		int week = ca.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(week);

		System.out.println("일\t월\t화\t수\t목\t금\t토\t");

		for(int a=0; a<week; a++) {
			System.out.print("\t");
		}
			for(int i = 1 ; i<= max; i++) {
				System.out.print(i+"\t");
				if((i+week)%7==0) System.out.println();
			}
		}
}

