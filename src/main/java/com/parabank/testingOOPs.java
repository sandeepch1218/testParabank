package com.parabank;

interface test1
{
	int x=10, y=20;
	public void hello1();
}

class test2
{
	public void hello2()
	{
		System.out.println("inheritance checking");
	}
}

class test3 extends test2 implements test1	//multiple inheritance
{
	public void hello1()
	{
		System.out.println("inheritance testing = "+(x+y));
	}
}

abstract class Apple		//parent and abstract class
{
	public void show()		//parent method
	{
		System.out.println("Apple");
	}
	public abstract void display();		//Abstract method declaration
}

class Ball extends Apple	//single inheritance
{
	public void show()		//Overriding
	{
		System.out.println("overriden method");
	}

	public void display() {
		System.out.println("Abstract Method");// abstraction
		
	}
}

class Cat extends Ball		//multilevel inheritance
{
	public void sample()		
	{
		System.out.println("sample method");
	}
}

class Dog extends Apple		//hierarichal inheritance
{
	public void display()
	{
		
			System.out.println("abstract method");
		
	}
	
	public void show(int a)		//method declaration
	{
		System.out.println("parameter is="+a);
	}
	
	public void show(int a, int b)		//method overloading
	{
		System.out.println("parameter is="+a+","+b);
	}
}

public class testingOOPs {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.display();
		d.show();
		d.show(10);
		d.show(2,2);
		Ball b= new Ball();
		b.show();
		b.display();
		Cat c=new Cat();
		c.sample();
		c.show();
		test3 t=new test3();
		t.hello1();
		t.hello2();

	}

}
