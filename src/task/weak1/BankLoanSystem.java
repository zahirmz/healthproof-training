package task.weak1;//Encapsulation TASK3
class LoanAccount {

	 private String customerName;
	 private double loanAmount;
	 private double interestRate;
	 public LoanAccount(String customerName, double loanAmount, double interestRate) {
	     this.customerName = customerName;
	     setLoanAmount(loanAmount);  
	     setInterestRate(interestRate);  
	 }
	 public String getCustomerName() {
	     return customerName;
	 }
	
	 public void setCustomerName(String customerName) {
	     this.customerName = customerName;
	 }
	 public double getLoanAmount() {
	     return loanAmount;
	 }
	
	 public void setLoanAmount(double loanAmount) {
	     if (loanAmount <= 0) {
	         System.out.println("Loan Amount must be greater than 0. Setting loan amount to 0.");
	         this.loanAmount = 0;
	     } else {
	         this.loanAmount = loanAmount;
	     }
	 }
	 public double getInterestRate() {
	     return interestRate;
	 }
	 public void setInterestRate(double interestRate) {
	     if (interestRate < 5 || interestRate > 15) {
	         System.out.println("Interest Rate must be between 5% and 15%. Setting interest rate to 0.");
	         this.interestRate = 0;
	     } else {
	         this.interestRate = interestRate;
	     }
	 }
	 public void calculateTotalRepay() {
	     if (loanAmount > 0 && interestRate > 0) {
	         double total = loanAmount + (loanAmount * interestRate / 100);
	         System.out.println("Customer Name: " + customerName);
	         System.out.println("Loan Amount: ₹" + loanAmount);
	         System.out.println("Interest Rate: " + interestRate + "%");
	         System.out.println("Total Repayment Amount: ₹" + total);
	     } else {
	         System.out.println("Unable to calculate repayment — invalid loan details.");
	     }
	 }
}

public class BankLoanSystem {
 public static void main(String[] args) {
     
     LoanAccount loan1 = new LoanAccount("Alice", 50000, 10);
     loan1.calculateTotalRepay();
     System.out.println();
     LoanAccount loan2 = new LoanAccount("Bob", -20000, 20);
     loan2.calculateTotalRepay();
 }
}
