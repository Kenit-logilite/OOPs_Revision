package com.oop.keywords;

public class FinalExample {

	final int speed = 90; 
	
	void run()
	{
		speed = 100; //this will give an error because we cant mutate final variable
	}
	 
	
	public static void main(String[] args) {

		FinalExample f = new FinalExample();
		f.run();

	}

}
