package interfaces;

public class Rectangle implements Shapes{
	void side() {
		System.out.println("4 sides");
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle");
	}

}
