package com.example;

public class Icici implements Loan {

	@Override
	public void interestrate(int amount) {
		amount=amount/10;
		System.out.println("interesnt rate fro ICICI : "+amount);
		// TODO Auto-generated method stub
		
	}
	
	

}
