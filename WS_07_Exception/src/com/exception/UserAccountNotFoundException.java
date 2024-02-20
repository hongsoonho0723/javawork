package com.exception;

/**
 * 사용자 or 계좌정보가 없을때 발생하는 예외객체 
 * */
public class UserAccountNotFoundException extends Exception {//예외처리필수
//public class UserAccountNotFoundException extends RuntimeException {//비체크예외
   public UserAccountNotFoundException() {
	   super("사용자 또는 계좌정보를 찾을수 없습니다.");
   }
   public UserAccountNotFoundException(String message) {
	   super(message);
   }

}
