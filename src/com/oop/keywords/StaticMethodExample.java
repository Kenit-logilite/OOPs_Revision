package com.oop.keywords;

public class StaticMethodExample {
	
	//	Static Method
	static int cube(int x)
	{
		return x*x*x;
	}

	public static void main(String[] args) {
		
		int result = StaticMethodExample.cube(10);
		
		System.out.println(result);

	}

}
