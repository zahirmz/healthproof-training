package com.example;

public class Bat implements Animals,Birds {
	public static void main(String[] args) {
		Bat b1=new Bat();
		b1.eat();
		b1.fly();
		b1.run();
		System.out.println(b1.legs);
		
	}

	@Override
	public void fly() {
		System.out.println("Bat flies");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		System.out.println("Bat is omnivore");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		System.out.println("Bat doesnt run");
		// TODO Auto-generated method stub
		
	}

}
