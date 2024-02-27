package db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.util.DbManager;

public class TransactionDAO {
  /**
   * 계좌이체 기능 구현
   * */
	public void transfer(String inputAccount, String outputAccount, int money) {
		//로드 연결 실행 (2번의 update select) 닫기
		Connection con = null;
				
		try {
			con=DbManager.getConnection();
			con.setAutoCommit(false);//자동커밋 해지한다
			//1. 출금한다
			int result = this.withdraw(con, outputAccount, money);
			if(result ==0)throw new SQLException("출금계좌번호 오류입니다");
			
			//2. 출금이 정상이면 입금한다
			result = this.deposit(con, inputAccount, money);
			if(result==0) throw new SQLException("입금계좌번호 오류입니다");

			//3. 입금이 정상이면 잔액확인

			if(!this.ischeckBalance(con, inputAccount)) {
				throw new SQLException("잔액이 1000원이 초과하여 계좌이체 할수 없습니다");
			}
			//4. 잔액확인이 정상이면 commit한다
			con.commit();
			System.out.println("계좌이체 성공하였습니다");
			
		}catch(SQLException e) {
			//e.printStackTrace();
			try {
			con.rollback();
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
			System.out.println(e.getMessage());
		}finally{
			DbManager.dbClose(con, null);
		}
		
		
	}
	
	
	/*
	 * 출금하기 
	 * 1. 인출한다.
		update bank set balance=balance-? where account = ?
	 */
	public int withdraw(Connection con,String outputAccount,int money) throws SQLException {
		PreparedStatement ps = null;
		String sql ="update bank set balance=balance-? where account =?";
		int result =0;
	
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, money );
			ps.setString(2, outputAccount);
			
			result = ps.executeUpdate();
		}finally {
			DbManager.dbClose(null, ps);
		}
		
		return result;
		
	}
	
	/*
	 * 입금하기
	 */
	
	public int deposit(Connection con,String inputAccount,int money) throws SQLException{
		PreparedStatement ps =null;
		String sql = "update bank set balance = balance+? where account =?";
		int result = 0;
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, money );
			ps.setString(2, inputAccount);
			
			result = ps.executeUpdate();
		}finally {
			DbManager.dbClose(null, ps);
		}
		
		return result;		
	}
	
	/*
	 * 잔액확인
	 	select balance from bank where account='A02';
	 	@return : true이면 정상 false이면 잔액이 1000원초과
	 */
	public boolean ischeckBalance(Connection con , String inputAccount) throws SQLException{
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean result = false;
		String sql ="select balance from bank where account=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, inputAccount);
			
			rs= ps.executeQuery();
			
			if(rs.next()) {
				if(rs.getInt(1)<= 1000)
					result=true;				
			}
			
		}finally {
			DbManager.dbClose(null, ps,rs);
		}
		return result;
		
	}
	
//	if(rs.next()) 블록 내부에서 rs.getInt(1): 이는 결과 집합의 
//	현재 행에서 첫 번째 열(열 인덱스 1)의 값을 가져옵니다. 
//	이 열은 SQL 쿼리에 따라 "balance" 열로 가정됩니다.
	
	
	
	public static void main(String[] args) {
		TransactionDAO dao = new TransactionDAO();
		//System.out.println("--1. 출금계좌 오류----");
		//dao.transfer("A02", "A05",200);//입금, 출금, 금액
		
		//System.out.println("--2. 입금계좌 오류----");
		//dao.transfer("A04", "A01",200);//입금, 출금, 금액
		
		
		//System.out.println("--3. 입금계좌의 총액 1000원 이상인경우----");
		//dao.transfer("A02", "A01",700);//입금, 출금, 금액
		
		//System.out.println("--4. 성공----------");
		dao.transfer("A02", "A01",100);//입금, 출금, 금액
	}
}











