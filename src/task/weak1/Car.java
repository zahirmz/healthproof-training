package task.weak1;

class Vehicles//INheritence TASK1
{
	String name;
	String brand;
	int km;
	int year;
	
	public void add(String name,String brand,int km,int year)
	{
		this.name=name;
		this.brand=brand;
		this.km=km;
		this.year=year;
	}
	public void display()
	{
		System.out.println(":CAR INFO :\nName : "+name+"\nBrand : "+brand+"\nKilometeres Driven : "+km+"\nYear : "+year+"\n");
	}
}

class Truck extends Vehicles
{
	String name;
	String brand;
	int km;
	int year;
	
	public void add(String name,String brand,int km,int year)
	{
		this.name=name;
		this.brand=brand;
		this.km=km;
		this.year=year;
	}
	public void display()
	{
		System.out.println(":TRUCK INFO :\nName : "+name+"\nBrand : "+brand+"\nKilometeres Driven : "+km+"\nYear : "+year+"\n");
	}
}

public class Car extends Vehicles {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.add("Crysta","Toyota",120000,2015);
		c1.display();
		Truck t1=new Truck();
		t1.add("F series","Ford",90000,2023);
		t1.display();
		
	}
	

}
