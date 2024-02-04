package chapter6;

import java.util.Scanner;

class Account {
    private String accountNumber;
    private String accountHolder;
    private int balance;

    public Account(String accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + balance + "원");
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다. 현재 잔액: " + balance + "원");
        }
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[100];
        int accountCount = 0;

        while (true) {
        	System.out.println("-----------------------------------------------------------");
            System.out.println("1. 계좌 생성 | 2.계좌목록 | 3. 입금 | 4. 출금 | 5. 종료");
            System.out.println("-----------------------------------------------------------");
            System.out.print("메뉴를 선택하세요: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("계좌번호 입력: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("계좌주 입력: ");
                    String accountHolder = scanner.nextLine();
                    System.out.print("초기 입금액 입력: ");
                    int initialBalance = scanner.nextInt();

                    Account newAccount = new Account(accountNumber, accountHolder, initialBalance);
                    accounts[accountCount++] = newAccount;
                    System.out.println("결과 : 계좌가 생성되었습니다.");
                    break;
                case 2:
                	System.out.println("-------------------------------");
                	System.out.println("계좌목록");
                	System.out.println("-------------------------------");
                	
                	for(int i =0; i<accounts.length; i++) {
                		if(accounts[i]!=null) {
                		System.out.println(accounts[i].getAccountNumber()+"\t"+accounts[i].getAccountHolder()+"\t"+accounts[i].getBalance());
                		
                		}
                	}break;
                case 3:
                    System.out.print("입금할 계좌번호 입력: ");
                    String depositAccountNumber = scanner.nextLine();
                    System.out.print("입금할 금액 입력: ");
                    int depositAmount = scanner.nextInt();
                    for (int i = 0; i < accountCount; i++) {
                        if (accounts[i].getAccountNumber().equals(depositAccountNumber)) {
                            accounts[i].deposit(depositAmount);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("출금할 계좌번호 입력: ");
                    String withdrawAccountNumber = scanner.nextLine();
                    System.out.print("출금할 금액 입력: ");
                    int withdrawAmount = scanner.nextInt();
                    for (int i = 0; i < accountCount; i++) {
                        if (accounts[i].getAccountNumber().equals(withdrawAccountNumber)) {
                            accounts[i].withdraw(withdrawAmount);
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }
}
