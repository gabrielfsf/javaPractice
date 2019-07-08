package labs;

public class BankAccountApp {
	
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("424447388", 1000);
//		BankAccount acc2 = new BankAccount("606558366", 2000);
//		BankAccount acc3 = new BankAccount("203848577", 2500);
		
		acc1.setName("Jimmy Page");
		System.out.println(acc1.getName());
		acc1.deposit(500);
		acc1.deposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());

	}
	
}

class BankAccount implements InterestRate {
	// Properties of BankAccount
	private static int id = 1000;		// Internal ID
	private String accountNumber;   	// id + random 2-digit number + first 2 of ssn
	private static final String routingNumber = "0528461";
	private String name;
	private String ssn;
	private double balance;
	
	// Constructor
	public BankAccount(String ssn, double initDeposit) {
		this.ssn = ssn;
		this.balance = initDeposit;
		System.out.println("New Account Created");
		id++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * Math.pow(10, 2));
		accountNumber = id + "" + random + ssn.substring(0, 2);
		System.out.println("ACCOUNT NUMBER: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance -= amount;
		System.out.println("Thank you for your payment of " + amount);
		getBalance();
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Thank you for your deposit of " + amount);
		getBalance();
	}
	
	public void getBalance() {
		System.out.println("Your balance is " + balance);
	}

	@Override
	public void accrue() {
		balance += balance * (rate/100);
		getBalance();
	}
	
	@Override
	public String toString() {
		return "[ Name: " + name + " ]\n[ Account Number: " + accountNumber + " ]\n[ Routing Number: " + routingNumber + " ]\n[ Balance: " + balance + " ]"; 
	}
	
	
	
}
