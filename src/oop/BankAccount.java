package oop;

public class BankAccount {
	// Define variables
	protected String accountNumber;
	// Static: belongs to the CLASS not the object instance
	// final: constant (often static final)
	private static final String ROUTINGNUMBER = "37503";
	private String accountType;
	protected String name;
	private String ssn;
	protected double balance = 0;
	
	// Constructor to define, setup and initialize objects and properties
	// IMPLICITLY called upon INSTANTIATION
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	// Overloading: call same method name with different parameters
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	BankAccount(String accountType, double initialDeposit) {
		// accountType, initialDeposit and msg are local variables (belongs to its block)
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT: $" + initialDeposit);
		String msg = null;
		if (initialDeposit < 1000) {
			msg = "ERROR: Minimum deposit must be at least $1,000";
		} else {
			msg = "Thank you for the initial deposit of: $" + initialDeposit;
		}
		System.out.println(msg);
		balance = balance + initialDeposit;
	}
	// Getters/Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public static String getRoutingnumber() {
		return ROUTINGNUMBER;
	}
	public String getAccountType() {
		return accountType;
	}
	public String getSsn() {
		return ssn;
	}
	public double getBalance() {
		return balance;
	}
	
	// Define methods
	public void deposit(double amount) {
		balance += amount;
	}
	
	void withdraw(double amount) {
		balance -= amount;
	}
	
	void checkBalance() {
		System.out.println("BALANCE: $" + balance);
	}

	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ " + name + ". " + accountNumber + ". BALANCE: $" + balance + " ]";
	}
}
