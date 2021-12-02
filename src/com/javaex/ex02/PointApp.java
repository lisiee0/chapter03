package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {

		Point p00= new Point(2,3);
		Point p01= new Point(2,3);
		Point p02= new Point(5,9);
		
		System.out.println("#getClass()");
		System.out.println(p00.getClass());
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		System.out.println("====================================");
		
		System.out.println("#hashCode()");
		System.out.println(p00.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println("====================================");
		
		System.out.println("#toString()");
		System.out.println(p00.toString());
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println("====================================");
		
	}

}
