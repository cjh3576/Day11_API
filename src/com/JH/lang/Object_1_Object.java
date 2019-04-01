package com.JH.lang;

public class Object_1_Object {
	public static void main(String[] args) {
		Object obj = new Object();
		Object obj2 = new Object();

		String s =obj.toString();
		System.out.println(obj.equals(obj2));
		int a = obj.hashCode();
		System.out.println(a);

		String ss = "hello world";
		String r = ss.substring(7);
		System.out.println(r);
		r= ss.substring(3,7);
		System.out.println(r);


		r = ss.toUpperCase();
		System.out.println(r);
		r=ss.toLowerCase();
		System.out.println(r);

		String str1 = "test";
		String str2 = "    test      ";
		r = str2.trim();
		System.out.println(r);
	
		System.out.println(String.valueOf(str2));
		
		ss = "iu-choa-suji-hani";
		String [] names = ss.split("-");
		for(int i = 0 ; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}

