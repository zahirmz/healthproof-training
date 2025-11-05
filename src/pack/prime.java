package pack;
import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		int prime=0;
		int limit=(num/2);
		for (int i=2;i<=limit;i++)
		{
			if(num%i==0)
			{
				prime=1;
				break;
				
			}
		}
		if (prime==1) {
			System.out.println("not prime");
			
		}
		else
		{
			System.out.println("prime");
		}
		
	}
}
