package com.example;

public class monkey extends tiger {
	void eat()
	{
		super.eat();
		System.out.println("monkey eats");
	}
	public static void main(String[] args) {
		monkey m1=new monkey();
		
		m1.eat();
	}

}
