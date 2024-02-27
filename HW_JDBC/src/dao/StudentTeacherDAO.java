package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
	public static List<Student> getGenderByWomen(){
			//로드 연결 실행닫기
			Connection con = null;
			Statement st = null;
			ResultSet rs = null;
			String sql = "select * from student where student_jumin like '%-2%'";
			List<Student> list = new ArrayList<Student>();
			try {
				con = DbManager.getConnection();
				st=con.createStatement();
				rs = st.executeQuery(sql);
				while(rs.next()){
					//열의 조회
					 /* STUDENT_NUMBER NUMBER PRIMARY KEY,
					    STUDENT_NAME VARCHAR2(12) NOT NULL,
					    STUDENT_JUMIN VARCHAR2(14) NOT NULL,
					    STUDENT_PHONE VARCHAR2(14) NOT NULL,
					    STUDENT_ADDR VARCHAR2(50),
					    STUDENT_EMAIL VARCHAR2(20)*/
					Student student = new Student(rs.getInt("student_number"),rs.getString("student_name"),
							rs.getString("student_jumin"),rs.getString("student_phone"),
							rs.getString("student_addr"),rs.getString("student_email"));
					list.add(student);
					
				}
			}catch(Exception e) {
				e.printStackTrace();
				
			}finally {
				DbManager.dbClose(con, st ,rs);
				
			}
			return list;
		}//메소드 끝);
	
	
	
	/**
	 * 3.  "구"를 인수로 전달받아 구에 거주하는 강사의 정보 검색
	 *      select * from teacher  where 주소 like ?
	 * */
	public List<Teacher> getTeacherInfoByAddr(String gu) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql ="select * from teacher  where 주소 like ?";
		List<Teacher> list = new ArrayList<Teacher>();
		//int result =0;
		
		try {
		ps= con.prepareStatement(sql);
		ps.setString(1, "+%gu%+");
			result = ps.executeUpdate();
		}finally {
			DbManager.dbClose(null, ps);
		}
		return list;
	};
	
	
	
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
}
