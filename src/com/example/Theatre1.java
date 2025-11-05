package com.example;

public class Theatre1 implements Malyalammovies {
	int totalPrice=0;
	



	@Override
	public void arm() {
		int ticketPrice=150;
		totalPrice+=ticketPrice;
		System.out.println("price for ARM : "+ticketPrice);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drishyam() {
		int ticketPrice=130;
		totalPrice+=ticketPrice;
		System.out.println("price for drishyam : "+ticketPrice);
		// TODO Auto-generated method stub
		
	}
	public void total()
	{
		System.out.println("Total Ticket Price : "+totalPrice);
	}

}
