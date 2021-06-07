package com.oop.abstraction;

interface Fruit
{
	public void fruitTaste();
	public void price();
}

class Apple implements Fruit
{
	public void fruitTaste() {
		System.out.println("Sweet");
		
	}
	public void price()
	{
		System.out.println("100 rs");
	}
	
}


public class AbstractionExampleWithInterface {

	public static void main(String[] args) {

		Apple apple = new Apple();
		apple.fruitTaste();
		apple.price();

	}

}
