package Features;

sealed class Car permits Bmw, Audi, C
{
	public void printName()
	{
		System.out.println("Cars");
	}
	
}
non-sealed class Bmw extends Car
{
	public void printName()
	{
		System.out.println("BMW");
	}
}
non-sealed class Audi extends Car
{
	public void printName()
	{
		System.out.println("Audi");
	}
}
public final class C extends Car{
	public void printName()
	{
		System.out.println("C");
		
	}
	public static void main(String[] args) {
		C c1=new C();
		c1.printName();
		
	}
}
