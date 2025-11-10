package task.weak1;
import java.util.ArrayList;
import java.util.HashMap;//collection
import java.util.Map;

public class StudentMarksManagement {
    
   
    private static ArrayList<String> studentNames = new ArrayList<>();

    private static HashMap<String, Integer> studentMarks = new HashMap<>();
    
    public static void addStudent(String name, int marks) {
        studentNames.add(name);
        studentMarks.put(name, marks);
    }
    public static void displayStudents() {
        System.out.println("Student Marks List:");
        for (String name : studentNames) {
            System.out.println("Name: " + name + ", Marks: " + studentMarks.get(name));
        }
    }
    
    public static void findTopScorer() {
        String topStudent = "";
        int highestMarks = -1;
        
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            if (entry.getValue() > highestMarks) {
                highestMarks = entry.getValue();
                topStudent = entry.getKey();
            }
        }
        System.out.println("Top Scorer: " + topStudent + " with " + highestMarks + " marks.");
    }
    
    public static void removeStudent(String name) {
        if (studentNames.contains(name)) {
            studentNames.remove(name);
            studentMarks.remove(name);
            System.out.println(name + " has been removed from the list.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }
    
    public static void main(String[] args) {
        addStudent("Alice", 85);
        addStudent("Bob", 92);
        addStudent("Charlie", 78);
        displayStudents(); 
        findTopScorer();
        removeStudent("Bob");
        displayStudents();
    }
}
