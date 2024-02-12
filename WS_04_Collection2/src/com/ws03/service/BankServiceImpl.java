package com.ws03.service;
/**
 * 고객과 계좌에 관련된 서비스
 * (Business Logic 을 처리하는 객체)
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ws03.dto.AccountDto;
import com.ws03.dto.UserDto;

public class BankServiceImpl {
	//final은 고정값= 값변경불가 (반드시 초기화 필수)

	List<UserDto> userList;//null-> 주소값
	List<AccountDto> accountList ; //null
	
	/**
	 * 생성자에서 테스트를 위한 고객 및 계좌 객체를 생성하고 배열에 저장한다
	 * */
	public BankServiceImpl() {
		//배열 생성
		 userList = new ArrayList <UserDto>(); //5
		 accountList = new ArrayList <AccountDto>(); //10
		
		// 각 배열방에 고객과 계좌를 생성한다.
		 //고객 4명
		 userList.add(new UserDto(100, "장희정", "8253jang@daum.net", "010-8875-8253", false));
		 userList.add(new UserDto(200, "이효리", "lee@daum.net", "010-2222-3333", false));
		 userList.add(new UserDto(300, "송중기", "song@naver.com", "010-5554-2222", false));
		 userList.add(new UserDto(400, "삼순이", "sam@daum.com", "010-2222-2222", false));
		 
		 
		 //계좌는 6개 정도
		 accountList.add(new AccountDto(1, "1111-11111", 1000000, 100));
		 accountList.add(new AccountDto(2, "2222-22222", 250000, 100));
		 accountList.add(new AccountDto(3, "3333-33333", 350000, 100));
		 
		 accountList.add(new AccountDto(4, "4444-44444", 150000, 200));
		 accountList.add(new AccountDto(5, "5555-55555", 250000, 200));
		 
		 accountList.add(new AccountDto(6, "6666-66666", 350000, 300));
		 
		 System.out.println("---세팅완료!!----");
		 
		 
		 
	}//생성자 끝
	
    /**
	  특정 사용자의 계좌 목록을 배열로 리턴 하는 메소드를 작성한다
	*/
	public List<AccountDto> getAccountList(int userSeq) { // 100 200  ... 
		
		List<AccountDto> searchAccountDtoList = new ArrayList<AccountDto>();
		
		for(AccountDto acDto: accountList) {
			if( acDto.userSeq  == userSeq) {
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










