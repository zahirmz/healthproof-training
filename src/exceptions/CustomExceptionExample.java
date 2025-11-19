package exceptions;

class NegativeBalanceException extends Exception {
    public NegativeBalanceException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    void withdraw(int balance, int amount) throws NegativeBalanceException {
        if (balance - amount < 0) {
            throw new NegativeBalanceException("Insufficient balance!");
        }
        System.out.println("Withdrawal successful.");
    }

    public static void main(String[] args) {
        CustomExceptionExample bank = new CustomExceptionExample();
        try {
            bank.withdraw(100, 150); // Trying to withdraw more than available balance
        } catch (NegativeBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
