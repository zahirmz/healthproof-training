package threading;

public class multithread {
	public static void main(String[] args) {
		Thread th1=new Thread() {
			public void run()
			{
				System.out.println("First round");
			}
		};

	Thread th2=new Thread() {
		public void run()
		{
			System.out.println("Second run");
		}
	};
	th1.start();
	th1.start();
	th2.start();
	}
}
