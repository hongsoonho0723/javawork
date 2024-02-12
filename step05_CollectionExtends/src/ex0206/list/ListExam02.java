package ex0206.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class ListExam02 {
	//List<Integer> list = new ArrayList<Integer>(5);
	//List<Integer> list = new LinkedList<Integer>();
	List<Integer> list = new Vector<Integer>(5);
    public ListExam02() {
    	
    	
    	System.out.println("요소의 개수 : " + list.size() );
    	
    	//추가
    	list.add(5);
    	list.add(15);
    	list.add(2);
    	list.add(20);
    	list.add(10);
    	list.add(20);
    	list.add(50);
    	list.add(40);
    	
    	System.out.println("추가후 요소의 개수 : " + list.size() );
    	
    	//list안에 요소 꺼내기
    	for(int i=0; i < list.size() ; i++) {
    	  int no = list.get(i);
    	  System.out.print(no+" , ");
    	}
    	
    	
    	System.out.println("\nthis = " + this );
    	System.out.println( );
    	
    	//요소 제거
    	list.remove(2);//3 번째요소 제거
    	list.remove(4);// 
    	
    	System.out.println("--개선된 for -----");
    	for(Integer n : list ) {
    		System.out.print(n+" , ");
    	}
    	System.out.println("\n------------");
    	//정렬
        //Collections.sort( this );//올림차순
    	Collections.sort( list , Collections.reverseOrder());
        
        System.out.println("정렬 후 = " + list);
    	
    }
	public static void main(String[] args) {
		 new ListExam02();

	}

}
