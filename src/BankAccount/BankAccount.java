package BankAccount;

import java.util.Scanner;

public class BankAccount {

	private static AccountManager[] accountArray = new AccountManager[100];
	private static Scanner scan = new Scanner(System.in);
	private static boolean created = false;
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			
			System.out.println(" == ������°����ý��� ==");
			System.out.println(" ------------------ ");
			System.out.println(" 1. ���»����ϱ�");
			System.out.println(" 2. ���� ��� �� �ܾ׺���");
			System.out.println(" 3. �Ա��ϱ�");
			System.out.println(" 4. ����ϱ�");
			System.out.println(" 5. ������");
			System.out.println(" ------------------ ");
			System.out.print(" 1~5���� �ʿ��� �빫�� �ش��ϴ� ��ȣ�� �Է����ּ���.");
			int select_number = scan.nextInt();
			switch(select_number) {
			case 1 : createAccount(); break;
			case 2 : accountList(); break;
			case 3 : deposit(); break;
			case 4 : withdraw(); break;
			case 5 : run = false; break;
			
			}
		}
		System.out.println(" �̿����ּż� �����մϴ�. ");
	}
	
	private static void createAccount() {
		
		System.out.println(" == ���� �����ϱ� == ");
		
		System.out.print(" ���¹�ȣ : ");
		String account_number = scan.next();
		
		System.out.print(" ���� : ");
		String name = scan.next();
		
		System.out.print(" �ʱ� �Ա� �ݾ� : ");
		int amount = scan.nextInt();
		
		for (int i = 0; i < accountArray.length; i++) {
			
			if(accountArray[i] == null) {
				
				accountArray[i] = new AccountManager(account_number, name, amount);
				System.out.println(" ���°� �����Ǿ����ϴ�. ");
				
				created = true;
				break;
				
			}
			
		}
		
	}
	
	private static boolean registered() {
		
		return created;
		
	}
	
	private static void accountList() {
		
		if(!registered()) {
			
			System.out.println("���� ���µ���� �ϼ��� ");
			
			return;
			
		}
		
		System.out.println(" == ���� ��Ϻ��� == ");
		
		for (int i = 0; i < accountArray.length; i++) {
			
			if(accountArray[i] == null) {
				
				break;
				
			}
			System.out.println("���¹�ȣ : " + accountArray[i].getAccount_number());
			System.out.println("���� : " + accountArray[i].getName());
			System.out.println("�����ܾ� : " + accountArray[i].getBalance());
		}
	}
	
	private static AccountManager findAccount(String account_number) {
		
		for (int i = 0; i < accountArray.length; i++) {
			
			if(accountArray[i] == null) {
				
				break;
				
			}
			
			if(accountArray[i].getAccount_number().equals(account_number)) {
				
				return accountArray[i];
				
			}
		}
		
		return null;
		
	}
	
	private static void deposit() {
		
		if(!registered()) {
			
			System.out.println("���� ���µ���� �ϼ��� ");
			
			return;
			
		}
		
		System.out.println(" == �Ա��ϱ� == ");
		System.out.print("�Ա��Ͻ� ���¹�ȣ�� �Է��ϼ��� : ");
		String account_number = scan.next();
		System.out.print(" �Ա��Ͻ� �ݾ��� �Է��ϼ��� : ");
		int savemoney = scan.nextInt();
		
		if(findAccount(account_number) == null) {
			
			System.out.println("�Է��� ���¹�ȣ�� ã�� ���߽��ϴ�.");
			
		}else {
			
			findAccount(account_number).setBalance(findAccount(account_number).getBalance() + savemoney);
			System.out.println("��� : �Ա��� �Ϸ����ϴ�. ");
			
		}
				
	}
	
	private static void withdraw() {
		
		if(!registered()) {
			
			System.out.println("���� ���µ���� �ϼ��� ");
			return;
			
		}
		
		System.out.println(" == ����ϱ� == ");
		System.out.print("����Ͻ� ���¹�ȣ�� �Է��ϼ��� : ");
		String account_number = scan.next();
		System.out.print(" ����Ͻ� �ݾ��� �Է��ϼ��� : ");
		
		int spendmoney = scan.nextInt();
		
		if(findAccount(account_number) == null) {
			
			System.out.println("�Է��� ���¹�ȣ�� ã�� ���߽��ϴ�.");
			
		} else {
			
			if(spendmoney > findAccount(account_number).getBalance()) {
				
				System.out.println("�ܾ��� �����մϴ�. ");
				
			} else {
				
				findAccount(account_number).setBalance(findAccount(account_number).getBalance() - spendmoney);
				System.out.println("��� : ����� �Ϸ�Ǿ����ϴ�. ");
				
			}
		}
		
	}
	
}
