package ex0129.array;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("***학생 관리 프로그램 시작됩니다***");

		StudentService service = new StudentService();

		service.init(); // 초기치데이터 세팅

		// 전체학생정보 출력
		service.selectAll();

		// 등록하기
		System.out.println("---등록하기----");
		Student student = new Student();
		student.setName("미미");
		student.setAge(25);
		student.setAddr("오리역");
		service.insert(student);

		// 이름으로 검색하기
		System.out.println("---이름으로 검색하기----");

		service.selectByName("나정");

		// 수정하기
		System.out.println("---수정하기----");

		service.update("미미24");

		System.out.println("------------전체학생정보 출력------------");
		service.selectAll();
	}

}
