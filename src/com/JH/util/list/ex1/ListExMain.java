package com.JH.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExMain {

	public static void main(String[] args) {
		//1. 정보입력 2. 정보 출력 3. 종료
		// 이름, 나이      모든 정보

		
		ArrayList ar = new ArrayList();
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while(check) {
			System.out.println("1. 정보입력   2. 정보출력     3.  종료");
			int num = sc.nextInt();
			ListExInput li = new ListExInput();
			ListExView lv = new ListExView();
			switch(num) {
			case 1:
				li.setInfo(ar);
			break;
			
			case 2:
				lv.view(ar);
				break;
				
			case 3:
				check = !check;
				break;
			
			}
		}
		
	}

}
