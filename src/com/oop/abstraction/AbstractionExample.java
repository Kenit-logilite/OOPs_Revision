package com.oop.abstraction;


abstract class Car
{
    
	public abstract void carSound();    //Abstract Method	
   	
	public void engine()        //Non-Abstract Method
	{
		System.out.println("V8");
	}
	
}

 class Lamborghini extends Car
{
	public void carSound()
	{
		System.out.println("Vroom Vroom");
	}
}
public class AbstractionExample {

	public static void main(String[] args) {
		
		Lamborghini lambo = new Lamborghini(); //Object of Class Lamborghini
		lambo.carSound();
		lambo.engine();
	}

}
