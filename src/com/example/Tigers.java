package com.example;

public class Tigers implements Animals{

	@Override
	public void eat() {
		System.out.println("eats only non veg");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		System.out.println("runs 50 miles per hour");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Tigers t=new Tigers();
		t.eat();
		t.run();
	}

}
