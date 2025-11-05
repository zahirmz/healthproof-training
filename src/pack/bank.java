package pack;

public class bank {
	int amount=2000;
	void balance() {
		System.out.println("account balance="+amount);
	}
	void withdraw(int amount)
	{
		if (amount>this.amount)
		{
			System.out.println("insufficient balance");
		}
		else{
			this.amount=this.amount-amount;
		}
		
	}
	void deposit(int amount)
	{
		this.amount=this.amount+amount;
	}
	public static void main(String[] args) {
		bank b1=new bank();
		b1.balance();
		b1.withdraw(5000);
		b1.balance();
		b1.deposit(10000);
		b1.balance();
	}

}
