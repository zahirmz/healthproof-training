package threading;



public class Users {
	public static void main(String[] args) {
//		A rn=new A();
//		Thread th1=new Thread(rn);
//		th1.start();

		Runnable rn=()->{System.out.println("Runnable Interface");};
		Thread th=new Thread();
		th.start();
	}

}
