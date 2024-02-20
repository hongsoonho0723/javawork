package com.ws03.service;
/**
 * 고객과 계좌에 관련된 서비스
 * (Business Logic 을 처리하는 객체)
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.exception.BalanceLackException;
import com.exception.UserAccountNotFoundException;
import com.ws03.dto.AccountDto;
import com.ws03.dto.InstallAccountDto;
import com.ws03.dto.LoanAccountDto;
import com.ws03.dto.SavingAccountDto;
import com.ws03.dto.UserDto;

public class BankServiceImpl implements BankService {
	
	List<UserDto>  userList;//null-> 주소값
	List<AccountDto> accountList ; //null
	
	/**
	 * 생성자에서 테스트를 위한 고객 및 계좌 객체를 생성하고 배열에 저장한다
	 * */
	public BankServiceImpl() {
         userList   = new ArrayList<UserDto>(); 
		 accountList = new ArrayList<AccountDto>(); 

		userList.add( new UserDto(111, "홍길동", "hong@gildong@com", "010-1111-1111", false) );
		userList.add( new UserDto(222, "이길동", "lee@gildong@com", "010-2222-2222", true) );
		userList.add( new UserDto(333, "삼길동", "sam@gildong@com", "010-3333-3333", false) );
		
		accountList.add( new InstallAccountDto(20, "00200202002002", 1000, 111, 12, 10000) );
		accountList.add( new SavingAccountDto(10, "00100101001001", 500, 111, 100) );
		
		accountList.add( new LoanAccountDto(60, "00600606006006", 500, 333, "House") );
		accountList.add( new LoanAccountDto(30, "00300303003003", 0, 111, "Building") );
		
		accountList.add( new SavingAccountDto(70, "00700707007007", 500, 333, 200) );
		
		accountList.add( new LoanAccountDto(50, "00500505005005", 200, 222, "Car") );
		accountList.add( new SavingAccountDto(40, "00400404004004", 1000, 222, 50) );
	}
	
	
    /**
	  특정 사용자의 계좌 목록을 배열로 리턴 하는 메소드를 작성한다
	*/
	public List<AccountDto> getAccountList(int userSeq) { // 100 200  ... 
		List<AccountDto> searchAccountDtoList = new ArrayList<AccountDto>();
		
		for(AccountDto acDto : accountList) {
			if( acDto.getUserSeq()  == userSeq) {
				searchAccountDtoList.add(acDto);
			}
		}
		
		return searchAccountDtoList;
	}
	
	/**
	   특정 사용자의 고객 정보를 리턴 하는 메소드를 작성한다
	   
	   @param : 고객의 sequence
	   @return : null이면 고객의정보없다 
	**/
	public UserDto getUserDetail(int userSeq) {
		for(UserDto userDto : userList) {
			if(userDto.getUserSeq() == userSeq) {
				//찾았다.
				return userDto;
			}
		}
		return null;
	}

	/**
	 * 신규로, 모든 계좌 목록을 리턴 하는 메소드를 작성한다.
	 * */
	public List<AccountDto> getAccountList() {
		return accountList;
	}

	/**
	 * 4) 신규로, 잔고 기준으로 정렬한 모든 계좌 목록을 리턴 하는 메소드를 작성한다.
       : Comparable Interface 를 이용한다.
          잔고가 같으면 accountSeq를 기준으로 정렬하자. 
	 * */
	public List<AccountDto> getAccountListSortByBalance() {
		List<AccountDto> sortByBalanceList = new ArrayList<AccountDto>(accountList);//복사
		
		//AccountDto에 Comparable 구현 필수
		Collections.sort(sortByBalanceList);
		
		return sortByBalanceList;
	}

	/**
	 * 5)  신규로, 사용자 일련번호 기준으로 정렬한 모든 계좌 목록을 리턴 하는 메소드를 작성한다. 
       : Comparator Interface 를 이용한다.
	 * */
	public List<AccountDto> getAccountListSortByUserSeq() {
		List<AccountDto> sortByUserSeqList = new ArrayList<AccountDto>(accountList);//복사
		Collections.sort(sortByUserSeqList, new Comparator<AccountDto>() {
			@Override
			public int compare(AccountDto o1, AccountDto o2) {
				return o1.getUserSeq() - o2.getUserSeq();//올림차순
				//return  o2.userSeq - o1.userSeq;//내림차순
			}
			
		}  );
		
		return sortByUserSeqList;
	}
	

//////////추가 메소드 /////////////////////////////
	@Override
	public AccountDto getUserAccount(int userSeq, int accountSeq) throws UserAccountNotFoundException {
		for (AccountDto account : accountList) {
			if (account.getUserSeq() == userSeq && account.getAccountSeq() == accountSeq) {
				return account;
			}
		}

		throw new UserAccountNotFoundException("사용자정보 또는 계좌정보를 다시 확인해주세요.");

	}
	
	

	@Override
	public int withdraw(int userSeq, int accountSeq, int amount)throws BalanceLackException, UserAccountNotFoundException {

		AccountDto dto = this.getUserAccount(userSeq, accountSeq);

		
        //출금하기전에 잔액이 출금 금액보다 많은지 확인한다.
		if (dto.getBalance() < amount) {
			throw new BalanceLackException("출금 금액보다 잔액이 부족합니다.^^");
		}

		dto.setBalance(dto.getBalance() - amount);

		return 1;
	}

}










