//package Exception;
//
//import java.util.Scanner;
//
//public class Bank {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int balance = 25000;  
//        int withdraw;
//
//        System.out.println("Enter the amount to withdraw:");
//
//        try {
//            withdraw = sc.nextInt();
//
//            e
//            if (withdraw > balance) {
//                throw new InsufficientBalance("Insufficient balance! Your balance is: " + balance);
//            }
//
//    
//            if (withdraw < 0) {
//                throw new InvalidInput("Invalid input! Withdrawal amount cannot be negative.");
//            }
//
//            balance -= withdraw;
//            System.out.println("Withdrawal successful! New balance: " + balance);
//
//        } catch (InsufficientBalance e) {
//            System.out.println(e.getMessage());
//        } catch (InvalidInput e) {
//            System.out.println(e.getMessage()); 
//        } catch (Exception e) {
//            System.out.println("An unexpected error occurred: " + e.getMessage());
//        } finally {
//            sc.close(); z
//        }
//    }
//}

