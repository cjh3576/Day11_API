package com.JH.util.list;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListTest_1 {
	public void ex_1() {
		Scanner sc = new Scanner(System.in);
		
		ArrayList ar = new ArrayList();
		Random ra = new Random();
		int num = sc.nextInt();
		
		for(int i =0; i<num; i++) {
			ar.add(ra.nextInt());
		}
		
			System.out.println(ar);
		
		
	}
	
	public void ex_2() {
		
	}
	
}
