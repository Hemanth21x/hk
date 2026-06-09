package projects;
import java.util.Scanner;

class BankAccount {

	private double balance;

	public BankAccount(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		} else {
			this.balance = 0;
			System.out.println("Balance cannot be negative");
		}

	}

	public double getbalance() {
		return balance;
	}

	public void setbalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		} else {
			System.out.println("Balance cannot be negative.");
		}

	}

	public void withdrawal(double amount) {
		if (amount <= 0) {
			System.out.println("Withdrawal amount must be positive.");
		} else if (amount > balance) {
			System.out.println("Insufficient Balance.");
		} else {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		}
	}

	public void deposit(double amount) {

		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited : " + amount);
		} else {
			System.out.println("Deposit amount must be postive");
		}

	}

}

public class BankApplication {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  
		BankAccount account = new BankAccount(10000);
		
		System.out.print("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter Withdrawal Amount: ");
        double withdrawalAmount = sc.nextDouble();
        account.withdrawal(withdrawalAmount);
		
		

//		account.deposit(2000);
//
//		account.withdrawal(1000);
//
//		account.withdrawal(7000);
//
//		account.deposit(-500);

		System.out.println("The balance amount is " + account.getbalance());
     sc.close();
	}
}
