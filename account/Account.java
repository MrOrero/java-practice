package account;

public class Account {
	private String name;
	private double balance;
	
	public Account(String name, double balance) {
		this.name = name;
		if(balance > 0.0) {
			this.balance = balance;			
		}
	}
	
	public void deposit(double amount) {
		if(amount > 0.0) {
			balance = balance + amount;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
