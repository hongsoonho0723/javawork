package ex0206.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExam02  {
		//List<Integer> list = new ArrayList<Integer> (5);
		List<Integer> list = new LinkedList<Integer>();
		//List<Integer> list = new Vector<Integer>(5);
		public ListExam02() {
		
		
			
			System.out.println("요소의 개수 : "+list.size() );
		
			//추가
			list.add(5);
			list.add(15);
			list.add(2);
			list.add(20);
			list.add(20);
			list.add(11);
			list.add(25);
			list.add(13);
			list.add(15);
			list.add(17);
			
			System.out.println("추가후 요소의 개수 : "+list.size() );
			
			//list 안에 요소 꺼내기
			for(int i = 0; i< list.size(); i++) {
				int no = list.get(i);
				System.out.print(no+ " , ");
				
				
				
			}
			System.out.println("\n list ="+list);
			System.out.println();
			
			list.remove(2); //3번째 요소 제거
			list.remove(4);
	
			System.out.println("---개선된 for ---");
			for(Integer n : list) {
				System.out.print(n+ " , ");
			}
			System.out.println("\n------------------------");
			//정렬
			//Collections.sort(this);//올림차순
			System.out.println("올림차순 정렬 후 =" + list);
			Collections.sort(list, Collections.reverseOrder());//내림차순
			System.out.println("내림차순 정렬 후 =" + list);
			
		}

		public static void main(String[] args) {
			new ListExam02();
			
			
		}
	}