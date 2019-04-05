package com.JH.calendar;

import java.util.Calendar;
import java.util.Scanner;


public class CalendarTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		
		System.out.println("종료 시간을 입력하세요");
		String time = sc.next();  // 3-50    종료시간을 받아 들어온시간과 나간시간의 차이를 구해 시급 계산 시급 1,000
		String[] a = time.split("-");
		
		cal2.set(Calendar.HOUR, Integer.parseInt(a[0]));
		cal2.set(Calendar.MINUTE,Integer.parseInt(a[1]));
		
		long l = cal.getTimeInMillis();
		long l2 = cal2.getTimeInMillis();
		long l3 = l2-l;
		long h = l3/(1000*3600);
		long m = l3/(1000*3600);
		System.out.println(h);
		if(m>0) {
			h++;
		}
		
		System.out.println("최종요금 : " + h*1000);
		
		
		
		
	}

}
