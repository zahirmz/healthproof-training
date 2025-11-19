package exceptions;

public class AgeValidator {
    void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or older!");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();
        try {
            validator.validateAge(16); 
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
