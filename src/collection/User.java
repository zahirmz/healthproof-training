package collection;

public class User implements Animal{
	public static void main(String[] args) {
		Animal a = (x)->{System.out.println("eats"+x);};
		a.eat(5);
	}

	@Override
	public void eat(int x) {
		// TODO Auto-generated method stub
		
	}
}
