package db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.dto.Emp;
import db.util.DbManager;

public class EmpDAO {

	/*
	 *  emp 테이블에서 사원의 이름 검색하기
	 *  select ename from emp;
	 */
	
	public void selectByName() {
		Connection con=null;
		Statement st =null;
		ResultSet rs = null;
		String sql = "select ename from emp";
		try {
		//로드
		//연결
		con = DbManager.getConnection();
		
		//실행
		st = con.createStatement();
		rs = st.executeQuery(sql);
		while (rs.next()) {
			//열을 조회
			String ename = rs.getString("ENAME");
			System.out.println(ename);
			
		}
		System.out.println("****조회 완료****");
		
		
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//닫기
		DbManager.dbClose(con, st, rs);
		
		}
		
		
		
		
		
	}//메소드 끝
	/*
	 * 전체검색
	 * select empno,ename,job,sal,hiredate from emp;
	 */
	public List<Emp> selectAll(){
		//로드 연결 실행닫기
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		String sql = "select empno,ename,job,sal,hiredate from emp";
		List<Emp> list = new ArrayList<Emp>();
		try {
			con = DbManager.getConnection();
			st=con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				//열의 조회
				
				Emp emp = new Emp(rs.getInt("empno"), rs.getString("ENAME"),
						rs.getString(3),rs.getInt(4),rs.getString("hiredate"));
				list.add(emp);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			DbManager.dbClose(con, st ,rs);
			
		}
		return list;
	}//메소드 끝
	
	
	/*
	 * 사원번호에 해당하는 사원정보 검색
	 */
	public Emp selectByEmpno(int empno) {
		Connection con =null;
		Statement st = null;
		ResultSet rs = null;
		Emp emp = null;
		String sql = "select empno,ename,job,sal,hiredate from emp where empno =";
		
		try {
			con = DbManager.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(sql+empno);
			if(rs.next()) {
				emp= new Emp(rs.getInt("empno"), rs.getString("ENAME"),
						rs.getString(3),rs.getInt(4),rs.getString("hiredate"));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, st, rs);
			
			
		}
		return emp;
	}
	
	
	/*
	 * 사원 등록
	 */
	public int insert(Emp emp) {
		Connection con = null;
		Statement st = null;
		int result = 0;
		String sql = "insert into emp(empno,ename,job,sal,hiredate) "
				+ "values("+emp.getEmpno()+",'"+emp.getEname()+"','"+emp.getJob()+"',"+emp.getSal()+",sysdate)";
		try {
			System.out.println("sql = " +sql);
			con = DbManager.getConnection();
			st = con.createStatement();
			result = st.executeUpdate(sql);
		}catch(Exception e) {
		//	e.printStackTrace();
			
		}finally {
			DbManager.dbClose(con, st);
			
		}
		return result;
		
	}
	
	/*
	 * 사원 등록(preparedStatement 방식)
	 */
	public int prepareInsert(Emp emp) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "insert into emp(empno,ename,job,sal,hiredate) "
				+ "values(?,?,?,?,sysdate)";
		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			//?의 개수만큼 순서대로 set설정한다
			ps.setInt(1,emp.getEmpno());
			ps.setString(2,emp.getEname());
			ps.setString(3,emp.getJob());
			ps.setInt(4, emp.getSal());
			
			result = ps.executeUpdate();
		
		}catch(Exception e) {
		//	e.printStackTrace();
			
		}finally {
			DbManager.dbClose(con, ps);
			
		}
		return result;
		
	}//메소드 끝
	
	
	
	
}//클래스 끝
