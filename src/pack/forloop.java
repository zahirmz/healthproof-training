package pack;
import java.util.Scanner;

public class forloop {
	public static void main(String[] args) {
		int num;
		Scanner sc =new Scanner (System.in);
	    System.out.println("enter:");
		num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println("sum="+sum);		
	}
}
