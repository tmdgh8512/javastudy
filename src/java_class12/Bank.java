package java_class12;

public abstract class Bank {

	String name;
	String account;
	int totalAmount;
	
	public Bank() {
		System.out.println(" -- Bank constructor -- ");
	}
	
	public Bank(String name, String account, int totalAmount) {
		System.out.println(" -- 멤버변수있는 Bank constructor -- ");
		
		this.name = name;
		this.account = account;
		this.totalAmount = totalAmount;
	}
	
	// 예금
	public void deposit() {
		System.out.println(" -- deposit() START --");
	}
	
	// 출금
	public void withdraw() {
		System.out.println(" -- withdraw() START --");
	}
	
	// 적금
	public void installmentSavings() {
		System.out.println(" -- installmentSavings() START --");
	}
	
	// 해약
	public void cancellation() {
		System.out.println(" -- cancellation() START --");
	}
	
	// 정보출력
	public void getInfo() {
		System.out.println("name : " + name);
		System.out.println("account : " + account);
		System.out.println("totalAmount : " + totalAmount);
	}
}
