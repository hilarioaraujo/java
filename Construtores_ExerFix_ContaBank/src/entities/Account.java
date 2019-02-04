package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;

	public int getNumber() {
		return number;
	}


	public String getHolder() {
		return holder;
	}

	public void setHolder(String name) {
		this.holder = name;
	}

	public double getBalance() {
		return balance;
	}

	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.holder = name;
		deposit(initialDeposit);
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}

	public void withdraw(double amount) {
		balance-=amount+5.0;
	}
	
	public String toString() {
		return "Account " + number + ", " + holder + ", Balance: " + String.format("%.2f",balance)+"€" ;
	}
}
