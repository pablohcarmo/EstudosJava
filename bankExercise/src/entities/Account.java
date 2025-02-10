package entities;

public class Account {
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	private double tax = 5.00;
	
	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}

	public Account(int accountNumber, String accountHolder) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void deposit(double amount) {
		this.accountBalance += amount;
	}
	
	public void withdraw(double amount) {
		this.accountBalance -= amount + tax;
	}

	public String toString() {
		return "Account "
				+ getAccountNumber()
				+ ", Holder: "
				+ getAccountHolder()
				+ ", Balance: $ "
				+ String.format("%.2f", getAccountBalance());
	}
}
