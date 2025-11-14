package Features;
import java.util.*;

public class ListDemo {
	
	public static void display(String n)
	{
		System.out.println(n);
	}
	public static void main(String[] args) {
//		List<Integer> l=Arrays.asList(3,33,22,44,4);
//		l.forEach(System.out::println);
		String names[]= {"Arjun","Abhinav","JP"};
		
		Arrays.stream(names).forEach(ListDemo::display);
		
	}
	
	
	

}
