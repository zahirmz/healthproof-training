package exceptions;
import java.io.*;

public class FinallyExample {
    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader("example.txt"); 
            System.out.println("File opened successfully");
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        } finally {
            if (file != null) {
                try {
                    file.close(); 
                    System.out.println("File closed");
                } catch (IOException e) {
                    System.out.println("Error while closing the file");
                }
            } else {
                System.out.println("No file opened to close");
            }
        }
    }
}

