package BankAccount;

public class AccountManager {

	private String account_number;
	private String name;
	private int balance;
	
	public AccountManager(String account_number, String name, int balance) {
		
		this.account_number = account_number;
		this.name = name;
		this.balance = balance;
		
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
