package collection;

public class Employee {
	private int Empid;
	private String Empname;
	private int Empsal;
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String eMpname) {
		Empname = eMpname;
	}
	public int getEmpsal() {
		return Empsal;
	}
	
	public void setEmpsal(int empsal) {
		Empsal = empsal;
	}
	
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Empname=" + Empname + ", Empsal=" + Empsal + "]";
	}
	
	public Employee(int empid, String empname, int empsal) {
		super();
		Empid = empid;
		Empname = empname;
		Empsal = empsal;
	}
	public Employee() {
		
	}
	
	
}
