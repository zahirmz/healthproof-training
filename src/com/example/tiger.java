package com.example;

public class tiger extends animal {
	void eat()
	{
		super.eat();
		System.out.println("eats only non veg");//method overriding 
	}
	void run()
	{
		System.out.println("runs fast");
	}
	public static void main(String[] args) {
		tiger t=new tiger();
		t.run();
		t.eat();
		System.out.println("tiger has "+t.legs+" legs");
	}

}
