package task.weak1;

import java.util.*;//Collection Task 1

public class StudentReportCardSystem {

    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);
        studentMarks.put("David", 88);
        studentMarks.put("Eve", 95);
        System.out.println("Student Report Card:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " marks");
        }
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(studentMarks.entrySet());
        sortedList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        System.out.println("\nSorted by Marks (Descending Order):");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " marks");
        }
        System.out.println("\nTopper: " + sortedList.get(0).getKey() + " with " + sortedList.get(0).getValue() + " marks");

        int totalMarks = 0;
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            totalMarks += entry.getValue();
        }
        double averageMarks = totalMarks / (double) studentMarks.size();
        System.out.println("Average Marks: " + averageMarks);
    }
}
