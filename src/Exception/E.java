package Exception;

public class E {
	public static void main(String[] args) {
		int x=21;
		int v=0;
	try {
		System.out.println(x+"/"+v+"="+x/v);
	}
	catch(Exception e)
	{
		System.out.println("please enter non zero value "+e);
	}
	}

}
