package interfaces;

public class Hotel implements Veg,Nonveg {
	int totalPrice=0;

	@Override
	public void chicken() {
		int chicken=80;
		System.out.println("Chicken :"+chicken);
		totalPrice+=chicken;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Beef() {
		// TODO Auto-generated method stub
		int beef=100;
		System.out.println("BEeef :"+beef);
		totalPrice+=beef;
		
	}

	@Override
	public void Paneer() {
		// TODO Auto-generated method stub
		int paneer=120;
		System.out.println("Paneer :"+paneer);
		totalPrice+=paneer;
		
	}

	@Override
	public void Vegcurry() {
		// TODO Auto-generated method stub
		int vegcurry=80;
		System.out.println("Vegcurry :"+vegcurry);
		totalPrice+=vegcurry;
	}
	public  void bill() {
		System.out.println("Total Bill : "+totalPrice);
	}
	

}
