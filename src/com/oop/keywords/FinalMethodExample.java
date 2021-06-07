package com.oop.keywords;

class Bike
{
	final void run()
	{
		System.out.println("This is running");
	}
}

public class FinalMethodExample extends Bike {
	void run() // this will give compile time error  because we can not override final method
	{
		System.out.println("This is not running");
	}

	public static void main(String[] args) {
		
		
	}

}
