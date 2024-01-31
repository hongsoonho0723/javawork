package ex0130.constructor;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("***학생 관리 프로그램 시작됩니다***");

		StudentService service = new StudentService();


		// 전체학생정보 출력
		service.selectAll();

		// 등록하기
		System.out.println("---등록하기----");
		Student student = new Student("미미",25,"오리역");
		service.insert(student);

		// 이름으로 검색하기
		System.out.println("---이름으로 검색하기----");

		service.selectByName("나정");

		// 수정하기
		System.out.println("---수정하기----");
		Student st2 = new Student("나정","대전");
		
		service.update(st2);

		System.out.println("------------전체학생정보 출력------------");
		service.selectAll();
	}

}
