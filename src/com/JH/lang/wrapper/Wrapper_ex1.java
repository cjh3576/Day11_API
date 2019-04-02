package com.JH.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex1 {
	
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		//1. 나이 출력 
		//3-5 봄  6-8 여름 9-11 가을 12 - 2 겨울 출생
		String age = num.substring(0, 2);
		String we = num.substring(2, 4);
		
		
		
		int n = Integer.parseInt(age);
		int w = Integer.parseInt(we);
		
		if(n>=0 && n<=19) {
		n= 2019 - (2000+n);
		}
		else {
			n = 2019 - (1900+n);
		}		
		System.out.println(n + "살 입니다");
		
		
		if(w>=3 && w<=5) {
			System.out.println("봄 출생");
		}
		else if(w>=6 && w <=8) {
			System.out.println("여름 출생");
		}
		else if(w>=9 && w<=11) {
			System.out.println("가을 출생");
		}
		else if ( w== 12 || w ==1 || w == 2 ) {
			System.out.println("겨울 출생");
		}
	
	
	}
	public void ex2() {
		//대소문자 1개이상, 공백 x 숫자 1개이상, 최소 6자 이상
		Scanner sc = new Scanner(System.in);
		String pw = sc.nextLine(); //공백포함여부
		char p;
		int up = 0;
		int low = 0;
		int space = 0;
		int digit = 0;
		for(int i =0; i<pw.length(); i++) {
			p=pw.charAt(i);
			
			if(Character.isUpperCase(p)) {
				up++;
			}
			if(Character.isLowerCase(p)) {
				low++;
			}
			if(Character.isWhitespace(p)) {
				space++;
			}
			if(Character.isDigit(p)) {
				digit++;
			}
			
		}//for
		if(up >=1 && low >=1 && space <1 && digit >=1 &&pw.length()>=6 ) {
			System.out.println("비밀번호 생성 완료");
		}
		else
			System.out.println("비밀번호 생성 오류");
		
	}//method
	
	
	
}
