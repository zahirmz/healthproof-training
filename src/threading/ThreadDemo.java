package threading;

public class ThreadDemo extends Thread{
	public static void main(String[] args) {
		ThreadDemo th1=new ThreadDemo();  //new born
		th1.start();  //runnable
	}
	public void run()
	
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}








