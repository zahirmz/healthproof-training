package com.filehandling;
import java.io.*;

public class Student {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Create a new StudentBean object
        StudentBean eb = new StudentBean(101, "Rahul", 22);
        
        // Serialize the object to a file
        FileOutputStream fos = new FileOutputStream("D:\\USTGlobal\\D.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(eb);
        oos.close();  // Close the ObjectOutputStream
        
        // Deserialize the object from the file
        FileInputStream fis = new FileInputStream("D:\\USTGlobal\\D.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        StudentBean eb1 = (StudentBean) ois.readObject();
        ois.close();  // Close the ObjectInputStream
        
        // Display the deserialized object
        System.out.println("Student ID: " + eb1.getId());
        System.out.println("Student Name: " + eb1.getName());
        System.out.println("Student Age: " + eb1.getAge());
    }
}
