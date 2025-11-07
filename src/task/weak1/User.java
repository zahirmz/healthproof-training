//package task.weak1;
//
//public class User {
//	    String username;
//	    String password;
//	    String role;
//	    
//	   
//	    public User(String username, String password, String role) {
//	        this.username = username;
//	        this.password = password;
//	        this.role = role;
//	    }
//	    
//	    
//	    public void login() {
//	        System.out.println(role + " logged in.");
//	    }
//	    
//	    public static void main(String[] args) {
//	        Teacher teacher = new Teacher("Mr. Smith", "password123", "Mathematics");
//	        Student student = new Student("Alice", "student123", "Computer Science");
//	        Admin admin = new Admin("admin", "admin123");
//	        teacher.login();
//	        student.login();
//	        admin.login();
//	        admin.manageUsers();
//			
//		}
//
//}
//class Teacher extends User {
//   
//    String subject;
//
//    public Teacher(String username, String password, String subject) {
//        super(username, password, "Teacher"); 
//        this.subject = subject;
//    }
//
//    
//    public void login() {
//        System.out.println("\nTeacher " + username + " logged in. Subject: " + subject);
//    }
//}
//
//class Student extends User {
//
//    String course;
//
//    public Student(String username, String password, String course) {
//        super(username, password, "Student");  
//        this.course = course;
//    }
//
//
//    public void login() {
//        System.out.println("\nStudent " + username + " logged in. Course: " + course);
//    }
//}
//
//
//class Admin extends User {
// 
//	 public Admin(String username, String password) {
//	     super(username, password, "Admin");  
//	 }
//	
//	 public void manageUsers() {
//	     System.out.println("\nAdmin " + username + " is managing users.");
//	 }
//}
