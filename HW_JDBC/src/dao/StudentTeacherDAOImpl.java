package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DbManager;
import vo.Student;
import vo.Teacher;



public class StudentTeacherDAOImpl implements StudentTeacherDAO{

	public List<Student> getGenderByWomen(){
		//로드 연결 실행닫기
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from student where student_jumin like '%-2%'";
		List<Student> list = new ArrayList<Student>();
		try {
			con = DbManager.getConnection();
			ps=con.prepareStatement(sql);
			rs = ps.executeQuery();
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
		}catch(SQLException e) {
			e.printStackTrace();
			
		}finally {
			DbManager.dbClose(con, ps ,rs);
			
		}
		return list;
	}//메소드 끝);

	
	
	public List<Teacher> getTeacherInfoByAddr(String gu) {
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Teacher> list =new ArrayList<Teacher>();
		String sql =" select * from teacher  where 주소 like ?";
		try {
		con=DbManager.getConnection();
		ps=con.prepareStatement(sql);
		
		ps.setString(1,"%"+gu+"%");
		
		
		rs=ps.executeQuery();
		
		while (rs.next()) {
			Teacher teacher = new Teacher(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
					rs.getString(5), rs.getString(6), rs.getString(7));

			list.add(teacher);
		}

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, ps, rs);
		}
		
		return list;
	}//메소드 끝

	
	
	
	
	public Teacher getTeacherInfoBySubject(String subject) {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Teacher teacher = null;
		String sql = " select * from teacher where sugang_code = \r\n"
				+ "    (select sugang_code from subject where upper(subject)=upper( ? ))";
		
			try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, subject);
			rs = ps.executeQuery();
			if(rs.next()) {
				 teacher = new Teacher(rs.getInt(1), rs.getString(2),  rs.getString(3),
						rs.getString(4),  rs.getString(5),  rs.getString(6) , rs.getString(7));
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				DbManager.dbClose(con, ps, rs);
			}
			
		
		
		return teacher;
	}

	@Override
	public Teacher getTeacherInfoByNo(int teacherNo) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
