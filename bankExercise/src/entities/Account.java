package entities;

public class Account {
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	private double tax = 5.00;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
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
	
	public void deposit(double balance) {
		this.accountBalance += balance;
	}
	
	public void withdraw(double balance) {
		this.accountBalance -= balance + tax;
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
