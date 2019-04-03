package com.JH.util.random;

import java.util.Random;

public class RandomEx1 {
	public void ex1() {
		Random r = new Random();
		for(int i =0; i<6; i++) {
		
		System.out.println(r.nextInt(45)+1);
		}
	}
	
	public void ex2() { 
		int [] lotto = new int[6];
		Random r = new Random();
		
		for(int i =0; i<lotto.length; i++) {
			lotto[i] = r.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		System.out.println(lotto[i]);
		}
	}
	
	public void ex3() {
		Random r = new Random();
		String [] foods = {"떡볶이", "냉면", "순대국","육개장", "해장국", "굶기" };
		for(int i = 0; i<10; i++) {
		int a = r.nextInt(6);
		System.out.println(foods[a]);
		}
	}
	
	public void ex4() {
		Random r= new Random();
		String [] num = {"1","2","2","3","3","3","3","3","3","3"};
		
		for(int i=0; i<10; i++) {
			String a = num[r.nextInt(10)];
			if(a.equals("1")) {
				System.out.println("2단계 강화 성공");
			}
			else if(a.equals("2")) {
				System.out.println("1단계 강화 성공");
			}
			else {
				System.out.println("강화 실패");
			}
			
		}
	}
	
}
