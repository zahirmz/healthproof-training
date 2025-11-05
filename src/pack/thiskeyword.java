package pack;

public class thiskeyword {
	thiskeyword()
	{ 
		this(4);
		System.out.println("Constructor");
	}
	thiskeyword(int x)
	{
		this(22,44);
		System.out.println("cats "+x);
	}
	thiskeyword(int x,int y)
	{
		this.eat(4);
		System.out.println("cats "+x+" dogs "+y);
	}
	void eat(int z)
	{
		System.out.println("methos :"+z);
	}
	public static void main(String[] args) {
		new thiskeyword();  //we cannot use this keyword in main method because main is static
	}
}
