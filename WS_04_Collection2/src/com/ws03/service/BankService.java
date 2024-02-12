package com.ws03.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ws03.dto.AccountDto;
import com.ws03.dto.UserDto;

public interface BankService {
	
	public BankServiceImpl() {
			 
	}//생성자 끝
	
    /**
	  특정 사용자의 계좌 목록을 배열로 리턴 하는 메소드를 작성한다
	*/
	public List<AccountDto> getAccountList(int userSeq) { // 100 200  ... 
		
	
		
		
		return searchAccountDtoList;
	}
	
	
	/**
	   특정 사용자의 고객 정보를 리턴 하는 메소드를 작성한다
	   
	   @param : 고객의 sequence
	   @return : null이면 고객의정보없다 
	**/
	public UserDto getUserDetail(int userSeq) {
		for(UserDto userDto : userList) {
			if(userDto.userSeq == userSeq) {
				//찾았다.
				return userDto;
			}
		}
		
		return null;
	}

	public List<AccountDto> getAccountList() {
		return accountList;
	}

	public List<AccountDto> getAccountListSortByBalance() {
		List<AccountDto> sortByBalanceList= new ArrayList<AccountDto>(accountList);
		
		Collections.sort(sortByBalanceList);
		return sortByBalanceList;
	}

	public List<AccountDto> getAccountListSortByUserSeq() {
		
		List<AccountDto> sortByUserSeqList = new ArrayList<AccountDto>(accountList);
		
		Collections.sort(sortByUserSeqList,new Comparator<AccountDto>() {
			@Override
			public int compare(AccountDto o1,AccountDto o2) {
				return o2.userSeq - o1.userSeq;
			}
		}
		
				
				);
		
		
		return sortByUserSeqList;
		
	}

}











}
