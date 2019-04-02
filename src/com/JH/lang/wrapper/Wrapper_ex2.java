package com.JH.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex2 {
	public void ex1() {
		//주민번호
		//마지막 번호는 체크용번호로 따로저장
		// 첫글자 *2, *3, *4, *5, *6    *7       -   *8,   *9  ,  *2   ,*3, *4, *5
		//각 자리수 총합을 11로 나눈 나머지를 구한다.
		//(11 - 나머지)       의 값을 마지막 번호와 비교. 같으면 정상, 아니면 비정상 
		// 위의 결과 값이 두자리면 결과값을 10으로 나눈 나머지를 체크번호와 비교
		
		String check; //마지막값 string
		int check2; //마지막값 int
		int namu ; // 
		char p; //주민번호 한글자씩 char
		int a; //주민번호 한글자씩 int
		int total=0; //주민번호 곱한값 
		int j = 2; //한자리당 곱할 값
		
		
		Scanner sc = new Scanner(System.in);
		String jumin = sc.next();
		
		
		
		
		check = jumin.substring(13);
		check2 = Integer.parseInt(check);
		
		for(int i = 0; i<jumin.length()-1; i++) {
			p=jumin.charAt(i);
			
			if(Character.isDigit(p)) {
				a = Integer.parseInt(p+"");
				total = total + (a *j);
				j++;
				if(j==10) j = 2;
				
			}
		}//for
		
		namu = 11 - (total%11);
		System.out.println("total : " + total);
		System.out.println("나머지 값: " + namu);
		if(namu >9) {
			if(check2 == namu % 10) {
				System.out.println("정상1");
			}
			else {
				System.out.println("비정상1");
			}
		}
		else if(namu == check2) {
			System.out.println("정상2");
		}
		else {
			System.out.println("비정상2");
		}
		
	}//method
}
