package collection;

public class CompanyBean {
	private String cmpName;
	private int empid;
	private String cmpAddress;
	public CompanyBean(String cmpName, int empid, String cmpAddress) {
		this.cmpName = cmpName;
		this.empid = empid;
		this.cmpAddress = cmpAddress;
	}
	public String getCmpName() {
		return cmpName;
	}
	public int getEmpid() {
		return empid;
	}
	public String getCmpAddress() {
		return cmpAddress;
	}
	@Override
	public String toString() {
		return "CompanyBean [cmpName=" + cmpName + ", empid=" + empid + ", cmpAddress=" + cmpAddress + "]\n";
	}

}

class EmployeeBean {
	private int empid;
	private String empname;
	private int empsal;
	public EmployeeBean(int empid, String empname, int empsal) {
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}
	public int getEmpid() {
		return empid;
	}
	public String getEmpname() {
		return empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	@Override
	public String toString() {
		return "EmployeeBean [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + "]\n";
	}
}


