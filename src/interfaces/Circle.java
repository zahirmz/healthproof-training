package interfaces;

interface Shapes
{
	public void draw();
}
public class Circle implements Shapes{
	void side() {
		System.out.println("no sides");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}
	public static void main(String[] args) {
		
	}
}
