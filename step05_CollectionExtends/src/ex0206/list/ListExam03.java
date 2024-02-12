package ex0206.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExam03 {
	List<Emp> list = new ArrayList<Emp>();
	
	public ListExam03() {
		//list에 사원 5명 추가
		list.add(new Emp(20, "희정", 20, "서울"));
		list.add(new Emp(30, "민기", 25, "대구"));
		list.add(new Emp(10, "효민", 21, "서울"));
		list.add(new Emp(50, "가현", 22, "오리"));
		list.add(new Emp(40, "찬범", 24, "대전"));
		
		//출력
		//System.out.println("list = "+ list );
		for(Emp e :list) {
			System.out.println(e);
		}
		
		
	}//생성자
	
	/*
	 * 이름에 해당하는 사원 정보 검색(이름중복안됨)
	 * */
	public Emp selectByName(String name) {
		for(Emp e : list) {
			if(e.getEname().equals(name)) {
				return e;
			}
		}
		
		return null;
	}
	
	/**
	 * 주소에 해당하는 사원정보 검색(주소 중복가능)
	 * */
	public List<Emp> selectByAddr(String addr){
		List<Emp> searchList = new ArrayList<Emp>();
		for(Emp e : list) {
			if(e.getAddr().equals(addr)) {
				//찾았다.
				searchList.add(e);// 찾은객체 담는다.
			}
		}
		
		return searchList;
	}
	
	
	/**
	 * 사원의 사원번호를 기준으로 정렬한 결과 리턴
	 * */
	public List<Emp> sortByEmpno(){
		List<Emp> shallowCopyList = new ArrayList<Emp>(list);
		/*System.out.println("정렬전 : ");
		for(Emp e:shallowCopyList) {
			System.out.println(e);
		}*/
		
		//Emp클래스에 Comparable<Emp> 구현필수 
		Collections.sort(shallowCopyList);//
		
		
		return shallowCopyList;
	}
	
	
	
	public static void main(String[] args) {
		ListExam03 ex =  new ListExam03();
		System.out.println("1. 이름으로 검색 -----");
		Emp e = ex.selectByName("효민2");
		System.out.println("e = " + e);
		
		System.out.println("\n2. 주소로 검색---");
		List<Emp> searchList = ex.selectByAddr("대구");
		if(searchList.isEmpty()) {
			System.out.println("찿는 주소가 없습니다.");
		}else {
			for(Emp emp: searchList) {
				System.out.println(emp);
			}
		}
		
		System.out.println("\n 3 정렬 연습 ----");
		List<Emp> sortResult = ex.sortByEmpno();
		for(Emp emp:sortResult) {
			System.out.println(emp);
		}

	}

}




