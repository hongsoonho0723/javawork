package view;

import java.util.List;

import dao.StudentTeacherDAOImpl;
import vo.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		StudentTeacherDAOImpl std = new StudentTeacherDAOImpl();
		List<Student> list = std.getGenderByWomen();
		//List<Student> list = StudentTeacherDAO.getGenderByWomen();
		for(Student e : list) {
			System.out.println(e);
		}
	}

}
