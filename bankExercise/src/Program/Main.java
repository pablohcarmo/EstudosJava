package Program;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int accountNumber;
		String accountHolder;
		double balance;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account = new Account();
		
		System.out.print("Enter account number: ");
		accountNumber = sc.nextInt();
		account.setAccountNumber(accountNumber);
		
		System.out.print("Enter account holder: ");
		accountHolder = sc.next();
		account.setAccountHolder(accountHolder);
		
		sc.next();
		System.out.print("Is there an initial deposit (y/n)? ");
		char confirm = sc.next().charAt(0);
		
		while(confirm != 'y' && confirm != 'Y' && confirm != 'n' && confirm != 'N') {	
			System.out.print("Invalid key\nIs there an initial deposit (y/s) ?");
			confirm = sc.next().charAt(0);
		}
		if (confirm == 'y' || confirm == 'Y') {
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();
			account.deposit(balance);
			System.out.print("Account data:\n" + account.toString());
		} else if (confirm == 'n' || confirm == 'N'){
			System.out.print("Account data:\n" + account.toString());
		}
		System.out.print("\n\nEnter a deposit value: ");
		balance = sc.nextDouble();
		account.deposit(balance);
		System.out.print("Updated account data:\n" + account.toString());
		
		System.out.print("\n\nEnter a withdraw value: ");
		
		sc.close();
	}
}