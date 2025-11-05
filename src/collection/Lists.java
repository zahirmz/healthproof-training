package collection;

import java.util.Iterator;
import java.util.ArrayList;

public class Lists {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEmpid(101);
		e1.setEmpname("karthik");
		e1.setEmpsal(55000);
		
		Employee e2=new Employee();
		e2.setEmpid(102);
		e2.setEmpname("surya");
		e2.setEmpsal(60000);
		
		Employee e3=new Employee(0, null, 0);
		e3.setEmpid(103);
		e3.setEmpname("Vijay");
		e3.setEmpsal(90000);
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Employee e=(Employee)itr.next();
			System.out.println(e.getEmpid()+" "+e.getEmpname()+" "+e.getEmpsal());
		}	
	}

}
