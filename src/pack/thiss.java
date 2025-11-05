package pack;

public class thiss {
	int x=22;
	public void meth(int x) {
//		this.x=x;
		System.out.println("accessing instance variable: "+this.x);
	}
	public static void main(String[] args) {
		thiss s1=new thiss();
		s1.meth(55);
	}

}
