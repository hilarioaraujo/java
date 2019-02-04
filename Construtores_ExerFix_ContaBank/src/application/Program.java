package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner (System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number=sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder=sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n): ");
		char isDeposit=sc.next().charAt(0);
		
		if(isDeposit=='y') {
			System.out.print("Enter initial deposit value: ");
			double deposit= sc.nextDouble();
			account = new Account(number, holder, deposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
			
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit=sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue=sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);

		sc.close();
	}

}
