package task.weak1;//overloading task


class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public void printResult(int a, double b) {
        System.out.println("Result (int and double): " + (a + b));
    }

    public void printResult(double a, int b) {
        System.out.println("Result (double and int): " + (a + b));
    }
}

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Sum of 5 and 10 (int): " + calculator.add(5, 10));
        System.out.println("Sum of 5, 10, and 15 (int): " + calculator.add(5, 10, 15));
        System.out.println("Sum of 5.5 and 10.5 (double): " + calculator.add(5.5, 10.5));
        System.out.println("Concatenation of 'Hello' and ' World': " + calculator.add("Hello", " World"));

        System.out.println("Difference between 10 and 5 (int): " + calculator.subtract(10, 5));
        System.out.println("Difference between 10.5 and 5.2 (double): " + calculator.subtract(10.5, 5.2));

        System.out.println("Multiplication of 5 and 10 (int): " + calculator.multiply(5, 10));
        System.out.println("Multiplication of 5.5 and 10.5 (double): " + calculator.multiply(5.5, 10.5));

        System.out.println("Division of 10 by 5 (int): " + calculator.divide(10, 5));
        System.out.println("Division of 10.5 by 2.5 (double): " + calculator.divide(10.5, 2.5));

        calculator.printResult(5, 10.5);
        calculator.printResult(5.5, 10);
    }
}
