package BankAccount;

import java.util.Scanner;

public class BankAccount {

	private static AccountManager[] accountArray = new AccountManager[100];
	private static Scanner scan = new Scanner(System.in);
	private static boolean created = false;
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			
			System.out.println(" == 은행계좌관리시스템 ==");
			System.out.println(" ------------------ ");
			System.out.println(" 1. 계좌생성하기");
			System.out.println(" 2. 계좌 목록 및 잔액보기");
			System.out.println(" 3. 입금하기");
			System.out.println(" 4. 출금하기");
			System.out.println(" 5. 나가기");
			System.out.println(" ------------------ ");
			System.out.print(" 1~5번중 필요한 용무에 해당하는 번호를 입력해주세요.");
			int select_number = scan.nextInt();
			switch(select_number) {
			case 1 : createAccount(); break;
			case 2 : accountList(); break;
			case 3 : deposit(); break;
			case 4 : withdraw(); break;
			case 5 : run = false; break;
			
			}
		}
		System.out.println(" 이용해주셔서 감사합니다. ");
	}
	
	private static void createAccount() {
		
		System.out.println(" == 계좌 생성하기 == ");
		
		System.out.print(" 계좌번호 : ");
		String account_number = scan.next();
		
		System.out.print(" 성함 : ");
		String name = scan.next();
		
		System.out.print(" 초기 입금 금액 : ");
		int amount = scan.nextInt();
		
		for (int i = 0; i < accountArray.length; i++) {
			
			if(accountArray[i] == null) {
				
				accountArray[i] = new AccountManager(account_number, name, amount);
				System.out.println(" 계좌가 생성되었습니다. ");
				
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
			
			System.out.println("먼저 계좌등록을 하세요 ");
			
			return;
			
		}
		
		System.out.println(" == 계좌 목록보기 == ");
		
		for (int i = 0; i < accountArray.length; i++) {
			
			if(accountArray[i] == null) {
				
				break;
				
			}
			System.out.println("계좌번호 : " + accountArray[i].getAccount_number());
			System.out.println("성함 : " + accountArray[i].getName());
			System.out.println("현재잔액 : " + accountArray[i].getBalance());
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
			
			System.out.println("먼저 계좌등록을 하세요 ");
			
			return;
			
		}
		
		System.out.println(" == 입금하기 == ");
		System.out.print("입금하실 계좌번호를 입력하세요 : ");
		String account_number = scan.next();
		System.out.print(" 입금하실 금액을 입력하세요 : ");
		int savemoney = scan.nextInt();
		
		if(findAccount(account_number) == null) {
			
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
			
		}else {
			
			findAccount(account_number).setBalance(findAccount(account_number).getBalance() + savemoney);
			System.out.println("결과 : 입금이 완료됬습니다. ");
			
		}
				
	}
	
	private static void withdraw() {
		
		if(!registered()) {
			
			System.out.println("먼저 계좌등록을 하세요 ");
			return;
			
		}
		
		System.out.println(" == 출금하기 == ");
		System.out.print("출금하실 계좌번호를 입력하세요 : ");
		String account_number = scan.next();
		System.out.print(" 출금하실 금액을 입력하세요 : ");
		
		int spendmoney = scan.nextInt();
		
		if(findAccount(account_number) == null) {
			
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
			
		} else {
			
			if(spendmoney > findAccount(account_number).getBalance()) {
				
				System.out.println("잔액이 부족합니다. ");
				
			} else {
				
				findAccount(account_number).setBalance(findAccount(account_number).getBalance() - spendmoney);
				System.out.println("결과 : 출금이 완료되었습니다. ");
				
			}
		}
		
	}
	
}
