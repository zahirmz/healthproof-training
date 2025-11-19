package exceptions;

import java.io.*;

public class ThrowsExample {

    void readFile() throws IOException {
        FileReader file = new FileReader("nonexistent.txt"); 
        System.out.println("File opened successfully");
    }

    public static void main(String[] args) {
        ThrowsExample example = new ThrowsExample();
        try {
            example.readFile(); 
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
