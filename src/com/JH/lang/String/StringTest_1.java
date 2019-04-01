package com.JH.lang.String;

import java.util.Comparator;

public class StringTest_1 {

	public static void main(String[] args) {
		String s1 = "iu";
		String s2 = "iu";
		String s3 = new String("iu");
		String s4 = new String("iu");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		
		
		System.out.println(s1.charAt(1));
		StringEx_1 st = new StringEx_1();
		
		
		String a = "hello world";
		int n = a.indexOf("l");
		System.out.println(n);
		st.ex2();
	}

}
