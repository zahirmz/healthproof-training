package pack;
import java.util.Scanner;

public class jump {
	public static void main(String[] args) {
		First:
			for (int i=0;i<5;i++) {
				Second:
				for (int j=0;j<5;j++) {
					if(j==2) {
						break First;
					}
					System.out.println("i: "+i+", j: "+j );
				}
				
			}
	}
}
