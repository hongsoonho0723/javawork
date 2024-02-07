package ex0206.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExam03 {
	List<Emp> list = new ArrayList<Emp>();
	
	public ListExam03() {
		//list에 사원 5명 추가
		list.add(new Emp(20, "순호", 20, "서울"));
		list.add(new Emp(40, "민기", 25, "대구"));
		list.add(new Emp(30, "효민", 29, "오리"));
		list.add(new Emp(50, "찬민", 41, "경기"));
		list.add(new Emp(10, "유민", 31, "서울"));
		
		//출력
		//System.out.println(" list = "+ list);
		for(Emp e : list) {
			System.out.println(e);
		}
		
		
	}
	
	/*
	 * 이름에 해당하는 사원 정보 검색
	 */
	public Emp selectByName(String name) {
		for(Emp e :list) {
			if(e.getEname().equals(name)) {
				return e;
				
				
				
			}
		}
		return null;
	}
	
	public List<Emp> selectByAddr(String addr) {
		List<Emp> searchList = new ArrayList<Emp>();
			for(Emp e : list) {
				if(e.getAddr().equals(addr)) {
					searchList.add(e);
				}
			}
			return  searchList;
		}
		
	/*
	 *사원의 사원번호를 기준으로 정렬한 결과 리턴 
	 */
	public List<Emp> sortByEmpno(){
		List<Emp> shallowCopyList = new ArrayList<Emp>(list);
	/*	System.out.println("정렬전 : ");
		for(Emp e : shallowCopyList) {
			System.out.println(e);
			
		}
		*/
		
		//Emp 클래스에 Comparable<Emp>구현필수
		Collections.sort(shallowCopyList);
		
		return shallowCopyList;
	
	}
	
	
	
	
	
	public static void main(String[] args) {
			ListExam03 ex = new ListExam03();
			System.out.println("이름으로 검색");
			Emp e = ex.selectByName("효민");
			System.out.println("e = "+ e);
			
			System.out.println("주소로 검색");
			List<Emp> searchList = ex.selectByAddr("서울");
			if(searchList.isEmpty()) {
				System.out.println("찾는 주소가 없습니다.");
			}else {
				for(Emp emp : searchList) {
					System.out.println(emp);
				}
			}
			
	}

}

