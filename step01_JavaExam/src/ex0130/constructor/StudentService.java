package ex0130.constructor;

import java.util.Scanner;

/*
 * 학생의 정보를 관리 하는 서비스 (등록,수정,검색)
 * */

public class StudentService {

	private Student stArr[] = new Student[5];
	private int count; // 배열방에 저장된 객체의 개수

	// 초기치데이터 3명 정도 세팅하기

	public StudentService() {
			System.out.println("******데이터 세팅하기********");
		

		stArr[count++] = this.create("희정", 20, "서울");
		stArr[count++] = this.create("나정", 30, "서울");
		stArr[count++] = this.create("김정", 10, "서울");

	}
	// Student 객체를 생성해서 리턴해주는 메소드

	private Student create(String name, int age, String addr) {

		Student st = new Student( name, age,addr);

		
		
		
		return st;

	}

	/*
	 * 학생의 정보 등록하기 : 배열의 경계를 벗어나면 더 이상 추가할수없습니다. 메시지 출력 추가가 성공하면 "등록되었습니다" 메시지를 출력
	 */
	public void insert(Student st) { // 이름 나이 주소
		// 배열방에 인수로 전달된 학생 정보를 추가한다

		/*
		 * for(int i=count; i<stArr.length; i++) { if(stArr[i]!=null) {continue; } else
		 * if(stArr[i] == null){
		 */
		for (int i = stArr.length - 1; i >= 0; i--) {
			if (stArr[i] == null) {
				stArr[i] = st;
				count++;
				System.out.println("등록되었습니다.");

			} else
				return;

		}
		System.out.println("배열의 경계를 벗어나 더 이상 추가할 수 없습니다");

	}

	// 전체 학생의 정보 조회하기
	public void selectAll() {
		System.out.println("---------전체 학생 정보 조회(" + count + "명)--------------");
		for (int i = 0; i < count; i++) {
			System.out.print("이름 : " + stArr[i].getName() + "\t");
			System.out.print("나이 : " + stArr[i].getAge() + "\t");
			System.out.print("주소 : " + stArr[i].getAddr() + "\n");
		}

	}

	/*
	 * 이름에 해당하는 학생의 정보 검색하기 : 이름에 해당하는 학생이 있으면 학생의 이름 나이 주소를 출력하고 없으면
	 * "찾는 정보가 없습니다"출력합니다
	 */
	public void selectByName(String name) {
		for (int i = 0; i < count; i++) {

			if (stArr[i].getName().equals(name)) { // 왼쪽의 문자열과 인수의 문자열을 비교해서 같으면 true 아니면 false리턴
				// 찾았다
				System.out.print("이름 : " + stArr[i].getName() + "\t");
				System.out.print("나이 : " + stArr[i].getAge() + "\t");
				System.out.print("주소 : " + stArr[i].getAddr() + "\n");
				//break for문을 빠져나가라
				return; //함수를 빠져나가라

			} else {

				// 없다
			}
		}
		System.out.println("찾는 정보가 없습니다");
	}

	// update 메소드사용
	// 이름에 해당하는 학생의 나이와 주소 변경하기
	// 이름에 해당하는 학생이 있는지 찾아서 없으면 "수정할수없습니다" 출력
	// 있으면 setAge(), setAddr() 이용해서 전달된 인수의 값으로 변경하고
	// "수정되었습니다" 출력
	public void update(Student student) {
		

		for (int i = 0; i < count; i++) {

			if (stArr[i].getName().equals(student.getName())) {

				stArr[i].setAddr(student.getAddr());
				System.out.println("정보를 수정하 었습니다");

			}

		}
		System.out.println("수정할 수 없습니다");

	}

}
