package pack;

public class b {
	public void add (int x,int y)
	{
		System.out.println("the addition="+(x+y));
	}
	public static void sub (int x, int y)
	{
		System.out.println("the sub="+(x-y));
		
	}
	public int mul(int x, int y) {
		return(x*y);
	}
	public static void main(String[] args) {
		b b1=new b();
		b1.add(4, 3);
		b.sub(4,3);
		int m=b1.mul(4, 3);
		System.out.println("mul="+m);
		
		
	}
}
