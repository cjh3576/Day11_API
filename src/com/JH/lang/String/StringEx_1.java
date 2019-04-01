package com.JH.lang.String;

import java.util.Scanner;

public class StringEx_1 {

	Scanner sc = new Scanner(System.in);
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();


		char  a = num.charAt(7 );

		if(a == '1' ) {
			System.out.println("남자");
		}
		else if(a == '2') {
			System.out.println( "여자");
		}
		else 
			System.out.println("아무것도아니다");
	}

	public void ex2() {
		String name = "Mississippi";
		int i = -1;
		int total = 0;
		while(true) {
			i= name.indexOf("s",i+1);
			if(i != -1) {
				total ++;
			}
			else {
				break;
			}
		}
		System.out.println(total);
	}

	public void ex3() {
		sc = new Scanner(System.in);
		String mas = sc.next();

		int a = mas.length();
		System.out.println(a*100);

	}

	public void ex4() {
		sc = new Scanner(System.in);
		while(true) {
			String id = sc.next();
			int i= id.indexOf("@");
			if(id.length() <=10 && i != -1) {
				System.out.println("통과");
			}
			else {

				System.out.println("실패");


			}

		}
	}
	
	public void ex5() {
		//jpg, png, gif
		String print = sc.next();
		int p = print.indexOf(".");
		int pp = print.lastIndexOf(".");
		String j = "jpg";
		String pn = "png";
		String g = "gif";
		
		String a = print.substring(pp+1, print.length() );
		System.out.println(a);
		if(a.equals(j) || a.equals(pn) || a.equals(g)) {
			System.out.println("올바른 파일");
		}
		else
			System.out.println("잘못된 파일");
		
		
	}
}
