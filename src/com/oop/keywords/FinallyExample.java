package com.oop.keywords;

public class FinallyExample {

	public static void main(String[] args) {


		try
		{
			int a = 10;
			int b = 0;
			int c = a/b;
		}
		catch(Exception e)
		{
			System.out.println("You cant Divide with Zero");
//			System.exit(0); Only when you do not want to execute finally block
		}
		finally
		{
			System.out.println("Finished");
		}

	}

}
