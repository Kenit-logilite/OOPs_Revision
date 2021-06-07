package com.oop.polymorphism;


class Car
{
	public void carEngine()
	{
		System.out.println("This is the car Engine");
	}
}

class Ferrari extends Car
{
	public void carEngine()
	{
		System.out.println("This car has V8 engine");
	}
}

class Porsche extends Car
{
	public void carEngine()
	{
		System.out.println("This car has v4 Engine");
	}
}

public class PolymorphismExample {

	public static void main(String[] args) {


		Car car = new Car();
		Ferrari ferrari = new Ferrari();
		Porsche porsche = new Porsche();
		
		car.carEngine();
		ferrari.carEngine();
		porsche.carEngine();
	}

}
