package com.ws03.dto;

// WS_04 대비
// 새로운 클래스, extends AccountDto, period, amount , setter & getter toString, , private
public class InstallAccountDto extends AccountDto{
	private int period;
	private int amount;
	
	public InstallAccountDto(){}
	public InstallAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, int period, int amount){
		super(accountSeq, accountNumber, balance, userSeq);
		this.period = period;
		this.amount = amount;
	}
	
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.getClass().getSimpleName());
		builder.append(super.toString());
		builder.append(", period=");
		builder.append(period);
		builder.append(", amount=");
		builder.append(amount);
		builder.append("]");
		
		return builder.toString();
	}
	
	

}
