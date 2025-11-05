package com.example;

public class Sbi implements Loan{

	@Override
	public void interestrate(int amount) {
		// TODO Auto-generated method stub
		amount=(amount/100)*8;
		System.out.println("Interst rate of sbi : "+amount);
		
	}

}
