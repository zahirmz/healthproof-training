package exceptions;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); 
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!"); 
        } catch (Exception e) {
            System.out.println("Some other error occurred");
        }
    }
}
