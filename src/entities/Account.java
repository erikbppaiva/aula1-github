package entities;

public class Account { // conta

	private int number;
	private String holder;// titular
	private double balance;// saldo

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) { // deposito inicial
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) { // deposito
		balance += amount;
	}

	public void withdraw(double amount) { // saque
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account data: "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ balance;
		
	}
}
