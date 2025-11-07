package task.weak1;//Encapsulation TAsk2

class Student {
	 private String name;
	 private String rollNo;
	 private int marks;
	 public Student(String name, String rollNo, int marks) {
	     this.name = name;
	     this.rollNo = rollNo;
	     setMarks(marks); 
	 }
	 public String getName() {
	     return name;
	 }
	 public void setName(String name) {
	     this.name = name;
	 }
	
	 public String getRollNo() {
	     return rollNo;
	 }
	 public void setRollNo(String rollNo) {
	     this.rollNo = rollNo;
	 }
	
	 public int getMarks() {
	     return marks;
	 }
	
	 public void setMarks(int marks) {
	     if (marks < 0 || marks > 100) {
	         System.out.println("Invalid marks. Marks must be between 0 and 100.");
	         this.marks = 0; 
	     } else {
	         this.marks = marks;
	     }
 }
	 public String getGrade() {
	     if (marks >= 90) {
	         return "A";
	     } else if (marks >= 75) {
	         return "B";
	     } else if (marks >= 50) {
	         return "C";
	     } else {
	         return "Fail";
	     }
	 }
	 public void displayInfo() {
	     System.out.println("Student Name: " + name);
	     System.out.println("Roll Number: " + rollNo);
	     System.out.println("Marks: " + marks);
	     System.out.println("Grade: " + getGrade());
	 }
}

public class StudentResultManagement {
 public static void main(String[] args) {
	     Student student1 = new Student("Alice", "S001", 85);
	     student1.displayInfo(); 
	
	     System.out.println(); 
	     Student student2 = new Student("Bob", "S002", 110);
	     student2.displayInfo(); 
 	}
}
