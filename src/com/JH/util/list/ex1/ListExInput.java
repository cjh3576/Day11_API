package com.JH.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExInput {
	private Scanner sc;
	private ArrayList ar;
	public ListExInput() {
		sc= new Scanner(System.in);
		ar = new ArrayList();
	}


	public void setInfo(ArrayList ar) {
		System.out.println("이름을 입력하세요");
		ar.add(sc.next());
		System.out.println("나이를 입력하세요");
		ar.add(sc.nextInt());
		
	}

}
