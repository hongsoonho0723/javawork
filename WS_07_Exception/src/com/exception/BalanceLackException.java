package com.exception;

/**
 * 출금할때 잔액이 출금금액보다 적으면 발생할 예외 객체
 * */
public class BalanceLackException extends Exception {
	public BalanceLackException() {
		super("잔액부족입니다.");
	}
	public BalanceLackException(String message) {
		super(message);
	}

}
