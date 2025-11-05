package pack;
import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		
		int marks[]= {22,33,44,55,66,77};
		for (int i =0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		for(int m:marks)
		{
			System.out.println(m);//enhanced for loop
		}
		int mark[]=new int[5];
		Scanner sc =new Scanner(System.in);
		
		for (int i =0;i<mark.length;i++)
		{
			System.out.println("enter mark:");
			mark[i]=sc.nextInt();
		}
		for (int j =0;j<mark.length;j++)
		{
			System.out.println(mark[j]);
		}
		
	}
}






