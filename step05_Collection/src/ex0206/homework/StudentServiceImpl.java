package ex0206.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentServiceImpl implements StudentService {
	
	private ArrayList<Student> list = new ArrayList<Student>();
	
	/**
	 * 초기치 데이터 5명의 정보를 저장
	 * */
	public StudentServiceImpl() {
		list.add(new Student("A01", "희정", 20, "서울"));
		list.add(new Student("A02", "나영", 25, "대구"));
		list.add(new Student("A03", "효리", 22, "부산"));
		list.add(new Student("A04", "민아", 21, "경기"));
		list.add(new Student("A05", "선경", 20, "서울"));
	}

	@Override
	public boolean insert(Student st) {
		//추가 전 학번 중복 체크
		
		
		if(this.selectBySno(st.getSno()) != null) {
			return false;
		}
		
		
		
		return list.add(st);
	}

	@Override
	public List<Student> selectAll() {
		return list;
	}

	@Override
	public Student selectBySno(String sno) { //사용자가 입력한 학번이 전달
		for(Student st: list) {
			if(st.getSno().equals(sno)) {
				return st;
				
			}
		}
		return null;
	}

	@Override
	public boolean delete(String sno) {
		Student student = this.selectBySno(sno);
		return list.remove(student);
	}

	@Override
	public boolean update(Student student) {
		Student searchedStudent = this.selectBySno(student.getSno());
		if(searchedStudent == null)
			return false;
		
		searchedStudent.setAge(student.getAge());
		searchedStudent.setAddr(student.getAddr());
		
			return true;
		
	}

	@Override
	public List<Student> sortByAge() {
		//정렬한 복사본 list 만들자
		List<Student> sortList = new ArrayList<Student>(list);
		
		//자료구조 정렬 - Student 객체는 반드시 Comparable를 구현
		//Collections.sort(list);

		//Comarator 사용하기
		//Student객체에 Comparble 구현은 할 필요없다
		
		Collections.sort(sortList , new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				
				return o2.getAge() - o1.getAge(); //내림차순
			}
			
			
		} );
		
		
		return sortList;
	}
	
}//클래스 끝
/*class SortCompartorTest implements Comparator<Student>{
	
	//@return : 음수 , 0 , 양수
	
	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.getAge() - o1.getAge(); //내림차순
	}
	
	
}
*/