package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		// Creating a new bank account "instantiating a new object
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "01274288";
		acc1.name = "Roger Hue";
		acc1.balance = 10000;
		System.out.println(acc1.toString());
		
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "36458292";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.checkBalance();
		
		
	}

}
