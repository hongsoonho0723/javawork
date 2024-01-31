package com.ws03.dto;

/**
 * 고객의 정보를 관리할 객체
 */
public class UserDto {

	UserDto() {};

	public UserDto(int userSeq, String name, String email, String phone, boolean isSleep) {
		super();
		this.userSeq = userSeq;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.isSleep = isSleep;
	}

	public int userSeq;
	public String name;
	public String email;
	public String phone;
	public boolean isSleep;

}
