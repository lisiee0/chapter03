package com.javaex.ex06;

public class StringApp01 {
	
	public static void main(String[] args) {
		
		
		String str01= new String("hi");
		String str02= new String("hi");
		
		System.out.println(str01==str02); // 주소값이 같은지? --> false
		
		System.out.println(str01.hashCode());
		System.out.println(str02.hashCode());
		
		System.out.println(str01.equals(str02)); 
		
		System.out.println("==========================================");
		
		String str03= "hello";
		String str04= "hello";
		
		System.out.println(str03==str04);
		System.out.println(str03.hashCode());
		System.out.println(str04.hashCode());
		
		str04= "hello!!!!";
		
		System.out.println(str03==str04);
		System.out.println(str03.hashCode());
		System.out.println(str04.hashCode());
		
	}
}
