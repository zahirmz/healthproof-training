package collection;

import java.util.ArrayList;//PROGRAM WITHOUT SETTERS ONLY CONSTRUCTORES AND GETTERS


public class Employees {
    private int Empid;
    private String Empname;
    private int Empsal;

    // Constructor
    public Employees(int Empid, String Empname, int Empsal) {
        this.Empid = Empid;
        this.Empname = Empname;
        this.Empsal = Empsal;
    }

    // Getters
    public int getEmpid() {
        return Empid;
    }

    public String getEmpname() {
        return Empname;
    }

    public int getEmpsal() {
        return Empsal;
    }

    public static void main(String[] args) {
        // Initialize ArrayList of Employee objects
        ArrayList<Employee> al = new ArrayList<Employee>();

        // Add Employee objects to the ArrayList
        al.add(new Employee(101, "Karthik", 55000));
        al.add(new Employee(102, "Surya", 60000));
        al.add(new Employee(103, "Vijay", 70000));

        // Iterate and print Employee details
        for (Employee e : al) {
            System.out.println(e.getEmpid() + " " + e.getEmpname() + " " + e.getEmpsal());
        }
    }
}

