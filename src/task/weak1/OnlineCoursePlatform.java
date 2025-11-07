package task.weak1;
//Interface Task3

interface CourseFeatures {
	 void startCourse();
	 void completeCourse();
}

abstract class OnlineCourse implements CourseFeatures {
	 String title;
	 String instructor;
	
	 public OnlineCourse(String title, String instructor) {
	     this.title = title;
	     this.instructor = instructor;
	 }
	
	 public void courseInfo() {
	     System.out.println("Course Title: " + title);
	     System.out.println("Instructor: " + instructor);
	 }
	 public abstract void courseDuration();
}

class PythonCourse extends OnlineCourse {
	
	 public PythonCourse(String title, String instructor) {
	     super(title, instructor);
	 }
	
	 @Override
	 public void startCourse() {
	     System.out.println("Starting Python course...");
	 }
	
	 @Override
	 public void completeCourse() {
	     System.out.println("Completing Python course...");
	 }
	
	 @Override
	 public void courseDuration() {
	     System.out.println("Duration of Python course: 6 weeks");
	 }
}

class JavaCourse extends OnlineCourse {
	
	 public JavaCourse(String title, String instructor) {
	     super(title, instructor);
	 }
	
	
	 @Override
	 public void startCourse() {
	     System.out.println("Starting Java course...");
	 }
	
	
	 @Override
	 public void completeCourse() {
	     System.out.println("Completing Java course...");
	 }
	
	 @Override
	 public void courseDuration() {
	     System.out.println("Duration of Java course: 8 weeks");
	 }
}

public class OnlineCoursePlatform {
	 public static void main(String[] args) {
	     OnlineCourse pythonCourse = new PythonCourse("Learn Python", "John Doe");
	     pythonCourse.courseInfo();  
	     pythonCourse.startCourse(); 
	     pythonCourse.courseDuration();
	     pythonCourse.completeCourse(); 	
	     System.out.println(); 
	
	     OnlineCourse javaCourse = new JavaCourse("Master Java", "Jane Smith");
	     javaCourse.courseInfo(); 
	     javaCourse.startCourse();
	     javaCourse.courseDuration(); 
	     javaCourse.completeCourse();
 }
}
