package com.oop.keywords;

 class Car
{
	static String brand = "Mercedes";
	String name;
	int price;
	
	Car(String name,int price)
	{
		this.name = name;
		this.price =price;
	}
	
	void display()
	{
		 System.out.println(brand + " " + name + " " + price );
	}
}


public class StaticExample {

	public static void main(String[] args) {
		
		Car car = new Car("C class",4500000);
		Car car1 = new Car("s class",5000000);
		
		car.display();
		car1.display();
		
	}

}
