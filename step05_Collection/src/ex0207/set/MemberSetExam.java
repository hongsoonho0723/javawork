package ex0207.set;

import java.util.HashSet;

public class MemberSetExam extends HashSet<Member> {
	public MemberSetExam() {
		
		/*
		 * set의 중복체크를 위해서
		 * hashcode() 호출하고 그결과가 다르면 추가
		 * 같으면 equals() 호출해서 false이면 추가
		 * true이면 추가 안됨
		 */
		
		
		//Member객체 추가
		super.add(new Member("희정",20,"서울"));
		super.add(new Member("희정1",23,"서울"));
		super.add(new Member("희정1",23,"서울"));
		
		System.out.println("저장된 객체의 개수 : " + super.size());
		System.out.println(this);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		new MemberSetExam();
		
	}

}
