package interfaces;

public class Demo {
	public static void main(String[] args) {
		Bird b=new Bird() {

			@Override
			public void eat() {
				System.out.println("eats's insects");
				// TODO Auto-generated method stub
				
			}

			@Override
			public void fly() {
				System.out.println("flies fast");
				// TODO Auto-generated method stub
				
			}
			
		};
		b.eat();
		b.fly();
		
		
	}

}
