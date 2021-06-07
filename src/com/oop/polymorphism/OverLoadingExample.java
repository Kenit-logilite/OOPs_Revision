package com.oop.polymorphism;

class OverLoadingExample{
	public int add(int number1,int number2)
	{
	return number1 + number2;
	}
	public double add(double number1,double number2)
	{
	return number1 + number2;
	}
	public long add(long number1,long number2)
	{
	return number1 + number2;
	}
		public static void main(String args[])
		{
		OverLoadingExample c1 = new OverLoadingExample();
		int calc1 = c1.add(10,12);
		long calc2 = c1.add(103212,122123131);
		double calc3 = c1.add(5.5,2.2);
		System.out.println("Result of Interger is "+calc1);
		System.out.println("Result of Long is "+calc2);
		System.out.println("Result of Double is "+calc3);
		} 


}
