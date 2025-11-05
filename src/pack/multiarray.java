package pack;
import java.util.Scanner;

public class multiarray {
	public static void main(String[] args) {
		int arr[][]=new int[2][3];
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.println("enter the numebr:");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int m=0;m<2;m++)
		{
			for (int n=0;n<3;n++)
			{
				System.out.print(arr[m][n]+"\t");
			}
			System.out.println();
		}	
	}
	

}
