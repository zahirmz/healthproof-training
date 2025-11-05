package interfaces;

public class Customerhotel extends Hotel {
	public void display()
	{
		System.out.println("CUSTOMER INFO");
	}
	public static void main(String[] args) {
		Customerhotel c1=new Customerhotel();
		c1.chicken();
		c1.Beef();
		c1.Vegcurry();
		c1.Paneer();
		c1.bill();
		c1.display();
		
		Nonveg c2=new Customerhotel();
		c2.Beef();
		c2.chicken();
		
		Veg c3=new Customerhotel();
		c3.Paneer();
		c3.Vegcurry();
		
		Hotel c4=new Customerhotel();
		c4.Beef();
		c2.chicken();
		c4.Paneer();
		c4.Vegcurry();
		c4.bill();
	}


}
