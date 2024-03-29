package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DbManager;
import vo.Student;
import vo.Teacher;

public interface StudentTeacherDAO {
	/**
	 * 1번 : 성별이 여자인 학생의 정보 검색
       select * from student where  수_주민등록번호 like '%-2%'
	 * */
	public List<Student> getGenderByWomen();
	
	
	
	/**
	 * 3.  "구"를 인수로 전달받아 구에 거주하는 강사의 정보 검색
	 *      select * from teacher  where 주소 like ?
	 * */
	public List<Teacher> getTeacherInfoByAddr(String gu);
	/*
	  public List<Teacher> getTeacherInfoByAddr(String gu) { 
	  Connection con = null;
	  PreparedStatement ps = null;
	  
	  String sql ="select * from teacher  where 주소 like ?"; 
	  List<Teacher> list =
	  new ArrayList<Teacher>(); //int result =0;
	  
	  try { 
	  ps= con.prepareStatement(sql); 
	  ps.setString(1, "+%gu%+"); 
	  result =
	  ps.executeUpdate(); 
	  }	finally { DbManager.dbClose(null, ps); 
	  	} 
	  return list; 
	  };*/
	 
	/*
	 * public List<Teacher> getTeacherInfoByAddr(String gu) { Connection con = null;
	 * PreparedStatement ps = null; ResultSet rs = null; List<Teacher> list = new
	 * ArrayList<Teacher>(); String sql =
	 * "SELECT * FROM teacher WHERE teacher_arrd LIKE ?";
	 * 
	 * try { con = DbManager.getConnection(); ps = con.prepareStatement(sql);
	 * ps.setString(1, "%" + gu + "%"); rs = ps.executeQuery();
	 * 
	 * while (rs.next()) { Teacher teacher = new Teacher();
	 * teacher.setTeacherName(rs.getString("teacher_name"));
	 * teacher.setTeacherAddr(rs.getString("teacher_arrd")); // 나머지 필드도 필요에 따라 설정
	 * 
	 * list.add(teacher); } } catch (SQLException e) { e.printStackTrace(); }
	 * finally { DbManager.dbClose(con, ps, rs); }
	 * 
	 * 
	 * return list; }
	 */
	
	
	/**
	 * 5. 과목을 인수로 전달받아 그 과목을 강의하는 강사의 정보 (서브쿼리) 
         select * from teacher where 수강코드 = 
          (select 수강코드 from subject where upper(과목)=upper( ? ))
	 * */
	
	public Teacher getTeacherInfoBySubject(String subject);
	
	

	/**
	 * 8강사의 번호를 인수로 전달받아 뷰에서 그 강사번호에 해당하는 정보를 출력한다
	 *   select * from v_teacherInfo  where 강사번호=?
	 * 
	 * */
	public Teacher getTeacherInfoByNo(int teacherNo);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//dao 클래스끝














