package com.ws03.dto;

/**
 * 고객의 계좌정보 관리하는 객체
 */
public class AccountDto {

	AccountDto() {
	};

	public AccountDto(int accountSeq, String accountNumber, int balance, int userSeq) {
		super();
		this.accountSeq = accountSeq;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.userSeq = userSeq;
	}

	public int accountSeq;
	public String accountNumber;
	public int balance;
	public int userSeq;

}
