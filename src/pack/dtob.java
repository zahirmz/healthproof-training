package pack;
import java.util.Scanner;


public class dtob {
	public static void main(String[] args) {
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0;
		String b="";
        while(n>0)
        {
        	rem=n%2;
        	b=rem+b;
        	n=n/2;   	
        }
		System.out.println(b);
		
	}
}