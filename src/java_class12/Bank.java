package java_class12;

public abstract class Bank {

	String name;
	String account;
	int totalAmount;
	
	public Bank() {
		System.out.println(" -- Bank constructor -- ");
	}
	
	public Bank(String name, String account, int totalAmount) {
		System.out.println(" -- ��������ִ� Bank constructor -- ");
		
		this.name = name;
		this.account = account;
		this.totalAmount = totalAmount;
	}
	
	// ����
	public void deposit() {
		System.out.println(" -- deposit() START --");
	}
	
	// ���
	public void withdraw() {
		System.out.println(" -- withdraw() START --");
	}
	
	// ����
	public void installmentSavings() {
		System.out.println(" -- installmentSavings() START --");
	}
	
	// �ؾ�
	public void cancellation() {
		System.out.println(" -- cancellation() START --");
	}
	
	// �������
	public void getInfo() {
		System.out.println("name : " + name);
		System.out.println("account : " + account);
		System.out.println("totalAmount : " + totalAmount);
	}
}
