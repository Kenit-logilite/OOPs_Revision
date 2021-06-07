package com.oop.polymorphism;

class Amitabh{
	public void marryAbhishek()
	{
	System.out.println("Marry with Karishma");
	}
}
class Abhishek extends Amitabh{
	public void marryAbhishek()
	{
	System.out.println("Marry with Aishwarya");
	}
}
class OverRidingExample{
	public static void main (String args[])
	{
	Amitabh a1 = new Amitabh();	
	a1.marryAbhishek(); 
	Abhishek a2 = new Abhishek();
	a2.marryAbhishek(); 
	
//	Amitabh a3 = new Abhishek(); 
//	a3.marryAbhishek(); 
	}
}
