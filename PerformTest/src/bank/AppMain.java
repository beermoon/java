package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMain {
	private static Scanner scanner = new Scanner(System.in);
	private static List<Account> accounts = new ArrayList<>();
		
	
	
	public static void main(String[] args) {
		
		boolean isRunning = true;
		while(isRunning) {
			System.out.println("-------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------");
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				isRunning = false;
			}
			System.out.println("프로그램 종료");
		}
		
	}	
		
		
	// 계좌생성
		private static void createAccount() {
			 
		        System.out.println("----------계좌 생성----------");
		        
		        
		        System.out.println("계좌번호 : ");
		        String ano = scanner.nextLine();
		        
		        System.out.println("계좌주 :");
		        String  owner = scanner.nextLine();
		        
		        System.out.println("초기입금액 : ");
		        int balance;
		        
		        // NumberFormatException 예외처리
		        try {
		        	balance = Integer.parseInt(scanner.nextLine());		// 숫자확인
		        } catch (NumberFormatException e) {
		        	System.out.println("초기입금액은 숫자여야 합니다");
		        	return;
		        }
		        
		        
		        Account newAccount  = new Account (ano,owner,balance);
		        accounts.add(newAccount);
		        
		        System.out.println("결과 : 계좌가 생성되었습니다");
		}
		
		// 계좌목록
		private static void accountList() {
	        System.out.println("----------");
	        System.out.println("계좌 목록");
	        System.out.println("----------");
	        for (Account account : accounts) {
	            System.out.print( account.getAno());
	            System.out.print(" ");
	            System.out.print( account.getOwner());
	            System.out.print(" ");
	            System.out.print(account.getBalance());
	            System.out.println(" ");
	            		
	        }
	    }
		
		// 예금
		private static void deposit() {
			System.out.println("---------- 예금 ----------");
			
			System.out.print("계좌번호 : ");
			String ano = scanner.nextLine();
			
	        System.out.println("예금액 :");
	        int amount; 
	        
	        // NumberFormatException 예외처리
	        try {
	        	amount = Integer.parseInt(scanner.nextLine());		// 숫자확인
	        } catch (NumberFormatException e) {
	        	System.out.println("출금액은 숫자여야 합니다");
	        	return;
	        }
	        
	        Account account = findAccount(ano);
	        if (account != null) {
	            account.setBalance(account.getBalance() + amount);
	            System.out.println("결과: 예금이 성공되었습니다.");
	        } else {
	            System.out.println("결과: 계좌를 찾을 수 없습니다.");
	        }
	    
		}
		
		
		
		private static void withdraw() {
			System.out.println("---------- 출금 ----------");
			
			System.out.print("계좌번호 : ");
			String ano = scanner.nextLine();
			
			System.out.print("출금액 : ");
			
			int amount;
			
			try {
	            amount = Integer.parseInt(scanner.nextLine());
	        } catch (NumberFormatException e) {
	            System.out.println("출금액은 숫자여야 합니다.");
	            return;
	        }
			
			
			 Account account = findAccount(ano);
		        if (account != null) {
		            if (account.getBalance() >= amount) {
		                account.setBalance(account.getBalance() - amount);
		                System.out.println("결과: 출금이 성공되었습니다.");
		            } else {
		                System.out.println("결과: 잔액이 부족합니다.");
		            }
		        } else {
		            System.out.println("결과: 계좌를 찾을 수 없습니다.");
		        }

		}
		
		private static Account findAccount(String ano) {
			for (Account account : accounts) {
	            if (account.getAno().equals(ano)) {
	                return account;
	            }
	        }
	        return null;
		}
	}

