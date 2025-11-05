package pack;

public class constructor {
	constructor()
	{
		System.out.println("call constructor");
	}
	void eat()
	{
		System.out.println("eats rats");
	}
	void eat(int x)
	{
		System.out.println("eats "+x+ "grass");
	}
	public static void main(String[] args) {
		constructor c=new constructor();//constructor call
		new constructor().eat(5);
		new constructor().eat();//creates heap memory every time we call method thsi way,thats why we create references
	}

}
