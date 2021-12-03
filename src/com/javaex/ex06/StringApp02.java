package com.javaex.ex06;

public class StringApp02 {

	public static void main(String[] args) {
		
		String a= "abcd";
		String b= ",efg";
		
		System.out.println(a.concat(b));
		System.out.println(b.concat(a));
		
		a= a.concat(b);
		System.out.println(a);
		
		a= a.trim();
		System.out.println("--"+a+"--");
		
		a= a.replace("ab", "12");
		System.out.println(a);
		
		String[] sArray= a.split(",");
		
		for(int i= 0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		String str= "Hello java!";
		
		String r01= str.substring(3);
		System.out.println(r01);
		
		String r02= str.substring(3, 8); // 3부터 8전까지
		System.out.println(r02);
	}

}
