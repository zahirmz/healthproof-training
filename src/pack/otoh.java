package pack;
import java.util.Scanner;


public class otoh {
	public static void main(String[] args) {
		System.out.println("enter octal :");
		Scanner sc=new Scanner(System.in);
		String octal=sc.nextLine();
		String hex="";
		String hexVal="0123456789ABCDEF";
		int rem;
		int decimal=0;
		for (int i=0; i<octal.length();i++)
		{
			int digit=octal.charAt(i)-'0';
			decimal=decimal*8+digit;
			
		}
		while(decimal>0)
		{
			rem=decimal%16;
			hex+=hexVal.charAt(rem);
			decimal=decimal/16;
			
		}
		StringBuffer sb=new StringBuffer(hex);
		System.out.println(sb.reverse());

	}

}
