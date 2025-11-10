package task.weak1;

public class Multirunnablethreaad {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run()
			{
				System.out.println("runnable objects");
			}
		
		}).start();
	}

}
