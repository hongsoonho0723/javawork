package db.view;

import java.util.List;

import db.dao.EmpDAO;
import db.dto.Emp;

public class Test {

	
	public static void main(String[] args) {

		System.out.println("********JDBC 연동*********");
		EmpDAO dao = new EmpDAO();
		dao.selectByName();
		
		System.out.println("\n2. 전체 검색");
		List<Emp> list = dao.selectAll();
		for(Emp e : list) {
			System.out.println(e);
		}
		
		System.out.println("\n3. 사원 번호 검색");
		Emp emp = dao.selectByEmpno(7844);
		if (emp==null) {
			System.out.println("찾는 정보가 없습니다");
		}else {
			System.out.println(emp);
		}
		
		
		  System.out.println("\n4. 사원 번호 검색"); int re =dao.insert(new
		  Emp(9001,"king","student",300,null)); if
		  (re==0)System.out.println("등록되지 않았습니다"); else System.out.println("등록되었습니다");
		 
		System.out.println("\n5. 사원 번호 검색");
		int re1 =dao.prepareInsert(new Emp(9002,"hong","student",300,null));
		if (re1==0)System.out.println("등록되지 않았습니다");
		else System.out.println("등록되었습니다");
		
	}

}
