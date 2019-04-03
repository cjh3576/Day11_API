package com.JH.util.list;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList(); 
		ar.add("1");
		ar.add(2);   // int -> Integer
		ar.add(3.12); // double -> Double
		ar.add('a'); // char -> Character

		String s =(String)ar.get(0);
		int a = (int)ar.get(1);
		
		for(int i =0 ; i<ar.size();i++){ 
			System.out.println(ar.get(i));
		}
		ar.clear(); 
		ar.remove(1); 
		ar.set(1, 500); 
		System.out.println(ar);

//		ListTest_1 li = new ListTest_1();
//		li.ex_1();
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(3);
		int b = ar2.get(0);
	}

}
