package interfaces;

public class Triangle implements Shapes{
	void side() {
		System.out.println("3 sides");
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Triangle");
	}
	public static void main(String[] args) {
		Triangle t1=new Triangle();
		t1.draw();
		t1.side();
	}
}
