package task.weak1;//Multilevel Inheritance TASK 2
class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


class Employee extends Person {
    int employeeId;
    double salary;
    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age);  
        this.salary = salary;
    }
}


class Doctor extends Employee {
    
    String specialization;
    public Doctor(String name, int age, int employeeId, double salary, String specialization) {
        super(name, age, employeeId, salary); 
        this.specialization = specialization;
    }
    public void displayInfo() {
        System.out.println("Doctor Info:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
        System.out.println("Specialization: " + specialization);
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. John Smith", 45, 101, 75000.50, "Cardiologist");
        doctor.displayInfo();
    }
}
