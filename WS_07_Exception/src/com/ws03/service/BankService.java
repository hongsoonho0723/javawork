package com.ws03.service;

import java.util.List;

import com.exception.BalanceLackException;
import com.exception.UserAccountNotFoundException;
import com.ws03.dto.AccountDto;
import com.ws03.dto.UserDto;

public interface BankService {
	/**
	  특정 사용자의 계좌 목록을 배열로 리턴 하는 메소드를 작성한다
	*/
	 List<AccountDto> getAccountList(int userSeq);
	 
	 
	/**
	   특정 사용자의 고객 정보를 리턴 하는 메소드를 작성한다
	   
	   @param : 고객의 sequence
	   @return : null이면 고객의정보없다 
	**/
	 UserDto getUserDetail(int userSeq) ;
	 

	/**
	 * 신규로, 모든 계좌 목록을 리턴 하는 메소드를 작성한다.
	 * */
	 List<AccountDto> getAccountList() ;
	 

	/**
	 * 4) 신규로, 잔고 기준으로 정렬한 모든 계좌 목록을 리턴 하는 메소드를 작성한다.
     : Comparable Interface 를 이용한다.
        잔고가 같으면 accountSeq를 기준으로 정렬하자. 
	 * */
	 List<AccountDto> getAccountListSortByBalance() ;
	 

	/**
	 * 5)  신규로, 사용자 일련번호 기준으로 정렬한 모든 계좌 목록을 리턴 하는 메소드를 작성한다. 
     : Comparator Interface 를 이용한다.
	 * */
	 List<AccountDto> getAccountListSortByUserSeq() ;
	 
 /////////추가된 메소드////////////////////////////////////////////////////
	 
	 /**
	  * 고객의 일련번호와 계좌 일련번호를 입력받아 계좌 정보를 리턴 한다. 
	  * 이 때, 일치하는 계좌가 없을 경우 UserAccoutNotFoundException 을 
	  * 발생시키고 이 요청을 수행하는 코드에서 처리한다.
	  * */
	 
	 AccountDto getUserAccount(int userSeq, int accountSeq) 
			 throws UserAccountNotFoundException;  
	 /**
	  * 고객의 일련번호, 계좌 일련번호, 그리고 출금금액을 입력받아 출금 처리한다.
	  *  이 때, 잔액이 부족할 경우, BalanceLackException 을 발생시키고, 
	  * 이 요청을 수행하는 코드에서 처리한다.
	  * */
	 int withdraw(int userSeq, int accountSeq, int amount) 
			 throws BalanceLackException, UserAccountNotFoundException;
	
}
